package org.example.main;

enum Day{
	MON("Monday",10),TUE("Tuesday", 20),WED("Thursday", 30);
	
	private String dayName;
	private int dayNumber;
	
	private Day(String dayName, int dayNumber){
		this.dayName = dayName;
		this.dayNumber = dayNumber;
	}
	
	public String getDayName() {
		return dayName;
	}
	public int getdayNumber() {
		return dayNumber;
	}
	public String toString(){
		return String.format("%-5s%-5d%-10s%-5d", this.name(),this.ordinal(),this.dayName, this.dayNumber);
	}
}	
class Program {
	public static void main(String[] args) {
		Day[] days = Day.values();
		for(Day day : days)
			System.out.println(day.toString());
	}
	public static void main1(String[] args) {
		Day day = Day.MON;
		System.out.println(day.name()+", "+day.getDayName()+", "+day.getdayNumber());
		System.out.println("Ordinal	: "+day.ordinal());
		
		day = Day.TUE;
		System.out.println(day.name()+", "+day.getDayName()+", "+day.getdayNumber());
		System.out.println("Ordinal	: "+day.ordinal());
		
		day = Day.WED;
		System.out.println(day.name()+", "+day.getDayName()+", "+day.getdayNumber());
		System.out.println("Ordinal	: "+day.ordinal());
	}
}
