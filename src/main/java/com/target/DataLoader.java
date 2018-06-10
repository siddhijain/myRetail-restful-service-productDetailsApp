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

import com.target.model.ProductDetails;
import com.target.model.ProductDetailsRepository;

@Component
public class DataLoader implements ApplicationRunner {

	private ProductDetailsRepository productDetailsRepository;

	@Autowired
	public DataLoader(ProductDetailsRepository productDetailsRepository) {
		this.productDetailsRepository = productDetailsRepository;
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		productDetailsRepository.save(new ProductDetails("15117729", "candle"));
		productDetailsRepository.save(new ProductDetails("16483589", "lotion"));
		productDetailsRepository.save(new ProductDetails("16696652", "shoe lace"));
		productDetailsRepository.save(new ProductDetails("15643793", "chalk"));
		productDetailsRepository.save(new ProductDetails("12345632", "wagon"));
		productDetailsRepository.save(new ProductDetails("11111111", "CD"));
		productDetailsRepository.save(new ProductDetails("23223232", "shovel"));
		productDetailsRepository.save(new ProductDetails("55334455", "glasses"));
		productDetailsRepository.save(new ProductDetails("22222222", "twezzers"));
		productDetailsRepository.save(new ProductDetails("33333333", "water bottle"));
		productDetailsRepository.save(new ProductDetails("44444444", "cookie"));
		productDetailsRepository.save(new ProductDetails("55555555", "toothbrush"));
		productDetailsRepository.save(new ProductDetails("66666666", "milk"));
		productDetailsRepository.save(new ProductDetails("77777777", "cellphone cover"));
		productDetailsRepository.save(new ProductDetails("88888888", "picture frame"));
		productDetailsRepository.save(new ProductDetails("99999999", "sandal"));
		productDetailsRepository.save(new ProductDetails("12345678", "face wash"));
		productDetailsRepository.save(new ProductDetails("44897334", "doll"));
		productDetailsRepository.save(new ProductDetails("87654321", "paper"));
		productDetailsRepository.save(new ProductDetails("76543210", "tissue box"));
		productDetailsRepository.save(new ProductDetails("65432109", "toe ring"));
		productDetailsRepository.save(new ProductDetails("54321098", "spoon"));
		productDetailsRepository.save(new ProductDetails("43210987", "fork"));
		productDetailsRepository.save(new ProductDetails("32109876", "nail file"));
		productDetailsRepository.save(new ProductDetails("21098765", "pencil"));
		productDetailsRepository.save(new ProductDetails("10987654", "flag"));
		productDetailsRepository.save(new ProductDetails("09876543", "soap"));
		productDetailsRepository.save(new ProductDetails("89012345", "thread"));
		productDetailsRepository.save(new ProductDetails("90123456", "knife"));
		productDetailsRepository.save(new ProductDetails("45678901", "charger"));
		productDetailsRepository.save(new ProductDetails("56789012", "canvas"));
		productDetailsRepository.save(new ProductDetails("67890123", "socks"));

	}

}
