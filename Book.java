package net.sef.jsonExample;

public class Book {

	private String tname;
	private double price;
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Book(String tname, double price) {
		super();
		this.tname = tname;
		this.price = price;
	}
	public Book() {
		super();
	}
	@Override
	public String toString() {
		return "Book [price=" + price + ", tname=" + tname + "]";
	}
	
}
