package com.example.demo.factory;

import com.example.demo.service.DocumentServiceInterface;
import com.example.demo.service.ExcelServiceImpl;
import com.example.demo.service.PdfServiceImpl;

public class DocumentFactory {

	public static DocumentServiceInterface getObject(String docType) {
		if ("pdfServiceImpl".equals(docType))
			return new PdfServiceImpl();
		if ("excelServiceImpl".equals(docType))
			return new ExcelServiceImpl();
		return null;
	}

}
