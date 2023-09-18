package com.inheritance;

//base interface1
interface Moveable2 {
	public void run();
}

// base interface2
interface Speakable2 {
	public void speak();
}

// child interface inheriting two base interfaces
interface Ability2 extends Moveable2, Speakable2 {
	public void show();
}

class Person2 implements Ability2 {
	@Override
	public void run() {
		System.out.println("I can run !!");
	}

	@Override
	public void speak() {
		System.out.println("I can speak !!");
	}

	@Override
	public void show() {
		System.out.println("I am a person, I can speak and run !!");
	}
}

public class Multiple_Inheritance {
	public static void main(String[] args) {
		Person2 obj = new Person2();
		obj.run();
		obj.speak();
		obj.show();
	}
}
