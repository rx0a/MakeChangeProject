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
		
		change = (payment * 100) - (cost * 100);
		
		if (change == 0) {
			System.out.println("Payment completed.");
		}
		
		else if (change < 0) {
			System.out.println("Insufficient payment.");
		}
		
		else {
			calculation(change);
		}
		
		System.out.println("Another purchase? (y/n)");
		tryAgain = kb.next();
		if (tryAgain.equals("y") || tryAgain.equals("Y")) {
			System.out.println();
		}
		else if (tryAgain.equals("n") || tryAgain.equals("N")) {
			keepGoing = false;
			System.out.println("Goodbye!");
		}
		}
		while (keepGoing);
		kb.close();
	}
	
	public static void calculation(double change) {
		
		System.out.println("************************");
		System.out.println("* Here is your change: *");
		
		twenties = (int)(change / 2000);
		if (twenties >= 1) {
			System.out.println("*     $20s : [" + twenties + "]       *");
			change = change - (twenties * 2000);
		}
		
		tens = (int)(change / 1000);
		if (tens >= 1) {
			System.out.println("*     $10s : [" + tens + "]       *");
			change = change - (tens * 1000);
		}

		fives = (int)(change / 500);
		if (fives >= 1) {
			System.out.println("*     $5s  : [" + fives + "]       *");
			change = change - (fives * 500);
		}

		ones = (int)(change / 100);
		if (ones >= 1) {
			System.out.println("*     $1s  : [" + ones + "]       *");
			change = change - (ones * 100);
		}

		quarters = (int)(change / 25);
		if (quarters >= 1) {
			System.out.println("*     $.25s: [" + quarters + "]       *");
			change = change - (quarters * 25);
		}
		
		dimes = (int)(change / 10);
		if (dimes >= 1) {
			System.out.println("*     $.10s: [" + dimes + "]       *");
			change = change - (dimes * 10);
		}
		
		nickels = (int)(change / 5);
		if (nickels >= 1) {
			System.out.println("*     $.05s: [" + nickels + "]       *");
			change = change - (nickels * 5);
		}
		
		pennies = (int)(change / 1);
		if (pennies >= 1) {
			System.out.println("*     $.01s: [" + pennies + "]       *");
		}
		System.out.println("************************");

	}

}
