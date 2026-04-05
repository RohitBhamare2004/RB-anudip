package day5;

public class Task1_variables {
	//static variable
		static int a =10;
		//non static variable
		int b =20;
		
		//three ways to access the static var
		//1. directly by name
		//2. using class name
		//3. using object / creating object
		
		//one way to call non static varible
		//using object
		public static void main(String[] args) {
			
			//local variable-inside method
			int p =100;		
		
			System.out.println("static var ::" +a);
			
			Task1_variables test = new Task1_variables();
			System.out.println("non static var ::" +test.b);
			
			System.out.println("local vari ::" +p);
		}
		
		void m1() {
			Task1_variables test = new Task1_variables();
			System.out.println(test.a);
			//System.out.println("local vari ::" +p);
		}
}
