package com.codeclan.example.courseservice.repositories.CustomerRepository;

import com.codeclan.example.courseservice.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long>, CustomerRepositoryCustom {
}
