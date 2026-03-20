package org.main.example;

import java.util.Arrays;
import java.time.LocalDate;
class Date{
	private int day;
	private int month;
	private int year;
	public Date( ){
		LocalDate ld = LocalDate.now();
		this.day = ld.getDayOfMonth();
		this.month = ld.getMonthValue();
		this.year = ld.getYear();
	}
	public Date(int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}
	@Override
	public String toString( ){
		return this.day+" / "+this.month+" / "+this.year;
	}
}
public class Program10 {
	public static void main(String[] args) {
		Date[] arr = new Date[3];	//array of instance
		arr[0] = new Date();
		arr[1] = new Date();
		arr[2] = new Date();
		System.out.println(Arrays.toString(arr));
	}
	public static void main1(String[] args) {
		Date[] arr = new Date[3];	//array of reference
		System.out.println(Arrays.toString(arr));
	}
}