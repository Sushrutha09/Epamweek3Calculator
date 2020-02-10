package epamweek3;

import java.util.Scanner;

public class CalculatorOP {

	public static void main(String[] args) {
		boolean n = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Calculator Operations");
		while(n) {
			System.out.println("You can perform any of the following operations ");
			System.out.println("ADD: +");
			System.out.println("SUBTRACT: - ");
			System.out.println("MULTIPLY: *");
			System.out.println("DIVIDE: /");
			System.out.println("Enter any 2 numbers");
			double x, y;
			x = sc.nextDouble();
			y = sc.nextDouble();
			System.out.println("Select Operator from the following:(+ - * /) ");
			char cho = sc.next().charAt(0);
			double ans = 0;
			char rep;
			try {
				Operations op = new Operations();
			switch(cho) {
				case '+':
					ans = op.add(x,y);
					System.out.println("Sum is: " +ans);
					System.out.println("Do you want to perform any other operations? (Y/N)");
					rep = sc.next().charAt(0);
					if(rep == 'Y' || rep == 'y') {
						n = true;
						break;
					} else {
						n = false;
						System.out.println("Executed successfully");
						break;
					}
				case '-':
				    ans = op.subtract(x, y);
					System.out.println("The result is " +ans);
					System.out.println("Do you want to perform any other operations? (Y/N)");
					rep = sc.next().charAt(0);
					if(rep == 'Y' || rep == 'y') {
						n = true;
						break;
					} else {
						n = false;
						System.out.println("Executed successfully");
						break;
					}
				case '*':
				    ans = op.multiply(x, y);
					System.out.println("The result is " +ans);
					System.out.println("Do you want to perform any other operations? (Y/N)");
					rep = sc.next().charAt(0);
					if(rep == 'Y' || rep == 'y') {
						n = true;
						break;
					} else {
						n = false;
						System.out.println("Executed successfully");
						break;
					}
				case '/':
				    ans = op.divide(x, y);
					System.out.println("The result is " +ans);
					System.out.println("Do you want to perform any other operations? (Y/N)");
					rep = sc.next().charAt(0);
					if(rep == 'Y' || rep == 'y') {
						n = true;
						break;
					} else {
						n = false;
						System.out.println("Executed successfully");
						break;
					}
				}
			} catch(Exception e) {
	        	System.out.println("Please select a valid operator!");
			}
		}
	}

}
