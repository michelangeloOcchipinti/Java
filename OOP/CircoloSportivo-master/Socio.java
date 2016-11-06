/**
 *Classe che crea un oggetto per archiviare i dati di un nuovo socio.
 * 
 * @author Michelangelo Occhipinti
 * 
 * @version 1.0
 * 
 * @since 31/03/2016 
*/

public class Socio{
	
	private String nome;
	private String cognome;
	private String cf;
	private CircoloSportivo circolo;
	private Disciplina[] disciplina;
	
	
	/**
	* Metodo costruttore con parametri.
	* 
	* @param nome Il nome del socio
	* @param cognome Il cognome del socio
	* @param cf Il codice fiscale del socio
	* @param circolo L'oggetto circolo da abbinare al socio
	*/
	public Socio (String nome, String cognome, String cf, CircoloSportivo circolo){
		this.nome=nome;
		this.cognome=cognome;
		this.cf=cf;
		this.circolo=circolo;
		disciplina=new Disciplina[3];
		
															}
	/**
	* Metodo modificatore per l'attributo nome.
	* 
	* @param nome Il nome del socio.
	*/														
	public void setNome(String nome){
		this.nome=nome;
		
										}
	
	/**
	* Metodo modificatore per l'attributo cognome.
	* 
	* @param cognome Il cognome del socio.
	*/									
	public void setCognome(String cognome){
		this.cognome=cognome;
		
											}
	
	/**
	* Metodo modificatore per l'attributo codice fiscale.
	* 
	* @param cf Il codice fiscale del socio.
	*/										
	public void setCf(String cf){
		this.cf=cf;
		
								}
	
	/**
	* Metodo osservatore per l'attributo nome.
	* 
	* @return restituisce il nome del socio.
	*/	
	public String getNome(){
		return nome;
		
							}
	
	/**
	* Metodo osservatore per l'attributo cognome.
	* 
	* @return restituisce il cognome del socio.
	*/							
	public String getCognome(){
		return cognome;
		
								}
	
	/**
	* Metodo osseratore per l'attributo codice fiscale.
	* 
	* @return restituisce il codice fiscale del socio.
	*/							
	public String getCf(){
		return cf;
		
							}
	
	/**
	* Metodo che restituisce la retta del socio annuale o mensile.
	* 
	* @param isAnnuale Attributo per assegnare il valore vero o falso nel caso l'iscrizione sia su base o annuale.
	* 
	* @return restituisce la retta dovuta dal socio.
	*/							
	public float calcoloRetta(boolean isAnnuale){
		
		return 0;
		
												}
			}
