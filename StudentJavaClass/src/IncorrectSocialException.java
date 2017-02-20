/*
 * Name:Jaime Trejo
 * 				This class will extend from the Exception class and have it's own methods
 */

public class IncorrectSocialException extends Exception
{

	public IncorrectSocialException()
	{
		super("Exception: Not a valid social!");
	}
	
	public IncorrectSocialException(String message)
	{
		super(message);
	}
}
