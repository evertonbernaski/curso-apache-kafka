package com.everton.paymentservice.service;

import com.everton.paymentservice.model.Payment;

public interface PaymentService {

    void sendPayment(Payment payment);
}
