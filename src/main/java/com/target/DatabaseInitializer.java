/**package com.target;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;

import com.target.model.ProductDetails;
import com.target.model.ProductDetailsRepository;

public class DatabaseInitializer {

	@EventListener
	public void seed(ContextRefreshedEvent event) {
		seedProductPriceRepository();
	}

	@Autowired
	private ProductDetailsRepository productDetailsRepository;

	private void seedProductPriceRepository() {
		ProductDetails productDetails1 = new ProductDetails("15117729", "Stroller");
		ProductDetails productDetails2 = new ProductDetails("16483589", "USD");
		ProductDetails productDetails3 = new ProductDetails("16696652", "EUR");
		ProductDetails productDetails4 = new ProductDetails("15643793", "INR");
		ProductDetails productDetails5 = new ProductDetails("12345632", "Stroller");
		ProductDetails productDetails6 = new ProductDetails("11111111", "USD");
		ProductDetails productDetails7 = new ProductDetails("23223232", "EUR");
		ProductDetails productDetails8 = new ProductDetails("55334455", "INR");
		productDetailsRepository.save(productDetails1);
		productDetailsRepository.save(productDetails2);
		productDetailsRepository.save(productDetails3);
		productDetailsRepository.save(productDetails4);
		productDetailsRepository.save(productDetails5);
		productDetailsRepository.save(productDetails6);
		productDetailsRepository.save(productDetails7);
		productDetailsRepository.save(productDetails8);

	}
}*/
