/*
 * Name:Jaime Trejo
 * 				This program will be the UndergraduateDemo and will run everything for the UndergraduateClass with two objects, 
 * 				it will also compare the objects
 */
import java.util.Scanner;

public class UndergraduateDemo
{

	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		Undergraduate ugOne = new Undergraduate();
		
		System.out.println("The following is the input for the first undergraduate: ");
		System.out.println("-------------------------------------------------------   ");
		ugOne.readInput();
		System.out.println("\nThe following is the output for the first undergraduate: ");
		System.out.println("-------------------------------------------------------   ");
		System.out.println(ugOne.toString());
		
		System.out.print("\nPlease enter your currentGpa(must be greater than 0 and less than 4.0): ");
		double currentGpa = keyboard.nextDouble();
		System.out.print("Please enter your semesterGpa(must be greater than 0 and less than 4.0): ");
		double semesterGpa = keyboard.nextDouble();
		ugOne.computeGPA(currentGpa, semesterGpa);
		
			System.out.print("\nPlease enter the hours you study per week (must be greater than zero and less than 48)" +
				"\nalso enter the location you study at (both things must be seperated by a space): ");
		int numHrs = keyboard.nextInt();
		String location = keyboard.next();
		ugOne.studyingIsFun(numHrs,location);
		
		ugOne.listeningToMusic();
		ugOne.playingSoccer();
		ugOne.playingVideoGames();
		ugOne.watchingTelevision();
		
		System.out.print("\nPlease enter the amount of hours you talk to your family(Enter an integer value from 1-7):");
		int hours = keyboard.nextInt();
		ugOne.family(hours);
		System.out.print("\nPlease enter the amount of hours you talk to your friends(Enter an integer value from 1-24):");
		int hrs = keyboard.nextInt();
		ugOne.friends(hrs);
		
		
		Undergraduate ugTwo = new Undergraduate();
		
		System.out.println("\nThe following is the input for the second undergraduate: ");
		System.out.println("-------------------------------------------------------   ");
		ugTwo.readInput();
		System.out.println("\nThe following is the output for the second undergraduate: ");
		System.out.println("-------------------------------------------------------   ");
		System.out.println(ugTwo.toString());
		
		System.out.print("\nPlease enter your currentGpa(must be greater than 0 and less than 4.0): ");
		currentGpa = keyboard.nextDouble();
		System.out.print("Please enter your semesterGpa(must be greater than 0 and less than 4.0): ");
		semesterGpa = keyboard.nextDouble();
		ugTwo.computeGPA(currentGpa, semesterGpa);
		
			System.out.print("\nPlease enter the hours you study per week (must be greater than zero and less than 48)" +
				"\nalso enter the location you study at (both things must be seperated by a space): ");
		numHrs = keyboard.nextInt();
		location = keyboard.next();
		ugTwo.studyingIsFun(numHrs,location);
		
		ugTwo.listeningToMusic();
		ugTwo.playingSoccer();
		ugTwo.playingVideoGames();
		ugTwo.watchingTelevision();
		
		System.out.print("\nPlease enter the amount of hours you talk to your family(Enter an integer value from 1-7):");
		hours = keyboard.nextInt();
		ugTwo.family(hours);
		System.out.print("\nPlease enter the amount of hours you talk to your friends(Enter an integer value from 1-24):");
		hrs = keyboard.nextInt();
		ugTwo.friends(hrs);
		
		
		System.out.println("\nThe following is the output for if ugOne is equal to ugTwo: ");
		System.out.println("-------------------------------------------------------   ");
		if(ugOne.equals(ugTwo))
		{
			System.out.println("Both objects have the same first and last name, studentNumber, and are the same level.");
		}
		else
		{
			System.out.println("The two objects differ.");
		}
	
	}

}
