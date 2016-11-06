/*
	Classe conto corrente (ContoCorrente), un conto bancario che non ha interessi, offre un numero limitato di
	operazioni mensili gratuite ma addebita una commissione per ciascun movimento aggiuntivo, sottoclasse della classe Conto.
*/

public class ContoCorrente extends Conto{
	
	private int numMovimentiMax;
	private double costoPerMovimento;
	private int numMovimentiAttuali;
	private double speseMovimentiExtra;
	
	public ContoCorrente(double saldo, String numContoCorrente){
		
		super(saldo, numContoCorrente);
		
		numMovimentiMax=10;
		costoPerMovimento=1.00;
		numMovimentiAttuali=10;
		speseMovimentiExtra=0.00;
																}
																
	public void setNumMovimentiAttuali(){
		numMovimentiAttuali++;
										}
										
	public int getNumMovimentiAttuali(){
		return numMovimentiAttuali;
										}
										
	public boolean prelievo(double quanto){
		boolean ris=true;
		if (saldo==0 || quanto>saldo){
			ris=false;
			
									}
		else {saldo=saldo-quanto;}
		return ris;
											}
										
	public void calcolaSpeseMovimentiExtra(){
		
		if (numMovimentiAttuali>numMovimentiMax){
			
			speseMovimentiExtra=(numMovimentiAttuali-numMovimentiMax)*costoPerMovimento;
			numMovimentiAttuali=0;
												}
											}
											
	public double getSpeseMovimentiExtra(){
		
		return speseMovimentiExtra;
											}
								
								
	
}

