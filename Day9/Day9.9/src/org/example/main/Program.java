package org.example.main;

enum Day{
	MON("Monday"),TUE("Tuesday"),WED("Wednesday");
	
	private String dayName;
	
	private Day(String dayName){
		this.dayName = dayName;
		//System.out.println("Inside Constr.");
	}
	public String getDayName() {
		return dayName;
	}
}	
class Program {
	public static void main(String[] args) {
		Day day = Day.MON;
		System.out.println(day.MON.name()+", "+ day.MON.ordinal()+", "+ day.MON.getDayName());
	}
}