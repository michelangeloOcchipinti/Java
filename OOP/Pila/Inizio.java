import java.util.Scanner;
	

public class Inizio{
																				 
	public static void main(String[] args){
		
		Pila pila=new Pila();
		Menu menu=new Menu();
		Scanner input=new Scanner(System.in);
		String scelta="";
		
		
		while (!scelta.equals("0")){
			scelta=menu.menuCinqueVoci("Crea nodo", "Rimuovi nodo", "Controlla numero nodi", "Stampa pila", "Controlla coerenza parentesi");
			if (scelta.equals("1")){
				System.out.println();
				System.out.println("Inserisci la parentesi: ");
				String parentesi=input.nextLine();
				pila.push(parentesi);
				System.out.println();
				System.out.print("La sequenza attuale e': "); pila.printPila();
				System.out.println();
				System.out.println();
									}
									
			else if(scelta.equals("2"))	{
				System.out.println();
				System.out.println("Il nodo eliminato e': "+pila.pop());
				System.out.println();
				System.out.print("La sequenza attuale e': "); pila.printPila();
				System.out.println();
				System.out.println();
										}
										
			else if(scelta.equals("3"))	{
				System.out.println();
				pila.size();
				System.out.println();
										}
										
			else if(scelta.equals("4"))	{
				System.out.println();
				pila.printPila();
				System.out.println("\n \n");
										}
										
			else if(scelta.equals("5"))	{
				System.out.println();
				pila.isPari();
				System.out.println("\n \n");
										}
			
			else if(scelta.equals("6"))	{
				
										}																								
	
		
											}
											}
					}
