/**
 * This service is used to get and update Product details of products by id.
 * 
 * @author sjain
 * @version 1.0 
 */
package com.target.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.target.model.ProductDetails;
import com.target.model.ProductPrice;
import com.target.model.ProductPriceRepository;

@Service
public class ProductDetailsService {

	@Autowired
	private ProductPriceRepository productPriceRepository;

	public ProductDetails getProductDetailsById(String productId) {
		String baseURL = "http://localhost:8044/productDetails/";
		String url = baseURL + productId;
		RestTemplate restTemplate = new RestTemplate();
		ProductDetails details = restTemplate.getForObject(url, ProductDetails.class);
		return details;
	}

	public void updateProductDetailsById(String productId, double value, String currencyCode) {
		ProductPrice priceDetails = productPriceRepository.findDocumentById(productId);
		priceDetails.setCurrency(value);
		priceDetails.setCurrencyType(currencyCode);
	}

}
