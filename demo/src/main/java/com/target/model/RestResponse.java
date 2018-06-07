/**
 * Model class representing response of Product service
 * author : sjain
 * version : 1.0
 */

package com.target.model;

public class RestResponse {

	private String id;
	private String name;
	private ProductPrice productPrice;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ProductPrice getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(ProductPrice productPrice) {
		this.productPrice = productPrice;
	}

}
