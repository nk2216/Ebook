package com.mphasis.Ebook.controller;


import java.awt.print.Book;
import java.util.List;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mphasis.Ebook.services.BookService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/books")

public class ebookcontroller {
	private BookService bookService;

	public ebookcontroller(BookService bookService) {
		super();
		this.bookService = bookService;
	}
	@PostMapping("/books")
	public Book insert(@RequestBody Book books)
	{
		bookService.insertBook(books);
		return books;
	}
	@GetMapping("/books")
	public List<Book> getBookDetails() 
	{
		List<Book> books = bookService.getBookDetails();
		return books;
	}

	@GetMapping("/books/{book_Id}")
	public Book getBookById(@PathVariable("book_Id") int book_Id) {	
		
		Book M = bookService.findById(book_Id);
		return M;
	}
	@DeleteMapping("/books/{book_Id}")
	public ResponseEntity<Object> deletebook(@PathVariable("book_Id") int book_Id) {
		bookService.deleteBooks(book_Id);
		return new ResponseEntity<>("deleted successsfully", HttpStatus.OK);
		}
	{
		
	}
	@PutMapping("/books")
	public Book update(@RequestBody Book books)
	{
		bookService.updateBook(books);
		return books;
	}
	}