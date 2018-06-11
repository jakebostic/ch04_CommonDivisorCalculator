package ch04_prj4_CommonDivisorCalculator;

import java.util.Scanner;

public class CommonDivisorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Common Divisor Calculator");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
		
		System.out.print("Enter x: ");
		int x = sc.nextInt();
		System.out.print("Enter y: ");
		int y = sc.nextInt();
		
		while (x != 0) {
			while (y >= x) {
				y -= x;
			}
			int z = y;
			y = x;
			x = z;
		}
		
		
	    System.out.println("Greatest common divisor is " +y);
		System.out.print("Continue? (y/n) ");
		choice = sc.next();
		System.out.println();
		}
		sc.close();
		System.out.println("Bye!");
		

	}

}
