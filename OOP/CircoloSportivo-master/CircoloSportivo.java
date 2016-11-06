/**
 * Classe che crea un oggetto per il circolo sportivo.
 * 
 * @author Michelangelo Occhipinti
 * 
 * @version 1.0
 * 
 * @since 31/03/2016
 */
public class CircoloSportivo {
	
	public String Nome;
	public Socio[] soci;
	
	/**
	 * Metodo costruttore con parametri
	 * 
	 * @param nome Il nome del circolo sportivo.
	 * @param numSoci Il numero massimo di soci ammessi.
	 */
	public CircoloSportivo(String nome, int numSoci){
		
		this.Nome=nome;
		soci=new Socio[numSoci];
													}
												
	/**
	 * Metodo che restituisce a video la stampa degli iscritti al circolo.
	 * 
	 */												
	public void ElencoIscritti(){
		
		
								}
	
	/**
	 * Metodo che restituisce la lista degli iscritti al circolo divisa per disciplina.
	 * 
	 * @param disc Attributo che definisce la disciplina di cui estrarre gli iscritti.
	 * 
	 * @return restituisce la lista degli iscritti per la disciplina richiesta.
	 * 
	 */								
	public String ElencoIscrittiPerDisciplina(String disc){
		
		return "q";
															}
										
	
}

