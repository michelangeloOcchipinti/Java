/**
 * Classe che definisce un team di dipendenti del centro ricerca.
 * 
 * @author Michelangelo Occhipinti
 * 
 * @version 1.0
 * 
 * @since 07/04/2016
 *
 */
public class Team {
	
	/**
	 * Attributo pubblico per il codice dipendente
	 */
	public String codice; 
	private Senior senior;
	/**
	 * Attributo pubblico per la lista dei dipendneti Junior
	 */
	public Junior[] listaJunior;
	/**
	 * Attributo pubblico per il diepndente di tipo Amministratore
	 */
	public Amministratore amministratore;
	private final int MAX=10;

	
	/**
	 * Metodo costruttore con parametri
	 * 
	 * @param codice Il codice dipendente
	 * @param senior Il dipendente Senior
	 * @param MaxDip Numero massimo dei dipendenti del team
	 * @param amministratore	L'amministratore del Centro ricerca
	 * @param progetto	Il progetto aziendale
	 */
	public Team(String codice, Senior senior, int MaxDip, Amministratore amministratore, Progetto progetto) {
		this.codice=codice;
		this.setSenior(senior);
		listaJunior=new Junior[MaxDip];
		this.amministratore=amministratore;
	}
	
	/**
	 * Metodo costruttore senza parametri.
	 */
	public Team() {
		codice=codice;
		setSenior(senior);
		listaJunior=new Junior[MAX];
		amministratore=amministratore;
	}
	
	
	/**
	 * Metodo osservatore per la variabile senior
	 * 
	 * @return Il dipendente Senior assegnato al team.
	 */
	public Senior getSenior() {
		return senior;
	}


	/**
	 * Metodo modificatore per la variabile senior
	 * 
	 * @param senior Il dipendente senior da assegnare al progetto.
	 */
	public void setSenior(Senior senior) {
		this.senior = senior;
	}


	/**
	 * Metodo utilizzato per aggiungere un dipendente Junior
	 * 
	 * @param junior Il dipendente Junior da aggiungere
	 */
	public void addJuniorWorker(Junior junior){
		
	
	}

}
