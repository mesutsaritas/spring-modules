package com.saritasmesut.service;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * @author msaritas
 *
 */
@Service
public class AccountService {

	private RestTemplate restTemplate;

	@Autowired
	public AccountService(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	/**
	 * Get Customer's Account Information
	 * 
	 * @param customerId
	 * @return
	 */
	@HystrixCommand(fallbackMethod = "reliable")
	public String customersAccount(Long customerId) {
		/**
		 * Can be tested by changing the url
		 */
		// URI uri = URI.create("http://localhost:8080/customers");
		URI uri = URI.create("http://localhost:8080/customersAccount/5");
		return this.restTemplate.getForObject(uri, String.class);
	}

	/**
	 * 
	 * @return
	 */
	@SuppressWarnings("unused")
	private String reliable(Long customerId) {
		System.out.println("Cannot access customers account");
		return "Cannot access customers account";

	}
}
