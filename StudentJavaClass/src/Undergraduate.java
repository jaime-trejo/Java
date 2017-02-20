/*
 * Name:Jaime Trejo
 * 				This program will be the class Undergraduate which extends from Student also implement two interfaces,
 * 				and will have certain attributes and methods. It will override the abstract method in Student
 * 				Certain methods will have restrictions. There will be mutators, accessors, readInput,equals, and toString method.
 */

import java.util.Scanner;

public class Undergraduate extends Student implements HavingFun,StayingInTouch
{
	private int level; // 1 for freshman, 2 for sophomore, 3 for junior , 4 for senior
	
	// default constructor
	public Undergraduate()
	{
		super();// calls previous class default constructor
		level = 1; // is initially set at freshman
	}
	
	// mutators 
	
	/*Precondition: The instance variables must be greater than 1 and not greater than 4
	 * Postcondition: level will be newLevel
	 */
	public void setLevel(int newLevel)
	{
		while(newLevel < 1 || newLevel > 4)
		{
			System.out.println("The input you entered is not greater than zero or less than 4");
			System.out.print("Please enter a new class level(Between 1 and 4): ");
			Scanner keyboard = new Scanner(System.in);
			newLevel = keyboard.nextInt();
			
		}
		level = newLevel;
	}
	
	// accessors 
	
	public int getLevel()
	{
		return level;
	}
	
	//Precondition: The conditions of the mutators must be met before a final value is entered
	//Postcondition: Data is stored into the instance variables
	public void readInput()
	{
		Scanner keyboard = new Scanner(System.in);
		super.readInput();// calls previous readInput from Student class
		System.out.print("Please enter your student level(The level must be 1-4): ");
		level = keyboard.nextInt();
		setLevel(level);
	}
	
	// Precondition: The conditions must be met
	//Postcondition it will return the grade class name for whichever level the student is
	public String classOutput()
	{
		if(level == 1)
		{
			return "Freshman \n";
		}
		else if(level == 2)
		{
			return "Sophomore \n";
		}
		else if(level == 3)
		{
			return "Junior \n";
		}
		else if(level == 4)
		{
			return "Senior \n";
		}
		else
		{
			return "You are not an Undergraduate. \n";
		}
	}
	
	//Precondition:The instance variables of the calling objects have values
	//Postcondition: The instance variables of the receiving object have been written out to screen
	public String toString()
	{
		System.out.println(super.toString());// prints and calls the Student class toString method
		return "Level: " + getLevel() + "\nClass: " + classOutput();
	}
	
	/*Precondition: The instance variables of objects will have values
	 * Postcondition:If the data stored in values meets the requirements then it will output true
	 */
	public boolean equals(Undergraduate otherUndergraduate)
	{
		return super.equals(otherUndergraduate) && (this.level == otherUndergraduate.level);
	}

	/*Precondition: Certain conditions must be met 
	 *Postcondition: Given the number of hours and location, your program should advice the 
	 *				student whether to continue or to change his/her practice in order to be successful
	 */
	public void studyingIsFun(int numHrs, String location)
	{
		while(numHrs > 48)
		{
			System.out.println("\nPlease enter an amount of hours that is greater than 0, but less than 48");
			Scanner keyboard = new Scanner(System.in);
			numHrs = keyboard.nextInt();
		}
		System.out.println("\nYou study for " + numHrs + " hours "+ "at " + location);
		
		if(numHrs <= 7)
		{
			System.out.println("You should consider studying more weekly");
		}
		if(numHrs > 7 && numHrs <= 24)
		{
			System.out.println("You study plenty during the week.");
		}
		if(numHrs > 24 && numHrs < 48)
		{
			System.out.println("You over study.");
		}
		if(location.equalsIgnoreCase("bar") || location.equalsIgnoreCase("party") || location.equalsIgnoreCase("work"))
		{
			System.out.println("You should find a better location to study.");
		}
		else
		{
			System.out.println("You study at a good location.");
		}
		
		
	}
	
	/*
	 * Precondition: Will ask for the use to see if he/she listens to music, conditions must be met
	 * Postcondition: Will output the certain condition the user has met
	 */
	public void listeningToMusic()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("\nDo you listen to music throughout the week? (Enter y/n): ");
		String userInput = keyboard.next();
		char userInputConversion = userInput.charAt(0);
		
		int hours = 0;// initialized at 0
		
		if(userInputConversion == 'y' || userInputConversion == 'Y')
		{
			System.out.print("How many hours do you listen during the week?" +
					"(Please enter an integer value that is greater than 0 and less than 120): ");
			hours = keyboard.nextInt();
			
			while(hours < 0 || hours > 120)
			{
				System.out.println("You entered an invalid input.Please try again.");
				System.out.println("(Please enter an integer value that is greater than 0 and less than 120)");
				hours = keyboard.nextInt();
			}
			System.out.println("The amount of hours you listen to music is " + hours + "\n");
		}
		
		else if(userInputConversion == 'n' || userInputConversion == 'N')
		{
			System.out.println("You do not listen to music throughout the week.\n");
		}
		else
		{
			System.out.println("Not a valid input.");
			System.out.println("Please try again.");
			listeningToMusic();
		}
	}
		
	/*
	 * Precondition: Will ask for the use to see if he/she plays soccer, conditions must be met
	 * Postcondition: Will output the certain condition the user has met
	 */
	
	public void playingSoccer()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("\nDo you play soccer throughout the week? (Enter y/n): ");
		String userInput = keyboard.next();
		char userInputConversion = userInput.charAt(0);
		
		int hours = 0;// initialized at 0
		
		if(userInputConversion == 'y' || userInputConversion == 'Y')
		{
			System.out.print("How many hours do you play during the week?" +
					"(Please enter an integer value that is greater than 0 and less than 120): ");
			hours = keyboard.nextInt();
			
			while(hours < 0 || hours > 120)
			{
				System.out.println("You entered an invalid input.Please try again.");
				System.out.println("(Please enter an integer value that is greater than 0 and less than 120)");
				hours = keyboard.nextInt();
			}
			System.out.println("The amount of hours you play soccer is " + hours + "\n");
		}
		
		else if(userInputConversion == 'n' || userInputConversion == 'N')
		{
			System.out.println("You do not play soccer throughout the week.\n");
		}
		else
		{
			System.out.println("Not a valid input.");
			System.out.println("Please try again.");
			playingSoccer();
		}
	}
	
	/*
	 * Precondition: Will ask for the use to see if he/she plays video games, conditions must be met
	 * Postcondition: Will output the certain condition the user has met
	 */
	public void playingVideoGames()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("\nDo you play video games throughout the week? (Enter y/n): ");
		String userInput = keyboard.next();
		char userInputConversion = userInput.charAt(0);
		
		int hours = 0;// initialized at 0
		
		if(userInputConversion == 'y' || userInputConversion == 'Y')
		{
			System.out.print("How many hours do you play during the week?" +
					"(Please enter an integer value that is greater than 0 and less than 120): ");
			hours = keyboard.nextInt();
			
			while(hours < 0 || hours > 120)
			{
				System.out.println("You entered an invalid input.Please try again.");
				System.out.println("(Please enter an integer value that is greater than 0 and less than 120)");
				hours = keyboard.nextInt();
			}
			System.out.println("The amount of hours you play video games is " + hours + "\n");
		}
		
		else if(userInputConversion == 'n' || userInputConversion == 'N')
		{
			System.out.println("You do not play videos games throughout the week.\n");
		}
		else
		{
			System.out.println("Not a valid input.");
			System.out.println("Please try again.");
			playingVideoGames();
		}
		
	}
	
	/*
	 * Precondition: Will ask for the use to see if he/she watches television, conditions must be met
	 * Postcondition: Will output the certain condition the user has met
	 */
	public void watchingTelevision()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("\nDo you watch television throughout the week? (Enter y/n): ");
		String userInput = keyboard.next();
		char userInputConversion = userInput.charAt(0);
		
		int hours = 0;// initialized at 0
		
		if(userInputConversion == 'y' || userInputConversion == 'Y')
		{
			System.out.print("How many hours do you watch television during the week?" +
					"(Please enter an integer value that is greater than 0 and less than 120): ");
			hours = keyboard.nextInt();
			
			while(hours < 0 || hours > 120)
			{
				System.out.println("You entered an invalid input.Please try again.");
				System.out.println("(Please enter an integer value that is greater than 0 and less than 120)");
				hours = keyboard.nextInt();
			}
			System.out.println("The amount of hours you watch television is " + hours + "\n");
		}
		
		else if(userInputConversion == 'n' || userInputConversion == 'N')
		{
			System.out.println("You do not watch television throughout the week.\n");
		}
		else
		{
			System.out.println("Not a valid input.");
			System.out.println("Please try again.");
			watchingTelevision();
		}
		
	}
	
	/*
	 * Precondition: Will see if the hours entered meets the certain conditions
	 * Postcondition: Will output the certain condition the user has met 
	 */
	
	public void family(int hours)
	{
		while(hours < 0 || hours > 7)
		{
			System.out.println("Invalid input");
			System.out.print("Please enter a value that is greater than 0 and less than 7: ");
			Scanner keyboard = new Scanner(System.in);
			hours = keyboard.nextInt();
		}
		if(hours > 0 && hours < 4)
		{
			System.out.println("You should consider talking to your family more than just " + hours + " hours weekly");
		}
		if(hours >= 4)
		{
			System.out.println("You should consider talking to your family less.");
		}
		
	}
	
	/*
	 * Precondition: Will see if the hours entered meets the certain conditions
	 * Postcondition: Will output the certain condition the user has met 
	 */
	public void friends(int hrs)
	{
		while(hrs < 0 || hrs > 24)
		{
			System.out.println("Invalid input");
			System.out.print("Please enter a value that is greater than 0 and less than 24: ");
			Scanner keyboard = new Scanner(System.in);
			hrs = keyboard.nextInt();
		}
		if(hrs > 0 && hrs < 5)
		{
			System.out.println("You should consider talking to your friends more than just " + hrs + " hours weekly");
		}
		if(hrs > 5 && hrs < 10)
		{
			System.out.println("You spend time with your friends a lot.");
		}
		if(hrs >= 10)
		{
			System.out.println("You sure like to spend time with your friends a lot.");
		}
		
	}
	
	

}
