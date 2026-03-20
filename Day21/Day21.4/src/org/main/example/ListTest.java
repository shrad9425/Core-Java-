package org.main.example;

import java.util.ArrayList;
import java.util.Comparator;

public class ListTest {
	private ArrayList<?> booklist = new ArrayList<>();
		
	public void addBook(Book[] arr) {
		if(arr != null) {
			for (Book book : arr) {
				System.out.println(book);
			}
		}
	}
	public Book findBook(int bookId) {
		Book key = new Book();
		key.setBookId(bookId);
		if(this.booklist != null) {
			int index =this.booklist.indexOf(key);
			Book value = (Book) this.booklist.get(index);
			return value;
		}
		return null;
	}
	public boolean removeBook(int bookId) {
		Book key = new Book();
		key.setBookId(bookId);
		if(this.booklist.contains(key)) {
			this.booklist.remove(key);
			return true;
		}
		return false;
	}
	public void printBooks(Comparator<Book> comparator) {
		this.booklist.sort(null);
		this.booklist.forEach(System.out::println);
	}
}
