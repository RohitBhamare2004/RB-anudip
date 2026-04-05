//03.WAJ program to check the person is eligible for the blood donation or not(two condition based on weight and age)
package day3;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age = scanner.nextInt();
		System.out.println("Enter your weight : ");
		int weight = scanner.nextInt();
		
		if (age>=21 && weight>=50) {
			System.out.println("You are eligible for Blood Donation !");
		}
		else {
			System.out.println("You are NOT eligible for Blood Donation !");
		}
	}

}
