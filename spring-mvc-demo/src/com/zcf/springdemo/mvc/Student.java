package com.zcf.springdemo.mvc;

import java.util.LinkedHashMap;

/**
 * Created by zhangchf on 26/12/2017.
 */
public class Student {

    public String firstName;
    public String lastName;
    public String country;
    public LinkedHashMap<String, String> countryOptions;

    public Student() {
        countryOptions = new LinkedHashMap<>();
        countryOptions.put("US", "The United States");
        countryOptions.put("UK", "The United Kingdom");
    }

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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }
}
