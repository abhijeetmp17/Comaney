package com.EmployeeData.Comaney.Payload;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@NoArgsConstructor
@Getter
@Setter
public class UserDto
{

    @Email
    @NotBlank
    @Column(unique = true)
    private String userEmail;

    @NotBlank
    private String userId;

    @NotBlank
    private String firstName;

    @NotBlank
    private Integer employeeId;

    @NotBlank
    private String lastName;
    
    @Size(min = 4, max = 10, message = "password must be >4 and <10 char")
    private String password;

}
