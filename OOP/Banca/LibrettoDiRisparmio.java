/*
 Classe Llbretto di risparmio (LibrettoDiRisparmio), un conto bancario che frutta interessi mensili, sottoclasse della classe Conto.
*/

public class LibrettoDiRisparmio extends Conto{
	
	private double tassoInteresseMensile;
	
	public LibrettoDiRisparmio(double saldo, String numContoCorrente){
		
		super(saldo, numContoCorrente);
		
		tassoInteresseMensile=0.25;
																	}
																	
	public boolean prelievo(double quanto){
		boolean ris=true;
		if (saldo==0 || quanto>saldo){
			ris=false;
			
									}
		else {saldo=saldo-quanto;}
		return ris;
											}
																	
	public void calcolaInteressiMensili(){
		
		saldo+=saldo*tassoInteresseMensile/100;
										}
								
		
}

