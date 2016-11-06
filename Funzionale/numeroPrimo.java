import java.util.Scanner;
public class numeroPrimo{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Inserisci il numero: ");
		int numero=input.nextInt();
		int divisore=2;
		int contenitore=0;
		boolean risultato=true;
		while (divisore<numero){
			contenitore=numero%divisore;
			if (contenitore==0){
				risultato=false;
				break;
					}
			else if (contenitore!=0){
				risultato=true;
				} 
			divisore=divisore+1;
			}
		System.out.println("Il risultato e': " + risultato);
		}
	}
