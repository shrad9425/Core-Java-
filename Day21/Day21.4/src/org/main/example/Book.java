package org.main.example;

import java.util.Comparator;

public class Book implements Comparator<Book>{
	private int bookId;
	private String name;
	private double price;
	private String publisher;
	private String author;
	
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getBookId() {
		return bookId;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public String getPublisher() {
		return publisher;
	}

	public String getAuthor() {
		return author;
	}

	public Book() {
		this(0,null,0.0f,null, null);
	}

	public Book(int bookId, String name, float price, String publisher, String author) {
		this.bookId = bookId;
		this.name = name;
		this.price = price;
		this.publisher = publisher;
		this.author = author;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			Book other = (Book) obj;
			if(this.bookId == other.bookId)
				return true;
		}
		return false;
	}
	public int ccmpareTo(Book other) {
		return this.bookId - other.bookId;
	}
	@Override
	public String toString() {
		return String.format("%-10d%-15s%-15d%-15s%-15s/n", this.bookId , this.name , this.price, this.publisher, this.author);
	}

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		return 0;
	}
}
