/**package com.target;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;

import com.target.model.ProductPrice;
import com.target.model.ProductPriceRepository;

public class DatabaseInitializer {
	
	@Autowired 
	private ProductPriceRepository productPriceRepository;
	
	@EventListener(ContextRefreshedEvent.class)
	public void seed(ContextRefreshedEvent event) {
		seedProductPriceRepository();
	}
	
	private void seedProductPriceRepository() {
		ProductPrice price = new ProductPrice("15117729", 3.5, "USD");
		ProductPrice price1 = new ProductPrice("16483589", 10, "USD");
		ProductPrice price2 = new ProductPrice("16696652", 12, "EUR");
		ProductPrice price3 = new ProductPrice("15643793", 45, "INR");
		ProductPrice price4 = new ProductPrice("12345632", 15, "USD");
		ProductPrice price5 = new ProductPrice("11111111", 5, "USD");
		ProductPrice price6 = new ProductPrice("23223232", 9, "EUR");
		ProductPrice price7 = new ProductPrice("55334455", 2, "INR");
		productPriceRepository.save(price);
		productPriceRepository.save(price1);
		productPriceRepository.save(price2);
		productPriceRepository.save(price3);
		productPriceRepository.save(price4);
		productPriceRepository.save(price5);
		productPriceRepository.save(price6);
		productPriceRepository.save(price7);

	}
}*/
