package day10;

public class Emp2 {
	import java.util.*;

	class Employee {
	    int eid;
	    String ename;
	    String desg;
	    double sal;

	    // Constructor
	    Employee(int eid, String ename, String desg, double sal) {
	        this.eid = eid;
	        this.ename = ename;
	        this.desg = desg;
	        this.sal = sal;
	    }

	    // Method to apply hike
	    void applyHike() {
	        if (desg.equalsIgnoreCase("developer")) {
	            sal = sal + (sal * 0.15);
	        }
	    }

	    // Display method
	    void display() {
	        System.out.println(eid + " " + ename + " " + desg + " " + sal);
	    }
	}

	public class Main {
	    public static void main(String[] args) {

	        ArrayList<Employee> list = new ArrayList<>();

	        // Adding employees
	        list.add(new Employee(1, "Aachal", "Developer", 50000));
	        list.add(new Employee(2, "Rahul", "Tester", 40000));
	        list.add(new Employee(3, "Sneha", "BA", 45000));

	        // Applying hike
	        for (Employee e : list) {
	            e.applyHike();
	        }

	        // Displaying data
	        System.out.println("Employee Details After Hike:");
	        for (Employee e : list) {
	            e.display();
	        }
	    }
	}
}
