package Exception;
/*
 * classe qui implemente l'exception lorsqu'il ya erreur de convertion
 */
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
