package org.example.assignmentproject.servise;

import org.example.assignmentproject.dto.CustomerDto;
import org.example.assignmentproject.model.Customer;
import org.example.assignmentproject.model.Result;
import org.example.assignmentproject.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
    public Customer getCustomerById(Integer id) {
        return customerRepository.findById(id).get();
    }
    public Result addCustomer(CustomerDto customerDto) {
        Customer customer = new Customer();
        customer.setName(customerDto.getName());
        customerRepository.save(customer);
        return new Result(true , "Saqlandi");

    }
    public Result updateCustomer(Integer id, CustomerDto customerDto) {
        Customer customer = customerRepository.findById(id).get();
        customer.setName(customerDto.getName());
        customerRepository.save(customer);
        return new Result();
    }
    public Result deleteCustomer(Integer id) {
        customerRepository.deleteById(id);
        return new Result();
    }
}
