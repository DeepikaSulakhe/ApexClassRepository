package com.arrays.library;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LibraryMain {

	public static void main(String[] args) {
		
		Book b1 = new Book("Atomic Habits", "James Clear", "978-0735211292", false);
        Book b2 = new Book("The Alchemist", "Paulo Coelho", "978-0061122415",false);
        Book b3 = new Book("Rich Dad Poor Dad", "Robert Kiyosaki", "978-1612680194", false);
        Book b4 = new Book("Think and Grow Rich", "Napoleon Hill", "978-1585424337",false);
        Book b5 = new Book("Deep Work", "Cal Newport", "978-1455586691", false);
        Book b6 = new Book("Clean Code", "Robert C. Martin", "978-0132350884", false);
        Book b7 = new Book("The Pragmatic Programmer", "Andrew Hunt", "978-0135957059", false);
        Book b8 = new Book("Start with Why", "Simon Sinek", "978-1591846444",false);
        Book b9 = new Book("The Subtle Art of Not Giving a F*ck", "Mark Manson", "978-0062457714",false);
        Book b10= new Book("Zero to One", "Peter Thiel", "978-0804139298", false);
        List<Book> books = new ArrayList<Book>(20);
        books.add(b1);
        books.add(b2);
		
		Library library = new Library("Santa Clara Library", books, 2);
		//System.out.println(library.toString());
		
/*1. Library class methods implemented by considering 2 books hardcoded and book count too in library or 
 * can add using addbook method therby updating the book count . Down written are all Library methods can be uncommented and run*/
 
 
		library.addBook(b3);
		library.addBook(b4);
		System.out.println(library.toString());
		
//		String title = "Deep Work";
//		Book b = library.findByTitle(title);
//		System.out.println(b);
		
//		String author = "James Clear";
//		Book auth = library.findByAuthor(author);
//		System.out.println(auth);
		
//		String issueBookTitle = "The Alchemist";
//		library.issueBook(issueBookTitle);
//		
//		String returnBookTitle = "The Alchemist";
//		library.returnBook(returnBookTitle);
		
//		library.displayAllBooks();
//		
//		library.countAvailable();
		
/* Down written are all Book methods can be uncommented and run.
 * Book class methods implemented in Book class based on a single book we can view any book from above b1 ,b2,b3...*/
		System.out.println("\n");
		Book book = new Book();
		book.displayInfo(b1);
		book.markIssued(b1);
		book.markReturned(b1);
		
		
	}

}
