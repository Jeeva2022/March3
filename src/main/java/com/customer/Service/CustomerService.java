package com.customer.Service;

import com.customer.Entity.Customer;

import java.util.List;

public interface CustomerService {

   public Customer getCustomer(Long id);

    public String addCustomer(Customer customer);

   public String updateCustomer(Customer customer);


  public List<Customer> getAllCustomer();
}
