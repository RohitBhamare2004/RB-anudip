package day7.zoo;

public class Main {
	public static void main(String[] args) {
		Animal lion = new Lion();
		lion.eat();
		lion.sleep();
		Animal rabbit = new Rabbit();
		rabbit.eat();
		rabbit.sleep();
	}
}
