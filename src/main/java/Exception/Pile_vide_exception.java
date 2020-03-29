package Exception;
import java.util.EmptyStackException;

public class Pile_vide_exception extends Exception{
/*
 * gestion des exceptions lorsque la pile est videss
 */
	public Pile_vide_exception(){
		System.out.println("votre pile est vide /Manque d'operande ");
		}
}
