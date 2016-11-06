import java.util.Scanner;
public class sommaMedia{
	
	public static void main(String args[]){
		double somma=0;
		double media=0;
		int minimo=1;
		int massimo=0;
		int indice=1;
		Scanner input=new Scanner(System.in);
		System.out.print("Inserisci una serie di numeri chiusa da uno zero: ");
		int numero=input.nextInt();
		minimo=numero;
		while (numero!=0){
			if (numero>massimo){
				massimo=numero;
				}
			if (numero<minimo){
				minimo=numero;	
				}
			indice=indice+1;
			somma=somma+numero;
			System.out.print("Inserisci una serie di numeri chiusa da uno zero: ");
			numero=input.nextInt();
			}
		media=somma/(indice-1);
		System.out.println(indice);
		System.out.println("La somma e' uguale a "+somma+", la media e' uguale a "+media+", il 	numero più piccolo e' "+minimo+" e il numero più grande e' "+massimo);
		
		}
	
	}
