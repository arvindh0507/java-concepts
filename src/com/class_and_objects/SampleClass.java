package com.class_and_objects;



public class SampleClass {
	
	void printHello() {
		System.out.println("Hello World");
	}
	
	int findSquare(int x) {
		printHello();
		return x * x;
	}

	static int findSum(int x, int y) {
		return x + y;
	}
	
	public static void main(String[] args) {
		
		//A a1 /*Object Reference */ = new A(); //Object

		//A a2 = a1;
		
		//a1.printHello();
		
		//System.out.println("Square (5) = " + A.findSquare(3));
		
		//SampleClass s = new SampleClass();
		
		//System.out.println("Square (5) = " + findSquare(3));

		System.out.println("Sum of 1 & 2 = " + findSum(1, 2));

		System.out.println("Sum of 3 & 4 = " + findSum(3, 4));

		//System.out.println(a1.getClass() == a2.getClass()); // Output : true

		//System.out.println(A.class == a1.getClass()); // Output : true

		//System.out.println(A.class == a2.getClass()); // Output : true
		
		//System.out.println(a1.getClass()); // Output : true

	}
}

/*
 * Every class in java is associated with one special object of type
 * java.lang.Class. This object will hold all the metadata of that class like
 * class name, package name, fields, methods, constructors, annotation details
 * etc. This object is created by the JVM when the class is loaded. This object
 * will be used to retrieve the information about a class at run time.
 */

/*
 * getClass() method returns java.lang.Class object of runtime type. For
 * example, If A a = new B() then a.getClass() will return java.lang.Class
 * object of type B not of type A. Where as .class returns java.lang.Class
 * object of calling type. For example, A.class will return java.lang.Class
 * object of A.
 */

/*
 * java.lang.Class object associated with a class is common to all instances of
 * that class. For example, If a1 and a2 are two instances of Class A then
 * a1.getClass() == a2.getClass() will return true. It is demonstrated in the
 * below code.
 */
