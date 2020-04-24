package Exception;
/*
 * classe qui implemente une exception l'orsque l'user renseigne un undo
 */
public class HistorisationException extends Exception {
	/*
	 * gestion des exceptions de types undo lorsque la pile est vide
	 */
	public HistorisationException()
	{
		System.out.println(" Pas de valeur disponible pour l'historisation");
	}

}
