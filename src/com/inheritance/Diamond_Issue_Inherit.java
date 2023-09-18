package com.inheritance;

class A {
	public void display() {
		System.out.println("class A display() method called");
	}
}

class B extends A {
	@Override
	public void display() {
		System.out.println("class B display() method called");
	}
}

class C extends B {
	public void display() {
		System.out.println("class C display() method called");
	}
}


// not supported in Java
public class Diamond_Issue_Inherit extends C
{

	public static void main(String args[]) {
		Diamond_Issue_Inherit d = new Diamond_Issue_Inherit();
		// creates ambiguity which display() method to call
		d.display();
		
		
		
	}
}
