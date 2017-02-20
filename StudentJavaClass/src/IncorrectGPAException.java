/*
 * Name:Jaime Trejo
 *
 * 				This class will extend from the Exception class and have it's own methods
 */

public class IncorrectGPAException extends Exception
{
	
	public IncorrectGPAException()
	{
		super("Exception: Not a valid GPA!");
	}
	
	public IncorrectGPAException(String message)
	{
		super(message);
	}
	
}
