package com.saritasmesut.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.saritasmesut.model.Customer;
import com.saritasmesut.service.CustomerService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * @author msaritas
 *
 */
@Api(value = "/customers")
@RestController
@RequestMapping("/customers")
public class CustomerController {

	private final CustomerService customerService;

	@Autowired
	public CustomerController(CustomerService customerService) {
		this.customerService = customerService;
	}

	@ApiOperation("Get Customer Account Information")
	@GetMapping(value = "/account/{customerId}")
	@ResponseStatus(value = HttpStatus.OK)
	public String load(@PathVariable Long customerId) {
		return customerService.customerAccount(customerId);

	}

	@ApiOperation("Get Customer List")
	@GetMapping()
	@ResponseStatus(value = HttpStatus.OK)
	public List<Customer> list() {
		return customerService.findAll();

	}

}
