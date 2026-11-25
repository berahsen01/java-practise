package javaPractise;
import java.util.Scanner;
public class EvenOddChecker {

	public static boolean isEven(int number) {
		return number %2==0;
		
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number :");
		int number = input.nextInt();
		if(isEven(number)) {
			System.out.println(number+" "+ "Even number");
		}else {
			System.out.println(number+" "+ "Odd number");
		}
		

	}

}
