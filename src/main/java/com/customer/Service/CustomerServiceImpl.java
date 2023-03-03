package com.customer.Service;

import com.customer.Dao.CustomerDao;
import com.customer.Entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{


    @Autowired
    CustomerDao customerDao;


    @Override
    public Customer getCustomer(Long id) {

        return customerDao.getCustomer(id);
    }

    @Override
    public String addCustomer(Customer customer) {
        return customerDao.addCustomer(customer);
    }

    @Override
    public String updateCustomer(Customer customer) {
        return customerDao.updateCustomer(customer);
    }

    @Override
    public List<Customer> getAllCustomer() {
        return customerDao.getAllCustomer();
    }

}
