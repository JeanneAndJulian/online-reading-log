package org.JeanneAndJulian.onlinereadinglog;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Teacher {
	
	@GeneratedValue
	@Id
	private long id;
	
	@OneToMany
	private Collection<Student> students;

	public Teacher(long id, Collection<Student> students) {
		super();
		this.id = id;
		this.students = students;
	}
	
	private Teacher() {
		
	}

	public long getId() {
		return id;
	}

	public Collection<Student> getStudents() {
		return students;
	}
	
	

}
