package com.inheritance;

//base class A
class Ability {
	public void show() {
		System.out.println("I am a person, I can speak and run !!");
	}
}

// child interface 
interface Moveable {
	public void run();
}

// child interface2
interface Speakable {
	public void speak();
}

// child class inheriting two base interfaces
class Person_1 extends Ability implements Moveable, Speakable {
	@Override
	public void run() {
		System.out.println("I can run !!");
	}

	@Override
	public void speak() {
		System.out.println("I can speak !!");
	}
}

public class Hybrid_Inheritance {
	public static void main(String[] args) {
		Person_1 obj = new Person_1();
		obj.run();
		obj.speak();
		obj.show();
	}
}