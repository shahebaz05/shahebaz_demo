package com.example.demo.service;

public class SavingAccountServiceImpl extends AccountAbstractClass {
	@Override
	public void proceeData() {
		System.out.println("Processing data for Saving Account");
	}

	@Override
	public String getBalance() {
		System.out.println("Your Balance is 100000");
		return "Your Saving Account Balance is 100000 ";
	}

}
