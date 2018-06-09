/**
 * This class is to seed mongoDB
 * @author sjain
 * @version 1.0 
 */
package com.target;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.target.model.ProductPrice;
import com.target.model.ProductPriceRepository;

@Component
public class DataLoader implements ApplicationRunner {

	private ProductPriceRepository productPriceRepository;

	@Autowired
	public DataLoader(ProductPriceRepository productPriceRepository) {
		this.productPriceRepository = productPriceRepository;
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		productPriceRepository.save(new ProductPrice("15117729", 3.5, "USD"));
		productPriceRepository.save(new ProductPrice("16483589", 10, "USD"));
		productPriceRepository.save(new ProductPrice("16696652", 12, "EUR"));
		productPriceRepository.save(new ProductPrice("15643793", 45, "INR"));
		productPriceRepository.save(new ProductPrice("12345632", 15, "USD"));
		productPriceRepository.save(new ProductPrice("11111111", 5, "USD"));
		productPriceRepository.save(new ProductPrice("23223232", 9, "EUR"));
		productPriceRepository.save(new ProductPrice("55334455", 2, "INR"));
		productPriceRepository.save(new ProductPrice("22222222", 3.5, "USD"));
		productPriceRepository.save(new ProductPrice("33333333", 10, "USD"));
		productPriceRepository.save(new ProductPrice("44444444", 12, "EUR"));
		productPriceRepository.save(new ProductPrice("55555555", 45, "INR"));
		productPriceRepository.save(new ProductPrice("66666666", 15, "USD"));
		productPriceRepository.save(new ProductPrice("77777777", 5, "USD"));
		productPriceRepository.save(new ProductPrice("88888888", 9, "EUR"));
		productPriceRepository.save(new ProductPrice("99999999", 2, "INR"));
		productPriceRepository.save(new ProductPrice("12345678", 3.5, "USD"));
		productPriceRepository.save(new ProductPrice("44897334", 10, "USD"));
		productPriceRepository.save(new ProductPrice("87654321", 12, "EUR"));
		productPriceRepository.save(new ProductPrice("76543210", 45, "INR"));
		productPriceRepository.save(new ProductPrice("65432109", 15, "USD"));
		productPriceRepository.save(new ProductPrice("54321098", 5, "USD"));
		productPriceRepository.save(new ProductPrice("43210987", 9, "EUR"));
		productPriceRepository.save(new ProductPrice("32109876", 2, "INR"));
		productPriceRepository.save(new ProductPrice("21098765", 3.5, "USD"));
		productPriceRepository.save(new ProductPrice("10987654", 10, "USD"));
		productPriceRepository.save(new ProductPrice("09876543", 12, "EUR"));
		productPriceRepository.save(new ProductPrice("89012345", 45, "INR"));
		productPriceRepository.save(new ProductPrice("90123456", 15, "USD"));
		productPriceRepository.save(new ProductPrice("45678901", 5, "USD"));
		productPriceRepository.save(new ProductPrice("56789012", 9, "EUR"));
		productPriceRepository.save(new ProductPrice("67890123", 2, "INR"));

	}

}
