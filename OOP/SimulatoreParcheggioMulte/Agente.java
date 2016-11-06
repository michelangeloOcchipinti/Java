/*
 Classe Agente
 */


public class Agente {
	
	private String nomeAgente;
	private int matricolaAgente;
	private boolean ris;
	private int minutiTrascorsiOltreSosta;
	
	public Agente(String nomeAgente, int matricolaAgente){
		
		this.nomeAgente=nomeAgente;
		this.matricolaAgente=matricolaAgente;
		minutiTrascorsiOltreSosta=0;
		ris=false;
					}
	
	//Sovrascrivo il metodo toString della classe Object				
	public String toString(){
		return nomeAgente+" "+matricolaAgente;
							}
	
	//Controllo se i minuti trascorsi sono di più rispetto ai minuti acquistati				
	public boolean controlloMinutiTrascorsi(int minutiAcquistati, int minutiTrascorsi){
		
		if (minutiTrascorsi>minutiAcquistati){
			
			ris=true;	
			minutiTrascorsiOltreSosta=	minutiTrascorsi-minutiAcquistati;				
											}
		
		return ris;
																						}
	//restituisco i minuti trascorsi oltre la sosta																					
	public int getMinutiTrascorsiOltreSosta(){
		return minutiTrascorsiOltreSosta;
											}
										
	
	
}

