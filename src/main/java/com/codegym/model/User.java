package com.codegym.model;

import javax.validation.constraints.*;

public class User {

    @NotEmpty
    @Size(min = 5, max = 45)
    private String firstname;

    @NotEmpty
    @Size(min = 5, max = 45)
    private String lastname;

    @Pattern(regexp = "(^$|[0-9]{10})")
    @NotNull
    private String phoneNumber;

    @Min(18)
    private int age;

    @Email
    private String email;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
