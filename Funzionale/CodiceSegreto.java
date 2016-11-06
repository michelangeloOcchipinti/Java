import java.util.Scanner;

public class CodiceSegreto{
	public static void main(String [] args){
		Scanner input=new Scanner(System.in);
		String fraseChiave=input.nextLine();
		String fraseCodificata="";
		while (input.hasNextLine()){
			fraseCodificata=fraseCodificata+input.nextLine();
			}
		String fraseDecodificataCompleta="";
		char fraseDecodificata;
		System.out.println(fraseChiave);
		System.out.println(fraseCodificata);
		int indice=0;
		int fine=1;
		int inizio=0;
		int indiceLetteraIntero;
		while (indice<fraseCodificata.length()-1){
			if (fraseCodificata.startsWith(" ",indice)){
				String indiceLettera=fraseCodificata.substring(indice-2,indice);
				if (indiceLettera.startsWith(" ")){
					indiceLettera=indiceLettera.trim();
					indiceLetteraIntero=Integer.parseInt(indiceLettera);
					}
			indiceLetteraIntero=Integer.parseInt(indiceLettera);
			System.out.print(indiceLetteraIntero+",");
			fraseDecodificata=fraseChiave.charAt(indiceLetteraIntero);
			fraseDecodificataCompleta=fraseDecodificataCompleta+fraseDecodificata;
				}
			indice=indice+1;
			}
		String codiceUltimaLettera=fraseCodificata.substring(indice-1,indice+1);
		System.out.println(codiceUltimaLettera);
		codiceUltimaLettera=codiceUltimaLettera.trim();
		int codiceUltimaLetteraFinale=Integer.parseInt(codiceUltimaLettera);
		char ultimaLettera=fraseChiave.charAt(codiceUltimaLetteraFinale);
		System.out.println();
		System.out.println();	
		System.out.print("La frase segreta e': "+fraseDecodificataCompleta);
		System.out.print(ultimaLettera);
		System.out.println();
		System.out.println();
		
		}
	}
