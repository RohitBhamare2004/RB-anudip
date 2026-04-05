//02.WAJ program to check no is positive or negative
package day3;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = scanner.nextInt();
		
		if (num>0) {
			System.out.println("Number is POSITIVE");
		}
		else if (num<0) {
			System.out.println("Number is NEGATIVE");
		}
		else if(num == 0) {
			System.out.println("Number is Zero");
		}
		else {
			System.out.println("Invalid Number !");
		}

	}

}

