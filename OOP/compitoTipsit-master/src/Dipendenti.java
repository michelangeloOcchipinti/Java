/**
 * Superclasse che serve a creare la figura del dipendente con i parametri essenziali e comuni a tutti i
 * dipendenti.
 * 
 * @author Michelangelo Occhipinti
 * 
 * @version 1.0
 * 
 * @since 07/04/2016
 *
 */
public class Dipendenti {
	
	private String nome;
	private String cognome;
	private String cf;
	private String dataAssunzione;
	
	/**
	 * Metodo costruttore con parametri.
	 * 
	 * @param nome Il nome del dipendente
	 * @param cognome Il cognome del dipendente
	 * @param cf Il codice fiscale del dipendente
	 * @param dataAssunzione La data di assunzione del dipendente
	 */
	public Dipendenti(String nome, String cognome, String cf,
			String dataAssunzione) {
		this.nome = nome;
		this.cognome = cognome;
		this.cf = cf;
		this.dataAssunzione = dataAssunzione;
	}

	/**
	 * Metodo osservatore per il nome del dipendente
	 * 
	 * @return il nome del dipendente
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Metodo modificatore per il nome del dipendente
	 * 
	 * @param nome Il nome del dipendente
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Metodo osservatore per il cognome del dipendente
	 * 
	 * @return Il cognome del dipendente
	 */
	public String getCognome() {
		return cognome;
	}

	/**
	 * Metodo modificatore per il cognome del dipendente
	 * 
	 * @param cognome Il cognome del dipendente
	 */
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	/**
	 * Metodo osservatore per il codice fiscale del dipendente
	 * 
	 * @return Il codice fiscale del dipendente
	 */
	public String getCf() {
		return cf;
	}

	/**
	 * Metodo modificatore per il codice fiscale del dipendente
	 * 
	 * @param cf Il codice fiscale del dipendente
	 */
	public void setCf(String cf) {
		this.cf = cf;
	}

	/**
	 * Metodo osservatore per la data di assunzione del dipendente
	 * 
	 * @return La data di assunzione del dipendente
	 */
	public String getDataAssunzione() {
		return dataAssunzione;
	}

	/**
	 * Metodo modificatore per la data di assunzione del dipendente
	 * 
	 * @param dataAssunzione La data di assunzione del dipendente
	 */
	public void setDataAssunzione(String dataAssunzione) {
		this.dataAssunzione = dataAssunzione;
	}
	
	

	

}
