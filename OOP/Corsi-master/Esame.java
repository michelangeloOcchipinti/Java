/**
 * Classe che definisce oggetti di tipo esame da superare per i moduli.
 * 
 * @author Michelangelo Occhipinti
 * 
 * @version 1.0
 * 
 * @since 28/03/2016
 */
public class Esame {
	
	private boolean superato;
	private Modulo modulo;
	private Studente studente;
	
	/**
	 * Costruttore della classe Esame con parametri.
	 * 
	 * @param superato Definisce se l'esame è stato superato o meno.
	 * @param modulo Il modulo al quale l'esame si riferisce.
	 * @param studente Studente abbinato all'esame.
	*/
	public Esame(boolean superato, Modulo modulo, Studente studente){
		
		this.superato=superato;
		this.modulo=modulo;
		this.studente=studente;
		
																	}
}

