package Exception;
import java.util.EmptyStackException;

public class Pile_vide_exception extends RuntimeException{

	public Pile_vide_exception(){
		System.out.println("Entrer au moins deux Operandes ");
		}
}
