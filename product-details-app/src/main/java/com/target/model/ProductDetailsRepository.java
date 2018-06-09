/**
 * Interface representing embedded mongoDb repository
 * author : sjain
 * version : 1.0
 */
package com.target.model;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductDetailsRepository extends MongoRepository<ProductDetails, String> {

	public ProductDetails findDocumentById(String productId);

}
