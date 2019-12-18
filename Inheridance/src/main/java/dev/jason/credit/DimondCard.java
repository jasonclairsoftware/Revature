package dev.jason.credit;

public class DimondCard extends CreditCard{

	@Override
	public boolean makePurhase(double price) {
		
		// allowed to go over by $1000.00
		if (this.getBalance() + price > this.getLimit() + 1000) {
			System.out.println("CARD DECLINED");
			return false;
		}

		
		int points = (int)price*2;
		this.setPoints(points+this.getPoints());
		this.setBalance(this.getBalance()+price);
		return true;
	
	}

	@Override
	public void showInfo() {
		System.out.println("TYPE :DIMOND\t USER :" + this.getOwner() + '\t'
				+ "LIMIT :" + this.getLimit() + '\t'
				+ "BALANCE :" + this.getBalance() + '\t'
				+ "POINTS :" + this.getPoints());
	}

}
