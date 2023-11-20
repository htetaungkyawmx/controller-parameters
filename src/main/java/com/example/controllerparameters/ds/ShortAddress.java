package com.example.controllerparameters.ds;


import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
public class ShortAddress {
    @NotBlank(message = "Street address cannot be empty!")
    private String streetAddress;
    @NotBlank(message = "City name cannot be empty!")
    private String city;
    @Pattern(regexp = "[A-Z]{2}",message = "State code needs to be 2 letter code.")
    private String stateCode;
    @Pattern(regexp = "\\d{5}",message = "zip code needs to be 5 digit Zip code.")
    private String zipCode;
}
