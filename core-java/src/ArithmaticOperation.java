

import java.util.Scanner;

public class ArithmaticOperation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a First Number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter a Second Number: ");
		int num2 = sc.nextInt();
		int add = num1 + num2;
		int sub = num1 - num2;
		int mult = num1 * num2;
		int divi = num1 / num2;
		int rem = num1%num2;
		System.out.println("Addition of "+num1+" And " + num2 + " is " + add);
		System.out.println("Substraction of "+num1+" And " + num2 + " is " + sub);
		System.out.println("Multiplication of "+num1+" And " + num2 + " is " + mult);
		System.out.println("Division of "+num1+" And " + num2 + " is " + divi);
		System.out.println("Reminder of "+num1+" And " + num2 + " is " + rem);	
	}
}
