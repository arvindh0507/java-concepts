package com.exceptions;

import java.io.*;

class Example_Throw {
	// declare exception using throws in the method signature
	void testMethod(int num) throws IOException, ArithmeticException {
		if (num != 1)
			throw new IOException("IOException Occurred");
		else if (num == 0)
			throw new ArithmeticException("ArithmeticException");
		else
			throw new ArrayIndexOutOfBoundsException("Array Index Out of Bound Exception");
	}
}

public class ThrowAndThrowsExample {

	static void validate_Age(int age) {
		// if specified age is lesser than 18, throw ArithmeticException
		if (age < 18)
			throw new ArithmeticException("Not eligible to vote and drive!!");
		else // print the message
			System.out.println("Eligible to vote and drive!!");
	}

	public static void main(String args[])  {
		// Example for throw keyword: call validate_Age method
		// validate_Age(10);
		// System.out.println("rest of the code...");

		// Example for throws keyword: call testMethod
		try {
			// this try block calls the above method so handle the exception
			
			validate_Age(17);
		} /*
			 * catch (CustomException e) { System.out.println("[" + e +
			 * "] Exception Occured"); }
			 */
		catch (Exception ex) {
			System.out.println(ex);
			Example_Throw obj = new Example_Throw();
			obj.testMethod(1);
		}
	}
}
