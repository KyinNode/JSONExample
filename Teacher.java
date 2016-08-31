package net.sef.jsonExample;

public class Teacher {
	
	private String name;
	private double salary;
	private String sex;
	private int workAge;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getWorkAge() {
		return workAge;
	}
	public void setWorkAge(int workAge) {
		this.workAge = workAge;
	}
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", salary=" + salary + ", sex=" + sex + ", workAge=" + workAge + "]";
	}
	public Teacher(String name, double salary, String sex, int workAge) {
		super();
		this.name = name;
		this.salary = salary;
		this.sex = sex;
		this.workAge = workAge;
	}
	
}
