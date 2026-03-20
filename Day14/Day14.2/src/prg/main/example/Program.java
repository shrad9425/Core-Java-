package prg.main.example;

class Super{
	public Super() {

	}
	protected void printRecord( ) throws RuntimeException{
		System.out.println("Super.printRecord()");
	}
}

class Sub extends Super{
	@Override
	//public void printRecord() {
	public void printRecord( ) throws RuntimeException {
		System.out.println("Sub.printRecord()");
	}
}

public class Program {
	public static void main(String[] args) {
		//Super s1 = new Super();
		//s1.printRecord();
		
		Super s2 = new Sub();//upcasting
		s2.printRecord();
	}
}
