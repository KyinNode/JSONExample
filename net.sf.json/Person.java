package net.sef.jsonExample;

public class Person {
	
	private String name ;
	private String sex;
	private int age;
	private Car car;

	public Person(String name) {
		super();
		this.name = name;
	}
	
	

	public Person(String name, String sex) {
		super();
		this.name = name;
		this.sex = sex;
	}



	public Person() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Car getCar() {
		return car;
	}


	public void setCar(Car car) {
		this.car = car;
	}

	public Person(String name, String sex, Car car) {
		super();
		this.name = name;
		this.sex = sex;
		this.car = car;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}


	public Person(String name, String sex, int age, Car car) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.car = car;
	}



	public Person(String name, String sex, int age) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
	}



	@Override
	public String toString() {
		return "Person [age=" + age + ", car=" + car + ", name=" + name + ", sex=" + sex + "]";
	}
	


}
