package com.keywordThisAndSuper;

/* 
 * Create 5 constructors and initialize first constructor with the variable I as any value greater than zero
 * Remaining 4 constructors utilize each constructor for each operations (Addition, Subtraction, Division, Mulitplication)
 * Constructors should print the values from the inputs & value of I, along with the selected operations 
 * 
 * I
 *
 * I = 10; 
 * 
 * Input value for each constructors is 10, 20, 30, 40
 *  
 * 2nd constructor  I + 40 
 * 
 * 3rd constructor  I - 30
 *  
 * 4th constructor  I * 20
 * 
 * 5th constructor  I / 10
 
 * */

class AnyClass
{
    int i;
 
    AnyClass()
    {
        System.out.println("First Constructor");
    }
 
    AnyClass(int j)
    {
        this();
        //this(20,30); //calling statement to First Constructor
        System.out.println("Second Constructor:  " + j );
    }
 
    AnyClass(int j, int k)
    {
        //this(20);    //calling statement to First Constructor
        System.out.println("Third Constructor: " + "j = " + j + " K =" + k);
    }
    
    void methodOne()
    {
        System.out.println("From method one");
    }
 
    void methodTwo()
    {
        System.out.println(this.i);  //Accessing same class field
        this.methodOne();      //Accessing same class method
    }
}

public class ExampleForThis {
	public static void main(String[] args) {
		AnyClass anyClass = new AnyClass();
		anyClass.methodOne();
		anyClass.methodTwo();
		
		AnyClass anyClass1 = new AnyClass(10);
		anyClass1.methodOne();
		anyClass1.methodTwo();
		
		AnyClass anyClass2 = new AnyClass(20, 30);
		anyClass2.methodOne();
		anyClass2.methodTwo();
	}
}