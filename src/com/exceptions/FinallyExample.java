/**
 * 
 */
package com.exceptions;

/**
 * @author a0c0fsb
 *
 */
public class FinallyExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //try block 
        try
        {
            System.out.println ("::Try Block::");
            int data = 125 / 0;
            System.out.println ("Result:" + data);
        } 
        //catchblock
        catch (Exception e) {
            System.out.println ("::Catch Block::");
            System.out.println (e);
        } 
        //finally block
        finally {
            System.out.println (":: Finally Block::");
            System.out.println ("No Exception::finally block executed");
        } 
        System.out.println ("rest of the code...");
    } 
}
