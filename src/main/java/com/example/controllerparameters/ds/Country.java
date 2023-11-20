package com.example.controllerparameters.ds;


import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
public class Country {
    @NotBlank(message = "Country name cannot be empty!")
    @Pattern(regexp = "[A-Za-z]*")
    private String country;

}
