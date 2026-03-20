package org.example.main;

import java.sql.Date;
import java.time.LocalDate;

class Box<V extends LocalDate>{
	private V date;
	
	public Box(V day, V month,V year) {
		this.date = date;
	}
	public V getDate() {
		return date;
	}
	public void setDate(V date) {
		this.date = date;
	}
	
}

public class Program {
	public static void main(String[] args) {
		Box<LocalDate> b1 = new Box<>(LocalDate.now(),LocalDate.now(),LocalDate.now());
		LocalDate date = b1.getDate();
		System.out.println(date);
	}
}
