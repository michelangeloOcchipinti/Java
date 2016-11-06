/*
 Classe "Conto" per creare l'oggetto conto abbinabile univocamente ad un oggetto cliente.  
 */


public abstract class Conto {
	
	
	protected double saldo;
	protected String numContoCorrente;
	protected int numMovimentiAttuali;
	
	
					
	public Conto(double saldoIniziale, String numConto){
		
		saldo=saldoIniziale;
		numContoCorrente=numConto;
		numMovimentiAttuali=0;
									}
									
	public String getNumContoCorrente(){
		return numContoCorrente;
										}

									
	public void deposito(double quanto){
		saldo+=quanto;
								}
								
								
	public boolean prelievo(double quanto){
		boolean ris=true;
		if (saldo==0 || quanto>saldo){
			ris=false;
			
									}
		else {saldo=saldo-quanto;}
		return ris;
											}
											
	public double getSaldo(){
		return saldo;
							}
								
	public boolean trasferisci(Conto altro, double quanto){
		if (saldo>0 && quanto >=saldo){
			saldo-=quanto;
			altro.deposito(quanto);
			return true;
									}
		else{return false;}
														}
														
	public void calcolaInteressiMensili(){
		
										}
										
	public void setNumMovimentiAttuali(){
		
										}
										
										
	public void calcolaSpeseMovimentiExtra(){
		
		
											}
											
	public int getNumMovimentiAttuali(){
		return numMovimentiAttuali; 
										}
										
	public boolean equals(Conto conto){
		boolean ris=false;
		if (saldo==conto.getSaldo()){
			ris=true;
									}
									
		return ris;
									}
									
	public int hashCode(Conto conto){
		int i=(int) conto.getSaldo();
		return i;
						}
											
	
											
	
										
	
}

