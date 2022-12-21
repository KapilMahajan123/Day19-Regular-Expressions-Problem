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
		String lastName = "[A-Z]{1}[a-z]{2,}";
		String inputLastName = scanner.next();
		/*
		 * User need to enter a valid email
		 * to valid email is (abc.xyz@bl.co.in)
		 */
		System.out.println("Enter Email-Id :");
		String emailId = "[a-z]*.[a-z]+@[a-z]+.[a-z]{2,3}(.[a-z]{2,})";
		String inputEmailId = scanner.next();
		/*
		 * User need to follow pre-defined Mobile Format
		 * Country code follow by hypen
		 * and 10 digit numbers
		 */
		System.out.println("Enter Mobile Number");
		String mobileNumber ="(91)(-)[6-9]{1}[0-9]{9}";
		String inputmobileNumber = scanner.next();
		/*
		 * As a user need to add Password rules
		 * At a minimum 8 characters
		 * And maximum any character 
		 */
		System.out.println("Enter Password");
		//String password = "[A-Za-z0-9]{8}$";
		String password = "((?=.*[A-Z]).{8,})";
		String inputPassword = scanner.next(); 
		
		UserRegistration userRegistration = new UserRegistration();
		System.out.println(userRegistration.userName(firstName, input));
		System.out.println(userRegistration.userName(lastName, inputLastName));
		System.out.println(userRegistration.userName(emailId, inputEmailId));
		System.out.println(userRegistration.userName(mobileNumber, inputmobileNumber));
		System.out.println(userRegistration.userName(password, inputPassword));





	}

}
