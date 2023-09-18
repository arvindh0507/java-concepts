package com.user.app;

import java.util.NoSuchElementException;
import java.util.Scanner;

import com.user.validation.UserValidation;

public class UserApplication {

	private static UserValidation userValidation = new UserValidation();

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		boolean isExit = false;
		try {
			while (!isExit) {
				System.out.println("Press 1 to Add User");
				System.out.println("Press 2 to Update User");
				System.out.println("Press 3 to Get User");
				System.out.println("Press 4 to Get All Users");
				System.out.println("Press 5 to Delete Users");
				System.out.println("Press 6 to Exit");
				System.out.println("Please input any numbers from 1-6");

				int input = Integer.parseInt(scanner.nextLine());

				switch (input) {
				case 1:
					userValidation.addUser();
					break;
				case 2:
					userValidation.updateUser();
					break;
				case 3:
					userValidation.getUserById();
					break;
				case 4:
					userValidation.getAllUsers();
					break;
				case 5:
					userValidation.removeUser();
					break;
				case 6:
					System.out.printf("Exiting App! Thanks");
					isExit = true;
					break;
				default:
					System.out.println("Invalid Input. Please Try Again !!!");
				}
			}
		} catch (IllegalStateException | NoSuchElementException e) {
			System.out.println("Invalid Input Format !!! Exiting the App");
		} catch (NumberFormatException NE) {
			System.out.println("Invalid Input Format !!! Exiting the App");
		}
	}
}
