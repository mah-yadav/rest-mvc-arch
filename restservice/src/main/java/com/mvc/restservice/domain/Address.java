package com.mvc.restservice.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @NoArgsConstructor @Setter @ToString
public class Address {
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String pincode;
}
