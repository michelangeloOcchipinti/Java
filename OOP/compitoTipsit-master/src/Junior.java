/**
 * Classe che definisce il dipendente di tipo Junior.
 * 
 * 
 * @author Michelangelo Occhipinti
 * 
 * @version 1.0
 * 
 * @since 07/04/2016
 *
 */
public class Junior extends Dipendenti {
	
	private int livello;

	/**
	 * Metodo costruttore con parametri
	 * 
	 * @param nome Il nome del dipendente
	 * @param cognome Il cognome del dipendente
	 * @param cf Il codice fiscale del dipendente
	 * @param dataAssunzione La data di assunzione del dipendente
	 * @param livello Il livello del dipendente
	 */
	public Junior(String nome, String cognome, String cf, String dataAssunzione, int livello) {
		super(nome, cognome, cf, dataAssunzione);
		this.setLivello(livello);
	}
	
	/**
	 * Metodo osservatore per l'attributo livello
	 * 
	 * @return Il livello del diepndente di tipi Junior
	 */
	public int getLivello() {
		return livello;
	}

	/**
	 * Metodo modificatore per l'attributo livello
	 * 
	 * @param livello Il nuovo livello del dipendente di tipo Junior
	 */
	public void setLivello(int livello) {
		this.livello = livello;
	}

	/**
	 * Metodo che calcola la paga del dipendente
	 * 
	 */
	public void calcolaPaga(){
		
		
	}
	
	

}
