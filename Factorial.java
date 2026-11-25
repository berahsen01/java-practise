package javaPractise;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number :");
		int number= input.nextInt();
		long factorial=1;
		if (number<0) {
			System.out.println("İnvalid number");
		}else {
			for(int i=1;i<=number;i++) {
				factorial=factorial*i;
			}
      System.out.println("Factorial:" +factorial);
		}


	}

}
