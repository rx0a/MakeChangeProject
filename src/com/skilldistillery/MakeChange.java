package com.skilldistillery;

import java.util.Scanner;

public class MakeChange {
	
	static Scanner kb = new java.util.Scanner(System.in);
	
	static double cost, payment, change;
	static int pennies, nickels, dimes, quarters, ones, fives, tens, twenties;
	static String tryAgain;
	static boolean keepGoing = true;
	
	public static void main(String[] args) {
		
		do {
		System.out.println("Welcome to the Cash Register!");
		System.out.println("Enter total: ");
		cost = kb.nextDouble();
		
		System.out.println("Enter payment: ");
		payment = kb.nextDouble();
		
		change = payment - cost;
		
		if (change == 0) {
			System.out.println("Payment completed.");
		}
		
		else if (change < 0) {
			System.out.println("Insufficient payment.");
		}
		
		else {
			calculation(change);
		}
		
		System.out.println("Try again? (y/n)");
		tryAgain = kb.next();
		if (tryAgain.equals("y") || tryAgain.equals("Y")) {
			System.out.println();
		}
		else {
			keepGoing = false;
		}
		}
		while (keepGoing);
		kb.close();
	}

	
	public static void calculation(double change) {
		
		System.out.println("Here is your change: ");
		
		twenties = (int)(change / 20);
		if (twenties >= 1) {
			System.out.println("   $20s : [" + twenties + "]");
			change = change - (twenties * 20);
		}
		
		tens = (int)(change / 10);
		if (tens >= 1) {
			System.out.println("   $10s : [" + tens + "]");
			change = change - (tens * 10);
		}

		fives = (int)(change / 5);
		if (fives >= 1) {
			System.out.println("   $5s  : [" + fives + "]");
			change = change - (fives * 5);
		}

		ones = (int)(change / 1);
		if (ones >= 1) {
			System.out.println("   $1s  : [" + ones + "]");
			change = change - ones;
		}

		quarters = (int)(change / 0.25);
		if (quarters >= 1) {
			System.out.println("   $.25s: [" + quarters + "]");
			change = change - (quarters * 0.25);
		}
		
		dimes = (int)(change / 0.10);
		if (dimes >= 1) {
			System.out.println("   $.10s: [" + dimes + "]");
			change = change - (dimes * 0.10);
		}
		
		nickels = (int)(change / 0.05);
		if (nickels >= 1) {
			System.out.println("   $.05s: [" + nickels + "]");
			change = change - (nickels * 0.05);
		}
		
		pennies = (int)(change / 0.01);
		if (pennies == 2 || pennies == 3) {
			System.out.println("   $.01s: [" + (pennies + 1) + "]");
		}
		else if (pennies >= 1) {
			System.out.println("   $.01s: [" + pennies + "]");
		}

	}
}
