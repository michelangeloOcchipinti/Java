/*
 Classe MultaPerSosta
 */


public class MultaPerSosta {
	
	private double valoreMulta;
	private MacchinaParcheggiata auto;
	private Agente agente;
	
	//Creo il costruttore che acquisisce anche i due oggetti MacchinaParcheggiata ed Agente in modo da stamparli direttamente dall'oggetto di classe Multa 
	public MultaPerSosta(MacchinaParcheggiata auto, Agente agente){
		
		valoreMulta=0.0;
		this.auto=auto;
		this.agente=agente;
																	}
	//Sovrascrivo il metodo toString della classe Object																
	public String toString(){
		return "La multa ammonta a "+valoreMulta+" euro \n"+"Modello auto: "+auto+"\n"+"Agente: "+agente;
							}
	
	//Calcolo il valore della multa 						
	public void calcolaMulta(int minutiPassatiOltreSosta){
		
		
			valoreMulta=25.00;
																																	
		if (minutiPassatiOltreSosta>60) {
			int indice=60;
			while (indice <minutiPassatiOltreSosta+60){
				indice+=60;
				valoreMulta+=10.00;
				
													}
				}
															}
															
	
}

