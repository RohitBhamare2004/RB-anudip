//01.WAJ program to check the person is eligible for the voting or not
package day3;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your age : ");		
		int age = scanner.nextInt();
		if(age>=18) {
			System.out.println("Eligible for Voting");
		}
		else {
			System.out.println("Not Eligible for Voting");
		}

	}

}
