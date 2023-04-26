package com;

public class Solution {
	public static void main(String[] args) {
		DepartmentalStore dimp = new DepartmentalStoreImpl();
		dimp.addProduct();
		dimp.displayProduct();
		dimp.buyProduct();
		dimp.checkout();
	}
}
