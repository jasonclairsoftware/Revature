package dev.jason.clock;

import dev.jason.App.Clock;

public class ClockPlayground {

	public static void main(String[] args) {

		
	
		Clock timer = new Clock();
		timer.start();
		timer.elapsedTime();

		do {
			System.out.println(timer.elapsedTime());
			if (timer.elapsedTime() % 2 == 0) {
				System.out.println("EVEN");
			}
			else {
				System.out.println("ODD");
			}
			if (timer.elapsedTime() >= 4) timer.resetTimer();
		
		} while (true);
	
	}
}
