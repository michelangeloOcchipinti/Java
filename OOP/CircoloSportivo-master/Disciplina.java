/**
 * Classe astratta che regola le tre discipline presenti attraverso le relative sottoclassi.
 * 
 * @author Michelangelo Occhipinti
 * 
 * @version 1.0
 * 
 * @since 31/03/2016
 */


public abstract class Disciplina {
	
	
	private float mensile;
	private float annuale;
	public String nome;
	
	/**
	 * metodo costruttore con parametri privati.
	 * 
	 * @param mensile La quota mensile per la disciplina.
	 * @param annuale La quota annuale per la disciplina.
	 */
	public Disciplina(float mensile, float annuale){
		
		this.mensile=mensile;
		this.annuale=annuale;
		
													}
	/**
	* Metodo modificatore per l'attributo mensile.
	* 
	* @param mensile Il costo mensile per la disciplina.
	*/												
	public void setMensile(float mensile){
		this.mensile=mensile;
										}
	
	/**
	* Metodo modificatore per l'attributo annuale.
	* 
	* @param annuale Il costo annuale per la disciplina.
	*/									
	public void setAnnuale(float annuale){
		
		this.annuale=annuale;
											}
											
	/**
	* Metodo osservatore per l'attributo mensile.
	* 
	* @return Ritorna il costo mensile per la disciplina.
	*/												
	public float getMensile(){
		return mensile;
							}
	
	/**
	* Metodo osservatore per l'attributo annuale.
	* 
	* @return Ritorna il costo annuale per la disciplina.
	*/									
	public float getAnnuale(){
		
		return annuale;
											}
	
}

