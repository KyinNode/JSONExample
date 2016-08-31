package net.sef.jsonExample;

import java.util.List;

public class SimpleClass {
	
	private List<Teacher> teachers;
	private Book book;
	public SimpleClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SimpleClass(List<Teacher> teachers, Book book) {
		super();
		this.teachers = teachers;
		this.book = book;
	}
	public List<Teacher> getTeachers() {
		return teachers;
	}
	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	@Override
	public String toString() {
		return "SimpleClass [book=" + book + ", teachers=" + teachers + "]";
	}

}
