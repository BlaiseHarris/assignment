package com.hcl.assignments;

public class WashingMachine {
	
	private boolean hasPower, hasDetergent, hasClothes;
	private int numberOfClothes;
	
	WashingMachine(){
		this.hasPower = false;
		this.hasDetergent = false;
		this.hasClothes = false;
		this.numberOfClothes = 0;
	}
	
	public void switchOn() {
		if(this.hasClothes) {
			if(!this.hasPower) {
				this.hasPower = true;
				System.out.println("The washing machine is powered on.");
			} else {
				System.out.println("The washing machine is already on.");
			}
		} else {
			System.out.println("Clothes must be added before you can start the cycle.");
		}	
	}
	
	public void switchOff() {
		if(this.hasPower && this.hasClothes) {
			this.hasPower = false;
			System.out.println("The washing machine is powered off and " + this.numberOfClothes + " have been washed.");
		} else {
			System.out.println("The washing machine is already off.");
		}
	}
	
	public void acceptDetergent() {
		if(!this.hasDetergent) {
			this.hasDetergent = true;
			System.out.println("The washing machine has detergent now.");
		} 
		else {
			System.out.println("The washing machine already has detergent.");
		}
	}
	
	public int acceptClothes(int num) {
		if(!this.hasClothes) {
			this.hasClothes = true;
			this.numberOfClothes = num;
			System.out.println(num + " clothes have been added to the washing machine.");
		} else {
			System.out.println("clothes have been added already.");
		} 
		return num;
	}
	
	public static void main(String[] args) {
		WashingMachine w = new WashingMachine();
		
		int x = w.acceptClothes(10);
		System.out.println("acceptClothes returns = " + x); 
		w.acceptDetergent();
		w.switchOn();
		w.switchOff();
	}
}
