package com.tns.date;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Example4 {

	public static void main(String[] args) {
		LocalDate date1 = LocalDate.now();
		LocalDate date2 = date1.plusDays(101);
		 
		long diffInDays = ChronoUnit.DAYS.between(date1, date2);
		System.out.println(diffInDays);
	}
}