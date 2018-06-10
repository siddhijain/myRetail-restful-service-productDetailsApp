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

		return productDetailsRepository.findDocumentById(productId);

	}

	public void updateProductDetailsById(String productId, String productName) {
		ProductDetails productDetails = productDetailsRepository.findDocumentById(productId);
		productDetails.setProductName(productName);
		productDetailsRepository.save(productDetails);
	}

}
