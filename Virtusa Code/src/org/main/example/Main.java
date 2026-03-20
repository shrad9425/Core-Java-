package org.main.example;
class GradeException extends Exception{
	public GradeException(String message) {
	super (message);
	}
}
class Student{
	private String name;
	private int age;
	private int grade;
	
	Student(String name, int age, int grade){
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	public void checkGrade()throws GradeException {
		if (this.grade < 40) {
			throw new GradeException("Student "+ this.name +" failed with the grade of "+this.grade);
		}else {
			System.out.println("Student's Details	: ");
			System.out.println("Name	: " + name);
			System.out.println("Age	: " + age);
			System.out.println("Grade	: " + grade);
		}
	}
}

public class Main {

	public static void main(String[] args) {
		try{
			Student s1 = new Student("ranu", 22, 80);
			s1.checkGrade();
			System.out.println("---");
			Student s2 = new Student("Shrad", 21, 35);
			s2.checkGrade();
		}catch(GradeException e){
			System.out.println("Throws an Exception	: "+e.getMessage());
		}

	}

}
