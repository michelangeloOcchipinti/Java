/*
 2. Data una matrice di interi e un numero intero determinare se questo numero compare nella
matrice e in caso affermativo stampare gli indici della posizione in cui compare e quante volte è
presente.
 */

import java.util.Scanner;

public class RicercaNumero {
	
	public static void main (String args[]) {
		int matrice[]={1,2,3,4,5,6,3,8,9};
		Scanner input=new Scanner(System.in);
		System.out.println("Inserire un numero da ricercare nell'array");
		int numSearch=input.nextInt();
		int ricorrenze=0;
		
		System.out.println();
		
		for (int i=0;i<matrice.length;i++){
			if (matrice[i]==numSearch){
				ricorrenze+=1;
				System.out.println("Il numero compare nella posizione "+i);
										}
											}
		System.out.println();
		
		if (ricorrenze==0){
			System.out.println("Il numero non e' presente all'interno dell'array");
							}
		else if(ricorrenze==1){
			System.out.println("Il numero e' presente solamente una volta");
								}
		else System.out.println("Il numero e' presente "+ricorrenze+" volte");
		System.out.println();
											}
							}

