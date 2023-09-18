package com.arrays;

import java.util.Arrays;

public class CopyArray
{
    public static void main(String[] args)
    {
        int[] a = {12, 21, 0, 5, 7};   //Declaring and initializing an array of ints
 
        int[] b = new int[a.length];  
        
        int[] c = Arrays.copyOf(a, a.length);  //Declaring and instantiating another array of ints with same length
        
        //creating a copy of array 'a' using clone() method
        
        int[] d = b.clone(); 
 
        for (int i = 0; i < a.length; i++)
        {
            b[i] = a[i];
            System.out.println("B ["+i+"] = " + b[i]);
        }
 
        //Now changing values of one array will not reflect in another array
        System.out.println("Befoere = "+ a[2]);
 
        a[2] = 56;       //Changing value of 3rd element in array 'a'
        
        System.out.println("After = " +a[2]);
 
        System.out.println(b[2]);    //value of 3rd element in array 'b' will not change
 
        b[4] = 100;     //Changing value of 5th element in array 'b'
 
        System.out.println(a[4]);    //value of 5th element in array 'a' will not change
    }
}
