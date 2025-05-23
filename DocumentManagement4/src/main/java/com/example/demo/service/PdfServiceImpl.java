package com.example.demo.service;

public class PdfServiceImpl extends DoocumentServiceAB {

	@Override
	public void processData() {
		System.out.println("Process DATA for PDF");

	}

	@Override
	public String printData() {
		System.out.println("Print data for PDF");
		return "Pdf print";
	}

}
