package com.zcf.springdemo.mvc;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by zhangchf on 27/12/2017.
 */
public class Customer {

    private String firstName;


    @NotNull(message = "required")
    @Size(min = 1, message = "required")
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
