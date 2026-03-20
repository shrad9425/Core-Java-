package org.main.example;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Point{
	private int xPosition;
	private int yPosition;	
	
	private Point(int xPosition, int yPosition) {
		this.xPosition = xPosition;
		this.yPosition = yPosition;
	}
	@Override
	public String toString() {
		return this.xPosition+"	"+this.yPosition;
	}
}
public class Program {
	public static void main(String[] args) {
		Class<?> c = Point.class;
		
		try {
			Constructor<?> ctor = c.getDeclaredConstructor(int.class, int.class);
			ctor.setAccessible(true);
			Object point = ctor.newInstance(10,20);
			//Point point = (Point)ctor.newInstance(10, 20);
			System.out.println(point);
		} catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}