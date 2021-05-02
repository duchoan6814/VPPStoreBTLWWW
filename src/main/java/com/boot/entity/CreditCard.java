package com.boot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Credit_Card")
public class CreditCard {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "number")
	private String number;
	
	@Column(name = "type")
	private String type;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public CreditCard(Long id, String number, String type) {
		super();
		this.id = id;
		this.number = number;
		this.type = type;
	}

	public CreditCard() {
		super();
	}

	@Override
	public String toString() {
		return "CreditCard [id=" + id + ", number=" + number + ", type=" + type + "]";
	}
	
	
}
