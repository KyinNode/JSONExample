package net.sef.jsonExample;

import java.util.List;

public class Classes {

	private List<Teacher> teachers;
	private List<Person> student;
	private String className;
	private Book book;
	
	public Classes(List<Teacher> teachers, List<Person> student, String className) {
		super();
		this.teachers = teachers;
		this.student = student;
		this.className = className;
	}
	public List<Teacher> getTeachers() {
		return teachers;
	}
	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}
	public List<Person> getStudent() {
		return student;
	}
	public void setStudent(List<Person> student) {
		this.student = student;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public Classes() {
		super();
	}
	@Override
	public String toString() {
		return "Classes [book=" + book + ", className=" + className + ", student=" + student + ", teachers=" + teachers + "]";
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	
	
}
