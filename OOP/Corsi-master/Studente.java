/**
 * Classe che crea  nel sistema oggetti di tipo studente.
 * 
 * @author Michelangelo Occhipinti
 * 
 * @version 1.0
 * 
 * @since 28/03/2016
 */
public class Studente {
	
	private String cf;
	private String nome;
	private String cognome;
	private String classe;
	private Lista lista;
	private Esame[] esame;
	
	/**
	 * Costruttore della classe Studente con parametri.
	 * 
	 * @param cf Il codice fiscale dello studente.
	 * @param nome Il nome dello studente.
	 * @param cognome Il cognome dello studente.
	 * @param classe La classe di appartenenza dello studente.
	 * @param lista La lista degli esami sostenuti e da sostenere dello studente.
	 * @param esame Lista degli esami da sostenere e sostenuti da parte dello studente.
	*/
	public Studente(String cf, String nome, String cognome, String classe, Lista lista, Esame[] esame){
		
		this.cf=cf;
		this.nome=nome;
		this.cognome=cognome;
		this.classe=classe;
		this.lista=lista;
		this.esame=esame;
																									}	
	/**
	 * metodo toString per stampare a video i parametri essenziali dello studente.
	 * 
	 * @return Ritorna i parametri specificati in formato stringa.
	*/																								
	public String toString(){
		return nome+"\n"+cognome+"\n"+cf+"\n"+classe;
							}
							}

