package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.factory.DocumentFactory;
import com.example.demo.service.DocumentServiceInterface;

@RestController
public class DocumentController {

	@GetMapping("print/{docType}")
	public String printInvoice(@PathVariable String docType) {
		DocumentServiceInterface ds = DocumentFactory.getObject(docType);

		return ds.printDocument();
	}
	@GetMapping("login")
	public String get()
	{
		return  "Welcome";
	}
}
