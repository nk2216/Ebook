package com.mphasis.Ebook.services;

import java.awt.print.Book;
import java.util.List;



public interface BookService {
	void insertBook(Book books);
	void updateBook(Book books);
	void deleteBooks(int book_Id);
	Book findById(int book_Id);
	List<Book>getBookDetails();

}
