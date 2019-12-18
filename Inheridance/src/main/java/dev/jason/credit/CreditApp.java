package dev.jason.credit;

public class CreditApp {

	public static void main(String[] args) {
		RewardsCard firstcard = new RewardsCard();
		DimondCard secondcard = new DimondCard();
		
		firstcard.setLimit(1000);
		firstcard.setOwner("Jason");
		secondcard.setLimit(1000);
		secondcard.setOwner("Jason");
		
		firstcard.makePurhase(100.00);
		firstcard.showInfo();
		firstcard.makePurhase(9999.00);
		firstcard.showInfo();
		firstcard.makePurhase(250.00);
		firstcard.showInfo();
		firstcard.makePurhase(800.00);
		firstcard.showInfo();
		
		secondcard.makePurhase(100.00);
		secondcard.showInfo();
		secondcard.makePurhase(9999.00);
		secondcard.showInfo();
		secondcard.makePurhase(250.00);
		secondcard.showInfo();
		secondcard.makePurhase(800.00);
		secondcard.showInfo();
		secondcard.makePurhase(1000.00);
		secondcard.showInfo();
		
		CreditCard.greaterBalance(firstcard, secondcard);
		
	}
}
