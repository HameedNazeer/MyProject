package com.staragile;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Select the Method of Operation from the following");
		System.out.println("+ for Addition");
		System.out.println("- for Subraction");
		System.out.println("* for Multiplication");
		System.out.println("/ for Division");
		
		char choose = scan.next().charAt(0);
		
		System.out.println("Please enter the two numbers to be computed:");
		int x =scan.nextInt();
		int y =scan.nextInt();
		
		if(choose == '+'){
			System.out.println("The Sum of Two Numbers is: "+ add(x,y));
		}
		else if(choose == '-'){
			System.out.println("The Subracted Value is: "+ sub(x,y));
		}
		else if(choose == '*'){
			System.out.println("The Multiplied Value is: "+ mul(x,y));
		}
		else if(choose == '/'){
			System.out.println("The Divided value for the number is: "+ div(x,y));
		}
		else {
			System.out.println("Please select only from the List provided");
		}
	}	
	public static int add(int x, int y) {
		int n;
		n=x+y;
		return n;
	}
	public static int sub(int x, int y) {
		int n;
		n=x-y;
		return n;
	}
	public static int mul(int x, int y) {
		int n;
		n=x*y;
		return n;
	}
	public static int div(int x, int y) {
		if (y == 0) {
			throw new IllegalArgumentException("Number cannot be divided by zero");
		}
		int n;
		n=x/y;
		return n;
	}


}
