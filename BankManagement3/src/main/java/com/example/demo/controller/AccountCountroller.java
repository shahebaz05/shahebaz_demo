package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.factory.AccountFactory;
import com.example.demo.service.AccountsServiceInterface;

@RestController
public class AccountCountroller {
	
	@PostMapping("balance/{accType}")
	public String getBalance(@PathVariable String accType) {
		AccountsServiceInterface as = AccountFactory.getIntance(accType);
		as.readDataFromDB();
		as.proceeData();

		return as.getBalance();

	}
}
