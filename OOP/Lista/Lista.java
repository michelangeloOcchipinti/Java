
/** 
 * Classe utilizzata per creare una lista di nodi.
 * 
 * @author Michelangelo Occhipinti
 * @version 1.0
 * @since 10/03/2016
 */
public class Lista {
	
	private Nodo head;
	private Nodo tail;
	
	/**Costruttore di classe senza parametri, parametri impostati a null*/				
	public Lista(){
		head=null;
		tail=null;
					}			
	/**
	 * Costruttore di classe con parametri.
	 * 
	 * @param head La testa della lista, cioè l'ultimo nodo inserito.
	 * @param tail La coda della lista, cioè il primo nodo inserito.
	 * 
	 */
	public Lista(Nodo head, Nodo tail){
		this.head=head;
		this.tail=tail;
									}
									
//----------------------------------------------------------------------	
	/**
	 * Metodo che serve a settare la variabile head.
	 * 
	 * @param head Indirizzo dell'ultimo nodo inserito in testa alla lista.
	 * 
	 */
	 					
	public void setHead(Nodo head){
		this.head=head;
									}
								
//----------------------------------------------------------------------
	
	/**
	 * Metodo che serve a far tornare il valore della variabile head.
	 * 
	 * @return Restituisce l'indirizzo di memoria dell'ultimo nodo inserito.	
	 * 
	 */
	 					
	public Nodo getHead(){
		return head;
						}
						
//----------------------------------------------------------------------
	
	/**
	 * Metodo che serve a far tornare il valore intero contenuto nella variabile info del nodo a cui punta la variabile head.
	 * 
	 * @return Restituisce il valore intero contenuto nella variabile info del nodo a cui punta la variabile head.	
	 * 
	 */
	 					
	public int getHeadInfo(){
		return head.getInfo();
							}
							
//----------------------------------------------------------------------
	
	/**
	 * Metodo che serve a settare la variabile tail.
	 * 
	 * @param tail Indirizzo del primo nodo inserito in coda alla lista.
	 * 
	 */
	 					
	public void setTail(Nodo tail){
		this.tail=tail;
							}
							
//----------------------------------------------------------------------
	
	/**
	 * Metodo che serve a far tornare il valore della variabile tail.
	 * 
	 * @return Restituisce l'indirizzo di memoria del nodo meno recente.	
	 * 
	 */
	 						
	public Nodo getTail(){
		return tail;
							}
							
//----------------------------------------------------------------------
	
	/**
	 * Metodo che serve a far tornare il valore intero contenuto nella variabile info del nodo a cui punta la variabile tail.
	 * 
	 * @return Restituisce il valore intero contenuto nella variabile info del nodo a cui punta la variabile tail.	
	 * 
	 */
	 						
	public int getTailInfo(){
		return tail.getInfo();
							}
							
//----------------------------------------------------------------------
	
	/**
	 * Metodo che serve ad inserire un nuovo nodo in testa alla lista.
	 * Il suo indirizzo di memoria diventerà il nuovo valore della variabile head.	
	 * 
	 * @param info Variabile di tipo intero in cui inserire il valore del nodo.
	 * 
	 */
	  					
	public void push(int info){
		Nodo n=new Nodo(info);
		n.setNext(head);
		head=n;
		if (head==null){tail=n;}
								}
								
//----------------------------------------------------------------------
	
	/**
	 * Metodo che estrae il nodo più recente dalla lista.
	 *  
	 */
	  						
	public void popPila(){
		head=head.getNext();
						}
						
//----------------------------------------------------------------------
	
	/**
	 * Metodo che estrae il nodo meno recente dalla lista.
	 */ 					
	public void popTail(){
		Nodo headTmp=head;
		while(headTmp.getNext().getNext()!=null){
			headTmp=headTmp.getNext();
											}
		tail=headTmp;
		headTmp.setNext(null);
							}
							
//----------------------------------------------------------------------
	
	/**
	 * Metodo che, dato un numero intero, lo cerca nella variabile info dei nodi della lista.
	 * 
	 * @param info Numero intero da cercare
	 * 
	 * @return Restituisce il numero del nodo dove trova il valore cercato, se non trova nulla
	 * non restituirà nulla.
	 */ 					
	public int cercaNumeroNodoConInfo(int info){
		int indice=1;
		Nodo headTmp=head;
		while (headTmp.getInfo()!=info && headTmp.getNext()!=null){
			headTmp=headTmp.getNext();
			indice++;
									}
		return indice;
												}
												
//----------------------------------------------------------------------
	
	/**
	 * Metodo che inserisce un nuovo nodo dopo la posizione specificata dall'utente.
	 * 
	 * @param numNodo Parametro intero che indica il numero di nodo da cercare.
	 * @param info Valore intero da inserire nel nuovo nodo.
	 * 
	 */ 											
	public void inserisciNodoDopoPosizione(int numNodo, int info){
		int indice=1;
		Nodo headTmp=head;
		Nodo n=new Nodo(info);
		while (indice<numNodo && headTmp.getNext()!=null){
			headTmp=headTmp.getNext();
			indice++;
														}
		if (headTmp.getNext()!= null){
			n.setNext(headTmp.getNext());
			headTmp.setNext(n);
									}
																}
																
//----------------------------------------------------------------------
	
	/**
	 * Metodo che inserisce un nuovo nodo prima di un nodo cercato con l'informazione intera.
	 * 
	 * @param info Informazione di tipo intero del nodo cercato.
	 * @param infoNodoNuovo Informazione di tipo intero da inserire nel nuovo nodo. 
	 */ 															
	public void inserisciNodoPrimaDelNodoCercatoConInfo(int info, int infoNodoNuovo){
		Nodo headTmp=head;
		Nodo n=new Nodo(infoNodoNuovo);
		while (headTmp.getNext().getInfo()!=info && headTmp.getNext()!=null){
			headTmp=headTmp.getNext();
												}
		if (headTmp.getNext()!= null){
			
			n.setNext(headTmp.getNext());
			headTmp.setNext(n);
									}
																}
																
//----------------------------------------------------------------------
	/**
	 * Metodo che ordina in ordine crescente la lista tenendo conto dei valori all'interno dei nodi.
	 */ 															
	public void ordinaLista(){
		Nodo headTmp=head;
		Nodo headTmp2=head;
		while (headTmp.getNext()!= null){
			headTmp2=headTmp;
			while (headTmp2.getNext()!=null){
				if (headTmp.getInfo()>headTmp2.getNext().getInfo()){
					int tmp=headTmp.getInfo();
					headTmp.setInfo(headTmp2.getNext().getInfo());
					headTmp2.getNext().setInfo(tmp);
																	}
			headTmp2=headTmp2.getNext();
														}
		headTmp=headTmp.getNext();
													}
							}
							
//----------------------------------------------------------------------
	/**
	 * metodo che stampa a video i valori dei nodi della lista.
	 */ 						
	public void printLista(){
		Nodo headTmp=head;
		System.out.println("\n");
		while (headTmp.getNext()!=null){
			System.out.println(" "+headTmp.getInfo());
			headTmp=headTmp.getNext();
										}
			System.out.println(" "+headTmp.getInfo());
			System.out.println("\n");
							}
					}

