package day5.p1;

public class B {
public static void main(String[] args) {
		
		int b = 10;
		A a = new A();
		//System.out.println("a value :: " +a.a); //within class anywhere u can access
		//private -> u can not acces the private var outside the class
		System.out.println("Local b value :: " + b);
		System.out.println("b value :: " +a.b);
		System.out.println("c value :: " +a.c);
		System.out.println("d value :: " +a.d);
	}
}
