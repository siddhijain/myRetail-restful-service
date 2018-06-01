package com.target.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.target.model.ProductDetails;
import com.target.model.ProductDetailsRepository;

@Service
public class ProductDetailsService {
	
	@Autowired
	private ProductDetailsRepository productDetailsRepository;
	
	public ProductDetails getProductDetailsById(String productId) {
		
		ProductDetails productDetails1 = new ProductDetails("15117729","Stroller");
		ProductDetails productDetails2 = new ProductDetails("16483589","USD");
		ProductDetails productDetails3 = new ProductDetails("16696652","EUR");
		ProductDetails productDetails4 = new ProductDetails("15643793","INR");
		productDetailsRepository.save(productDetails1);
		productDetailsRepository.save(productDetails2);
		productDetailsRepository.save(productDetails3);
		productDetailsRepository.save(productDetails4);
		
		ProductDetails productDetails = productDetailsRepository.findDocumentById(productId);
		
		ProductDetails pd = new ProductDetails();
		pd.setProductId(productId);
		pd.setProductName(productDetails.getProductName());
		
		return pd;
		
	}
	
	public void updateProductDetailsById(String productId, String productName) {
		ProductDetails productDetails = productDetailsRepository.findDocumentById(productId);
		productDetails.setProductName(productName);
	}

}
