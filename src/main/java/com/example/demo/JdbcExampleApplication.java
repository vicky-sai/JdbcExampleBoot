package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.model.Payment;
import com.example.demo.services.PaymentService;

@SpringBootApplication
public class JdbcExampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(JdbcExampleApplication.class, args);
		
		PaymentService service = ctx.getBean(PaymentService.class);
		
		Payment pmt = ctx.getBean(Payment.class);
		
		pmt.setCustomerName("Vicky");
		pmt.setTxnId(101);
		pmt.setTxnAmount(2000.00);
		
		service.save(pmt);
	}

}
