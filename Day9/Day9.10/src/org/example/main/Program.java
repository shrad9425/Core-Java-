package org.example.main;

enum Day{
	MON(11),TUE(22),WED(33);
	
	private int dayNumber;
	
	private Day(int dayNumber){
		this.dayNumber = dayNumber;
		//System.out.println("Inside Constr.");
	}
	public int getDayNumber() {
		return dayNumber;
	}
}	
class Program {
	public static void main(String[] args) {
		Day day = Day.MON;
		System.out.println(day.MON.name()+", "+ day.MON.ordinal()+", "+ day.MON.getDayNumber());
	}
}
