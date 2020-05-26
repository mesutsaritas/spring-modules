package com.saritasmesut.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saritasmesut.model.Customer;

/**
 * @author msaritas
 *
 */
@Service
public class CustomerService {

	private final AccountService accountService;

	@Autowired
	public CustomerService(AccountService accountService) {
		this.accountService = accountService;
	}

	/**
	 * GET Customer's Account
	 * 
	 * @param customerId
	 * @return
	 */
	public String customerAccount(Long customerId) {
		return accountService.customersAccount(customerId);

	}

	/**
	 * -->GET Customer List
	 * 
	 * @return
	 */
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<>();
		Customer customer = new Customer(1L, "Mesut", "Saritas");
		Customer customer2 = new Customer(2L, "Mert", "Saritas");
		customers.add(customer);
		customers.add(customer2);
		System.out.println("Customer list returned successfully");
		return customers;
	}

}
