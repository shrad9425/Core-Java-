package org.main.example;

import java.lang.reflect.Field;

class Point{
	private int xPosition;
	private int yPosition;	
	
	public Point() {
		this.xPosition = 10;
		this.yPosition = 20;
	}
	@Override
	public String toString() {
		return this.xPosition+"	"+this.yPosition;
	}
}
public class Program {
	public static void main(String[] args) {
		try {
			Point point = new Point();
			System.out.println(point);
			
			Class<?> c = point.getClass();
			Field field = null;
			
			field = c.getDeclaredField("xPosition");
			field.setAccessible(true);
			field.setInt(point, 11);
			
			System.out.println(point);
		} catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}