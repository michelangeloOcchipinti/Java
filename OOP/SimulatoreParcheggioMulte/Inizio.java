/*
 Inizio con main()
 */


public class Inizio {
	
	public static void main (String args[]) {
		
		//Creo i tre oggetti 
		MacchinaParcheggiata auto1=new MacchinaParcheggiata("Fiat", "500L", "Rosso Fuego", "AB987CA", 301);
		BigliettoParcheggio ticket=new BigliettoParcheggio(60);
		Agente agente=new Agente("Mario Peschulli", 4567);
		
		/*Attraverso il metodo booleano controlloMinutiTrascorsi() della classe Agente valuto se i minuti trascorsi sono 
		* di più rispetto a quelli acquistati e nel caso il risultato sia vero creo l'oggetto multa richiamando il metodo calcolaMulta() 
		* stampando tutti i dati a video*/
		if (agente.controlloMinutiTrascorsi(ticket.getMinutiAcquistati(), auto1.getMinutiTrascorsi())==true){
			
			MultaPerSosta multa=new MultaPerSosta(auto1, agente);
			
			multa.calcolaMulta(agente.getMinutiTrascorsiOltreSosta());
			
			System.out.println(multa);
			
			
			
											}
	}
}

