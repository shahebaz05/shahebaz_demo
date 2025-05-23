package com.example.demo.service;

public class ExcelServiceImpl extends DoocumentServiceAB {

	@Override
	public void processData() {
		System.out.println("Process data for excel");

	}

	@Override
	public String printData() {
		System.out.println("Print Data for excel");
		return "excel print";
	}

}
