package org.main.example;

import java.util.Comparator;
import java.util.Scanner;

public class Program {
	static Scanner sc = new Scanner(System.in);
	public static Book[] getArray() {
		Book[] arr = new Book[10];
		arr[ 0 ] = new Book(1083, "The Alchemist", 901.14f, "HarperCollins", "Paulo Coelho");
		arr[ 1 ] = new Book(461, "The Da Vinci Code", 1065.13f, "Doubleday", "Dan Brown");
		arr[ 2 ] = new Book(932, "Harry Potter and the Philosopher's Stone", 819.14f, "Bloomsbury", "J.K. Rowling");
		arr[ 3 ] = new Book(1159, "The Hunger Games", 737.15f, "Scholastic Press", "Suzanne Collins");
		arr[ 4 ] = new Book(691, "The Girl with the Dragon Tattoo", 1229.13f, "Norstedts Förlag", "Stieg Larsson");
		arr[ 5 ] = new Book(115, "The Lord of the Rings", 1639.11f, "George Allen & Unwin", "J.R.R. Tolkien");
		arr[ 6 ] = new Book(574, "The Catcher in the Rye", 983.14f, "Little, Brown and Company", "J.D. Salinger");
		arr[ 7 ] = new Book(230, "The Fault in Our Stars", 1147.13f, "Dutton Books", "John Green");
		arr[ 8 ] = new Book(864, "Gone Girl", 901.14f, "Crown Publishing Group", "Gillian Flynn");
		arr[ 9 ] = new Book(383, "Pride and Prejudice", 655.15f, "T. Egerton, Whitehall", "Jane Austen");
		return arr;	
	}
	public static void acceptRecord(int[] bookId) {
		if(bookId != null) {
			System.out.println("Bookid :");
			bookId[0] = sc.nextInt();
		}
	}
	public static void printRecord(Book book) {
		if(book != null) {
			System.out.println(book.toString());
		}else {
			System.out.println("Book is not found");
		}
	}
	public static void printRecord(boolean removedStatus) {
		if(removedStatus) {
			System.out.println("book is removed");
		}else {
			System.out.println("book is not found");
		}
	}
	public static int menuList() {
		System.out.println("0.Exit");
		System.out.println("1.Add Book");
		System.out.println("2.Find Book");
		System.out.println("3.Remove Book");
		System.out.println("4.Print sorted book");
		System.out.print("Enter a number	:	");
		return sc.nextInt();
	}
	public static int subMenuList() {
		System.out.println("0.Exit");
		System.out.println("1.Compare book by id");
		System.out.println("2.Compare book by name");
		System.out.println("3.Compare book by author");
		System.out.println("4.Compare book by price");
		System.out.println("5.Compare book by publisher ");
		System.out.print("Enter a number	:	");
		return sc.nextInt();
	}
	public static void main(String[] args) {
		int choice;
		int[] bookId = new int[1];
		ListTest test = new ListTest();
		while((choice = Program.menuList()) != 0) {
			switch(choice) {
				case 1 : 
					Book[] arr = Program.getArray();
					test.addBook(arr);
					break;
				case 2 :
					Program.acceptRecord( bookId );
					Book book = test.findBook( bookId[ 0 ] );
					Program.printRecord( book );
					break;
				case 3:
					Program.acceptRecord( bookId );
					boolean removedStatus = test.removeBook( bookId[ 0 ] );
					Program.printRecord( removedStatus );
					break;
				case 4:
					while( ( choice = Program.subMenuList( ) ) != 0 ) {
						Comparator<Book> comparator = null;
						switch( choice ) {
						case 1:
							comparator = new IdComparator();
							break;
						case 2:
							comparator = new NameComparator();
							break;
						case 3:
							comparator = new AuthorComparator();
							break;
						case 4:
							comparator = new PublisherComparator();
							break;
						case 5:
							comparator = new PriceComparator();
							break;
						}
						test.printBooks( comparator );
					}
					break;	
			}
		}
	}
}
