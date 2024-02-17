package com.EmployeeData.Comaney.Repository;

import com.EmployeeData.Comaney.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepo extends JpaRepository<User, Integer>
{
    public User findByUserEmail(String userEmail);
}
