import java.util.*;

public class Inizio {
	
	public static void main (String args[]) {
		
		Scanner input=new Scanner(System.in);
		Coda coda=new Coda();
		int scelta=0;
		do{
			System.out.println("Inserisci la voce di menu corrispondente alla scelta: \n");
			System.out.println("1 - Inserisci nodo:  \n");
			System.out.println("2 - Rimuovi nodo:  \n");
			System.out.println("3 - Stampa dimensione coda:  \n");
			System.out.println("4 - Stampa coda:  \n");
			
			scelta=input.nextInt();
			if (scelta==1){
				System.out.println("Inserisci il valore dell'info: ");
				input.nextLine();
				String info=input.nextLine();
				coda.push(info);
				
							}
							
			if (scelta==2){
				coda.pop();
				
							}
							
			if (scelta==3){
				System.out.println("la dimensione della coda e' uguale a: "+coda.size());
							}
							
			if (scelta==4){
				System.out.print("La coda e' uguale a: ");
				coda.printCoda();
				System.out.println("\n");
							}
							
			
			}
		while(scelta!=0);
		
	}
}

