
/* 
 * Testo dell'esercizio:
 
 * Una banca gestisce conti bancari per conto dei propri clienti. Ogni cliente è titolare di un solo conto. Ciascun conto ha
 * un solo titolare. Un conto bancario è caratterizzato da un numero di conto e da un saldo. Il numero di conto identifica
 * univocamente un conto all'interno della banca. In accordo alle politiche della banca, il saldo di un conto bancario non
 * può essere negativo. Un cliente è caratterizzato da un nome, un numero di cliente, un PIN e dal conto bancario di cui è
 * titolare. Il numero di cliente identifica univocamente il cliente.*/


/* Classe "Inizio" con main
 * Nella classe principale vi si trovano gli oggetti menu e le relative scelte con i sottomenu. 
 * Vengono anche gestiti i messaggi d'errore destinati all'utilizzatore.
 */

import java.util.Scanner;

public class Inizio {
	
	public static void main (String args[]) {
		
		//Creo le tre variabili per la scelta del menu principale e dei sottomenu
		int sceltaMenuIniziale;
		int sceltaMenuCliente;
		int sceltaMenuConto;
		int sceltaMenuRicercaVerifica;
		int sceltaTipoConto;
		int esci=0;
		
		//Creo l'oggetto Scanner che utilizzerò in tutti i menu per prendere i dati dall'utente
		Scanner input=new Scanner(System.in);
		
		//Creo i tre oggetti Menu con i relativi parametri formali come voci di menu e l'oggetto Banca
		Banca banca1=new Banca();
		Menu menuSceltaTipoConto=new Menu("Libretto di Risparmio", "Conto corrente", "Conto Vincolato");
		Menu menuCliente=new Menu("Aggiungi cliente", "Rimuovi cliente");
		Menu menuIniziale=new Menu("Menu Cliente - [Aggiungi/Rimuovi]", "Menu conto corrente - [Saldo/deposito/Prelievo/Trasferimento]", "Menu ricerca e verifica - [Numero cliente/Numero conto/Pin/Stampa Database]");
		Menu menuConto=new Menu("Saldo conto corrente", "Menu deposito in conto", "Menu prelievo in conto", "Menu trasferimento tra conti (con numero di conto)", "Menu tasferimento tra conti (con numero cliente)");	
		Menu menuRicercaVerifica=new Menu("Ricerca numero conto [da numero cliente]", "Ricerca numero cliente [da numero conto]", "Ricerca nome e cognome cliente [da numero cliente]", "Ricerca nome e cognome cliente [da numero conto]", "Verifica numero cliente con pin", "Stampa database totale banca");
		
		do{
			//Entro nel ciclo do/while con il menu principale
			sceltaMenuIniziale=menuIniziale.menuTreVoci();
			
			
			/*Scelta 1 per aggiungere e cancellare un cliente ed abbinargli un conto corrente dinamicamente attraverso l'inserimento del nome, cognome e saldo iniziale del conto.
			 * Il cliente ed il conto verranno automaticamente salvati in due array distinti dell'oggetto dataBaseBanca con riferimento radice fissa uguale al nome dell'array ed un numero progressivo 0..MAX_TOT_CLIENTI*/
			if (sceltaMenuIniziale==1){
				//Viene avviato il metodo menuDueVoci dell'oggetto menuCliente per entrare nel menu secondario dedicato all'inserimento e cancellazione dei clienti
				sceltaMenuCliente=menuCliente.menuDueVoci();
				if (sceltaMenuCliente==1){
						System.out.println("Inserisci il nome del cliente: \n");
						String nome=input.nextLine();
						System.out.println();
						System.out.println("Inserisci il cognome del cliente: \n");
						String cognome=input.nextLine();
						System.out.println();
						System.out.println("Inserisci il saldo iniziale del conto con due decimali separati da una virgola: \n");
						double saldoContoIniziale=input.nextDouble();
						System.out.println();
						System.out.println("Scegli il tipo di conto: \n");
						System.out.println("1 - Libretto di risparmio: \n");
						System.out.println("2 - Conto corrente: \n");
						System.out.println("3 - Conto vincolato: \n");
						int tipoConto=input.nextInt();
						
						
						//Metodo registra della classe Banca che crea automaticamente due nuove istanze, una della classe cliente ed una della classe conto 			
						banca1.registra(nome, cognome, saldoContoIniziale, tipoConto);
						System.out.println();
						System.out.println(	"Premi 1 seguito da invio per tornare al menu principale");
						input.nextInt();
						input.nextLine();

										}
				if (sceltaMenuCliente==2){
					System.out.println("**** ATTENZIONE - MENU CANCELLAZIONE CLIENTE - PROCEDERE CON CAUTELA **** \n");
					System.out.println("Inserisci il numero cliente: \n");
					String numCliente=input.nextLine();
					System.out.println();
					
					//Metodo cancellaCliente della classe Banca che cancella un cliente dal dataBaseBanca e lo inserisce nell'array clientiCancellati
					boolean ris=banca1.cancellaCliente(numCliente);
					if (ris==true){
						System.out.println("Il sistema restituisce "+ris+" alla procedura di cancellazione del cliente numero "+numCliente+"\n\n");
						System.out.println("Il cliente numero "+numCliente+" e' stato cancellato dal database. \n");
						System.out.println(	"Premi 1 seguito da invio per tornare al menu principale");
						input.nextInt();
						input.nextLine();
									}
									
					else{
						System.out.println("***NUMERO CONTO INESISTENTE*** \n\n");
						System.out.println(	"Premi 1 seguito da invio per tornare al menu principale");
						input.nextInt();
						input.nextLine();
						
						}
					
										}
										}
			//Scelta 2 del menu Iniziale per accedere al menu dei movimenti del conto corrente							
			else if(sceltaMenuIniziale==2) {
				
				//Viene avviato il metodo menuCinqueVoci dell'oggetto menuConto per entrare nel menu secondario dedicato ai movimenti possibili nei conti bancari
				sceltaMenuConto=menuConto.menuCinqueVoci();
				
				//Scelta 1 per accedere al menu per il controllo del saldo del conto corrente attraverso l'inserimento del numero di conto corrente
				if (sceltaMenuConto==1){
					System.out.println("inserisci il numero del conto di cui vuoi conoscere il saldo attuale: \n\n");
					String conto=input.nextLine();
					System.out.println();
					
					//Si attiva un controllo che invia a video un messaggio per l'utente nel caso l'inserimento del numero di conto non trovi nessuna occorrenza nell'array numConti[] dell'oggetto dataBaseBanca 
					if (banca1.getSaldo(conto)==-10000.00){
						System.out.println("***NUMERO CONTO INESISTENTE*** \n");				
										}
										
					//Invio della stampa a video del saldo attraverso il metodo getSaldo
					else{
						System.out.println("Il saldo del conto e' uguale a "+banca1.getSaldo(conto)+" euro. \n");
						}
					System.out.println("Premi 1 per tornare al menu iniziale: ");
					input.nextInt();
					input.nextLine();
										} 
					
				//Scelta 2 del menuConto per accedere al menu per il deposito in conto corrente						
				else if (sceltaMenuConto==2){
					System.out.println("inserisci il numero del conto nel quale vuoi depositare: \n");
					String conto=input.nextLine();
					System.out.println();
					System.out.println("inserisci il valore in euro del deposito: \n");
					double deposito=input.nextDouble();
					double saldoOld=banca1.getSaldo(conto);
					System.out.println();
					boolean risDeposito=banca1.deposito(deposito, conto);
					
					//Si attiva un controllo che invia a video un messaggio per l'utente nel caso l'inserimento del numero di conto non trovi nessuna occorrenza nell'array numConti[] dell'oggetto dataBaseBanca 
					if (risDeposito==false){
						System.out.println("***NUMERO CONTO INESISTENTE*** \n\n");
																}
																
					//Viene restituito a video un messaggio del risultato positivo della transazione e viene anche stampato il vecchio saldo ed il nuovo saldo in conto											
					else{
						System.out.println("Il sistema restituisce TRUE alla procedura di deposito. \n\n");
						System.out.println("Il vecchio saldo del "+conto+" era uguale a "+saldoOld+". Il nuovo saldo del conto "+conto+" e' uguale a "+banca1.getSaldo(conto)+" euro \n	");
						}
					System.out.println("Premi 1 per tornare al menu iniziale: ");
						
					input.nextInt();
					input.nextLine();					
											}
									
				//Scelta 3 del menuConto per accedere al menu per il prelievo in conto corrente	
				else if (sceltaMenuConto==3){
					System.out.println("inserisci il numero del conto dal quale vuoi prelevare: \n");
					String conto=input.nextLine();
					System.out.println();
					
					/*Si attiva un controllo attraverso il metodo getSaldo che invia a video un messaggio per l'utente nel caso l'inserimento del numero di conto non trovi nessuna occorrenza nell'array numConti[] dell'oggetto dataBaseBanca*
					 * oppure se il saldo del conto risulta essere a zero*/
					if (banca1.getSaldo(conto)==-10000.00){
						System.out.println("***DISPONIBILITA' IN CONTO INSUFFICIENTE O NUMERO CONTO INESISTENTE*** \n");
						System.out.println("Premi 1 per tornare al menu iniziale: ");	
						int scelta=input.nextInt();
						input.nextLine();				
															}
															
					//Messaggio a video con il saldo del conto scelto
					else{
						System.out.println("La disponibilita' attuale del conto "+conto+" e' uguale a "+banca1.getSaldo(conto)+"\n");
						System.out.println("inserisci il valore in euro del prelievo: \n");
						double prelievo=input.nextDouble();
						double saldoOld=banca1.getSaldo(conto);
						System.out.println();
						boolean risPrelievo=banca1.prelievo(prelievo, conto);
						if (risPrelievo==false){
							System.out.println("Il sistema restituisce FALSE alla procedura di prelievo. ***DISPONIBILITA' IN CONTO INSUFFICIENTE O NUMERO CONTO INESISTENTE*** \n\n");
												}
												
						//Messaggio a video con il risultato positivo della transazione e stampa del vecchio saldo e del nuovo saldo del conto corrente scelto
						else{
							System.out.println("Il sistema restituisce TRUE alla procedura di prelievo. ***DISPONIBILITA' IN CONTO SUFFICIENTE*** \n\n");
							System.out.println("Il vecchio saldo del "+conto+" era uguale a "+saldoOld+". Il nuovo saldo del conto "+conto+" e' uguale a "+banca1.getSaldo(conto)+" euro \n	");
							}
						System.out.println("Premi 1 per tornare al menu iniziale: ");	
						input.nextInt();
						input.nextLine();						
						}
											}
				//Scelta 4 del menuConto per accedere al menu per il trasferimento tra conti inserendo i numeri di conto corrente								
				else if (sceltaMenuConto==4){
					String contoPre="";
					String contoDep="";
					boolean risTrasferimento=false;
					System.out.println("Inserisci il numero di conto dal quale prelevare i soldi: \n");
					contoPre=input.nextLine();
					System.out.println();
					System.out.println("Inserisci il numero di conto nel quale depositare i soldi: \n");
					contoDep=input.nextLine();
					System.out.println();
					System.out.println("Inserisci la somma da trasferire: ");
					double trasferimento=input.nextDouble();
					System.out.println();
					risTrasferimento=banca1.trasferisciDaNumConto(contoPre, contoDep, trasferimento);
					
					//Messaggio a video con il risultato positivo della transazione e stampa del nuovo saldo dei due conti a video 
					if (risTrasferimento==true){
						System.out.println("Il sistema restituisce TRUE al trasferimento tra i due conti. \n");
						System.out.println("Il nuovo saldo del conto "+contoPre+" e' uguale a "+banca1.getSaldo(contoPre)+" e il nuovo saldo del conto "+contoDep+" e' uguale a "+banca1.getSaldo(contoDep)+ "\n	");
												}
												
					/*Si attiva un controllo che invia un messaggio a video per l'utente nel caso l'inserimento del numero di conto non trovi nessuna occorrenza nell'array numConti[] dell'oggetto dataBaseBanca*
					 * oppure se il saldo del conto risulta essere a zero*/
					else{
						System.out.println("Non e' stato possibile procedere al trasferimento del denaro. \n");
						System.out.println("***DISPONIBILITÀ IN CONTO INSUFFICIENTE O NUMERO CONTO INESISTENTE*** \n");
						}
					
					System.out.println("Premi 1 per tornare al menu iniziale: ");	
					input.nextInt();
					input.nextLine();
											}
					
				//Scelta 5 del menuConto per accedere al menu per il trasferimento tra conti inserendo i numeri cliente	
				else if (sceltaMenuConto==5){
					String clientePre="";
					String clienteDep="";
					boolean risTrasferimento=false;
					System.out.println("Inserisci il numero di cliente del conto dal quale prelevare i soldi: \n");
					clientePre=input.nextLine();
					System.out.println();
					System.out.println("Inserisci il numero di cliente del conto nel quale depositare i soldi: \n");
					clienteDep=input.nextLine();
					System.out.println();
					System.out.println("Inserisci la somma da trasferire: ");
					double trasferimento=input.nextDouble();
					System.out.println();
					risTrasferimento=banca1.trasferisciDaNumCliente(clientePre, clienteDep, trasferimento);
					
					//Messaggio a video con il risultato positivo della transazione e stampa del nuovo saldo dei due conti a video
					if (risTrasferimento==true){
						System.out.println("Il sistema restituisce TRUE al trasferimento tra i due conti. \n");
						System.out.println("Il nuovo saldo del conto del cliente "+clientePre+" e' uguale a "+banca1.getSaldoDaNumCliente(clientePre)+" e il nuovo saldo del conto del cliente "+clienteDep+" e' uguale a "+banca1.getSaldoDaNumCliente(clienteDep)+ "\n	");
												}
												
					/*Si attiva un controllo che invia un messaggio a video per l'utente nel caso l'inserimento del numero di conto non trovi nessuna occorrenza nell'array numConti[] dell'oggetto dataBaseBanca*
					 * oppure se il saldo del conto risulta essere a zero*/
					else{
						System.out.println("Non e' stato possibile procedere al trasferimento del denaro. \n");
						System.out.println("***DISPONIBILITA' IN CONTO INSUFFICIENTE O NUMERO CLIENTE INESISTENTE*** \n");
						}
					
					System.out.println("Premi 1 per tornare al menu iniziale: ");	
					input.nextInt();
					input.nextLine();
											}
											
											
											
											
											
				else if  (sceltaMenuConto==6){
											}
				
				else if  (sceltaMenuConto==7){
					esci=7;
											}
					
											} 
			
			//Scelta 3 del menu Iniziale per accedere al menu di ricerca e verifica dati								
			else if(sceltaMenuIniziale==3) {
				sceltaMenuRicercaVerifica=menuRicercaVerifica.menuSeiVoci();
				
				//Scelta 1 del menu ricerca e verifica per ricercare il numero di conto attraverso l'inserimento del numero cliente
				if (sceltaMenuRicercaVerifica==1){
					System.out.println("Inserisci il numero cliente di cui vuoi trovare il conto \n");
					String numCliente=input.nextLine();
					System.out.println();
					System.out.println("Il numero di conto abbinato al cliente "+numCliente+" e': ***"+banca1.trovaNumContoDaNumCliente(numCliente)+"*** \n");
					System.out.println("Premi 1 per tornare al menu iniziale: ");	
					input.nextInt();
					input.nextLine();
					
													}
													
				//Scelta 2 del menu ricerca e verifica per ricercare il numero cliente attraverso l'inserimento del numero di conto
				if (sceltaMenuRicercaVerifica==2){
					System.out.println("Inserisci il numero del conto abbinato al numero cliente che stai cercando \n");
					String numConto=input.nextLine();
					System.out.println();
					System.out.println("Il numero cliente abbinato al numero di conto "+numConto+" e': ***"+banca1.trovaNumClienteDaNumConto(numConto)+"*** \n");
					System.out.println("Premi 1 per tornare al menu iniziale: ");	
					input.nextInt();
					input.nextLine();
					
													}
													
				//Scelta 3 del menu ricerca e verifica per ricercare il nome e cognome del cliente attraverso l'inserimento del numero cliente
				if (sceltaMenuRicercaVerifica==3){
					System.out.println("Inserisci il numero cliente di cui vuoi trovare il nome e cognome \n");
					String numCliente=input.nextLine();
					System.out.println();
					System.out.println("Il nome ed il cognome inseriti nel numero cliente "+numCliente+" corrispondono a: ***"+banca1.trovaNomeCognomeDaNumCliente(numCliente)+"*** \n");
					System.out.println("Premi 1 per tornare al menu iniziale: ");	
					input.nextInt();
					input.nextLine();
					
													}
												
				//Scelta 4 del menu ricerca e verifica per ricercare il nome e cognome del cliente attraverso l'inserimento del numero di conto
				if (sceltaMenuRicercaVerifica==4){
					System.out.println("Inserisci il numero conto di cui vuoi trovare il nome e cognome \n");
					String numConto=input.nextLine();
					System.out.println();
					System.out.println("Il nome ed il cognome inseriti nel numero di conto "+numConto+" corrispondono a: ***"+banca1.trovaNomeCognomeDaNumConto(numConto)+"*** \n");
					System.out.println("Premi 1 per tornare al menu iniziale: ");	
					input.nextInt();
					input.nextLine();
					
													}
												
				//Scelta 5 del menu ricerca e verifica per verificare la corrispondenza tra numero cliente e pin inseriti nell'oggetto cliente	
				if (sceltaMenuRicercaVerifica==5){
					System.out.println("Inserisci il numero cliente di cui vuoi controllare la corrispondenza con il pin \n");
					String numCliente=input.nextLine();
					System.out.println("Inserisci il numero di pin di cui vuoi controllare la corrispondenza con il numero cliente \n");
					int pin=input.nextInt();
					System.out.println();
					if (banca1.trovaCorrispondenzaNumClientePin(numCliente, pin)==true){
					System.out.println("Il numero di pin "+pin+" ed il numero cliente "+numCliente+" sono corrispondenti ed abbinati allo stesso cliente \n");
					System.out.println("Premi 1 per tornare al menu iniziale: ");	
					input.nextInt();
					input.nextLine();
																				}
																				
					else{
						System.out.println("**** Numero cliente o numero pin sbagliato **** \n");
						System.out.println("**** Non e' stata trovata nessuna occorrenza all'interno del database **** \n");
						System.out.println("Premi 1 per tornare al menu iniziale: ");	
						input.nextInt();
						input.nextLine();
						}
					
													}
				
				//Scelta 6 del menu ricerca e verifica per stampare a video tutti i dati contenuti nel dataBase della  banca									
				if (sceltaMenuRicercaVerifica==6){
					System.out.println("****STAMPA A VIDEO DEL DATABASE CLIENTI**** \n");
					System.out.println("****ACCESSO PROTETTO DA PASSWORD - INSERIRE LA PASSWORD PER VISUALIZZARE**** (Per prova inserire 1111)\n");
					int pswDip=input.nextInt();
					banca1.stampaDataBaseBanca(pswDip);
					System.out.println();
					System.out.println("Premi 1 per tornare al menu iniziale: ");	
					input.nextInt();
					input.nextLine();
																				
					
												}
													
				else if  (sceltaMenuRicercaVerifica==7){
											}
				
				else if  (sceltaMenuRicercaVerifica==8)
				{
					esci=7;
											}
											}
			
			
			else if(sceltaMenuIniziale==7){
				esci=7;
											}								
			
			}
		
		while(esci!=7);	
		
											}
	

}

