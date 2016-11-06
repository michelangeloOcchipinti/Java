/*
 Classe "Banca"
 * E' la classe che gestisce i movimenti di conto corrente e la ricerca nel record creato appositamente per registrare tutti i dati dei clienti e dei conti correnti.
 */

import java.util.*;

public class Banca {
	
	//Creo la COSTANTE per definire il numero massimo di clienti registrabili nel caso non venga scelto.
	private final int DEFAULT_MAX_TOT_CLIENTI=10;
	
	//Creo la variabile d'istanza per poter scegliere quanti clienti al massimo poter registrare nella banca.
	private int maxTotClienti;
	
	//Creo la variabile d'istanza per poter avere un numero progressivo da abbinare ai numeri cliente e conto.
	private int numClienteContoProgressivo;
	
	//Creo il database dove registerò, attraverso un record di array, tutti i dati dei clienti e dei conti a loro intestati. 
	private Record dataBaseBanca;
	
	//Creo l'oggetto random per creare i pin dei conti da assegnare ad  ogni cliente.
	Random rnd=new Random();
	
	//Creo la variabile d'istanza dove memorizzare il numero di cliente progressivo.
	private String numCliente;
	
	//Creo la variabile d'istanza dove memorizzare il numero di conto progressivo.
	private String numConto;
	
	//Creo il primo costruttore senza parametri.
	public Banca(){
		maxTotClienti=DEFAULT_MAX_TOT_CLIENTI;
		dataBaseBanca=new Record(maxTotClienti);
		numClienteContoProgressivo=0;
		numCliente="";
		numConto="";
					}
					
	/*Creo il secondo costruttore con parametro numero massimo clienti registrabili nel database della banca. 
	 * Viene inserito anche un controllo nel caso in cui il numero impostato sia ad 1, in questo caso verrà impostato il valore di default
	 * della costante MAX_TOT_CLIENTI */			
	public Banca(int MaxTotClienti){
		if (maxTotClienti<1){
			MaxTotClienti=DEFAULT_MAX_TOT_CLIENTI;
							}					
		else {this.maxTotClienti=maxTotClienti;}
		dataBaseBanca=new Record(maxTotClienti);
		numClienteContoProgressivo=0;
		numCliente="";
		numConto="";
									}
	
	
	
	//metodo per leggere il numero massimo di clienti registrabili							
	public int getMaxTotClienti() {
		return maxTotClienti;
									}
									
										
	/*Metodo che, attraverso l'oggetto dataBaseBanca della classe record, crea runtime 
	* gli oggetti delle classi Cliente e Conto e li registra nei relativi array.
	* Il loro nome sarà cosi del tipo "nomeArray[indice]".
	* Nel caso si sia raggiunto il limite massimo dei clenti verrà scritto un messaggio di errore a video.*/							
	public void registra (String nome, String cognome, double saldoContoIniziale, int tipoConto){
		if (dataBaseBanca.getNumeroClientiAttuali()<maxTotClienti){
			
			//Controllo, attraverso il metodo controlloNomeCognome della classe Record, che il cliente non esista già nel database
			if (dataBaseBanca.controlloNomeCognome(nome, cognome)==true){
				System.out.println("Il cliente esiste gia'. Impossibile crearne un'altro con la stessa identita'.");
																		}
				
			else{
			//Aumento di uno il numero progressivo che userò per comporre il numero conto e numero cliente.
			numClienteContoProgressivo++;	
			
			//Creazione numero cliente con prefisso, suffisso e numero progressivo.
			if (numClienteContoProgressivo<10){
				numCliente="cltIT000"+numClienteContoProgressivo+"FB01";	
				}
			else if(numClienteContoProgressivo>=10 && numClienteContoProgressivo<100){
				numCliente="cltIT00"+numClienteContoProgressivo+"FB01";	
				}
			else if(numClienteContoProgressivo>=100 && numClienteContoProgressivo<1000){
				numCliente="cltIT0"+numClienteContoProgressivo+"FB01";	
				}
			
			//Creazione numero conto con prefisso, suffisso e numero progressivo.
			if (numClienteContoProgressivo<10){
				numConto="cntIT000"+numClienteContoProgressivo+"FB01";	
				}
			else if(numClienteContoProgressivo>=10 && numClienteContoProgressivo<100){
				numConto="cntIT00"+numClienteContoProgressivo+"FB01";	
				}
			else if(numClienteContoProgressivo>=100 && numClienteContoProgressivo<1000){
				numConto="cntIT0"+numClienteContoProgressivo+"FB01";	
				}
			
			
			//Creazione del pin casuale con oggetto della classe Random
			int pin=rnd.nextInt(140000-100000)+50000;
			
			//Chiamata al metodo della classe Record per la creazione e memorizzazione degli oggetti conto e cliente e dei dati dei clienti.
			dataBaseBanca.aggiungiCliente(numCliente, nome, cognome, pin, saldoContoIniziale, numConto, tipoConto);
			
			
				}
												}
		else{
			System.out.println("Non si e' potuto aggiungere il nuovo cliente, limite massimo raggiunto!");
			}
																					
																				}
	//Chiamata al metodo cancellaCliente della classe Record per cancellare un cliente dal database della Banca																			
	public boolean cancellaCliente(String numCliente){
		return dataBaseBanca.cancellaCliente(numCliente);
								}																		
		
	//Metodo per effettuare un deposito inserendo il numero di conto in possesso del cliente.																				
	public boolean deposito (double quanto, String numConto){
		
		//Imposto la variabile di tipo boolean per il risultato restituito.
		boolean ris=false;
		
		//Indice per il ciclo.
		int indice=0;
		
		//Memorizzo, attraverso i metodi get della classe Record, i due array degli oggetti Conto e delle Stringhe con i numeri cliente.
		String[] numConti=dataBaseBanca.getNumeroConti();
		Conto[] conti=dataBaseBanca.getConti();
		
		/*Ciclo che mi permette, attraverso la variabile stringa con il numero di conto inserita dall'utente, di trovare il numero conto all'interno 
		* del relativo array e di associarlo così all'oggetto conto.
		* Questo permetterà di chiamare il metodo deposito della classe Conto e di effettuare l'operazione. */
		while (ris==false && indice<numConti.length){
			if (numConto.equals(numConti[indice])){
				conti[indice].deposito(quanto);
				ris=true;
											}
			indice++;
											}
											
		//Controllo dell'effettiva esistenza del numero di conto all'interno dell'array conti.
												
		
		return ris;
															}
															
	
	/*metodo che mi permette, attraverso la variabile stringa con il numero di conto inserita dall'utente, di trovare il numero conto all'interno 
	* del relativo array e di associarlo così all'oggetto conto.
	* Questo permetterà di chiamare il metodo prelievo della classe Conto e di effettuare l'operazione. */														
	public boolean prelievo (double quanto, String numConto){
		int indice=0;
		boolean ris=false;
		String[] numConti=dataBaseBanca.getNumeroConti();
		Conto[] conti=dataBaseBanca.getConti();
		while (ris==false && indice<numConti.length){
			if (numConto.equals(numConti[indice])){
				ris=conti[indice].prelievo(quanto);
													}
			indice++;
													}
		
		//Controllo dell'effettiva esistenza del numero di conto all'interno dell'array conti.
												
		if (ris==false && indice==numConti.length){
			System.out.println("***DISPONIBILITA' IN CONTO INSUFFICIENTE O NUMERO CONTO INESISTENTE*** \n");
													}
												
		return ris;
															}			
	
	/*Metodo che mi permette, attraverso la variabile stringa con il numero di conto inserita dall'utente, di trovare il numero conto all'interno 
	* del relativo array e di associarlo così all'oggetto conto.
	* Questo permetterà di chiamare il metodo getSaldo della classe Conto e di effettuare l'operazione. */	
	public double getSaldo(String numConto){
		int indice=0;
		boolean ris=false;
		double saldo=0.0;
		String[] numConti=dataBaseBanca.getNumeroConti();
		Conto[] conti=dataBaseBanca.getConti();
		
		while (ris==false && indice<numConti.length){
			if (numConto.equals(numConti[indice])){ 
				saldo=conti[indice].getSaldo();	
				ris=true;			
													}
		indice++;
													}
													
		/* Assegno alla variabile saldo un valore impossibile nel caso la variabile booleana ris rimanga con valore "false" e 
		 * nel contempo il ciclo sia stato scorso per intero, questo farà scrivere nel main un messaggio che il conto non è stato trovato.*/
		if (ris==false && indice==numConti.length){
			saldo=-10000.00;
													}
		return saldo;
										}
										
	/*Metodo che mi permette, attraverso la variabile stringa con il numero di cliente inserita dall'utente, di trovare il numero conto all'interno 
	* del relativo array e di associarlo così all'oggetto conto.
	* Questo permetterà di chiamare il metodo getSaldo della classe Conto e di effettuare l'operazione. */									
	public double getSaldoDaNumCliente(String numCliente){
		String numConto=dataBaseBanca.trovaNumConto(numCliente);
		int indice=0;
		boolean ris=false;
		double saldo=0.0;
		String[] numConti=dataBaseBanca.getNumeroConti();
		Conto[] conti=dataBaseBanca.getConti();
		
		while (ris==false && indice<numConti.length){
			if (numConto.equals(numConti[indice])){ 
				saldo=conti[indice].getSaldo();	
				ris=true;			
													}
		indice++;
													}
													
		/* Assegno alla variabile saldo un valore impossibile nel caso la variabile booleana ris rimanga con valore "false" e 
		 * nel contempo il ciclo sia stato scorso per intero, questo farà scrivere nel main un messaggio che il conto non è stato trovato.*/
		if (ris==false && indice==numConti.length){
			saldo=-10000.00;
													}
		return saldo;
										}	
											
	/*public void cancella(Cliente cliente){
		
									}
	
							
	
	/*metodo che mi permette, attraverso le variabili stringa con il numero di conto inserite dall'utente, di trovare i numeri di conto all'interno 
	* del relativo array e di associarli così agli oggetti conto.
	* Chiamando i metodi prelievo e deposito della classe Banca potremo effettuare un trasferimento di denaro tra conti con il valore 
	* inserito dall'utente. */									
	public boolean trasferisciDaNumConto(String numContoSrg, String numContoDst, double quanto){
		boolean pre=false;
		boolean dep=false;
		pre=prelievo(quanto, numContoSrg);
		if (pre==false){
			return false;
						}
		else {
			dep=deposito(quanto, numContoDst);
			
			/*Effettuo un controllo sul valore di uscita del metodo deposito cosi, nel caso sia "false" a causa di un numero conto errato in fase di 
			* inserimento, non verrà effettuato alcun prelievo nel conto sorgente, ma anzi verrà inviato dal main un messaggio a video
			* sull'impossibilità di effettuare il trasferimento di denaro. */
			if (dep==false){
				deposito(quanto, numContoSrg);        
							}
			}
		
		if (pre==true && dep==true){
			return true;
									}
		else return false;
		
																						}
	/*metodo che mi permette, attraverso le variabili stringa con il numero di cliente inserite dall'utente, di trovare i numeri di conto all'interno 
	* del relativo array e di associarli così agli oggetti conto.
	* Chiamando i metodi prelievo e deposito della classe Banca potremo effettuare un trasferimento di denaro tra conti con il valore 
	* inserito dall'utente. */																				
	public boolean trasferisciDaNumCliente (String numClienteSrg, String numClienteDst, double quanto){
		boolean pre=false;
		boolean dep=false;
		String numContoSrg=dataBaseBanca.trovaNumConto(numClienteSrg);
		String numContoDst=dataBaseBanca.trovaNumConto(numClienteDst);
		pre=prelievo(quanto, numContoSrg);
		
		System.out.println(numContoSrg);
		System.out.println(numContoDst);
		if (pre==false){
			return false;
						}
		else {
			dep=deposito(quanto, numContoDst);
			
			/*Effettuo un controllo sul valore di uscita del metodo deposito cosi, nel caso sia "false" a causa di un numero conto errato in fase di 
			* inserimento, non verrà effettuato alcun prelievo nel conto sorgente, ma anzi verrà inviato dal main un messaggio a video
			* sull'impossibilità di effettuare il trasferimento di denaro. */
			if (dep==false){
				deposito(quanto, numContoSrg);        
							}
			}
		
		if (pre==true && dep==true){
			return true;
									}
									
		else return false;
		
		
																											}
	//Metodo per la ricerca di un numero di conto partendo da un numero cliente																										
	public String trovaNumContoDaNumCliente(String numCliente){
		String numConto;
		return numConto=dataBaseBanca.trovaNumConto(numCliente);
																}
	//Metodo per la ricerca di un numero cliente partendo da un numero di conto															
	public String trovaNumClienteDaNumConto(String numConto){
		String numCliente;
		return numCliente=dataBaseBanca.trovaNumCliente(numConto);
															}
																
	//Metodo per la ricerca di nome e cognome di un cliente partendo dal numero cliente															
	public String trovaNomeCognomeDaNumCliente(String numCliente){
		String nomeCognome;
		return nomeCognome=dataBaseBanca.trovaNomeCognomeDaNumCliente(numCliente);
																}
																
	//Metodo per la ricerca di nome e cognome di un cliente partendo dal numero del conto															
	public String trovaNomeCognomeDaNumConto(String numConto){
		String nomeCognome;
		return nomeCognome=dataBaseBanca.trovaNomeCognomeDaNumConto(numConto);
															}
																
	//Metodo per la ricerca di corrispondenza tra numero cliente e pin assegnato															
	public boolean trovaCorrispondenzaNumClientePin(String numCliente, int pin){
		boolean ris=false;
		return ris=dataBaseBanca.trovaCorrispondenzaNumClientePin(numCliente, pin);
																				}
	//Metodo per la stampa a video di tutti i dati presenti nell'oggetto dataBaseBanca di tipo Record. 															
	public void stampaDataBaseBanca(int pswDip){
		
		//Creo le variabili che utilizzerò in seguito ed importo i due array contenenti gli oggetti cliente e conto. 
		Cliente[] clienti=dataBaseBanca.getClienti();
		Conto[] conti=dataBaseBanca.getConti();
		int numSpaziNome=0;
		int numSpaziCognome=0;
		int numSpaziSaldo=0;
		int password[]=dataBaseBanca.getPassword();
		int indice=0;
		String spazi=" ";
		String trattino="-";
		int i=0;
		String nome="Nome";
		String cognome="Cognome";
		String saldo="Saldo";
		
		/*Primo ciclo che serve a confrontare tutti i nomi, cognomi e saldo formato di tipo stringa tra loro per determinare qual'è quello con più caratteri 
		 * per stampare a video una tabella con tutte le celle allineate e formattate alla lunghezza massima. */
		while (i<clienti.length && clienti[i] != null){
			int saldoRealeStringa=Double.toString(conti[i].getSaldo()).length();
			if (numSpaziNome<clienti[i].getNomeCliente().length()){
				numSpaziNome=clienti[i].getNomeCliente().length();
				if (numSpaziNome<nome.length()){numSpaziNome=nome.length();}
																	}
			else if (numSpaziCognome<clienti[i].getCognomeCliente().length()){
				numSpaziCognome=clienti[i].getCognomeCliente().length();
				if (numSpaziCognome<cognome.length()){numSpaziCognome=cognome.length();}
																			}
																																		
			else if (numSpaziSaldo<saldoRealeStringa){
				numSpaziSaldo=Double.toString(conti[i].getSaldo()).length();
				if (numSpaziSaldo<saldo.length()){numSpaziSaldo=saldo.length();}
				
																		}
			i++;
														}
		/*Creo la prima riga della tabella come intestazione e  nel caso le parole siano più corte 
		della parola contenuta in numSpazi stampo tanti spazi per quante lettere mancano per avere la tabella formattata ed allineata.*/
		System.out.print("| Num  ");
		System.out.print("| Num cliente  ");
		System.out.print(" | Num conto    ");
		System.out.print(" | "+nome);
		if (numSpaziNome>nome.length()){
			int diffNumSpaziNome=numSpaziNome-nome.length();
			for (int j=diffNumSpaziNome; j>0;j--){
				System.out.print(spazi);
												}
										}
		System.out.print(" | "+cognome);
		if (numSpaziCognome>cognome.length()){
			int diffNumSpaziCognome=numSpaziCognome-cognome.length();
			for (int j=diffNumSpaziCognome; j>0;j--){
				System.out.print(spazi);
														}
											}
		System.out.print(" | Pin  ");
		System.out.println(" | "+saldo+" Euro ");
		if (numSpaziSaldo>saldo.length()){
			int diffNumSpaziSaldo=numSpaziSaldo-saldo.length();
			for (int j=diffNumSpaziSaldo; j>0;j--){
				System.out.print(spazi);
														}
											}
		
		//inizio la stampa della tabella con un controllo password (la password che viene consegnata all'impiegato che stamperà il dataBase).																	
		for ( i=0;i<password.length;i++){
			if (pswDip==password[i]){
				while (indice<clienti.length && clienti[indice]!=null && conti[indice]!=null){
					System.out.println();
					System.out.println();
					
					//Formatto il numero ocnsecutivo perchè abbia sempre quattro cifre e sia sempre della stessa lunghezza fino al numero 1000.
					if (indice<9){System.out.print("| 000"+(indice+1));}
					else if (indice>=9 && indice <99){System.out.print("| 00"+(indice+1));}
					else if (indice<=99 && indice <999){System.out.print("| 0"+(indice+1));}
					
					//Stampo i campi numero cliente e numero conto.
					System.out.print(" | "+clienti[indice].getNumCliente());
					System.out.print(" | "+conti[indice].getNumContoCorrente());
					System.out.print(" | "+clienti[indice].getNomeCliente());
					
					/*Dopo aver stampato i campi nome, cognome e saldo faccio un controllo per vedere se sono più lunghe e più corte della 
					parola memorizzata su numSpazi e nel caso aggiungo tanti spazi per quante lettere mancano per avere la tabella sempre fomrattata ed in linea.*/
					if (numSpaziNome>clienti[indice].getNomeCliente().length()){
						int diffNumSpaziNome=numSpaziNome-clienti[indice].getNomeCliente().length();
						
						for (int j=diffNumSpaziNome; j>0;j--){
							System.out.print(spazi);
																}
																				}
					System.out.print(" | "+clienti[indice].getCognomeCliente());
					if (numSpaziCognome>clienti[indice].getCognomeCliente().length()){
						int diffNumSpaziCognome=numSpaziCognome-clienti[indice].getCognomeCliente().length();
						
						for (int j=diffNumSpaziCognome; j>0;j--){
							System.out.print(spazi);
																	}
																						}
					System.out.print(" | "+clienti[indice].getPinCliente());
					System.out.print(" | "+conti[indice].getSaldo());
					int saldoRealeStringa =Double.toString(conti[indice].getSaldo()).length();
					if (numSpaziSaldo>saldoRealeStringa){
						int diffNumSpaziSaldo=numSpaziSaldo-saldoRealeStringa;
						
						for (int j=diffNumSpaziSaldo; j>0;j--){
							System.out.print(spazi);
																}
																						}
					System.out.println();
					indice++;
																								}
									}

											}
											}
					
				}
					

