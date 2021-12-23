package com.coderscampus.assignment6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ReadingFile {
	
	
	public List<Tesla> values(String fileName) throws IOException{
		
		
		BufferedReader fileReader = null;
		
		
		final String DELIMITER = "-";
		
		List<Tesla> teslas = new ArrayList<>();
		
		try 
		{
			String line = "";
			fileReader = new BufferedReader(new FileReader(fileName));
			 String title = fileReader.readLine();
			while ((line = fileReader.readLine()) != null) {
				
				String[] tokens = line.split(",");
				String[] splitDate = tokens[0].split(DELIMITER);
				String month = splitDate[0];
				String year = splitDate[1];
				String yearMonthDate = year + DELIMITER + month;
				DateTimeFormatter inputFormat = DateTimeFormatter.ofPattern("yy-MMM");
				YearMonth date = YearMonth.parse(yearMonthDate, inputFormat);
				Integer sales = Integer.parseInt(tokens[1]);
				teslas.add(new Tesla(sales, date));
				
			}
		}
		catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} finally {
			try {
				fileReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return teslas;
		
		
	}
		
		
		
	}


