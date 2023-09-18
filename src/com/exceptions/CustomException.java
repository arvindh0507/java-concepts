/**
 * 
 */
package com.exceptions;

/**
 * @author a0c0fsb
 *
 */
@SuppressWarnings("serial")
class MyException extends Exception {
	
    public MyException(String s)
    {
        // Call constructor of parent Exception
        super(s); //Myexception.setMessage(s);
    }
}
 
// A Class that uses above CustomException
public class CustomException {
    // Driver Program
    public static void main(String args[])
    {
        try {
            // Throw an object of user defined exception
            throw new MyException("Custom Exception Caught");
        }
        catch (ArithmeticException ex) {
            System.out.println("Caught");
 
            // Print the message from CustomException object
            System.out.println(ex.getMessage());
        }
        catch (MyException ex) {
            System.out.println("Caught");
 
            // Print the message from CustomException object
            System.out.println(ex.getMessage());
        }
    }
}