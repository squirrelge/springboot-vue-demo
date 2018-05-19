package com.roypan.platohome;

import com.roypan.platohome.model.QuotationDo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PlatoHomeApplicationTests {
	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;

	private String name = "roypan";
	@Test
	public void contextLoads() {
		String baseUrl = "http://localhost:" + port;
		addTest(baseUrl);
	}

	public void addTest(String baseUrl){
		QuotationDo quotationDo = new QuotationDo();
		quotationDo.setName(name);
		quotationDo.setSex(1);
		quotationDo.setCountry("China");
		quotationDo.setDate(LocalDate.now());
		quotationDo.setQuotation("Hello World!");
		String result = restTemplate.postForObject(baseUrl + "/quotation/add",quotationDo,String.class);
		System.out.println("add:" + result);
	}

	public void updateTest(String baseUrl){

	}
}
