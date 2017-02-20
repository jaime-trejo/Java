/*
 * Name:Jaime Trejo
 * 				This program will be the abstract class Student which extends from Person and 
 * 				will have certain attributes and methods (one method is abstract and final) 
 * 				Certain methods will have restrictions. There will be mutators, accessors, readInput,equals, and toString method.
 */

import java.util.Scanner;

public abstract class Student extends Person
{
	private int studentNumber;
	
	// default constructor
	public Student()
	{
		super();// calls the default constructor of Person
		studentNumber = 0; // there is no number yet
	}
	
	// mutators
	
	/*Precondition: The instance variables must be greater than zero
	 * Postcondition: studentNumber will be newStudentNumber
	 */
	public void setStudentNumber(int newStudentNumber)
	{
		while(newStudentNumber < 0 )
		{
			System.out.println("The input you entered is not greater than zero");
			System.out.print("Please enter a new student number that is 6 digits ");
			Scanner keyboard = new Scanner(System.in);
			newStudentNumber = keyboard.nextInt();
		}
		studentNumber = newStudentNumber;
	}
	
	// accessors
	public int getStudentNumber()
	{
		return studentNumber;
	}
	
	//Precondition: The conditions of the mutators must be met before a final value is entered
	//Postcondition: Data is stored into the instance variables
	public void readInput()
	{
		super.readInput(); // calls previous readInput from base class
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter a student number that is 6 digits (must also be greater than zero) : ");
		studentNumber = keyboard.nextInt();
		setStudentNumber(studentNumber);
	}
	
	//Precondition:The instance variables of the calling objects have values
	//Postcondition: The instance variables of the receiving object have been written out to screen
	public String toString()
	{
		
		System.out.println(super.toString());// prints and calls the base class toString method
		return "Student number: " + getStudentNumber();
	}
	
	/*Precondition: The instance variables of objects will have values
	 * Postcondition:If the data stored in values meets the requirements then it will output true
	 */
	public boolean equals(Student otherStudent)
	{
		return super.equals(otherStudent) && (this.studentNumber == otherStudent.studentNumber);
	}
	
	/*Precondition: Conditions have to be met before a final value is calculated
	 * Postcondition: Will calculate the updatedGPA and be ready to display the value
	 */
	public final void computeGPA(double currentGpa, double semesterGpa)
	{
		Scanner keyboard = new Scanner(System.in);
		double updateGpa = 0;
		
		// tries the following with an exception
		try
		{
			if(currentGpa < 0.0 || currentGpa > 5.0)
			{
				throw new IncorrectGPAException();
				
			}
		}
		catch(IncorrectGPAException e)
		{
			System.out.println(e.getMessage());
			//System.out.println("Your current gpa is: " + currentGpa);
			System.out.print("That is not a valid current GPA please enter a value that is greater than 0.0 and less than 5.0): ");
			currentGpa = keyboard.nextDouble();
			computeGPA(currentGpa,semesterGpa);// keeps calling the method for a loop
		}
		
		
		if(semesterGpa == 0)
		{
			System.out.println("Your semester gpa is: " + semesterGpa);
			System.out.println("You did not pass the current semester because your semesterGpa is: " + semesterGpa);
			updateGpa = currentGpa + semesterGpa;
			System.out.println("Your gpa remains unchanged." );
		}
		while(semesterGpa < 0.0 || semesterGpa > 4.0)
		{
			System.out.println("Your semester gpa is: " + semesterGpa);
			System.out.print("\nThat is not a valid semester GPA please enter a value that is greater than 0.0 and less than 4.0): ");
			semesterGpa = keyboard.nextDouble();
		}
		
		updateGpa = currentGpa + (semesterGpa/4.0);
		updateGpa = Math.round(updateGpa*100)/100;
		
		
		System.out.println("\nYour current Gpa is: " + currentGpa + "\nYour semester Gpa is: " + semesterGpa +
				"\nYour updated Gpa is: "+ updateGpa);
	}
	
	// abstract method studyingIsFun, does not need a body
	public abstract void studyingIsFun(int numHrs, String location);
	
	


}
