//Implementation of switch case
package day2;

import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	System.out.println("what is today day????");
	System.out.println("1. Monday");
	System.out.println("2. Monday");
	System.out.println("3. Monday");
	System.out.println("4. Monday");
	System.out.println("5. Friday");
	System.out.println("6. saturdy");
	System.out.println("7. Sunday");
	System.out.print("Enter your choise :: ");
	
	int choice1 = sc.nextInt();
	
	switch(choice1) {

		case 1 : 
			System.out.println("Today is Monday, very boaring day ");
			break;
		case 2: 
			System.out.println("Today is Tuesday, 5 days to go");
			break;
		case 3: 
			System.out.println("Today is Wednesday, 4 days to go");
			break;
		case 4: 
			System.out.println("Today is Thursday, 3 days to go");
			break;
		case 5: 
			System.out.println("Today is Friday, 2 days to go");
			break;
		case 6: 
			System.out.println("Today is Saturday, 1 day to go");
			break;
		case 7: 
			System.out.println("Today is sunday , enjoy");
			break;

		default:
			System.out.println("Ivalid choice");
		}

	}
	
}
