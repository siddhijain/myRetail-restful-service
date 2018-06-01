package com.target.model;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductPriceRepository extends MongoRepository<ProductPrice,String>{
	
	public ProductPrice findDocumentById(String productId);

}
