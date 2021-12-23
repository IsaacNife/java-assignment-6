package com.coderscampus.assignment6;

import java.io.IOException;

import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
        String model3Data = "model3";
        String modelSData = "modelS";
        String modelXData = "modelX";
		ReadingFile fileReader = new ReadingFile();
		SalesReport salesReport = new SalesReport();
		

		
		List<Tesla> modelSales = fileReader.values("model3");
		String model3Report = salesReport.reportData(modelSales, model3Data);
		System.out.println(model3Report);
		System.out.println("---------");
		String model3BestAndWorstMonth = salesReport.getBestAndWorstMonth(modelSales, model3Data);
      System.out.println(model3BestAndWorstMonth);
      
      
		 modelSales = fileReader.values("modelS");
		String modelSReport = salesReport.reportData(modelSales, modelSData);
		System.out.println(modelSReport);
		System.out.println("---------");
		String modelSBestAndWorstMonth = salesReport.getBestAndWorstMonth(modelSales, modelSData);
      System.out.println(modelSBestAndWorstMonth);
		
		 modelSales = fileReader.values("modelX");
		String modelXReport = salesReport.reportData(modelSales, modelXData);
		System.out.println(modelXReport);
		System.out.println("---------");
		String modelXBestAndWorstMonth = salesReport.getBestAndWorstMonth(modelSales, modelXData);
      System.out.println(modelXBestAndWorstMonth);
	}

	
}
