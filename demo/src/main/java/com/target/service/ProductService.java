package com.target.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.target.model.ProductDetails;
import com.target.model.ProductPrice;
import com.target.model.ProductPriceRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductPriceRepository productPriceRepository;
	
	public ProductPrice getProductPriceDetailsById(String productId) {
		

		
		ProductPrice price = new ProductPrice("15117729",3.5,"USD");
		ProductPrice price1 = new ProductPrice("16483589",10,"USD");
		ProductPrice price2 = new ProductPrice("16696652",12,"EUR");
		ProductPrice price3 = new ProductPrice("15643793",45,"INR");
		productPriceRepository.save(price);
		productPriceRepository.save(price1);
		productPriceRepository.save(price2);
		productPriceRepository.save(price3); 
		
//		List<ProductPrice> ppd = productPriceRepository.findAll();
//		for(ProductPrice pc : ppd) System.out.println(pc.getCurrency() + "" + pc.getCurrencyType());
		ProductPrice priceDetails = productPriceRepository.findDocumentById(productId);
//		System.out.println(priceDetails.getCurrency() + "" + priceDetails.getCurrencyType());
		return priceDetails;
		
	}
	
	public ProductDetails getProductDetailsById(String productId) {
	/**	ProductDetails productDetails = new ProductDetails();
		productDetails.setProductName("test"); */
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
