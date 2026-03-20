package prg.main.example;

//abstract => when the implementation of method is logically 100% incomplete the we 
			//should used abstract class or abstract method.

abstract class Super{
	public abstract void printRecord( ); 
	public abstract void showRecord( );
	
	public void displayRecord( ) {
		System.out.println("Super.displayRecord()");
	}
}

class Sub extends Super{
	@Override
	public void displayRecord() {
		System.out.println("sub.displayRecord()");
	}
	@Override
	public void printRecord() {
		System.out.println("sub.printRecord()");
	}
	@Override
	public void showRecord() {
		System.out.println("sub.showRecord()");
	}
}

public class Program {
	public static void main(String[] args) {
		Super s1 = new Sub();	//ok
		//s1 = new Sub();	//ok
		s1.displayRecord();
		s1.showRecord();
		s1.printRecord();
		
		
		//Super s2 = new Sub();	//upcasting
		//s2.printRecord();
		//s2.displayRecord();
		
		//Super s1 = new Super(); //Not ok => can not create instant of abstract class
		
		
	}
}
