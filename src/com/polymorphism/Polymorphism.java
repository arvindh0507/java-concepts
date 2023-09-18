package com.polymorphism;

class Shape {
	void output(){
		System.out.println("Display Shape");
	}
	
	void draw() {
		System.out.println("...");
	}
}

class Rectangle extends Shape {
	void draw() {
		System.out.println("rendering rectangle...");
	}
}

class Display extends Rectangle {
	
	void print(){
		System.out.println("Display Shape");
	}
	
	void draw() {
		System.out.println("Displaying rectangle...");
	}
}

class Circle extends Shape {
	void draw() {
		System.out.println("rendering circle...");
	}
}

class Triangle extends Shape {
	void draw() {
		System.out.println("rendering triangle...");
	}
}

class Polymorphism {
	public static void main(String args[]) {
		Shape s;
		s= new Shape();
		s.draw();
		Shape s1 = new Rectangle();
		s1.output();
		//s1.print();
		
		s.draw();
		s = new Circle();
		s.draw();
		s = new Triangle();
		s.draw();
	}
}
