package com.threads;

/*
 * The lifecycle of each thread in Java has five different stages. 
 * You will look into each one of those stages in detail. 
 * The Stages of the Lifecycle are mentioned below.

1. New
2. Runnable
3. Running
4. Waiting
5. Dead
*/

class MyThread implements Runnable {
	String name;
	Thread t;

	MyThread(String threadname) {
		name = threadname;
		t = new Thread(this, name);
		System.out.println("New thread: " + t);
		t.start();
	}

	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println(name + ": " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println(name + "Interrupted");
		}
		System.out.println(name + " exiting.");
	}
}

class MultiThreadingExample {
	public static void main(String args[]) {
		new MyThread("One");
		new MyThread("Two");
		new MyThread("Three");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			System.out.println("Main thread Interrupted");
		}
		System.out.println("Main thread exiting.");
	}
}


/*
ProcessBuilder pb =
new ProcessBuilder("myCommand", "myArg1", "myArg2");
Map<String, String> env = pb.environment();
env.put("VAR1", "myValue");
env.remove("OTHERVAR");
env.put("VAR2", env.get("VAR1") + "suffix");
pb.directory(new File("myDir"));
File log = new File("log");
pb.redirectErrorStream(true);
pb.redirectOutput(Redirect.appendTo(log));
Process p = pb.start();
assert pb.redirectInput() == Redirect.PIPE;
assert pb.redirectOutput().file() == log;
assert p.getInputStream().read() == -1; 
*/