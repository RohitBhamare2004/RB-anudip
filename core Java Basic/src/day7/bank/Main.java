package day7.bank;

public class Main {
	public static void main(String[] args) {
		ATM atm = new ATM();
		ATMCard card;
		
		card = new HDFCCard();
		atm.transaction(card , 400);
		
		card = new SBICard();
		atm.transaction(card, 500);
		
		card = new ICICICard();
		atm.transaction(card , 600);
	}
}
