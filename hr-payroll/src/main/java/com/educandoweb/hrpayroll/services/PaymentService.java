package com.educandoweb.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.educandoweb.hrpayroll.entites.Payment;

@Service
public class PaymentService {

	public Payment getPayment(Long workerId, Integer days) {
		return new Payment("tayna", 250.0, days);
	}
}
