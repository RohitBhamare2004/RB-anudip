//05.WAJ program to print the grade of student
package day3;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	
		
		System.out.println("Enter your Marks : ");
		int marks = scanner.nextInt();
		if (marks >=90 && marks <= 100) {
			System.out.println("A GRADE");
		}
		else if (marks >= 70 && marks<90) {
			System.out.println("B GRADE");
		}
		else if(marks >= 50 && marks<70) {
			System.out.println("C GRADE");
		}
		else if(marks >= 35 && marks <50) {
			System.out.println("D GRADE");
		}
		else if (marks < 35 && marks >= 0){
			System.out.println("FAIL");
		}
		else {
			System.out.println("Invalide Marks");
		}
	}

}
