package day9;

import java.util.Vector;

public class Task2_Vector {
public static void main(String[] args) {
		
		Vector<Integer> A = new Vector<Integer>();
		A.add(2);
		A.add(1);
		A.add(1);
		A.add(4);
		A.add(3);
		A.add(3);
		
		System.out.println(A);
		A.remove(2);
		System.out.println(A);
	}
}
