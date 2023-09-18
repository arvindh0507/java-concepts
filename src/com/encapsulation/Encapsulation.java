package com.encapsulation;

//a process of wrapping code and data together into a single unit
//a way to achieve data hiding
//provides you the control over the data

class Student {
	// private data member
	private String name;

	// private data member
	private String college = "MIT";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}
	
	public void display(){
		System.out.println("Student Name= "+ this.name);
		System.out.println("Student College= "+ this.college);
	}
}

public class Encapsulation {
	
	public static void main(String[] args) {
		
		
		Student s = new Student();
		s.setCollege("MIT");
		s.setName("Arvindh");
		s.display();
		/*

		int arr[] = new int[100];
		int a=0;
		for (int i = 0; i < arr.length / 2; i++) {
			arr[i] = i;
	
			a++;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println("ARR[" + i + "]   = " + arr[i]);
		}

		for (int i = a; i < arr.length; i++) {
			arr[i] = i;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.println("ARR[" + i + "]   = " + arr[i]);
		}
		
*/		/*
		 * // creating instance of the encapsulated class Student s = new
		 * Student(); // setting value in the name member s.setName("Arvindh");
		 * // getting value of the name member System.out.println(s.getName());
		 * 
		 * s.setName("Karthik");
		 * 
		 * System.out.println(s.getName());
		 * 
		 * System.out.println("College= "+s.getCollege());
		 * 
		 * 
		 * s.setCollege("IIT");
		 * 
		 * 
		 * 
		 * System.out.println(s.getCollege());
		 * 
		 * Student s1 = new Student(); // setting value in the name member
		 * s1.setName("Siva"); // getting value of the name member
		 * System.out.println(s1.getName());
		 * 
		 * s1.setCollege("VIT");
		 * 
		 * System.out.println(s1.getCollege());
		 */

	}

}

/*
 * Student s; String ar [] = new String [10];
 * 
 * ar[0] = a ar[1] = b ar[2] = c ar[3] = d ar[4] = e ar[5] = f ar[6] = g ar[7] =
 * h ar[8] = i ar[9] = j
 * 
 * for (int i=5; i < ar.length; i++) { s = new Student ();
 * s.setName(ar[i].name); s.setCollege((ar[i].college); }
 * 
 * 
 * 
 * }
 */