package org.example.assignmentproject.controller;

import org.example.assignmentproject.dto.CustomerDto;
import org.example.assignmentproject.model.Customer;
import org.example.assignmentproject.model.Result;
import org.example.assignmentproject.servise.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @GetMapping
    public List<Customer> getCustomers() {
        List<Customer> allCustomers = customerService.getAllCustomers();
        return allCustomers;
    }
    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable Integer id) {
        return customerService.getCustomerById(id);
    }

    @PostMapping
    public Result createCustomer(@RequestBody CustomerDto customerDto) {
        Result result = customerService.addCustomer(customerDto);
        return result;
    }

    @PutMapping("/{id}")
    public Result updateCustomer(@PathVariable Integer id, @RequestBody CustomerDto customerDto) {
        Result result = customerService.updateCustomer(id, customerDto);
        return result;
    }
    @DeleteMapping
    public Result deleteCustomer(@PathVariable Integer id) {
        Result result = customerService.deleteCustomer(id);
        return result;
    }
}
