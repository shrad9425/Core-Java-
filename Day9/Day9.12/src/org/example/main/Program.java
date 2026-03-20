package org.example.main;

enum Day{
	MON("Monday"),TUE( 20),WED("Wednesday", 30);
	
	private String dayName;
	private int dayNumber;
	
	private Day(String dayName, int dayNumber){
		this.dayName = dayName;
		this.dayNumber = dayNumber;
	}
	private Day(String dayName) {
		this.dayName = dayName;
	}
	
	private Day(int dayNumber) {
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
		Day day = Day.TUE;
		int index = day.ordinal();
		
		Day[] arr = Day.values();
		day = arr[ index + 1 ];
		System.out.println(day);
	}
	public static void main1(String[] args) {
		Day[] days = Day.values();
		for(Day day : days)
			System.out.println(day.toString());
	}
}
