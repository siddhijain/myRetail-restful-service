/**
 * This service is used to get and update Product details of products by id.
 * @author sjain
 * @version 1.0 
 */
package com.target.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.target.model.ProductDetails;
import com.target.model.ProductDetailsRepository;

@Service
public class ProductDetailsService {

	@Autowired
	private ProductDetailsRepository productDetailsRepository;

	public ProductDetails getProductDetailsById(String productId) {

		/**
		 * ProductDetails productDetails1 = new ProductDetails("15117729","Stroller");
		 * ProductDetails productDetails2 = new ProductDetails("16483589","USD");
		 * ProductDetails productDetails3 = new ProductDetails("16696652","EUR");
		 * ProductDetails productDetails4 = new ProductDetails("15643793","INR");
		 * ProductDetails productDetails5 = new ProductDetails("12345632","Stroller");
		 * ProductDetails productDetails6 = new ProductDetails("11111111","USD");
		 * ProductDetails productDetails7 = new ProductDetails("23223232","EUR");
		 * ProductDetails productDetails8 = new ProductDetails("55334455","INR");
		 * productDetailsRepository.save(productDetails1);
		 * productDetailsRepository.save(productDetails2);
		 * productDetailsRepository.save(productDetails3);
		 * productDetailsRepository.save(productDetails4);
		 * productDetailsRepository.save(productDetails5);
		 * productDetailsRepository.save(productDetails6);
		 * productDetailsRepository.save(productDetails7);
		 * productDetailsRepository.save(productDetails8);
		 */

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
