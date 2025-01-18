package org.example.assignmentproject.servise;

import org.example.assignmentproject.dto.PaymentDto;
import org.example.assignmentproject.model.Payment;
import org.example.assignmentproject.model.Result;
import org.example.assignmentproject.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {
    @Autowired
    private PaymentRepository paymentRepository;
    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }
    public Payment getPaymentById(Integer id) {
        return paymentRepository.getReferenceById(id);
    }
    public Payment createPayment(PaymentDto payment) {
        Payment payment1 = new Payment();
        payment1.setPaymentMethod(payment.getPaymentMethod());
        payment1.setPaymentMethod(payment.getPaymentMethod());
        payment1.setOrder(payment.getOrder());
        return paymentRepository.save(payment1);

    }
    public Result deletePaymentById(Integer id) {
        paymentRepository.deleteById(id);
        return new Result();
    }
    public Result updatePaymentById(Integer id, PaymentDto payment) {
        Payment payment1 = paymentRepository.getReferenceById(id);
        payment1.setPaymentMethod(payment.getPaymentMethod());
        payment1.setPaymentMethod(payment.getPaymentMethod());
        payment1.setOrder(payment.getOrder());
        paymentRepository.save(payment1);
        return new Result();
    }

}
