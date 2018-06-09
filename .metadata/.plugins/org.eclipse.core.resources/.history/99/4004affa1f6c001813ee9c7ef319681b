package com.target.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.target.model.ProductDetails;
import com.target.service.ProductDetailsService;

@RestController
@RequestMapping(value = "/productDetails")
public class ProductDetailsController {
	
	@Autowired
	ProductDetailsService productDetailsService;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ProductDetails getProductDetailsById(@PathVariable("id") String productId) {
		return productDetailsService.getProductDetailsById(productId);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void updateProductDetailsById(@PathVariable("id") String productId, @RequestBody ProductDetails productDetails) {
		productDetailsService.updateProductDetailsById(productId,productDetails.getProductName());
	}

}
