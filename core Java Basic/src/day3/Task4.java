//04.WAJ program to find greatest no among three numbers
package day3;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your First number  : ");
		int num1 = scanner.nextInt();
		System.out.println("Enter your Second number : ");
		int num2 = scanner.nextInt();
		System.out.println("Enter your Third number : ");
		int num3 = scanner.nextInt();
		
		if ( (num1>num2) && (num1>num3) ) {
			System.out.println("The greatest number among three number is : " + num1);
		}
		else if (num2 > num3) {
			System.out.println("The greatest number among three number is : " +num2);
		}
		else {
			System.out.println("The greatest number among three number is : " +num3);
		}

	}

}
