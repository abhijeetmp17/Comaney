package com.EmployeeData.Comaney.Controller;

import com.EmployeeData.Comaney.Payload.UserDto;
import com.EmployeeData.Comaney.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class UserController
{
    @Autowired
    private UserService userService;
    //create user
    @PostMapping("/save")
    public ResponseEntity<UserDto> createUser( @RequestBody UserDto userDto)
    {
       UserDto savedUser =  this.userService.createUser(userDto);

       return new ResponseEntity<UserDto>(savedUser , HttpStatus.CREATED);

    }
}
