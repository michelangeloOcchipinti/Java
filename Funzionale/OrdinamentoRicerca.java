/*Esercizio sulle liste Compito

Realizzare un programma in grado di produrre una lista di numeri casuali di lunghezza parametrica.

Produrre e verificare una funzione di ricerca ingenua in grado di cercare la prima posizione di un valore nella lista di numeri casuali.

Produrre una funzione in grado di riordinari i dati nella lista

Produrre una funzione di ricerca efficiente che sfruttando il fatto che lista è ordinata esegue una ricerca "intelligente" arrivando alla posizione del valore cercato in modo più efficiente.

Puoi consegnare fino a tre diverse versioni dello stesso programma.*/

import java.util.Scanner;
import java.util.Random;

public class OrdinamentoRicerca {
	public static void main(String args[]){
		
		//Creo una lista di numeri interi random e popolo una array con questi numeri ed infine stampo l'array a video
		
		int[] numeri=new int[20];
		int indice=0;
		Scanner input=new Scanner(System.in);
		Random generatore=new Random();
		while (indice<numeri.length){
			int numeroCasuale=generatore.nextInt(100);
			numeri[indice]=numeroCasuale;
			System.out.print(numeri[indice]+",");
			indice=indice+1;
			
			}
		System.out.println();	
		
		//Chiedo in input un numero da ricercare e creo un ciclo di ricerca nell'array stampando a video la posizione di tale numero nell'array
		
		indice=0;
		System.out.println();
		System.out.print("Inserisci un numero da ricercare nella lista: ");
		int numeroDaCercare=input.nextInt();
		while (indice<numeri.length){
			int numeroInteger=numeri[indice];
			if (numeroDaCercare==numeri[indice]){
				System.out.println();
				System.out.println("La prima posizione del numero "+numeroDaCercare+" nella lista e' "+indice);
				break;
				}
			indice=indice+1;
			}
			
		//Creo un ciclo per ordinare i dati all'interno dell'array utilizzando una variabile tampone e stampo a video la lista di valori ordinata
		
		int variabileTampone=0;
		int indice2=0;
		indice=0;
		while (indice<numeri.length){
			indice2=0;
			while (indice2<numeri.length-1){
				if (numeri[indice2]>numeri[indice2+1]){
					variabileTampone=numeri[indice2];
					numeri[indice2]=numeri[indice2+1];
					numeri[indice2+1]=variabileTampone;
					}
				indice2=indice2+1;
				}
			indice=indice+1;
			
			}
			System.out.println();
		indice=1;
		for (;indice<=numeri.length;indice++){
			System.out.print(numeri[indice-1]+",");
			}
		System.out.println();
		System.out.println();
		int inizio=0;
		int fine=numeri.length;
		indice=0;
		while (indice<numeri.length/2){
			int posizione=(inizio+fine)/2;
			if (numeroDaCercare>numeri[posizione]){
				inizio=posizione;
				}
			else if (numeroDaCercare<numeri[posizione]){
				fine=posizione;
				}
			else if (numeroDaCercare==numeri[posizione]){
				System.out.println("Il numero cercato nella lista ordinata si trova in posizione "+posizione);
				break;
				}
			indice=indice+1;
			}	
			}
		
		}
	


