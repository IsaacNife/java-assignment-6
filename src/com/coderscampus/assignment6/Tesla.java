package com.coderscampus.assignment6;

import java.time.YearMonth;
import java.util.Objects;


public class Tesla {
	
	private Integer sales;
	private YearMonth date;
	
	
	public Tesla(Integer sales, YearMonth date) {
		
		this.sales = sales;
		this.date = date;
		
	}
	public Integer getSales() {
		return sales;
	}
	public void setSales(Integer sales) {
		this.sales = sales;
	}
	public YearMonth getDate() {
		return date;
	}
	public void setDate(YearMonth date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Tesla [sales=" + sales + ", date=" + date + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(sales);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tesla other = (Tesla) obj;
		return Objects.equals(sales, other.sales);
	}
	
	
	
	

}
