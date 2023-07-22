package com.mvc.restservice.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("customer")
@Getter @NoArgsConstructor @Setter @ToString
public class Customer {
    @Id
    private String id;
    private String name;
    private String age;
    private String emailAddress;
    private Integer mobileNo;
    private Address address;
}
