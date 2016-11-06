/**
 * Classe lista che permette di creare una lista di nodi ordinata da utilizzare per memorizzare i risultati dello studente.
 * 
 * @author Michelangelo Occhipinti
 * 
 * @version 1.0
 * 
 * @since 28/03/20016
 */
public class Lista {
	
	private Nodo head;
	private Nodo tail;	
	Studente studente;
	
	/**
	 * Costruttore della lista senza parametri.
	*/
	public Lista(){
		head=null;
		tail=null;
		studente=null;
					}
	
	/**
	 * Costruttore della lista con parametri.
	 * 
	 * @param head indirizzo del nodo più recente.
	 * @param tail Indirizzo del nodo meno recente.
	 * @param studente Studente al quale appartiene la lista.
	*/				
	public Lista(Nodo head, Nodo tail, Studente studente){
		this.head=head;
		this.tail=tail;
		this.studente=studente;
										}
	
	/**
	 * Metodo che assegna il valore all'attributo head. 
	 * 
	 * @param head indirizzo del nodo più recente.
	*/										
	public void setHead(Nodo head){
		this.head=head;
									}
	
	/**
	 * Metodo osservatore della variabile head.
	 * 
	 * @return Restituisce l'attributo head della lista.
	*/									
	public Nodo getHead(){
		return head;
						}
	
	/**
	 * Metodo che assegna il valore all'attributo tail. 
	 * 
	 * @param tail Indirizzo del nodo meno recente.
	*/					
	public void setTail(Nodo tail){
		this.tail=tail;
									}
	
	/**
	 * Metodo osservatore della variabile tail.
	 * 
	 * @return Restituisce l'attributo tail della lista.
	*/								
	public Nodo getTail(){
		return tail;
						}
						
	/**
	 * Metodo che naviga all'interno della lista contenente gli esami abbinati allo studente.
	 * 
	 * @param studente Studente abbinato univocamente alla lista.
	 * 
	 * @return Restituisce la lista a video degli esami superati dallo studente.
	*/						
	public String elencoModuliSuperati(Studente studente){
		return "lista degli esami";
															}					
}

