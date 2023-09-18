package com.user.validation;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.io.File;
import java.io.FileNotFoundException;

import com.user.dao.UserDao;
import com.user.daoImpl.UserDaoImpl;
import com.user.entity.User;

public class UserValidation {

	private static UserDao<User> userDao = new UserDaoImpl();

	private static User user = new User();

	Scanner scanner = new Scanner(System.in);
	
	private boolean attempt = false;

	public void addUser() {
		User user = new User();
		System.out.println("Enter User Name");
		user.setName(scanner.nextLine());
		
		System.out.println("Enter User Email");
		String email = scanner.nextLine();		
		if ( isEmail(email) ){
			user.setEmail(email);
			userDao.save(user);
		}
		else {
			System.out.println("Invalid email address, try again with valid email");
		}
	}

	@SuppressWarnings("resource")
	public void loadUsers(){
		System.out.println("Enter file's full path (example: C:\\users\\username\\desktop\\input.txt)");
		File file = new File(scanner.nextLine());
		
		try {
			Scanner line = new Scanner(file);
			while (line.hasNextLine()) {
				String input[] = line.nextLine().split(",");
				if (isEmail(input[1])){
					User user = new User();
					user.setName(input[0]);
					user.setEmail(input[1]);
					userDao.save(user);
				}
				else
					System.out.println("Input line rejected:\nName: " + input[0] + "Email: " + input[1]);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void updateUser() {
		// TODO Auto-generated method stub
		List<User> users = userDao.getAll();
		int max_id = users.size();
		if (max_id > 0) {
			System.out.println("Enter User ID");
			int id = Integer.parseInt(scanner.nextLine());
			if (id >= 1 && id < max_id ) {
				user = userDao.get(id);
				System.out.println("Current user name = " + user.getName() + " & email = " + user.getEmail());
				System.out.println("Enter User Name to Update");
				user.setName(scanner.nextLine());
				System.out.println("Enter User Email to Update");
				String email = scanner.nextLine(); 
				if ( isEmail(email) ){
					user.setEmail(email);
					userDao.update(user);
				}
				else
					System.out.println("Invalid email address, try again with valid email");
			} else
				System.out.println("Invalid User Id\nEnter any value between 0 and " + max_id);
		} else
			System.out.println("No Users Available !! Please Add New User ");
	}

	public void getUserById() {
		//Don't change the Method Headers and Inputs & Try to add the validation and return values
		/* Get the Input from User. Should be in number(integer) format. if any other formats(other than Integer) 
		is provided as input throw error message as "Invalid Input Please Try Again" and add option to Try Again */
		System.out.println("Enter User ID");
		/* If the User ID is in number format. check whether the User ID exist or not. If User ID does not Exist throw error message as 
		"Invalid User ID" */
		try {
			int id = Integer.parseInt(scanner.nextLine());
			List<User> users = userDao.getAll();
			int max_id = users.size();
			if (id >= 1 && id < max_id ) {
				/* If the User ID Exist, Print the User Info (User Name & Email) */
				user = userDao.get(id);
				System.out.println("User name: " + user.getName() + " & Email: " + user.getEmail());
			} else
				System.out.println("Invalid User Id\nEnter any value between 0 and " + max_id);
		}
		catch(NumberFormatException e) {
			System.out.println("Invalid Input type. Please Try Again");
			if (attempt) {
				attempt = true;
				getUserById();
			}
		}
		/* Note: Already added a get method. Please refer UserDaoImpl.java */
	}

	public void getAllUsers() {
		List<User> users = userDao.getAll();

		for(int i = 0; i < users.size(); i++) {
			user = users.get(i);
			System.out.println("User Name:" + user.getName() + " & Email: " + user.getEmail() + " && ID: " + user.getId());
		}
		//Don't change the Method Headers and Inputs & Try to add the validation and return values
		
		/* Display all User Informations as mentioned below*/
		
		/* User Name: <UserName> & Email: <User Email> && Id: <User ID> */
		
		/* Note: Already added a getAll method. Please refer UserDaoImpl.java */
	}

	public void removeUser() {
		//Don't change the Method Headers and Inputs & Try to add the validation and return values
		System.out.println("Enter User ID <or> List of IDs seperated by comma (ex: 1,2,3)");
/* Get the Input from User. Should be in number(integer) format. if any other formats(other than Integer) 
		is provided as input throw error message as "Invalid Input Please Try Again" and add option to Try Again */
		String inputs[] = scanner.nextLine().split(",");
		for (int i = 0; i < inputs.length; i++) {
/* If the User ID is in number format. check whether the User ID exist or not. If User ID does not Exist throw error message as 
			"Invalid User ID" */
			try {
				int id = Integer.parseInt(inputs[i]);
				List<User> users = userDao.getAll();
				int max_id = users.size();
				if (id >= 1 && id < max_id ) {
/* If the User ID Exist, Print the User Info (User Name & Email) */
					user = userDao.get(id);
					System.out.println("User name: " + user.getName() + " & Email: " + user.getEmail());
/* If the User ID Exist, Remove the User Info from the List and show message as "User Removed Successfully" (User Name & Email) */
					userDao.delete(user);
				}
				else
					System.out.println("User Id (" + id + ") Not found");
			}
			catch(NumberFormatException e) {
				System.out.println("Invalid format entered. Please try with valid ID(s)");
			}
		}

		

		
		
		/* Note: Already added a delete method. Please refer UserDaoImpl.java */ 
	}
	
	public boolean isEmail(String mail){
		boolean isemail = false;
		if ( Pattern.matches("^[A-Za-z0-9+_.-]+@(.+)$", mail) )
			isemail = true;
		return isemail;
	}

}