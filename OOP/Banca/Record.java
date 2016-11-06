/*
 Classe "Record" che serve a creare oggetti da utilizzare, attraverso l'utilizzo di array, come data base per i dati dei conti e dei clienti dell'oggetto della classe Banca.
 */


public class Record {
	
	//Creo un contatore dei clienti attualmente registrati.
	private int numClientiAttuali;
	
	
	//Creo gli array
	private Cliente[] clienti;
	private Conto[] conti;
	private String[] numClienti;
	private String[] numConti;
	private String[][] clientiCancellati;
	private int indice;
	private int indiceCancellati;
	private final int password[]={0000,1111,2222,3333,4444,5555};
	
	public Record(int maxTotClienti){
		
		//Inizializzo gli array dando la dimensione massima pari a maxTotClienti presa attraverso il parametro del costruttore
		clienti=new Cliente[maxTotClienti];
		conti=new Conto[maxTotClienti];
		numClienti=new String[maxTotClienti];																
		numConti=new String[maxTotClienti];
		clientiCancellati=new String[1000][5];
		indice=0;
		numClientiAttuali=0;
		indiceCancellati=0;
									}
	
	public int getNumeroClientiAttuali(){
		return numClientiAttuali;
										}
	
	
	/*Creo dinamicamente gli oggetti cliente e conto e memorizzandoli nei relativi array. Creo anche due array, uno per il numero di conto ed uno per il numero di conto.
	 * Infine stampo a video tutti i dati relativi al nuovo cliente*/			
	public void aggiungiCliente(String numCliente, String nome, String cognome, int pin, double saldoContoIniziale, String numConto, int tipoConto){
		
		if (tipoConto==1){clienti[indice]=new Cliente(nome, cognome, numCliente, pin, conti[indice]);}
		clienti[indice]=new Cliente(nome, cognome, numCliente, pin, conti[indice]);
		
		//Creo l'oggetto conto a seconda del tipo scelto in fase di creazione cliente: LibrettoDiRisparmio, ContoCorrente o ContoVincolato.
		if (tipoConto==1){conti[indice]=new LibrettoDiRisparmio(saldoContoIniziale, numConto);}
		else if(tipoConto==2){conti[indice]=new ContoCorrente(saldoContoIniziale, numConto);}
		else if(tipoConto==3){conti[indice]=new ContoVincolato(saldoContoIniziale, numConto);}
		numClienti[indice]=numCliente;
		numConti[indice]=numConto;
		indice++;
		numClientiAttuali++;
		System.out.println("Il sistema restituisce il seguente messaggio: \n");
		System.out.println("E' stato creato il nuovo cliente con i seguenti dati: \n");
		System.out.println("Nome: "+clienti[indice-1].getNomeCliente());
		System.out.println("Cognome: "+clienti[indice-1].getCognomeCliente());
		System.out.println("Numero cliente: "+clienti[indice-1].getNumCliente());
		System.out.println("Numero conto: "+conti[indice-1].getNumContoCorrente());
		System.out.println("Numero pin: "+clienti[indice-1].getPinCliente());
		System.out.println("Saldo iniziale: "+conti[indice-1].getSaldo()+" euro");
		
		switch (tipoConto){
			case 1: System.out.println("Tipo conto: Libretto di risparmio");
					break;
			case 2:	System.out.println("Tipo conto: Conto corrente"+conti[indice-1].getNumMovimentiAttuali());
					break;
			case 3:	System.out.println("Tipo conto: Conto vincolato");
					break;
							} 
																													}
	
	/*Metodo che serve a cancellare un cliente dal dataBase e a salvare i suoi dati in un array creato appositamente per i clienti cancellati.
	 * Il metodo faraà scorrere indietro da tutti gli array i dati lasciando sempre liberi gli spazi ultimi in modo da avere sempre i clienti e i loro dati in ordine cronologicamente crescente.*/																												
	public boolean cancellaCliente(String numCliente){
		boolean ris=false;
		indice=0;
		while (ris==false && indice<numClienti.length && numClienti[indice]!=null){
				if (numClienti[indice].equals(numCliente)){
					ris=true;
					clientiCancellati[indiceCancellati][0]=numClienti[indice];
					clientiCancellati[indiceCancellati][1]=numConti[indice];
					clientiCancellati[indiceCancellati][2]=clienti[indice].getNomeCliente();
					clientiCancellati[indiceCancellati][3]=clienti[indice].getCognomeCliente();
					clientiCancellati[indiceCancellati][4]=Integer.toString(clienti[indice].getPinCliente());
					indiceCancellati++;						
					while (indice<numClienti.length-1 && numClienti[indice +1]!=null){
						numClienti[indice]=numClienti[indice +1];
						numConti[indice]=numConti[indice +1];
						clienti[indice]=clienti[indice +1];
						conti[indice]=conti[indice +1];
						indice++;
																					}
					numClienti[indice]=null;
					numConti[indice]=null;
					clienti[indice]=null;
					conti[indice]=null;
					indice--;
					numClientiAttuali--;
															}
				indice++;
																						}
		return ris;
													}
																													
	public String[] getNumeroConti(){
		return numConti;
									}
									
	public Cliente[] getClienti(){
		return clienti;
									}
									
	public Conto[] getConti(){
		return conti;
							}
							
	public int[] getPassword(){
		return password;
							}
	//Metodo per controllare se esistono già clienti con quel nome e quel cognome specifici nel dataBase.						
	public boolean controlloNomeCognome(String nome, String cognome){
		
		boolean ris=false;
		int indice=0;
		
		do{
			if (numClienti[indice]==null){ ris=false;}
			
			else if (nome.equals(clienti[indice].getNomeCliente()) && cognome.equals(clienti[indice].getCognomeCliente())){
				ris=true;
																												}
			indice++;
			}
		while(ris==false && indice<clienti.length);
		
		return ris;
																	}
	//metodo per la ricerca del numero di conto attraverso il numero cliente						
	public  String trovaNumConto(String numCliente){
		
		String numConto="";
		int indice=0;
		boolean ris=false;
			
		
			while (ris==false && indice<numClienti.length && numClienti[indice]!=null){
				if (numClienti[indice].equals(numCliente)){
					numConto=numConti[indice];
					ris=true;
															}
				indice++;
																						}
			
			if (ris==false && numClienti[indice]==null){
				numConto="NUMERO CLIENTE INESISTENTE";
														}
			return numConto;
														}
	//metodo per la ricerca del numero cliente attraverso il numero di conto																												
	public  String trovaNumCliente(String numConto){
		
		String numCliente="";
		int indice=0;
		boolean ris=false;
		
		while (ris==false && indice<numClienti.length && numClienti[indice]!=null){
			if (numConti[indice].equals(numConto)){
				numCliente=numClienti[indice];
				ris=true;
													}
			indice++;
																					}								
		if (ris==false && numClienti[indice]==null){
			numCliente="NUMERO CLIENTE INESISTENTE";
													}
		
		return numCliente;
												}
	//metodo per la ricerca del nome e cognome attraverso il numero cliente													
	public  String trovaNomeCognomeDaNumCliente(String numCliente){
		
		String nomeCognome="";
		int indice=0;
		boolean ris=false;
			
		
		while (ris==false && indice<numClienti.length && numClienti[indice]!=null){
			if (numClienti[indice].equals(numCliente)){
				nomeCognome=clienti[indice].getNomeCliente()+" "+clienti[indice].getCognomeCliente();
				ris=true;
														}
			indice++;
																					}
			
		if (ris==false && numClienti[indice]==null){
			nomeCognome="NUMERO CLIENTE INESISTENTE";
													}
		return nomeCognome;
															}
	//metodo per la ricerca del nome e cognome attraverso il numero di conto													
	public  String trovaNomeCognomeDaNumConto(String numConto){
		
		String nomeCognome="";
		int indice=0;
		boolean ris=false;
			
		
		while (ris==false && indice<numConti.length && numConti[indice]!=null){
			if (numConti[indice].equals(numConto)){
				nomeCognome=clienti[indice].getNomeCliente()+" "+clienti[indice].getCognomeCliente();
				ris=true;
													}
			indice++;
																				}
			
		if (ris==false && numConti[indice]==null){
			nomeCognome="NUMERO CLIENTE INESISTENTE";
													}
		return nomeCognome;
																}
																
	//metodo per la verifica di corrispondenza tra numero cliente e pin
	public  boolean trovaCorrispondenzaNumClientePin (String numCliente, int pin){
		
		int indice=0;
		boolean ris=false;
			
		
		while (ris==false && indice<numClienti.length && numClienti[indice]!=null){
			if (numClienti[indice].equals(numCliente) && clienti[indice].getPinCliente()==pin){
				ris=true;
													}
			indice++;
																				}
		if (ris==false && numClienti[indice]==null){
			ris=false;
													}
		return ris;
																}
					}
