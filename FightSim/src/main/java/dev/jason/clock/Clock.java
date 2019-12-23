package dev.jason.clock;

public class Clock {

	private long totaldelta = (long) 0.0;
	private long start = System.currentTimeMillis();

	public void start() {
		start = System.currentTimeMillis();

	}
	
	public long elapsedTime() {

		totaldelta = System.currentTimeMillis();
		return (totaldelta - start) / 1000;
		
	}
	
	public void resetTimer() {
		start = System.currentTimeMillis();

		totaldelta = (long) 0.0;
	}


}
