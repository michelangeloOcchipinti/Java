import java.util.Date;

/**
 * Classe che crea un periodo da abbinare poi ai percorsi per lo studente.
 * 
 * @author Michelangelo Occhipinti
 * 
 * @version 1.0
 * 
 * @since 28/03/2016
 */
public class Periodo {
	
	private String denominazione;
	private Date annoInizio;
	private int durata;
	Percorso percorso;
	
	/**
	 * Costruttore della classe Periodo con parametri.
	 * 
	 * @param denominazione Nome del percorso.
	 * @param annoInizio Anno di inizio del periodo.
	 * @param durata Durata del percorso.
	 * @param percorso Percorso di studi abbinato al periodo.
	*/
	public Periodo(String denominazione, Date annoInizio, int durata, Percorso percorso){
		
		this.denominazione=denominazione;
		this.annoInizio=annoInizio;
		this.durata=durata;
		this.percorso=percorso;
		
																		}
						}

