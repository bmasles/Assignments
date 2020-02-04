package com.ss.assignment3;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;


/*
 * Answers to first 4 questions:
 * 1. LocalDateTime
 * 2. .minusDays(7)
 * 3. ZoneId is the id of each time zone, ZonedOffset is the actual difference in time form UTC
 * 4. Instant.from(...) and LocalDateTime(instant, id)
 */

public class DateAndTime {

	public DateAndTime() {
		
	}
	
	public static void printLengthMonths(boolean isLeap) {
		if (isLeap) {
			System.out.println("Janurary: " + Month.JANUARY.maxLength());
			System.out.println("February: " + Month.FEBRUARY.maxLength());
			System.out.println("March: " + Month.MARCH.maxLength());
			System.out.println("April: " + Month.APRIL.maxLength());
			System.out.println("May: " + Month.MAY.maxLength());
			System.out.println("June: " + Month.JUNE.maxLength());
			System.out.println("July: " + Month.JULY.maxLength());
			System.out.println("August: " + Month.AUGUST.maxLength());
			System.out.println("September: " + Month.SEPTEMBER.maxLength());
			System.out.println("October: " + Month.OCTOBER.maxLength());
			System.out.println("November: " + Month.NOVEMBER.maxLength());
			System.out.println("December: " + Month.DECEMBER.maxLength());
		}
		else {
			System.out.println("Janurary: " + Month.JANUARY.maxLength());
			System.out.println("February: " + Month.FEBRUARY.minLength());
			System.out.println("March: " + Month.MARCH.maxLength());
			System.out.println("April: " + Month.APRIL.maxLength());
			System.out.println("May: " + Month.MAY.maxLength());
			System.out.println("June: " + Month.JUNE.maxLength());
			System.out.println("July: " + Month.JULY.maxLength());
			System.out.println("August: " + Month.AUGUST.maxLength());
			System.out.println("September: " + Month.SEPTEMBER.maxLength());
			System.out.println("October: " + Month.OCTOBER.maxLength());
			System.out.println("November: " + Month.NOVEMBER.maxLength());
			System.out.println("December: " + Month.DECEMBER.maxLength());
		}
	}
	
	public static void printMondays(Month mnth) {
		LocalDateTime ldt = LocalDateTime.of(2020, mnth, 1, 0, 0);
		for (int i = 0; i < 6; i++) {
			if (ldt.getDayOfWeek() != DayOfWeek.MONDAY)
				ldt = ldt.plusDays(1L);
			else
				break;
		}
		while (ldt.getMonth().getValue() != mnth.getValue() + 1) {
			System.out.println(ldt);
			ldt = ldt.plusDays(7L);
		}
	}
	
	public static void fridayThirteenth(LocalDate ldt) {
		if (ldt.getDayOfMonth() == 13 && ldt.getDayOfWeek() == DayOfWeek.FRIDAY)
			System.out.println(ldt + " is on Friday the 13th!!!!!!");
		else
			System.out.println("Sorry, " + ldt + " isn't on Friday the 13th...");
	}

	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.now();
		DateAndTime.printLengthMonths(ldt.toLocalDate().isLeapYear());
		System.out.println();
		DateAndTime.printLengthMonths(ldt.minusYears(1).toLocalDate().isLeapYear());
		System.out.println();
		printMondays(Month.JANUARY);
		System.out.println();
		fridayThirteenth(ldt.toLocalDate());
	}

}
