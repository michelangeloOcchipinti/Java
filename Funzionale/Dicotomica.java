/*
 4. Dato un array di interi ricercare un elemento utilizzando la tecnica della ricerca dicotomica.
 */

import java.util.Scanner;

public class Dicotomica {
	
	public static void main (String args[]) {
		int numeri[]={25,4,8,65,98,7,2,3,5,4,45,1,45,7,45,25,36,95,15};
		int varTemp=0;
		for (int i=0;i<numeri.length-1;i++){
			for (int j=0;j<numeri.length-1;j++){
				if (numeri[j]>numeri[j+1]){
					varTemp=numeri[j];
					numeri[j]=numeri[j+1];
					numeri[j+1]=varTemp;
											}
				
											}
										}
		for (int i=0;i<numeri.length;i++){
			System.out.print(numeri[i]+" ");
										}
										
		System.out.println();
		System.out.println();
										
		Scanner input=new Scanner(System.in);
		System.out.println("Inserisci il numero da cercare; ");
		int numero=input.nextInt();
		
		int indice=0;
		int meta=numeri.length/2;
		int inizio=0;
		while (indice<numeri.length/2){
			if (numero<numeri[meta]){
				meta=(meta-inizio)/2+inizio;
									}
			else if (numero>numeri[meta]){
				inizio=meta;
				meta=(numeri.length-meta)/2+inizio;
										}
			else if (numero==numeri[meta]){
				System.out.println("Il numero cercato si trova nella posizione "+meta);
				indice=numeri.length/2;
											}
			indice+=1;
										}
									
		System.out.println();
		System.out.println();
		
	}
}

