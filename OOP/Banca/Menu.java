/*
 Classe "Menu" per la creazione di menu dinamici e modificabili attraverso metodi con numero diverso di voci.
 */

import java.util.Scanner;

public class Menu {
	
	private int scelta;
	private String voce1;
	private String voce2;
	private String voce3;
	private String voce4;
	private String voce5;
	private String voce6;
	
	Scanner input=new Scanner(System.in);
	
	public Menu(String voce1, String voce2){
		scelta=0;
		this.voce1=voce1;
		this.voce2=voce2;
															}
	
	public Menu(String voce1, String voce2, String voce3){
		scelta=0;
		this.voce1=voce1;
		this.voce2=voce2;
		this.voce3=voce3;
															}
															
	
	
	public Menu(String voce1, String voce2, String voce3, String voce4, String voce5){
		scelta=0;
		this.voce1=voce1;
		this.voce2=voce2;
		this.voce3=voce3;
		this.voce4=voce4;
		this.voce5=voce5;															}
		
	public Menu(String voce1, String voce2, String voce3, String voce4, String voce5, String voce6){
		scelta=0;
		this.voce1=voce1;
		this.voce2=voce2;
		this.voce3=voce3;
		this.voce4=voce4;
		this.voce5=voce5;	
		this.voce6=voce6;														}
		
	
	public int menuDueVoci(){
	
		System.out.println("\n");
		
		System.out.println("Benvenuti nel Sistema Bancario Intranet di BANCA DELL'AGRICOLTURA RURALE \n\n");
		System.out.println("Scegli la voce di menu seguita da invio: \n\n");
		System.out.println("1 - "+voce1+" \n\n");
		System.out.println("2 - "+voce2+" \n\n");
		System.out.println ("6 - Torna al menu principale\n\n");
		System.out.println ("7 - Esci dal sistema\n\n");
		
		scelta=input.nextInt();
		
		System.out.println("\n\n");
				
		return scelta;
		
						}

	public int menuTreVoci(){
	
		System.out.println("\n");
		
		System.out.println("Benvenuti nel Sistema Bancario Intranet di BANCA DELL'AGRICOLTURA RURALE \n\n");
		
		System.out.println("Scegli la voce di menu seguita da invio: \n\n");
		System.out.println("1 - "+voce1+" \n\n");
		System.out.println("2 - "+voce2+" \n\n");
		System.out.println("3 - "+voce3+" \n\n");
		System.out.println ("6 - Torna al menu principale\n\n");
		System.out.println ("7 - Esci dal sistema\n\n");
		
		scelta=input.nextInt();
		
		System.out.println("\n\n");
				
		return scelta;
		
						}
						
	public int menuCinqueVoci(){
	
		System.out.println("\n");
		
		System.out.println("Benvenuti nel Sistema Bancario Intranet di BANCA DELL'AGRICOLTURA RURALE \n\n");
		
		System.out.println("Scegli la voce di menu seguita da invio: \n\n");
		System.out.println("1 - "+voce1+" \n\n");
		System.out.println("2 - "+voce2+" \n\n");
		System.out.println("3 - "+voce3+" \n\n");
		System.out.println("4 - "+voce4+" \n\n");
		System.out.println("5 - "+voce5+" \n\n");
		System.out.println ("6 - Torna al menu principale\n\n");
		System.out.println ("7 - Esci dal sistema\n\n");
		
		scelta=input.nextInt();
		
		System.out.println("\n\n");
				
		return scelta;
		
						}
						
	public int menuSeiVoci(){
	
		System.out.println("\n");
		
		System.out.println("Benvenuti nel Sistema Bancario Intranet di BANCA DELL'AGRICOLTURA RURALE \n\n");
		
		System.out.println("Scegli la voce di menu seguita da invio: \n\n");
		System.out.println("1 - "+voce1+" \n\n");
		System.out.println("2 - "+voce2+" \n\n");
		System.out.println("3 - "+voce3+" \n\n");
		System.out.println("4 - "+voce4+" \n\n");
		System.out.println("5 - "+voce5+" \n\n");
		System.out.println("6 - "+voce6+" \n\n");
		System.out.println ("7 - Torna al menu principale\n\n");
		System.out.println ("8 - Esci dal sistema\n\n");
		
		scelta=input.nextInt();
		
		System.out.println("\n\n");
				
		return scelta;
		
						}
	
					}

