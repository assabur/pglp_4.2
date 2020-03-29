package Exception;

public class CommandeException  extends Exception{
	/*
	 * gestion des exceptions de type commaande n'existant pas
	 */
	public CommandeException(String commande )
	{
		System.out.println("La commande "+commande+" n'est pas disponible");
	}
}