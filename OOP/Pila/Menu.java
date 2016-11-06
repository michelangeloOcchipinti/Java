import java.util.Scanner;
	

public class Menu {
	
	Scanner input=new Scanner(System.in);
	
	public String menuDueVoci(String a, String b){
		System.out.println("1 - "+a+" \n");
		System.out.println("2 - "+b+" \n");
		System.out.println("6 - Torna al menu principale \n");
		
		String scelta=input.nextLine();
		return scelta;
													}
													
	public String menuTreVoci(String a, String b, String c){
		System.out.println("1 - "+a+" \n");
		System.out.println("2 - "+b+" \n");
		System.out.println("3 - "+c+" \n");
		System.out.println("6 - Torna al menu principale \n");
		String scelta=input.nextLine();
		return scelta;
																}
																
	public String menuQuattroVoci(String a, String b, String c, String d){
		System.out.println("1 - "+a+" \n");
		System.out.println("2 - "+b+" \n");
		System.out.println("3 - "+c+" \n");
		System.out.println("4 - "+d+" \n");
		System.out.println("6 - Torna al menu principale \n");
		String scelta=input.nextLine();
		return scelta;
		
																				}
																				
	public String menuCinqueVoci(String a, String b, String c, String d, String e){
		System.out.println("1 - "+a+" \n");
		System.out.println("2 - "+b+" \n");
		System.out.println("3 - "+c+" \n");
		System.out.println("4 - "+d+" \n");
		System.out.println("5 - "+e+" \n");
		System.out.println("6 - Torna al menu principale \n");
		String scelta=input.nextLine();
		return scelta;
																				}
	
}

