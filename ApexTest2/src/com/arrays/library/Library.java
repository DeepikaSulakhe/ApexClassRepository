package com.arrays.library;

import java.util.List;

public class Library {

	public String libraryName;
	public List<Book> books;
	public int bookCount;
	
	public Library(String libraryName, List<Book> books, int bookCount) {
		super();
		this.libraryName = libraryName;
		this.books = books;
		this.bookCount = bookCount;
	}
	
	@Override
	public String toString() {
	    return "Library{libraryName='" + libraryName + "', Books='" + books + "', bookCount = '"+bookCount+"'}";
	}

	
	public void addBook(Book b) {
		//Library lib = new Library(libraryName, books, bookCount);
		if(bookCount <= 20) {
			books.add(b);
			bookCount += 1;
			System.out.println("Book added successfully");
		}else {
			System.out.println("Cannot add before books as number of books maximized");
		}
	 }

	public Book findByTitle(String title) {
		for(Book b1: books) {
			if(b1.title == title) {
				return b1;
			}
		}
		System.out.print("Book not found: ");
		return null;
		
     }
	
	public Book findByAuthor(String author) {
		for(Book b1: books) {
			if(b1.author == author) {
				System.out.println("Book found");
				return b1;
			}
		}
		System.out.print("Book not found ");
		//return null;
		return null;
		
     }

	public void issueBook(String issueTitle) {
		for(Book b1: books) {
			if(b1.title == issueTitle && b1.isIssued == false) {
				b1.isIssued = true;
				System.out.println("Updated issued status" +b1);
			}else if(b1.isIssued == true){
				System.out.println("Book is not available to issue");
			}
		}
	}

	public void returnBook(String returnBookTitle) {
		for(Book b1: books) {
			if(b1.title == returnBookTitle && b1.isIssued == true) {
				b1.isIssued = false;
				System.out.println("Book Returned" +b1);
			}else if(b1.isIssued == true) {
				System.out.println("Book is never issued" +b1);
			}
		}
		
	}

	public void displayAllBooks() {
		for(Book b1: books) {
			System.out.println(b1);
		}
	}

	public void countAvailable() {
		System.out.println("Number of books available is: "+bookCount);
		
	}

	
		
}



