// 5. Creare un metodo per calcolare il fattoriale di un intero positivo senza usare la ricorsione

import java.util.Scanner;

public class Fattoriale{
	public static void main(String [] args){
		Scanner input=new Scanner(System.in);
		System.out.println("Inserisci il numero di cui calcolare il fattoriale: ");
		System.out.println();
		int num=input.nextInt();
		int num2=num;
		long somma=1;
		while (num>1){
			somma=somma*num;
			num-=1;
					}
					System.out.println();
		System.out.println("Il fattoriale del numero "+num2+" e' uguale a "+somma);
											}
						}
