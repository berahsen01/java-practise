package javaPractise;
import java.util.Scanner;
public class Palindrome {
   public static void main(String[] args) {
	   Scanner input=new Scanner(System.in);
	   System.out.println("Enter a number:");
	   int number=input.nextInt();
	   
	   int original=number;
	   int reversed=0;
	   while (number>0) {
		   int digit=number%10;
		   reversed =reversed*10+digit;
		   number=number/10;
	   }
		if(original==reversed) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not Palindrome");
		}

	}

}
