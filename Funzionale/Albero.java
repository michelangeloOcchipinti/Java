import java.util.Scanner;

public class Albero{
	public static void main(String [] args){
		String asterisco="*";
		Scanner input=new Scanner(System.in);
		System.out.print("Inserisci la dimensione in altezza dell'albero: ");
		int altezzaAlbero=input.nextInt();
		int indice=0;
		int spazi=altezzaAlbero-1;
		String spazio=" ";
		for (int i=0;i<spazi;i++){
			spazio=spazio+" ";
			}
		
		while (indice<altezzaAlbero){
			System.out.println(spazio+asterisco+spazio);
			asterisco=asterisco+"**";
			spazio=spazio.substring(1);
			indice=indice+1;
			}
		for (int i=0;i<spazi;i++){
			spazio=spazio+" ";
			}
		for (int i=0;i<altezzaAlbero-3;i++){
			System.out.println(spazio+asterisco.substring(1,4));
			}
		asterisco="*";
		for (int i=0;i<altezzaAlbero*2-6;i++){
			asterisco=asterisco+"*";
			}
		for (int i=0;i<3;i++){
			System.out.println("   "+asterisco+"   ");
			}
		}
	}
