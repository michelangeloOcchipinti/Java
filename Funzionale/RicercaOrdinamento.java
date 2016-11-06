import java.util.Scanner;
import java.util.Random;

public class RicercaOrdinamento{
	public static void main(String []args){
		Random rnd=new Random();
		Scanner input=new Scanner(System.in);
		System.out.print("Inserisci quanti numeri casuali vuoi creare: ");
		int quantiNumeri=input.nextInt();
		int[] numeri=new int[quantiNumeri];
		System.out.println();
		System.out.print("La lista creata e' uguale a: ");
		for (int i=0;i<numeri.length;i++){
			numeri[i]=rnd.nextInt(quantiNumeri*10);
			System.out.print(numeri[i]+",");
			}
		System.out.println();
		System.out.println();
		System.out.print("Inserisci il numero che vuoi cercare all'interno della lista: ");
		int numeroDaCercare=input.nextInt();
		System.out.println();
		
		for (int i=0;i<numeri.length;i++){
			if (numeroDaCercare==numeri[i]){
				System.out.print("Il numero cercato e' presente all'interno della lista con indice N.: "+i);
				break;
				}
			}
		System.out.println();	
		for (int indiceEsterno=0;indiceEsterno<numeri.length;indiceEsterno++){
			int indiceInterno=0;
			int tampone=0;
			for (;indiceInterno<numeri.length-1;indiceInterno++){
				if (numeri[indiceInterno]>numeri[indiceInterno+1]){
					tampone=numeri[indiceInterno];
					numeri[indiceInterno]=numeri[indiceInterno+1];
					numeri[indiceInterno+1]=tampone;
					}
				}
			}
		System.out.println();
		System.out.println("La lista ordinata e' uguale a: ");
		System.out.println();
		for (int i=0;i<numeri.length;i++){
			System.out.print(numeri[i]+",");
			}
		System.out.println();
		System.out.println();
		int inizio=0;
		int meta=numeri.length/2;
		int fine=numeri.length;
		for (int i=0;i<numeri.length/2;i++){
			if (numeroDaCercare>numeri[meta]){
				meta=(meta+fine)/2;
				}
			if (numeroDaCercare<numeri[meta]){
				meta=meta/2;
				}
			if (numeroDaCercare==numeri[meta]){
				System.out.println("Il numero cercato si trova nella posizione: "+meta);
				System.out.println();
				break;
				}
			}
		
		}
	}
