package com.example.BookstoreAPI;

import javax.management.loading.ClassLoaderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private ClassLoaderRepository customerRepository;

    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer) {
        return ClassLoaderRepository.save(customer);
    }

	public ClassLoaderRepository getCustomerRepository() {
		return customerRepository;
	}

	public void setCustomerRepository(ClassLoaderRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
}
