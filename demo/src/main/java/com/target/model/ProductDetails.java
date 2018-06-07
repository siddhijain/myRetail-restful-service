/**
 * Model class representing Product details
 * author : sjain
 * version : 1.0
 */
package com.target.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductDetails {

	private String productId;
	private String productName;

	public ProductDetails() {
	};

	public ProductDetails(String id, String name) {
		this.productId = id;
		this.productName = name;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

}
