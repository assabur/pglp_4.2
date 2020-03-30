package Exception;
/*
 * classe qui implemente les exceptions de types divizion par zero
 */
public class Arithmetic_exception extends Exception
{
	/*
	 * gestion des exceptions de types division par zero
	 */
	public Arithmetic_exception()
	{
		System.out.println("Division par zero impossible ");
	}
}
