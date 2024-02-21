package com.tasks;

import java.util.Scanner;

public class EnumWeekday_2 {

	enum Weekday {
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number between 1 and 7: ");
		int dayNum = scanner.nextInt();

		Weekday weekday = getWeekday(dayNum);
		if (weekday != null) {
			System.out.println("The weekday of " + dayNum + " is: " + weekday);
		} else {
			System.out.println("Invalid input! Please enter a number between 1 and 7.");
		}
		scanner.close();
	}

	public static Weekday getWeekday(int dayNumber) {
		switch (dayNumber) {
		case 1:
			return Weekday.SUNDAY;
		case 2:
			return Weekday.MONDAY;
		case 3:
			return Weekday.TUESDAY;
		case 4:
			return Weekday.WEDNESDAY;
		case 5:
			return Weekday.THURSDAY;
		case 6:
			return Weekday.FRIDAY;
		case 7:
			return Weekday.SATURDAY;
		default:
			return null;
		}
	}
}
