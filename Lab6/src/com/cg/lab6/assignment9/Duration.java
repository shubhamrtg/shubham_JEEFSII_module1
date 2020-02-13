package com.cg.lab6.assignment9;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Duration 
{
	public void durationBetween(String date)
	{
		DateTimeFormatter myFormat =DateTimeFormatter.ofPattern("dd MM yyyy");

	    LocalDate date1=LocalDate.parse(date, myFormat);
		LocalDate date2 =LocalDate.now();
		Period difference=Period.between(date1,date2);
		System.out.printf("Difference is %d years, %d months and %d days",Math.abs(difference.getYears()),Math.abs(difference.getMonths()),Math.abs(difference.getDays()));
	}
}
