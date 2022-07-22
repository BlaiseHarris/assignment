package com.hcl.assignments;

public class Vehicle {
	
	private int vehicleNo;
	private String model, manufacturer;
	protected String color;
	
	public Vehicle(int number, String m, String man, String col) {
		this.vehicleNo=number;
		this.model=m;
		this.manufacturer=man;
		this.color=col;
	}
	
	public void changeColor(String col) {
		this.color = col;
	}
}

class Truck extends Vehicle {
	
	private int loadingCapacity = 0;
	
	Truck(int number, String m, String man, String col, int cap) {
		super(number, m, man, col);
		this.loadingCapacity = cap;
	}
	
	public int getCapacity() {
		return loadingCapacity;
	}
	
	public void changeCapacity(int capacity) {
		this.loadingCapacity = capacity;
	}
	@Override
	public void changeColor(String col) {
		this.color = col;
	}
}

class VehicleMain {
	public static void main(String[] args) {
		Truck t = new Truck(123242, "F-150", "Ford", "Red", 100);
		System.out.println("Changing color");
		System.out.println("----------------");
		System.out.println(t.color);
		System.out.println("----------------");
		t.changeColor("Blue");
		System.out.println(t.color);
		System.out.println("----------------");
		System.out.println("Changing capacity");
		System.out.println("----------------");
		System.out.println("Current cap: " + t.getCapacity());
		t.changeCapacity(10);
		System.out.println("----------------");
		System.out.println("New cap: " + t.getCapacity());
	}
}
