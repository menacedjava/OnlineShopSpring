package org.example.assignmentproject.controller;

import org.example.assignmentproject.dto.PaymentDto;
import org.example.assignmentproject.model.Payment;
import org.example.assignmentproject.model.Result;
import org.example.assignmentproject.servise.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/payment")
public class PaymentController {
    @Autowired
    PaymentService paymentService;

    @GetMapping
    public List<Payment> getPayments() {
        List<Payment> allPayments = paymentService.getAllPayments();
        return allPayments;
    }
    @GetMapping("/{id}")
    public Payment getPayment(@PathVariable Integer id) {
        Payment paymentById = paymentService.getPaymentById(id);
        return paymentById;
    }

    @PostMapping
    public Result createPayment(@RequestBody PaymentDto paymentDto) {
        Result payment = paymentService.createPayment(paymentDto);
        return payment;
    }

    @PutMapping("/{id}")
    public Result updatePayment(@PathVariable Integer id, @RequestBody PaymentDto paymentDto) {
        Result result = paymentService.updatePaymentById(id, paymentDto);
        return result;
    }
    @DeleteMapping("/{id}")
    public Result deletePayment(@PathVariable Integer id) {
        Result result = paymentService.deletePaymentById(id);
        return result;
    }
}
