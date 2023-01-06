package com.example.javatraininng.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aspose.pdf.Document;
import com.aspose.pdf.ExcelSaveOptions;
import com.aspose.pdf.SaveFormat;
import com.spire.pdf.FileFormat;
import com.spire.pdf.PdfDocument;
@RestController  
public class PDFtoExcel {

	@RequestMapping("/pdftoExcel")  
	public String pdftoExcel()
	{
		Document doc = new Document("C:\\andrew\\election\\AC022.pdf");
		// Set Excel options
		//ExcelSaveOptions options = new ExcelSaveOptions();
		// Set output format
		//options.setFormat(ExcelSaveOptions.ExcelFormat.XLSX);
		// Convert PDF to XLSX
		doc.save("workbook.xlsx", SaveFormat.Excel);
		
		return "true";
	}
	@RequestMapping("/pdftoExcelSpire") 
	public String pdftoExcelSpire()
	{
		PdfDocument pdf = new PdfDocument();
        //Load the PDF document
        pdf.loadFromFile("C:\\andrew\\election\\AC022.pdf");

        //Save the PDF document to XLSX
        pdf.saveToFile("PdfToExcel.xlsx", FileFormat.XLSX);
		
		return "true";
	}	
}
