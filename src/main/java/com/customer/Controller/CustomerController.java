package com.customer.Controller;

import com.customer.Entity.Customer;
import com.customer.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping(value = "/getCustomer/{id}")
    public Customer getCustomer(@PathVariable Long id){
        return customerService.getCustomer(id);
    }

    @PostMapping(value = "/addCustomer")
    public String addCustomer(@RequestBody Customer customer){
        return customerService.addCustomer(customer);
    }

    @PostMapping(value = "/updateCustomer")
    public String updateCustomer(@RequestBody Customer customer){

        return customerService.updateCustomer(customer);
    }

    @GetMapping(value = "/getAllCustomer")
    public List<Customer> getAllCustomer(){
        return customerService.getAllCustomer();
    }







}
