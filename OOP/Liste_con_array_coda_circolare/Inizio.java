/*Realizzare due programmi distinti, uno per la struttura pila e uno per la struttura coda. 
 * Ognuno di questi programmi dovrà avere il suo main di test SENZA grande uso di input output e ridotto dunque all'essenziale. 
 * I programmi dovranno realizzare le funzioni base delle relative strutture utilizzando un semplice array.
 *  Non possono essere utilizzate altre strutture dati che non siano state viste a lezione o in laboratorio. 
 * Per ogni chiarimento c'è il forum del corso.*/

import java.util.Scanner;

public class Inizio {
	
	public static void main (String args[]) {
		
		Scanner input=new Scanner(System.in);
		int scelta=0;
		
		
		Pila pila=new Pila(8);
		Coda coda=new Coda(8);
		
		System.out.println("Scegli il tipo di struttura: \n");
		System.out.println("1 - Pila: ");
		System.out.println("2 - Coda: ");
		
		scelta=input.nextInt();
		input.nextLine();
		
		if (scelta==1){
			
			do{
				System.out.println("\n Scegli la voce di menu: \n");
				System.out.println("1 - Inserisci nodo: ");
				System.out.println("2 - Elimina nodo: ");
				System.out.println("3 - Stampa pila: \n");
				
				scelta=input.nextInt();
				input.nextLine();
				
				if (scelta==1){
					System.out.println("Inserisci un numero intero compreso tra 1 e 9: \n");
					int num=input.nextInt();
					input.nextLine();
					pila.push(num);
					pila.printPila();
								}
								
				if (scelta==2){
					System.out.println("L'info del nodo e' uguale a: "+pila.pop());
					pila.printPila();
								}
				}
			
			while(scelta!=0);
						}
						
		if (scelta==2){
			
			do{
				System.out.println("\n Scegli la voce di menu: \n");
				System.out.println("1 - Inserisci nodo: ");
				System.out.println("2 - Elimina nodo: ");
				System.out.println("3 - Stampa coda: \n");
				
				scelta=input.nextInt();
				input.nextLine();
				
				if (scelta==1){
					System.out.println("Inserisci un numero intero compreso tra 1 e 99: \n");
					int num=input.nextInt();
					input.nextLine();
					coda.push(num);
					coda.printCoda();
								}
								
				if (scelta==2){
					System.out.println("L'info del nodo e' uguale a: "+coda.pop());
					coda.printCoda();
								}
				}
			
			while(scelta!=0);
			
						}
											}
}

