package com.EmployeeData.Comaney.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address
{
    @Id
    private Integer id;

    private String city;

    private String State;

    private String Line1;

    private String line2;

    private String pincode;
}
