//2] create a user defined data type for representing real world object Bank Account in java world .
//Create 2 bank account for customer Remesh and Rajesh with their values and display those values.
//properties name:accName , accNo, accBalance, address

package day2;


public class Task2 {

	static class BankAcc{
		 String accName ;
		 long accNo;
		 float accBalance;
		 String address;
		 
		@Override
		public String toString() {
			return "BankAcc [accName=" + accName + ", accNo=" + accNo + ", accBalance=" + accBalance + ", address="
					+ address + "]";
		}
		
	}
	public static void main(String[] args) {
		BankAcc cust1 = new BankAcc();
		cust1.accName = "Ramesh";
		cust1.accNo = 921456388425L;
		cust1.accBalance = 500000.00f;
		cust1.address = "bhiwandi";
		
		System.out.println(cust1);
		
		BankAcc cust2 = new BankAcc();
		cust2.accName = "Rajesh";
		cust2.accNo = 8457563884665L;
		cust2.accBalance = 500500.00f;
		cust2.address = "bhiwandi";
		
		System.out.println(cust2);
	}

}
