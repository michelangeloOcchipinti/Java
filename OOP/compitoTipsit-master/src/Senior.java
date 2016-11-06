/**
 * 
 */

/**
 * Classe che definisce il dipendente di tipo Senior.
 * 
 * 
 * @author Michelangelo Occhipinti
 * 
 * @version 1.0
 * 
 * @since 07/04/2016
 *
 */
public class Senior extends Dipendenti {

	/**
	 * @param nome Il nome del dipendente
	 * @param cognome Il cognome del dipendente
	 * @param cf Il codice fiscale del dipendente
	 * @param dataAssunzione La data di assunzione del dipendente
	 */
	public Senior(String nome, String cognome, String cf, String dataAssunzione) {
		super(nome, cognome, cf, dataAssunzione);
		
	}
	
	public int calcolaAnzianita(){
		return 0;
	}

}
