package com.target.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.TestComponent;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.target.model.ProductDetails;
import com.target.model.ProductPrice;
import com.target.service.ProductDetailsService;
import com.target.service.ProductPriceService;

@RunWith(SpringRunner.class)
@WebMvcTest(value = ProductController.class, secure = false)
public class ProductControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private ProductDetailsService productDetailsService;
	
	@MockBean
	private ProductPriceService productPriceService;
	
	ProductPrice mockPrice = new ProductPrice("2345",4.5,"USD");
	ProductDetails mockDetails = new ProductDetails("2345","Headphones");
	
	@Test
	public void getProductDetailsByIdTest() throws Exception{
		Mockito.when(productPriceService.getProductPriceDetailsById(Mockito.anyString())).thenReturn(mockPrice);
		Mockito.when(productDetailsService.getProductDetailsById(Mockito.anyString())).thenReturn(mockDetails);
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
				"/products/2345").accept(
				MediaType.APPLICATION_JSON);

		MvcResult result = mockMvc.perform(requestBuilder).andReturn();

		System.out.println(result.getResponse());
		String expected = "{\"id\":\"2345\",\"name\":\"Headphones\",\"currencyPrice\":4.5,\"currencyCode\":\"USD\"}";

		JSONAssert.assertEquals(expected, result.getResponse()
				.getContentAsString(), false);
		
	}
	

}
