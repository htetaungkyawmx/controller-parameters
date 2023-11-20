package com.example.controllerparameters.ds;


import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class Person {
    @NotBlank(message = "First name cannot be empty!")
    private String firstName;
    @NotBlank(message = "Last name cannot be empty!")
    private String lastName;
}
