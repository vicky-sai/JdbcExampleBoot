package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Component 
@Entity 
@Table(name="vdsi_payment")

public class Payment {
	@Id 
	private long txnId;
	private String customerName; 
	private double txnAmount;
}
