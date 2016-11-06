/**
 * Classe che definisce il dipendente di tipo Amministratore.
 * 
 * 
 * @author Michelangelo Occhipinti
 * 
 * @version 1.0
 * 
 * @since 07/04/2016
 *
 */
public class Amministratore extends Dipendenti {

	/**
	 * Metodo costruttore con parametri
	 * 
	 * @param nome Il nome del dipendente
	 * @param cognome Il cognome del dipendente
	 * @param cf Il codice fiscale del dipendente
	 * @param dataAssunzione La data di assunzione del dipendente
	 */
	public Amministratore(String nome, String cognome, String cf,String dataAssunzione) {
		super(nome, cognome, cf, dataAssunzione);
	}

}
