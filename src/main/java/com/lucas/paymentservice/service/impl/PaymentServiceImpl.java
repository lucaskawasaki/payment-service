package com.lucas.paymentservice.service.impl;

import com.lucas.paymentservice.model.Payment;
import com.lucas.paymentservice.service.PaymentService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class PaymentServiceImpl implements PaymentService {
    @Override
    public void sendPayment(Payment payment) {
        log.info("Recebi o pagamento {}", payment);
    }
}
