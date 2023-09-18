package com.markerinterface;

//A simple interface
interface In1
{
 // public, static and final
 final int a = 10;

 // public and abstract 
 void display();
}

interface In2
{
 // public, static and final
 final int a = 10;

 // public and abstract 
 void display();
}

//A class that implements the interface.
class InterfaceExample implements In1, In2
{
 // Implementing the capabilities of
 // interface.
 public void display()
 {
     System.out.println("Arvindh");
 }

 // Driver Code
 public static void main (String[] args)
 {
	 InterfaceExample I = new InterfaceExample();
     I.display();
     //System.out.println(a);
 }
}