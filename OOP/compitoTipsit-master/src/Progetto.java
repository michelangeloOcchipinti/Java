import java.util.*;

/**
 * Classe che definisce il progetto che sarà seguito dal <strong>team</strong> del centro ricerca.
 * 
 * @author Michelanelo Occhipinti
 * 
 * @version 1.0
 * 
 * @since 07/04/2016
 *
 */
public class Progetto {
	
	/**
	 * Attributo pubblico per la denominazione del progetto
	 */
	public String Denominazione;
	private float budget;
	private Date dataInizio;
	/**
	 * Attributo pubblico per il team assegnato al progetto
	 */
	public Team[] teamAssegnato;
	private final int MAX=10;
	
	/**
	 * Metodo costruttore con parametri.
	 * 
	 * @param denominazione Il nome del progetto.
	 * @param budget Il budget massimo assegnato al progetto.
	 * @param dataInizio La data di inizio del progetto.
	 * @param teamAssegnato Il team di dipendenti assegnato al progetto.
	 */
	public Progetto(String denominazione, float budget, Date dataInizio, Team[] teamAssegnato) {
		Denominazione = denominazione;
		this.budget = budget;
		this.dataInizio = dataInizio;
		this.teamAssegnato = teamAssegnato;
	}
	
	/**
	 * Metodo costruttore senza parametri.
	 * 
	 */
	public Progetto(){
		Denominazione =null;
		budget = 0;
		dataInizio =null;
		teamAssegnato=new Team[MAX];
		
	}
	
	
	
	/**
	 * Metodo osservatore per l'attributo budget.
	 * 
	 * @return Il budget del progetto.
	 */
	public float getBudget() {
		return budget;
	}

	/**
	 * Metodo modificatore  per l'attributo budget.
	 * 
	 * @param budget Il budget del progetto
	 */
	public void setBudget(float budget) {
		this.budget = budget;
	}

	/**
	 * Metodo osservatore per l'attributo data di inizio del progetto.
	 * 
	 * @return La data di inizio del progetto.
	 */
	public Date getDataInizio() {
		return dataInizio;
	}

	/**
	 * Metodo modificatore per l'attributo dataInizio.
	 * 
	 * @param dataInizio La data di inizio del progetto.
	 */
	public void setDataInizio(Date dataInizio) {
		this.dataInizio = dataInizio;
	}

	/**
	 * Metodo utilizzato per assegnare un team al progetto.
	 * 
	 * @param t Il team da assegnare al progetto.
	 */
	public void addTeam(Team t){
		
	}
	
	/**
	 * Metodo utilizzato per rimuovere un team.
	 * 
	 * @param ct il nome del team da rimuovere.
	 */
	public void removeTeam(String ct){
		
	}

	
	

}
