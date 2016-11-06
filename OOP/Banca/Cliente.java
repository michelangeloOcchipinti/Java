	/*
 Classe "Cliente" per creare oggetti del tipo cliente nei quali memorizzare dati personali e pin. Viene abbinato all'oggetto conto univocamente.
 */


public class Cliente {
	
	private String nome;
	private String cognome;
	private String numCliente;
	private int pin;
	private String numConto;
	
	
	public Cliente(String nome, String cognome, String numCliente, int pin, Conto conto){
		this.nome=nome;
		this.cognome=cognome;
		this.numCliente=numCliente;
		this.pin=pin;
		this.numConto=numConto;
																	}
																	
	public String getNumCliente(){
		return numCliente;
								}
								
	public String getNomeCliente(){
		return nome;
		}
		
	public String getCognomeCliente(){
		return cognome;
		}
		
	public int getPinCliente(){
		return pin;
		}	
																	
	public boolean verifica(String numCliente, int pin){
		
		if (numCliente.equals(this.numCliente) && pin==this.pin){
			return true;
														}
		else{ return false;}
													}
													
	public String ritornaNumCliente(){
			return numCliente;					
									}
}

