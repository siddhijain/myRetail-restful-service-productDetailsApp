package com.target.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import com.target.model.ProductDetails;
import com.target.service.ProductDetailsService;

@RunWith(SpringRunner.class)
@WebMvcTest(value = ProductDetailsController.class, secure = false)
public class ProductDetailsControllerTest { 
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private ProductDetailsService productDetailsService;

	ProductDetails mockDetails = new ProductDetails("2345","Headphones");
	
	@Test
	public void getProductDetailsByIdTest() throws Exception{
		Mockito.when(productDetailsService.getProductDetailsById(Mockito.anyString())).thenReturn(mockDetails);
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
				"/productDetails/2345").accept(
				MediaType.APPLICATION_JSON);

		MvcResult result = mockMvc.perform(requestBuilder).andReturn();

		System.out.println(result.getResponse());
		String expected = "{\"productName\":\"Headphones\",\"productId\":\"2345\"}";

		JSONAssert.assertEquals(expected, result.getResponse()
				.getContentAsString(), true);
			
		}
		

}



