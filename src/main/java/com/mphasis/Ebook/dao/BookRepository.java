package com.mphasis.Ebook.dao;

import java.awt.print.Book;


import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {

	/*static Medicines getMedicine(int medicineId) {
		// TODO Auto-generated method stub
		return null;
	}*/
	Book findBybook_Id(int book_Id);

}
