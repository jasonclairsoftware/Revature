package dev.jason.threading;

public class ThreadPlayground {
	static int x = 100;
	public static void main(String[] args) throws InterruptedException{
		
		
		System.out.println("Hello");
		
		Thread.sleep(1000);
		System.out.println(Thread.currentThread());
		System.out.println("Goodbye... End of program...");
		
		// Lambda for Threads
		Runnable run1 = () -> {
			System.out.println("Hello from Runnable 1");
			System.out.println(Thread.currentThread());
			x = x*2;
			System.out.println(x);
			System.out.println("Goodbye from Runnable 1");
		};
		
		Runnable run2 = () -> {
			System.out.println("Hello from Runnable 2");
			x = x+ 20;
			System.out.println(x);
			System.out.println(Thread.currentThread());
			System.out.println("Goodbye from Runnable 2");
		};
		
		Thread thread1 = new Thread(run1);
		Thread thread2 = new Thread(run2);
		thread1.start();
		thread2.start();
		
		// How to make a thread
		// 1) Create a Runnable lambda
		// 2) Create a new thread
		// 3) Start the thread
		
		// StringBuffer is thread safe of StringBuilder
		// StringBuffer will not allow two threads to access the 
		// Same resource at the same time
		
		// Two common threading problems
		// 1) Deadlock - when two threads have a resource that neither will give up
		// 2) Live lock (Canadian lock)
		// each thread is trying to give their resource first
		
		
	}
}
