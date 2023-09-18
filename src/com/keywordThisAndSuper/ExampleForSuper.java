package com.keywordThisAndSuper;

//1432 = 1 + 4 + 3 + 2 => 10 => 1 + 0 => 1  

class SuperClass
{
    int i;   //Field
 
    SuperClass(int j)
    {
    	i = j;
        System.out.println("Super Class Constructor, I= " + i  );
        
        System.out.println("Super Class Constructor, J= " + j  );
    }
    
    SuperClass(String j)
    {
    }
 
    void findSquare() //method
    {
        System.out.println("From findSquare");
        System.out.println("From method of findSquare, I= " + i  );
        System.out.println("From method of findSquare, Square for the Value = " +  (i * i)  );
    }
}
 
class SubClass extends SuperClass
{
    
    SubClass(int k) {
    	super(k);
		System.out.println("Sub Class Constructor");
		//System.out.println("Sub Class Constructor");
		// TODO Auto-generated constructor stub
	}
    
    SubClass(String l) {
    	super(l);
		System.out.println("Sub Class Constructor");
		//System.out.println("Sub Class Constructor");
		// TODO Auto-generated constructor stub
	}

	void methodOfSubClass()
    {
        System.out.println(super.i);  //super class field is accessed
        super.findSquare();  // super class method is called
        System.out.println("From method of sub class");
    }
}

public class ExampleForSuper {
	public static void main(String args[]){
		
		SubClass sub = new SubClass(8);
		sub.methodOfSubClass();
	}
}
