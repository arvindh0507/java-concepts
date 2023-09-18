package com.markerinterface;


public class UserClass implements UserInterface{

	public void getUserInfo() {
		// TODO Auto-generated method stub
		System.out.println("User Info Get Method");		
	}

	public void getDepartmentInfo() {
		// TODO Auto-generated method stub
		System.out.println("Dept Info Get Method");
	}

	public void getEmployeeInfo() {
		// TODO Auto-generated method stub
		System.out.println("Employee Info Get Method");
	}
	
	public static void main(String[] args) {
		UserClass uc = new UserClass();
		uc.getDepartmentInfo();		
	}

}

class AB {
	
	void display(){
		System.out.println("ARvindh");
	}
}


class BC{
	
	void display(){
		System.out.println("ARvindh");
	}
	
}

class UserClassSample  {
	
	public static void main(String[] args) {
		UserClass uc = new UserClass();
		uc.getDepartmentInfo();		
	}

}


