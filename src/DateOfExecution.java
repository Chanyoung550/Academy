package ch10;

import java.time.LocalDate;

public class DateOfExecution {
	static String date;
	static int count=0;
	
	static {
		System.out.println(++count);
		LocalDate nDate=LocalDate.now();
		date=nDate.toString();
		
	}
	public static void main(String[] args) {
		System.out.println(date);
	}

}
