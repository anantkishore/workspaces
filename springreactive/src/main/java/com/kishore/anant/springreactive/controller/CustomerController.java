package com.kishore.anant.springreactive.controller;

import com.kishore.anant.springreactive.repo.ReactiveCustomerRepository;
import com.kishore.anant.springreactive.model.Customer;

import java.time.Duration;

import javax.validation.Valid;

import reactor.core.publisher.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins ="http://localhost:4200")
@RestController
@RequestMapping(value = "/api")
public class CustomerController {

    @Autowired
    ReactiveCustomerRepository customerRepository;

    @GetMapping("/customers")
    public Flux<Customer> getAllCustomers() {

        return customerRepository.findAll().delayElements(Duration.ofMillis(1000));
    }

    @PostMapping("/customers/create")
    public Mono<Customer> createCustomer(@Valid @RequestBody Customer customer)
    {
        customer.setActive(false);
        return customerRepository.save(customer);
    }

    @PutMapping("/customers/{customer_id}")
    public Mono<ResponseEntity<Customer>> updateCustomer(@PathVariable("customer_id") String customer_id,
        @RequestBody Customer customer) 
    {
        return customerRepository.findById(customer_id).flatMap(customerData -> {
            customerData.setName(customer.getName());
            customerData.setAge(customer.getAge());
            customerData.setActive(customer.isActive());
            return customerRepository.save(customerData);
        })
        .map(updatedCustomer -> new ResponseEntity<>(updatedCustomer, HttpStatus.OK))
            .defaultIfEmpty(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/customers/{customer_id}")
    public ResponseEntity<String> deleteCustomer(@PathVariable("customer_id") String customer_id)
    {
        try {
            customerRepository.deleteById(customer_id).subscribe();
        }
        catch(Exception e)
        {
            return new ResponseEntity<>("Fail to delete.", HttpStatus.EXPECTATION_FAILED);
        }
        return new ResponseEntity<>("Customer deleted successfully.", HttpStatus.OK);
    }

    @DeleteMapping("/customers/delete")
    public ResponseEntity<String> deleteAllCustomers(){

        try {
            customerRepository.deleteAll().subscribe();
        }
        catch(Exception e )
        {
            return new ResponseEntity<>("Fail to delete all customers.", HttpStatus.EXPECTATION_FAILED);
        }
        return new ResponseEntity<>("All customers have been deleted successfully.", HttpStatus.OK);
    }

    @GetMapping("/customers/findbyname")
    public Flux<Customer> findByName(@RequestParam String name)
    {
        return customerRepository.findByName(name).delayElements(Duration.ofMillis(1000));
    }

}