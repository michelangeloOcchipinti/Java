/*
	Classe conto vincolato (ContoVincolato) che è un libretto di risparmio che impegna a lasciare il denaro
	nel conto per un certo numero di mesi e prevede una penale per il ritiro anticipato, sottoclasse della classe Conto.
*/

public class ContoVincolato extends Conto{
	
	private int numMesiVincolo;
	private double percentualePenale;
	private int numMesiAttuali;
	private double tassoInteresseMensile;
	private double penaleAnticipata;
	
	public ContoVincolato(double saldo, String numContoCorrente){
		
		super(saldo, numContoCorrente);
		
		numMesiVincolo=12;
		percentualePenale=5.00;
		numMesiAttuali=10;
		tassoInteresseMensile=0.25;
																}
																
	public void calcolaInteressiMensili(){
		
		saldo+=saldo*tassoInteresseMensile/100;
										}
										
	public boolean prelievo(double quanto){
		
		if (numMesiAttuali>numMesiVincolo){
			
			return super.prelievo(quanto);
											}
											
		else {
			penaleAnticipata=saldo*percentualePenale/100;
			saldo-=penaleAnticipata;
			System.out.println("Il prelievo viene effettuato prima del vincolo per cui la penale sara' uguale a: "+penaleAnticipata+" euro");
			System.out.println("Il nuovo saldo e' pari a: "+saldo+" euro");
			return false;	
			
			}
											}
										
	
																
	
	
}

