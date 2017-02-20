
/*
 * Name:Jaime Trejo
 * 				This class will extend from the Exception class and have it's own methods
 */


public class IncorrectNameException extends Exception
{

	public IncorrectNameException()
	{
		super("Exception: Incorrect name input!");
	}
	
	public IncorrectNameException(String message)
	{
		super(message);
	}
}
