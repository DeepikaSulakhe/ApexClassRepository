package com.arrays.library;


public class Book {
	public String title;
	public String author;
	public String isbn;
	public boolean isIssued;
	
	public Book(String title, String author, String isbn, boolean isIssued) {
		super();
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.isIssued = isIssued;
	}
	public Book() {
		
	};
	@Override
	public String toString() {
	    return "Book \n {title='" + title + "', author='" + author + "', isbn = '"+isbn+"', isIssued = '"+isIssued+"'}";
	}
	
	//I have written logic based on a single book by passing a particular book from main
	public void displayInfo(Book b1) {
        System.out.println("Title: " + b1.title);
        System.out.println("Author: " + b1.author);
        System.out.println("ISBN: " + b1.isbn);
        System.out.println("Issued: " + (b1.isIssued ? "Yes" : "No"));
        System.out.println("----------------------");
    }
	 public  void markIssued(Book b1) {
	        if (!b1.isIssued) {
	            b1.isIssued = true;
	            System.out.println(b1.title + " has been issued.");
	        } else {
	            System.out.println(b1.title + " is already issued.");
	        }
	    }
	 
	    public void markReturned(Book b1) {
	        if (b1.isIssued) {
	            b1.isIssued = false;
	            System.out.println(b1.title + " has been returned.");
	        } else {
	            System.out.println(b1.title + " was not issued.");
	        }
	    }
	
	
}
