package com.nestedclass;

class OuterNonStaticClass {
    private int i;   //private field of OuterClass
 
    int j;           //Default field of OuterClass
 
    protected int k; //protected field of OuterClass
 
    public int m;    //public field of OuterClass
 
    void methodOfOuterClass()
    {
        InnerClass inner = new InnerClass(); //creating instance of InnerClass
 
        System.out.println(inner.a);  //accessing private field of InnerClass
 
        System.out.println(inner.b);  //accessing default field of InnerClass
 
        System.out.println(inner.c);  //accessing protected field of InnerClass
 
        System.out.println(inner.d);  //accessing public field of InnerClass
    }
 
    class InnerClass
    {
    	static final int e = 10;
    	
        private int a;    //private field of InnerClass
 
        int b = 1;            //Default field of InnerClass
 
        protected int c = 2;  //protected field of InnerClass
 
        public int d = 3;     //public field of InnerClass
 
        void methodOfInnerClass()
        {
        	OuterNonStaticClass outer = new OuterNonStaticClass(); //creating an instance of OuterClass
 
            System.out.println(outer.i);    //accessing private field of OuterClass
 
            System.out.println(outer.j);    //accessing default field of OuterClass
 
            System.out.println(outer.k);    //accessing protected field of OuterClass
 
            System.out.println(outer.m);    //accessing public field of OuterClass
        }
        class InnerClass2{
        	
        	 void methodOfInnerClass2()
             {
        		 System.out.println("Nested Inner Class 2");
             }
        }
    }
}

public class NonStaticNestedClass
{
    public static void main(String args[])
    {
    	OuterNonStaticClass outer = new OuterNonStaticClass();  //creating an instance of OuterClass
 
    	OuterNonStaticClass.InnerClass inner = outer.new InnerClass();  //creating an instance of InnerClass
    	
//    	new OuterNonStaticClass().new InnerClass();
 
        System.out.println(inner.b);  //accessing non-static field of InnerClass
        
        System.out.println(inner.c);  //accessing non-static field of InnerClass
        
        //System.out.println(inner.a); //accessing non-static field of InnerClass
        
        System.out.println(inner.c); //accessing non-static field of InnerClass
 
        System.out.println(OuterNonStaticClass.InnerClass.e);    //static field can be accessed directly through class name
 
        inner.methodOfInnerClass();    //accessing non-static method of InnerClass
    }
}