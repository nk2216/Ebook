package com.mphasis.Ebook.services;

import java.awt.print.Book;
import java.util.List;



import com.mphasis.Ebook.dao.BookRepository;

public class BookServiceImpl implements BookService {
	private BookRepository BookRepository;
	public BookServiceImpl(BookRepository bookRepository) {
		super();
		this.BookRepository = bookRepository;
	}

	@Override
	public void insertBook(Book books) {
		// TODO Auto-generated method stub
		BookRepository.save(books);
		
	}

	@Override
	public void updateBook(Book books) {
		// TODO Auto-generated method stub
		BookRepository.save(books);
	}

	@Override
	public void deleteBooks(int book_Id) {
		// TODO Auto-generated method stub
		BookRepository.deleteById(book_Id);
	}

	@Override
	public Book findById(int book_Id) {
		Book m = BookRepository.findBybook_Id(book_Id);
		return m;
	}

	@Override
	public List<Book> getBookDetails() {
		List<Book> books = BookRepository.findAll();
		return books;
	}

}
