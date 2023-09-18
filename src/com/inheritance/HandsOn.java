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
public class HandsOn extends C {
	public static void main(String args[]) {
		HandsOn d = new HandsOn();
		HandsOn c = (HandsOn) new C();
		HandsOn b = (HandsOn) new B();
		HandsOn a = (HandsOn) new A();
		d.display();
		c.display();
		b.display();
		a.display();
	}
}

// Real Time examples.
// Understanding of Parent and Child Class.
// How the object instatiation works here. 

