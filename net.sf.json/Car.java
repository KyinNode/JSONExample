package net.sef.jsonExample;

public class Car {

	
	private String carNum;
	private double price;
	

	public String getCarNum() {
		return carNum;
	}

	public void setCarNum(String carNum) {
		this.carNum = carNum;
	}

	public Car(String carNum) {
		super();
		this.carNum = carNum;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Car(String carNum, double price) {
		super();
		this.carNum = carNum;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [carNum=" + carNum + ", price=" + price + "]";
	}
	
}

