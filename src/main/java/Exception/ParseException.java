package Exception;

public class ParseException extends Exception
{
	/*
	 * exception levé lorsque la convertion de String en Double echoue
	 */
	public ParseException()
	{
		System.out.println("Erreur de convertion ");
	}
}
