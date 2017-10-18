package com.bookstore.service;

import com.bookstore.domain.Payment;
import com.bookstore.domain.UserPayment;

public interface PaymentService {
	Payment setByUserPayment(UserPayment userPayment, Payment payment);
}
