package dev.jason.App;

public class DuelPlayground {

	public static void main(String[] args) {
		Hero wizard = new Hero("Yolhan The Great", 10, 900);
		Enemy gobbo = new Enemy("Gobbo The Stupid", 2, 30);
				
		wizard.printInfo();
		gobbo.printInfo();
	}
}
