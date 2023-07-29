package com.mvc.restservice.repository;

import com.mvc.restservice.domain.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends MongoRepository<Customer, String> {
    public Customer findByCustomerRef(String customerRef);

    public void deleteByCustomerRef(String customerRef);
}
