package com.customer.Repository;

import com.customer.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepo extends JpaRepository<Customer,Long> {
}
