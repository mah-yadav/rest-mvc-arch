package com.mvc.restservice.service;

import com.mvc.restservice.domain.Customer;
import com.mvc.restservice.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService extends GenericAppService<Customer, String> {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        super(customerRepository);
        this.customerRepository = customerRepository;
    }

    @Override
    public void validateDataForAdd(Customer customer) {
        customer.validate();
    }

    @Override
    public void validateDataForUpdate(Customer customer) {
        customer.validate();
    }
}
