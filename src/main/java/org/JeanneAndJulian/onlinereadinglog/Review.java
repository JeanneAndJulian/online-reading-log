package org.JeanneAndJulian.onlinereadinglog;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

@Embeddable
public class Review {
	
	
	private String title;
	
	@Lob
	private String text;
	
	private String studentName;

	public Review(String title, String text, String studentName) {
		super();
		this.title = title;
		this.text = text;
		this.studentName = studentName;
	}
	
	private Review() {
		
	}

	public String getTitle() {
		return title;
	}

	public String getText() {
		return text;
	}

	public String getStudentName() {
		return studentName;
	}
	
	
	
	
	

}
