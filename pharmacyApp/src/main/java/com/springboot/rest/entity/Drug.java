package com.springboot.rest.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "drug")
@Data
public class Drug {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "drug_no")
	protected int drugNo;
	@Column(name = "drug_nm")
	protected String drugName;
	@Column(name = "generic_name")
	protected String genericName;
	protected String manufacturer;
	protected String category;
	@Column(name = "batch_no")
	protected String batchNo;
	@Column(name = "manufactured_dt")
	protected LocalDate manufacturedDate;
	@Column(name = "expiry_month")
	protected int expiryMonth;
	@Column(name = "expiry_year")
	protected int expiryYear;
	protected int quantity;
	protected double price;

}
