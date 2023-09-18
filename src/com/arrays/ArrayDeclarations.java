package com.arrays;

public class ArrayDeclarations
{
    public static void main(String[] args)
    {
        int[] arrayOfInts;    //Declaring an array of ints
 
        double arrayOfDoubles[];   //Declaring an array of doubles
 
        char[] arrayOfChars;     //Declaring an array of characters
 
        boolean arrayOfBooleans[];   //Declaring an array of booleans
        
        arrayOfInts = new int[10]; //Instantiating an array of int using new operator
      
        //Declaring, instantiating and Initializing an array in one statement
        
        //double[] arrayOfDoubles = new double[] {12.56, 45.87, 14.85};
 
        //int[] arrayOfInts = {12, 21, 0, 5, 7};
        
        arrayOfInts[0] = 1;
        arrayOfInts[1] = 1;
        arrayOfInts[2] = 2;
        
        
       for(int i=0; i<= arrayOfInts.length; i++){
    	   System.out.println("array =" + i + " = " + arrayOfInts[i]);
       }
        
       	System.out.println(arrayOfInts.length);
       
       	System.out.println(arrayOfInts[11]);
       
        System.out.println(arrayOfInts[0]);   //accessing 1st element
        
        System.out.println(arrayOfInts[3]);   //accessing 4th element
 
        System.out.println(arrayOfInts[2]); 
        
    }
}