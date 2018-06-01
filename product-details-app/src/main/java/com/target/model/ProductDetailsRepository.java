package com.target.model;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductDetailsRepository extends MongoRepository<ProductDetails,String>{
	
	public ProductDetails findDocumentById(String productId);

}
