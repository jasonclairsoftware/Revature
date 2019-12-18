package dev.jason.credit;

public class RewardsCard extends CreditCard{

	
	public boolean makePurhase(double price) {
		if ((this.getBalance() + price) > this.getLimit()) {
			System.out.println("CARD DECLINED");
			return false;
		}
		
		int points = (int)price*10;
		this.setPoints(points+this.getPoints());
		this.setBalance(this.getBalance()+price);
		return true;
	}

	@Override
	public void showInfo() {
		System.out.println("TYPE :REWARDS\t USER :" + this.getOwner() + '\t'
				+ "LIMIT :" + this.getLimit() + '\t'
				+ "BALANCE :" + this.getBalance() + '\t'
				+ "POINTS :" + this.getPoints());
	}
	


}
