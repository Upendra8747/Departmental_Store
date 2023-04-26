package com;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DepartmentalStoreImpl implements DepartmentalStore {
	// key --> product id-> Integer & value -> Product Instance -> Product
	Map<Integer, Product> db = new LinkedHashMap<Integer, Product>();
	Scanner scan = new Scanner(System.in);
	int totalBill = 0;

	@Override
	public void addProduct() {
		db.put(1, new Product("Chocolates", 10, 10));
		db.put(2, new Product("Biscuits", 20, 20));
		db.put(3, new Product("Icecream", 30, 50));
		db.put(4, new Product("CoolDrinks", 40, 70));
		db.put(5, new Product("Cake", 50, 90));
	}

	@Override
	public void displayProduct() {
		Set<Integer> keys = db.keySet();//1 2 3 4 5 
		for(int key : keys) {
			Product p = db.get(key);
			System.out.println("Enter"+key+" to order "+p.getName());
			System.out.println("Available Quantity: "+p.getQuantity());
			System.out.println("Cost: res."+p.getCost());
			System.out.println("---------------------------------------");
		}
	}

	@Override
	public void buyProduct() {

	}

	@Override
	public void checkout() {

	}

}
