package day5.p1;

public class A {
	private int a = 10;//within class anywhere u can access
	//private -> u can not access the private variable outside the class
	int b = 20;
	protected int c = 30;
	public int d = 40;
	
	public static void main(String[] args) {
		
		A a = new A();
		System.out.println("a value :: " +a.a); 
		System.out.println("b value :: " +a.b);
		System.out.println("c value :: " +a.c);
		System.out.println("d value :: " +a.d);
	}
}
