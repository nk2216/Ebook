npackage com.mphasis.Ebook.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class book {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	private int  Id;
	private String book_title;	
	private String book_publisher;	
	private String book_isbn;	
	private double book_number_of_pages;	
	private int book_year;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getBook_title() {
		return book_title;
	}
	public void setBook_title(String book_title) {
		this.book_title = book_title;
	}
	public String getBook_publisher() {
		return book_publisher;
	}
	public void setBook_publisher(String book_publisher) {
		this.book_publisher = book_publisher;
	}
	public String getBook_isbn() {
		return book_isbn;
	}
	public void setBook_isbn(String book_isbn) {
		this.book_isbn = book_isbn;
	}
	public double getBook_number_of_pages() {
		return book_number_of_pages;
	}
	public void setBook_number_of_pages(double book_number_of_pages) {
		this.book_number_of_pages = book_number_of_pages;
	}
	public int getBook_year() {
		return book_year;
	}
	public void setBook_year(int book_year) {
		this.book_year = book_year;
	}
	@Override
	public String toString() {
		return "book [Id=" + Id + ", book_title=" + book_title + ", book_publisher=" + book_publisher + ", book_isbn="
				+ book_isbn + ", book_number_of_pages=" + book_number_of_pages + ", book_year=" + book_year + "]";
	}
	


}
