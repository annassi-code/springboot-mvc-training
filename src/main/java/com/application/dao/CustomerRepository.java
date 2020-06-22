package com.application.dao;

import com.application.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@RepositoryRestResource(path = "customers")
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
