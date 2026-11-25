package javaPractise;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("First Number:");
		double num1 = input.nextDouble();
		System.out.println("Second Number");
		double num2 = input.nextDouble();
		
		System.out.println("Choose operation (+,-,*,/)");
		char operation = input.next().charAt(0);
		
		switch (operation) {
		case'+':
			System.out.println(num1+num2);
	       break;
		case'-':
			System.out.println(num1-num2);
			break;
		case '*':
			System.out.println(num1*num2);
			break;
		case '/':
			System.out.println(num1/num2);
			break;
			
		default :
			System.out.println("İnvalid operation");
			
			
		}
		
		
	

	}

}
