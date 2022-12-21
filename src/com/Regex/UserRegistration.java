package com.Regex;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * 
 * @author Kapil
 *
 */
public class UserRegistration {
	
	public boolean userName(String regex , String input) {
		return Pattern.compile(regex).matcher(input).matches();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);  //create object
		/*
		 * User need to enter a valid First Name and Last Name
		 * First name and Last Name start capital minimum 1.
		 */
		System.out.println("Enter First Name :");
		String firstName = "[A-Z]{1}[a-z]{2,}";
		String input = scanner.next(); //Kapil = true  //kapil = false
		
		System.out.println("Enter Last Name :");
		String lastName = "[A-z]{1}[a-z]{2,}";
		String inputLastName = scanner.next();
		
		UserRegistration userRegistration = new UserRegistration();
		System.out.println(userRegistration.userName(firstName, input));
		System.out.println(userRegistration.userName(lastName, inputLastName));


	}

}
