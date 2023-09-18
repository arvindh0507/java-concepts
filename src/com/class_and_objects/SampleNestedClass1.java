package com.class_and_objects;

class TestNestClassA {
	void square(int i) {
		System.out.println("Class of TestNestClassA - Square of " + i + " = " + i * i);
	}

	void sum(int i, int j) {
		System.out.println("Class of TestNestClassA - Sum of " + i + " & " + j + " = " + (i + j));
	}
}

class TestNestClassB {
	TestNestClassA a = new TestNestClassA() {

		void square(int i) {
			System.out.println("Object of TestNestClassA from Class B - Square of " + i + " = " + i * i);
		}

		void sum(int i, int j) {
			System.out.println("Object of TestNestClassA from Class B - Sum of " + i + " & " + j + " = " + (i + j));
		}

	};
}

public class SampleNestedClass1 {
	public static void main(String[] args) {
		TestNestClassA a = new TestNestClassA();

		a.square(10);

		a.sum(10, 20);

		TestNestClassB b = new TestNestClassB();

		b.a.square(5);

		b.a.sum(30, 40);
	}
}