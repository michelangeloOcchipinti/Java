/*
 1. Dato un array di interi, invertirlo e poi stamparlo
 */


public class Inverto {
	
	public static void main (String args[]) {
		int inverto[]={1,2,3,4,5,6,7,8,9};
		int varTemp=0;
		int indice=0;
	
		System.out.println("L'array originale e' uguale a:");
		System.out.println();
		
		for (int i=0;i<inverto.length;i++){
			System.out.print(inverto[i]);
											}
											
		System.out.println();
		System.out.println();
		
		while (inverto[indice]<inverto[indice+1]){
			varTemp=inverto[indice];
			inverto[indice]=inverto[inverto.length-1-indice];
			inverto[inverto.length-1-indice]=varTemp;
			indice+=1;
												}
		System.out.println("L'array invertito e' uguale a:");
		System.out.println();
		for (int i=0;i<inverto.length;i++){
			System.out.print(inverto[i]);
											}
		System.out.println();
		System.out.println();
											}
					}

