package day2;

public class Task3 {
	
	static class Mobile {

		
		@Override
		public String toString() {
			return "Mobile [color=" + color + ", modelName=" + modelName + ", prize=" + prize + ", compName=" + compName
					+ "]";
		}

		String color;
		String modelName;
		double prize;
		String compName;
	}
	
public static void main(String[] args) {
		

		Mobile mob1 = new Mobile();
		
		mob1.color = "black";
		mob1.modelName = "11R";
		mob1.prize = 40000.00;
		mob1.compName = "OnePlus";
		System.out.println(mob1);
		
		Mobile mob2 = new Mobile();
		mob2.color = "Black";
		mob2.modelName = "Note 12 Pro";
		mob2.prize = 20000.00;
		mob2.compName = "Redmi";
		System.out.println(mob2);
		
		
		
	}
}



