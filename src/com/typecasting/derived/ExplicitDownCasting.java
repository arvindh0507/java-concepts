package com.typecasting.derived;

//Parent class  
class Parent {   
    String name;   
    
    // A method which prints the data of the parent class   
    void showMessage()   
    {   
        System.out.println("Parent method is called");   
    }  
    
    void showObj()   
    {   
        System.out.println("Show Object is called");   
    } 
}   
    
// Child class   
class Child extends Parent {   
    int age;   
    
    // Performing overriding  
  
    void showMessage()
    {   
        System.out.println("Child method is called");   
    }   
}   
    
public class ExplicitDownCasting{  
    
    public static void main(String[] args) 
    {   
    	Parent p = new Parent();
    	p.name = "ARVINDH";
    	p.showMessage();
    	System.out.println("Name = "+ p.name);
    	
    	Child c = new Child();
    	c.age = 24;
    	c.name = "Arvindh";
    	c.showMessage();
    	c.showObj();
    	System.out.println("Name = "+ c.name);
    	System.out.println("AGe = "+ c.age);
    	
    	Parent p1 = new Child();
    	p1.showMessage();
    	
        /*Parent p = new Child();  
        p.name = "Arvindh";  
          
        // Performing Downcasting Implicitly   
        //Child c = new Parent(); // it gives compile-time error   
          
        // Performing Downcasting Explicitly   
        Child c = (Child)p;   
        Child ca = new Child();
       
        c.age = 16;   
        System.out.println(c.name);   
        System.out.println(c.age);   
        c.showMessage(); */  
    	
    }   
} 