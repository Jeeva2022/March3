package com.customer.Dao;

import com.customer.Entity.Customer;
import com.customer.Exception.CustomerAlreadyExistException;
import com.customer.Exception.NoSuchCustomerExistException;
import com.customer.Repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CustomerDao {

    @Autowired
    CustomerRepo customerRepo;
    public Customer getCustomer(Long id) {

        Optional <Customer> theCustomer = customerRepo.findAll().stream().filter(c->c.getId()==id).findFirst();

        if(theCustomer.isEmpty()){
            throw new NoSuchCustomerExistException("No Customer Exists With this Id- "+id);
        }else {
            return theCustomer.get();
        }
    }



    public String addCustomer(Customer customer) {

        Customer existingCustomer = customerRepo.findById(customer.getId()).orElse(null);

        if(existingCustomer==null){
             customerRepo.save(customer);
             return "Customer added successfully";
        }else
            throw new CustomerAlreadyExistException("Customer Already Exist");

    }


    public String updateCustomer(Customer customer) {

        Customer existingCustomer = customerRepo.findById(customer.getId()).orElse(null);

        if(existingCustomer==null){
            throw new NoSuchCustomerExistException("No Such Customer Exists");
        }else{
            existingCustomer.setName(customer.getName());
            existingCustomer.setAddress(customer.getAddress());
            customerRepo.save(existingCustomer);
            return "Record Updated SuccessFully";
        }

    }

    public List<Customer> getAllCustomer() {
        return customerRepo.findAll();
    }
}
