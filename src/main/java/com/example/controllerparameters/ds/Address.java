package com.example.controllerparameters.ds;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotBlank(message = "First name cannot be empty!")
    private String firstName;
    @NotBlank(message = "Last name cannot be empty!")
    private String lastName;
    @NotBlank(message = "Street address cannot be empty!")
    private String streetAddress;
    @NotBlank(message = "City cannot be empty!")
    private String city;
    @Pattern(regexp = "[A-Z]{2}",message = "State code needs to be 2 letter code!")
    private String streetCode;
    @Pattern(regexp = "\\d{5}",message = "Zip code needs to be 5 digit Zip code!")
    private String zipCode;
    @Pattern(regexp = "[A-Za-z]*]",message = "Country name contains illegal characters!")
    private String country;

    public Address(){

    }

    public Address(Person person,ShortAddress shortAddress,Country country){
        this.firstName= person.getFirstName();
        this.lastName= person.getLastName();
        this.streetAddress= shortAddress.getStreetAddress();
        this.city= shortAddress.getCity();
        this.streetCode= shortAddress.getStateCode();
        this.zipCode= shortAddress.getZipCode();
        this.country= country.getCountry();
    }


}