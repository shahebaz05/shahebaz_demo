package com.example.demo.service;

public class CurrentAccountServiceImpl extends AccountAbstractClass {

	@Override
	public void proceeData() {
		System.out.println("Processing data for Current Account");
	}
	
	@Override
	public String getBalance() {
		System.out.println("Your Balance is 340000");
		return "Your Current Account Balance is 3400000 ";
	}

}
