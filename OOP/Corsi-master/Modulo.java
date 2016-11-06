/**
 * Classe Modulo che definisce i moduli per le varie materie.
 * 
 * @author Michelangelo Occhipinti
 * 
 * @version  1.0
 * 
 * @since 28/03/2016
 */
public class Modulo {
	
	private String titolo;
	private Materia materia;
	private Periodo periodo;
	private Esame[] esame;
	
	/**
	 * Costruttore della classe Modulo con parametri.
	 * 
	 * @param titolo Nome del modulo.
	 * @param materia Materia di cui fa parte il modulo.
	 * @param periodo Periodo di cui fa parte il modulo.
	 * @param esame Esame 	abbinato al modulo.
	*/
	public Modulo(String titolo, Materia materia, Periodo periodo, Esame[] esame){
		
		this.titolo=titolo;
		this.materia=materia;
		this.periodo=periodo;
		this.esame=esame;	
		
		
								}
					}

