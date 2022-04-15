package com.tns.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Example1 {

	public static void main(String[] args) {
		LocalDate d=LocalDate.now();
		LocalTime e = LocalTime.now();
		LocalDateTime f = LocalDateTime.now();	
		LocalDate d1=LocalDate.of(2022,Month.FEBRUARY,28);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(d1);

	}

}
