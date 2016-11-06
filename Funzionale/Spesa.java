import java.util.Scanner;

public class Spesa{
	public static void main(String [] args){
		Scanner input=new Scanner(System.in);
		System.out.print("Inserisci la quantita' di viti acquistate: ");
		int viti=input.nextInt();
		System.out.print("Inserisci il numero di dadi acquistati: ");
		int dadi=input.nextInt();
		System.out.print("Inserisci il numero di rondelle acquistate: ");
		int rondelle=input.nextInt();
		int costoViti=5;
		int costoDadi=3;
		int costoRondelle=1;
		int costoTotaleViti=viti*costoViti;
		int costoTotaleDadi=dadi*costoDadi;
		int costoTotaleRondelle=rondelle*costoRondelle;
		int costoTotaleSpesa=(viti*costoViti)+(dadi*costoDadi)+(rondelle*costoRondelle);
		System.out.println();
		if (dadi>=viti && rondelle>=viti*2){
			System.out.println("Il costo delle singole viti e' pari a: "+costoViti);
			System.out.println("Il costo dei singoli dadi e' pari a: "+costoDadi);
			System.out.println("Il costo delle singole rondelle e' uguale a: "+costoRondelle);
			System.out.println("Il conto totale della spesa e' pari a: "+costoTotaleSpesa);
			}
		else {
		
			if (dadi<viti){
				System.out.println("Attenzione! Il numero di dadi e' inferiore al numero di viti!");
				
				}
			if (rondelle<viti*2){
				System.out.println("Attenzione! Il numero di rondelle e' inferiore a due rondelle per ogni vite!");
				
				}
			System.out.println();
			System.out.println("Il costo delle singole viti e' pari a: "+costoViti);
			System.out.println("Il costo dei singoli dadi e' pari a: "+costoDadi);
			System.out.println("Il costo delle singole rondelle e' uguale a: "+costoRondelle);
			System.out.println();
			System.out.println("Il conto totale della spesa e' pari a: "+costoTotaleSpesa);
			
			System.out.println();
		}	
	}
	
}
