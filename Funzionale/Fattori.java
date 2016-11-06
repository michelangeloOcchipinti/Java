import java.util.Scanner;
public class Fattori {
	
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("Inserisci un numero di cui calcolare i fattori: ");
		int numero=input.nextInt();
		int k=1;
		int divisione=0;
		while (k*k<=numero){
			if (numero%k==0){
				divisione=numero/k;
				System.out.println("I due fattori sono: "+divisione+" e "+k);
				}
			k=k+1;
			
			}
		
		
		
		}
	
}
