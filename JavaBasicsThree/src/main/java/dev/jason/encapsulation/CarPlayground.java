package dev.jason.encapsulation;

public class CarPlayground {

	public static void main(String[] args) {
		Car oldcar = new Car();
		Car newcar = new Car("Lamborgini", "Diablo", 10);
		
		oldcar.setMpg(35);
		oldcar.showInfo();
		newcar.showInfo();
	}
}
