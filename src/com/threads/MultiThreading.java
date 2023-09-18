package com.threads;

/*Multithreading in Java is an act of executing a complex process using virtual processing entities independent of each other. 
 * These entities are called threads. Threads in Java are virtual and share the same memory location of the process. 
 * As the threads are virtual, they exhibit a safer way of executing a process.
 * Multithreading in Java is a similar approach to multiprocessing. 
 * However, there are some fundamental differences between the two. Instead of a physical processor, 
 * multithreading involves virtual and independent threads.*/

/*Multiprocessing in Java is purely based on the number of processors available on the host computer. 
 * Every process initiated by the user is sent to the CPU (processor). 
 * It loads the registers on the CPU with the data related to the assigned process.*/

/* The key difference between multiprocessing and multithreading is that multiprocessing allows a system 
 * to have more than two CPUs added to the system whereas multithreading lets a process generate multiple threads to 
 * increase the computing speed of a system.
 */
/* Multiprocessing system executes multiple processes simultaneously whereas, the multithreading system let execute 
 * multiple threads of a process simultaneously.Creating a process can consume time and even exhaust the system resources. 
 * However creating threads is economical as threads belonging to the same process share the belongings of that process.
 * Multiprocessing can be classified into symmetric multiprocessing and asymmetric multiprocessing whereas, 
 * multithreading is not classified further.*/

class ThreadCount extends Thread {

	ThreadCount() {
		super("Overriding Thread Class");
		System.out.println("New thread created " + this);
		start();
	}

	public void run() { // Run Method
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("New thread created" + this);
				Thread.sleep(1500);
			}
		} catch (InterruptedException e) {
			System.out.println("Currently executing thread is interrupted");
		}
		System.out.println("Currently executing thread run is terminated");
	}
}

public class MultiThreading {
	public static void main(String args[]) {
		ThreadCount C = new ThreadCount();
		try {
			while (C.isAlive()) {
				System.out.println("Main Method Thread will be alive, until it's Child Thread stays alive");
				Thread.sleep(2500); // Sleep method
			}
		}

		catch (InterruptedException e) {
			System.out.println("Main Method thread is interrupted");
		}

		System.out.println("Main Method's thread run is terminated");
	}

}
