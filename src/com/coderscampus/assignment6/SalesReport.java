package com.coderscampus.assignment6;


import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class SalesReport {
	
	public String reportData(List<Tesla> modelSales, String reportData) {
		Map<Integer, List<Tesla>> salesPerYear = modelSales.stream().collect(Collectors.groupingBy(t ->t.getDate().getYear()));

		
		Set<Entry<Integer, List<Tesla>>>  entrySet = salesPerYear.entrySet();

		
		
		entrySet.stream().forEach(entry -> System.out.println(
				          entry.getKey() + " -> " + entry.getValue().stream().collect(Collectors.summingInt(n -> n.getSales()))));
		
		return reportData;
		
	}
	
	public String getBestAndWorstMonth(List<Tesla> modelSales, String reportData) {
		
		
	
		
		Tesla maxSales = Collections.max(modelSales, Comparator.comparingInt(e -> e.getSales()));
		Tesla minSales = Collections.min(modelSales, Comparator.comparingInt(e -> e.getSales()));
		
		
		
		return "The best month for Model " + reportData + " was: " + maxSales.getDate() + "\n" + "The worst month for Model " + reportData + " was: " +minSales.getDate() + "\n";

		
	}

}
