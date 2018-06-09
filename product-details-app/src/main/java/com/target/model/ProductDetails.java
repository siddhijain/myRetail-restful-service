/**
 * Model class representing Product details
 * author : sjain
 * version : 1.0
 */
package com.target.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@Document
public class ProductDetails {

	@Id
	private String id;

	private String productName;

	public ProductDetails() {
	}

	public ProductDetails(String id, String name) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.productName = name;
	}

	public String getProductId() {
		return id;
	}

	public void setProductId(String productId) {
		this.id = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

}
