package org.JeanneAndJulian.onlinereadinglog;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Student {
	
	@GeneratedValue
	@Id
	private long id;
	
	String name;
		
	@ManyToOne
	Teacher teacher;
	
	Collection<Book> books;
	
	private int totalTimeRead;
	
	private int totalBooksRead;

	public Student(long id, String name, Teacher teacher, Collection<Book> books, int totalTimeRead,
			int totalBooksRead) {
		super();
		this.id = id;
		this.name = name;
		this.teacher = teacher;
		this.books = books;
		this.totalTimeRead = totalTimeRead;
		this.totalBooksRead = totalBooksRead;
	}
	
	private Student() {
		
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public Collection<Book> getBooks() {
		return books;
	}

	public int getTotalTimeRead() {
		return totalTimeRead;
	}

	public int getTotalBooksRead() {
		return totalBooksRead;
	}
	
	
	
	

}
