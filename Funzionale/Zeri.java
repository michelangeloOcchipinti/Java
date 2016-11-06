/*
 Zeri
 */

import java.util.Random;
import java.util.Scanner;

public class Zeri {
	
	public static void main (String args[]) {
		
		Random rnd=new Random();
		Scanner input=new Scanner(System.in);
		
		System.out.println("Scrivi quanti numeri vuoi inserire: ");
		System.out.println();
		int numeri=input.nextInt();
		
		System.out.println();
		
		int[] listaNum=new int[numeri];
		int contatore=0;
		
		for (int i=0;i<numeri;i++){
			
			listaNum[i]=rnd.nextInt(5);
			System.out.print(listaNum[i]);
			
									}
									
		for (int i=0;i<listaNum.length;i++){
			
			if (listaNum[i]!=0){
				listaNum[contatore]=listaNum[i];
				contatore++;
								}
											}
											
		for (int i=contatore;i<listaNum.length;i++){
			
			listaNum[i]=0;
													}
													
		System.out.println();
		System.out.println();
		System.out.println("La lista ordinata e' uguale a:");
		System.out.println();											
		for (int i=0;i<listaNum.length;i++){
			System.out.print(listaNum[i]+" ");
									}
		System.out.println();
		System.out.println();
											}
				}

