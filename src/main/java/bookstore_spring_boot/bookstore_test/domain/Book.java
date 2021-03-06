package bookstore_spring_boot.bookstore_test.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private Long id;
	private String author;
	private String title;
	private int year;
	private int isbn;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "categoryid")
	private Category category;
	
	public Book() {
	}
	public Book(String author, String title, int year, int isbn, Category category) {
		super();
		this.author = author;
		this.title = title;
		this.year = year;
		this.isbn = isbn;
		this.category = category;
	}
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	
	@Override
	public String toString() {
		if (this.category != null) 
			return "Book [id=" + id + ", author=" + author + ", title=" + title + ", year=" + year + ", isbn=" + isbn + " category =" + this.getCategory() + "]";
		else 
		return "Book [id=" + id + ", author=" + author + ", title=" + title + ", year=" + year + ", isbn=" + isbn + "]";
	}
}	
