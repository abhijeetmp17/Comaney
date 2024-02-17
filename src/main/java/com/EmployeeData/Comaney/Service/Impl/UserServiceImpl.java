package com.EmployeeData.Comaney.Service.Impl;

import com.EmployeeData.Comaney.Entity.User;
import com.EmployeeData.Comaney.Payload.UserDto;
import com.EmployeeData.Comaney.Repository.UserRepo;
import com.EmployeeData.Comaney.Service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService
{
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public UserDto createUser(UserDto userDto) {

        User user = this.modelMapper.map(userDto, User.class);

        if (userRepo.findByUserEmail(user.getUserEmail()) != null) {
            throw new IllegalArgumentException("Email already exists");
        }
        User saveUser = this.userRepo.save(user);
        return this.modelMapper.map(saveUser, UserDto.class);

    }
}
