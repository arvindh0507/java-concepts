package com.exceptions;

/*
 * Try	- We specify the block of code that might give rise to the exception in a special block with a “Try” keyword.
 
 * Catch - When the exception is raised it needs to be caught by the program. This is done using a “catch” keyword. 
   So a catch block follows the try block that raises an exception. The keyword catch should always be used with a try.
 
 * Finally - Sometimes we have an important code in our program that needs to be executed irrespective of whether 
   or not the exception is thrown. This code is placed in a special block starting with the “Finally” keyword. 
   The Finally block follows the Try-catch block.

 * Throw - The keyword “throw” is used to throw the exception explicitly.
 
 * Throws	The keyword “Throws” does not throw an exception but is used to declare exceptions. 
   This keyword is used to indicate that an exception might occur in the program or method.
*/

public class TryCatchExample {
//extends MyException {

	/*public TryCatchExample(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}*/

	public static void main(String[] args) {
		int val1, val2;
		
		try {
			// this block will contain statements that may raise exceptions
			System.out.println("Try Block:: Start");
			val1 = 0;
			val2 = 25 / val1; // ** 25/0 **
			System.out.println(val2);
			System.out.println("Try Block:: End");
		}
		catch (Exception e) {
			// Exception Handler for ArithmeticException
			System.out.println("ArithmeticException :: Divide by Zero!!" + e.getMessage());
			val1 = 10;
			val2 = 25 / val1;
			System.out.println(val2);
			
		}

		/*try {
			System.out.println("try Block:: Begin");
			int myArray[] = new int[5];
			myArray[5] = 10 / 0;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBounds :: Accessed index out of bounds");
		} catch (Exception e) {
			System.out.println("Exception :: " + e.getMessage());
		}*/
		
		/*
		 * try { System.out.println("try Block:: Begin"); int myArray[] = new
		 * int[5]; System.out.println("Array element 10 : " + myArray[10]);
		 * myArray[5] = 10 / 0; } // multiple catch blocks catch
		 * (ArithmeticException e) {
		 * System.out.println("Arithmetic Exception :: Divide by zero!!"); }
		 * catch (ArrayIndexOutOfBoundsException e) { System.out.
		 * println("ArrayIndexOutOfBounds :: Accessed index out of bounds"); }
		 * catch (Exception e) { System.out.println("Exception :: " +
		 * e.getMessage()); }
		 */

		//System.out.println("Outside try-catch:: Rest of the code.");
	}

}
