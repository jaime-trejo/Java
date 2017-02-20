/*
 * Name:Jaime Trejo
 * 				This program will be the class Person and will have certain attributes and methods. 
 * 				Certain methods will have restrictions. There will be mutators, accessors, readInput,equals, and toString method.
 */

import java.util.Scanner;

public class Person
{
	private String firstName;
	private String lastName;
	private int social;
	
	// default constructor 
	public Person()
	{
		firstName = "No first name yet";
		lastName = "No last name yet";
		social = 0;
	}
	
	//mutators
	
	/*Precondition: The instance variables must be greater than length 1 or else it throws 
	 * it keeps throwing in loop until a valid name is entered
	 * Postcondition: firstName will be newFirstName
	 */
	public void setFirstName(String newFirstName)
	{
		try
		{
			if(newFirstName.length() < 2)
			throw new IncorrectNameException();
			
			firstName = newFirstName;
		
		}
		catch(IncorrectNameException e)
		{
			System.out.println(e.getMessage());
			System.out.println("Try again.");
			System.out.print("Please enter first name(greater than two characters): ");
			Scanner keyboard = new Scanner(System.in);
			newFirstName = keyboard.next();
			setFirstName(newFirstName);
		}
	}

	/*Precondition: The instance variables must be greater than length 1 or else it throws 
	 * it keeps throwing in loop until a valid name is entered
	 * Postcondition: lastName will be newLastName
	 */
	
	public void setLastName(String newLastName)
	{
		try
		{
			if(newLastName.length() < 2)
			throw new IncorrectNameException();
			
			lastName = newLastName;
		
		}
		catch(IncorrectNameException e)
		{
			System.out.println(e.getMessage());
			System.out.println("Try again.");
			System.out.print("Please enter last name(greater than two characters): ");
			Scanner keyboard = new Scanner(System.in);
			newLastName = keyboard.next();
			setLastName(newLastName);
		}
	}
	
	/*Precondition: The instance variables must be greater than zero
	 * Postcondition: socialSecurityNumber will be newSocial
	 */
	public void setSocial(int newSocial)
	{
		try
		{
			if(newSocial < 0)
			throw new IncorrectSocialException();
			social = newSocial;
	
		}
		catch(IncorrectSocialException e)
		{
			System.out.println(e.getMessage());
			System.out.println("Try again.");
			System.out.print("Please enter a SSN for the person(must be greater than 0 and 9 digits(no spaces and hyphens): ");
			Scanner keyboard = new Scanner(System.in);
			newSocial = keyboard.nextInt();
			setSocial(newSocial);
		}
		
		
	}
	
	// accessors
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public int getSocial()
	{
		return social;
	}
	
	//Precondition: The conditions of the mutators must be met before a final value is entered
	//Postcondition: Data is stored into the instance variables
	public void readInput()
	{
		Scanner keyboard = new Scanner(System.in);
		
		// will try the following
		try
		{
			System.out.print("Please enter first name(greater than two characters): ");
			firstName = keyboard.next();
			setFirstName(firstName);
			
			if(firstName.length() < 2)
			throw new IncorrectNameException();
		}
		catch(IncorrectNameException e)
		{
			System.out.println(e.getMessage());
			System.out.println("Try again.");
			System.out.print("Please enter first name(greater than two characters): ");
			firstName = keyboard.next();
			setFirstName(firstName);
		}
		try
		{
			
			System.out.print("Please enter last name(greater than two characters): ");
			lastName = keyboard.next();
			
			if(lastName.length() < 2)
			throw new IncorrectNameException();
			
			setLastName(lastName);
		}
		catch(IncorrectNameException e)
		{
			System.out.println(e.getMessage());
			System.out.println("Try again.");
			System.out.print("Please enter last name(greater than two characters): ");
			lastName = keyboard.next();
			setLastName(lastName);
		}
			
			
		// will try the following
		try
		{	System.out.print("Please enter a SSN for the person(must be greater than 0 and 9 digits(no spaces and hyphens): ");
			social = keyboard.nextInt();
			setSocial(social);
		
			if(social < 0)
			throw new IncorrectSocialException();
	
		}
		catch(IncorrectSocialException e)
		{
			System.out.println(e.getMessage());
			System.out.println("Try again.");
			System.out.print("Please enter a SSN for the person(must be greater than 0 and 9 digits(no spaces and hyphens): ");
			social = keyboard.nextInt();
			setSocial(social);
		}
		
		
	}
	
	//Precondition:The instance variables of the calling objects have values
	//Postcondition: The instance variables of the receiving object have been written out to screen
	public String toString()
	{
		return "First name: " + getFirstName() + "\nLast name: " + getLastName();
	}
	
	/*Precondition: The instance variables of objects will have values
	 * Postcondition:If the data stored in values meets the requirements then it will output true
	 */
	public boolean equals(Person otherObject)
	{
		return firstName.equalsIgnoreCase(otherObject.firstName) && (lastName.equalsIgnoreCase(otherObject.lastName));
	}

}