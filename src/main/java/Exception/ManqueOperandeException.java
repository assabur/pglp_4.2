package Exception;

public class ManqueOperandeException extends Exception {
	/*
	 * exception l'orsque il ya manque d'operande pour effectuer une operation
	 */
	public ManqueOperandeException(){
		System.out.println("Erreur Entrez une operande ");
		}
}