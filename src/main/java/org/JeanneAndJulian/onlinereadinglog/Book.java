package org.JeanneAndJulian.onlinereadinglog;

import java.math.BigDecimal;
import java.util.Collection;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Book {
	
	@GeneratedValue
	@Id
	private long id;
	
	private String name;
	private String bookCover;
	
	private int totalMinRead;
	private int totalStudentsRead;
	
	private BigDecimal rating;
	
	@Embedded
	@ElementCollection
	Collection<Review> reviews;

	public Book(long id, String name, String bookCover, int totalMinRead, int totalStudentsRead, BigDecimal rating) {
		super();
		this.id = id;
		this.name = name;
		this.bookCover = bookCover;
		this.totalMinRead = totalMinRead;
		this.totalStudentsRead = totalStudentsRead;
		this.rating = rating;
	}
	
	private Book() {
		
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getBookCover() {
		return bookCover;
	}

	public int getTotalMinRead() {
		return totalMinRead;
	}

	public int getTotalStudentsRead() {
		return totalStudentsRead;
	}

	public BigDecimal getRating() {
		return rating;
	}

	public Collection<Review> getReviews() {
		return reviews;
	}
	
	
	
	
	

}
