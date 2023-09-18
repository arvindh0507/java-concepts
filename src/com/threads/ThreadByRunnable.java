package com.threads;

public class ThreadByRunnable implements Runnable {
	
	public void run() {
		System.out.println("thread is running...");
		methodOne(10);
		methodOne(20);
		methodOne(30);
	}
	
	public void methodOne(int a){
		System.out.println("thread is running from method One..." + a);  
	}

	public static void main(String args[]){
		ThreadByRunnable m1 = new ThreadByRunnable();
		Thread t1 = new Thread(m1);
		t1.start();
		try {
			t1.sleep(5000);
			System.out.println("Resumed !!");  
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t1.stop();
		System.out.println("Completed !!");  
	}

	

}