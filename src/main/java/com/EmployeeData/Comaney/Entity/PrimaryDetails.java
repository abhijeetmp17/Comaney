package com.EmployeeData.Comaney.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class PrimaryDetails
{
    @Id
    private Integer Id;

    private String primarySkillSet;

    private String secondarySkillSet;

    private String jobTitle;

    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


}
