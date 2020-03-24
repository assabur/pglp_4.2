package fr.uvsq.solid.pglp_4;
	public class Undo implements GeneriqueCommand {
	MoteurRpn moteur=new MoteurRpn();
	Receiver_Generic rg= new Receiver_Generic();
	/*
	 * methode qui recupere la pile du moteur pour en faire un undo
	 * @see fr.uvsq.solid.pglp_4.GeneriqueCommand#apply()
	 */
	public void apply() {
		rg.undo(moteur.pile);
	} 
}
