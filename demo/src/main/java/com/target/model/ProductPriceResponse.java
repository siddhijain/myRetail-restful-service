/**
 * Model class representing product price response of Product service
 * author : sjain
 * version : 1.0
 */

package com.target.model;

public class ProductPriceResponse {
	
	private double value;
	private String currency_code;
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public String getCurrency_code() {
		return currency_code;
	}
	public void setCurrency_code(String currency_code) {
		this.currency_code = currency_code;
	}
	
	

}
