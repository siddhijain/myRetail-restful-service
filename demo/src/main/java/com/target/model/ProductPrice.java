/**
 * Model class representing Product price
 * author : sjain
 * version : 1.0
 */
package com.target.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@Document
public class ProductPrice {

	@Id
	private String id;

	private double value;
	private String currency_code;

	public ProductPrice() {
	}

	public ProductPrice(String id, double value, String currency_code) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.value = value;
		this.currency_code = currency_code;
	}

	public String getId() {
		return id;
	}

	public void setId(String productId) {
		this.id = productId;
	}

	public double getCurrency() {
		return value;
	}

	public void setCurrency(double currency) {
		this.value = currency;
	}

	public String getCurrencyType() {
		return currency_code;
	}

	public void setCurrencyType(String currency_code) {
		this.currency_code = currency_code;
	}

}
