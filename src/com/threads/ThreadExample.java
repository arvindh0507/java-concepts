package com.threads;

public class ThreadExample extends Thread {
	int i = 10;

	public void run() {
		System.out.println(getName() + " thread is running..." + (i + 1));
	}

	public void methodOne(int a) {
		System.out.println(getName() + " thread is running from method One..." + a);
	}

	public void methodTwo(int a) {
		System.out.println(getName() + " thread is running from method Two..." + a);
	}

	@SuppressWarnings("deprecation")
	public static void main(String args[]) {
		ThreadExample t1 = new ThreadExample();
		ThreadExample t2 = new ThreadExample();
		Thread thread1 = new Thread(t1);
		Thread thread2 = new Thread(t2);
		thread1.start();
		thread2.start();
		t1.start();
		t2.start();
		try {
			t1.methodOne(10);
			t1.methodOne(20);
			t1.methodOne(30);
			t1.sleep(5000);
			t1.methodTwo(1);
			t1.methodTwo(2);
			t1.methodTwo(3);
			t1.sleep(5000);
			t1.setName("Arvindh");
			t2.methodOne(40);
			t2.methodOne(50);
			t2.methodOne(60);
			t1.sleep(5000);
			t1.methodTwo(4);
			t1.methodTwo(5);
			t1.methodTwo(6);
			t1.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t1.stop();
		t2.stop();
		thread1.stop();
		thread2.stop();

	}
}
// A thread is a lightweight sub-process, the smallest unit of processing.
// Multiprocessing and multithreading,
// both are used to achieve multitasking.

// Thread class provide constructors and methods to create and perform
// operations on a thread.
// Thread class extends Object class and implements Runnable interface.

/*
 * Thread() Thread(String name) Thread(Runnable r) Thread(Runnable r,String
 * name)
 */

/*
 * public void run(): is used to perform action for a thread. //act as a
 * constructor for a thread public void start(): starts the execution of the
 * thread.JVM calls the run() method on the thread. public void sleep(long
 * miliseconds): Causes the currently executing thread to sleep (temporarily
 * cease execution) for the specified number of milliseconds. public void
 * join(): waits for a thread to die. public void join(long miliseconds): waits
 * for a thread to die for the specified miliseconds. public int getPriority():
 * returns the priority of the thread. public int setPriority(int priority):
 * changes the priority of the thread. public String getName(): returns the name
 * of the thread. public void setName(String name): changes the name of the
 * thread. public Thread currentThread(): returns the reference of currently
 * executing thread. public int getId(): returns the id of the thread. public
 * Thread.State getState(): returns the state of the thread. public boolean
 * isAlive(): tests if the thread is alive. public void yield(): causes the
 * currently executing thread object to temporarily pause and allow other
 * threads to execute. public void suspend(): is used to suspend the
 * thread(depricated). public void resume(): is used to resume the suspended
 * thread(depricated). public void stop(): is used to stop the
 * thread(depricated). public boolean isDaemon(): tests if the thread is a
 * daemon thread. public void setDaemon(boolean b): marks the thread as daemon
 * or user thread. public void interrupt(): interrupts the thread. public
 * boolean isInterrupted(): tests if the thread has been interrupted. public
 * static boolean interrupted(): tests if the current thread has been
 * interrupted.
 */
