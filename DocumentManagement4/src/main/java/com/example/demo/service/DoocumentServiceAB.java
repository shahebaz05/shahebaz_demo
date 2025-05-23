package com.example.demo.service;

abstract public class DoocumentServiceAB implements DocumentServiceInterface {
	public void readDataFromDB() {
		System.out.println("Reading the data From DB");
	}

	@Override
	public String printDocument() {

		readDataFromDB();
		processData();

		return printData();
	}
}
