package org.main.example;

import java.util.Comparator;

public class IdComparator implements Comparator<Book> {
	@Override
	public int compare(Book b1, Book b2) {
		return b1.getBookId() - b2.getBookId();
	}
}
