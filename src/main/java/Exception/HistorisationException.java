package Exception;

public class HistorisationException extends Exception {
	/*
	 * gestion des exceptions de types undo lorsque la pile est vide
	 */
	public HistorisationException()
	{
		System.out.println(" Pas de valeur disponible pour l'historisation");
	}

}
