package com.tns.enum1;

public class Example4
{

	  public enum Day
	  {
	    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY 
	  }

	  public static void main(String[] args)
	  {
	    Day theDay = Day.THURSDAY;
	    printDayGreeting(theDay);
	  }

	  public static void printDayGreeting(Day day)
	  {
	    if (day == Day.FRIDAY)
	      System.out.println("TGIF");
	    else
	      System.out.println("Some other day");
	  }
	  
	}
