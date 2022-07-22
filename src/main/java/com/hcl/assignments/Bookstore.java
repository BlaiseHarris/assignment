package com.hcl.assignments;

import java.util.*;
import java.io.*;

public class Bookstore {
	public static void main(String[] args) throws IOException {

		long total = 0;
		boolean isDone = false;
		Customer shopper = null;

		TreeMap<Integer, String> titles = new TreeMap<Integer, String>();
		titles.put(1, "Book of Stuff");
		titles.put(2, "Book of Water");
		titles.put(3, "Book of Fire");
		titles.put(4, "Book of Wind");
		titles.put(4, "Book of Earth");
		titles.put(5, "CD of Songs");
		titles.put(6, "CD of Opera");
		titles.put(7, "CD of Bells");
		titles.put(8, "Software1");
		titles.put(9, "Software2");
		titles.put(10, "Software3");

		ArrayList<Customer> storedInfo = new ArrayList<Customer>();
		storedInfo.add(new Customer("John", "123"));
		storedInfo.add(new Customer("Sara", "1234"));
		storedInfo.add(new Customer("Lewis", "1235"));

		Scanner s = new Scanner(System.in);

		while (!isDone) {
			String userInputU = null;
			String userInputP = null;
			System.out.println("Please enter your username: ");
			userInputU = s.next();
			System.out.println("Please enter your password: ");
			userInputP = s.next();

			for (Customer cust : storedInfo) {
				if (cust.getUsername().equals(userInputU)) {
					if (cust.getPassword().equals(userInputP)) {
						System.out.println("You have successfully logged in.");
						System.out.println("---------------------------------------");
						shopper = cust;
						isDone = true;
						break;
					} else {
						System.out.println("Password is wrong please try again.");
						System.out.println("---------------------------------------");
						break;
					}
				}
			}
		}

		System.out.print("1 for browse or 2 for keyword search: ");
		String input = s.next();
		if (input.equals("1")) {
			isDone = false;
			while (!isDone) {
				System.out.println("---------------------------------------------");
				System.out.println(titles);
				System.out.println("---------------------------------------------");
				System.out.print("Please enter the number associated with the item you want (-1 to quit): ");
				int userNum = s.nextInt();
				if (userNum == -1)
					isDone = true;
				for (int num : titles.keySet()) {
					if (num == userNum) {
						System.out.println("-------------------------------------------------");
						System.out.println(titles.get(num) + " has been added to the cart.");
						shopper.addToCart(titles.get(num));
						if (titles.get(num).toLowerCase().contains("book")) {
							total += 10;
						} else if (titles.get(num).toLowerCase().contains("cd")) {
							total += 5;
						} else if (titles.get(num).toLowerCase().contains("software")) {
							total += 45;
						}
					}
				}
			}
		} else {
			System.out.println("-------------------------------------------------");
			System.out.print("Please enter a keyword (try book/CD/Software): ");
			input = s.next();
			ArrayList<String> currentSelection = new ArrayList<String>();
			for (String title : titles.values()) {
				if (title.toLowerCase().contains(input.toLowerCase())) {
					currentSelection.add(title);
				}
			}
			isDone = false;
			while (!isDone) {
				System.out.println("---------------------");
				System.out.println("From the keyword");
				System.out.println("---------------------");
				System.out.println(currentSelection);
				System.out.println("-------------------------------------------------");
				System.out.print("Please enter the name associated with the item (-1 to quit): ");
				input = s.next();
				if (input.equals("-1"))
					isDone = true;
				for (String title : currentSelection) {
					if (title.toLowerCase().contains(input.toLowerCase())) {
						System.out.println(title + " has been added to the cart.");
						shopper.addToCart(title);
						if (title.toLowerCase().contains("book")) {
							total += 10;
						} else if (title.toLowerCase().contains("cd")) {
							total += 5;
						} else if (title.toLowerCase().contains("software")) {
							total += 45;
						}
					}
				}
			}
		}
		shopper.setTotal(total);
		System.out.println("------------------------------");
		System.out.println("Final cart before checkout: " + shopper.getCart());
		System.out.println("TOTAL: $" + total);
		System.out.println("------------------------------");
		System.out.print("1 to confirm the order or 2 to cancel: ");
		int orderConfirmation = s.nextInt();
		if (orderConfirmation == 1) {
			System.out.println("Thank you for purchasing. ");
			FileOutputStream fos = new FileOutputStream("reciept.txt");
			byte arr[] = shopper.reciept().getBytes();
			fos.write(arr);
			s.close();
			fos.close();
			System.out.println("You will now be logged out.");
			shopper = null;
		} else {
			System.out.println("Thank you for browsing.");
			System.out.println("You will now be logged out.");
			shopper = null;
			s.close();
		}

	}

}

class Customer {

	private String username;
	private String password;
	private ArrayList<String> cart = new ArrayList<String>();
	private long total;

	Customer(String u, String p) {
		this.username = u;
		this.password = p;
		this.total = 0;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public void addToCart(String title) {
		this.cart.add(title);
	}

	public ArrayList<String> getCart() {
		return this.cart;
	}

	public long getTotal() {
		return this.total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public String reciept() {
		return "Thank you for purchasing here " + this.username + ". Your items are: " + this.cart
				+ " for a total of: $" + this.total;
	}

}
