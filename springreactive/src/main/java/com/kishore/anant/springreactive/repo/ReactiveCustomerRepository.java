package com.kishore.anant.springreactive.repo;

import com.kishore.anant.springreactive.model.Customer;
import reactor.core.publisher.Flux;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ReactiveCustomerRepository extends ReactiveCrudRepository<Customer, String> {

    Flux<Customer> findByName(String name);

}