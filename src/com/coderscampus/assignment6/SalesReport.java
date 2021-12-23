package com.coderscampus.assignment6;

import java.util.ArrayList;
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
		
		List<Tesla> tesla = modelSales.stream().collect(Collectors.toList());
		
		List<Integer> salesValues = tesla.stream().map(date -> date.getSales().intValue())
				                                  .collect(Collectors.toList());
		
		Integer bestSalesMonth = salesValues.stream().max(Integer::compare).get();
		
		Integer worstSalesMonth = salesValues.stream().min(Integer::compare).get();
		
		return "The best month for Model " + reportData + " was: " + bestSalesMonth + "\n" + "The worst month for Model " + reportData + " was: " + worstSalesMonth + "\n";

		
	}

}
