
/*Scrivere il programma pygen che dato un "modello" (pattern)  di come si voglia generare una password, lo interpreti e ne stampi il risultato. Il modello e' il seguente:

    a. Il carattere 'a' sta ad indicare una qualsiasi lettera minuscola
    B. il carattere 'B' sta ad indicare una qualsiasi lettera MAIUSCOLA
    c. il carattere 'c' sta ad indicare un qualsiasi numero
    d. il carattere 'd' sta ad indicare un simbolo tra .,:,;,

Ad esempio se lanciamo il comando 'pygen aaBccd' vogliamo generare una password di 6 caratteri di cui i primi due sono due lettere casuali minuscole, la terza e' una lettera casuale MAIUSCOLA, la quarta e la quinta sono due cifre casuali e l'ultima un simbolo di interpunzione.
*/

import java.util.Scanner;
import org.apache.commons.lang3.*;
public class Pygen_2{
	public static void main(String args[]){
		String password=new String();
		String passwordParziale=new String();
		Scanner input=new Scanner(System.in);
		int lunghezzaPassword=6;
		String maiuscole="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String minuscole="abcdefghijklmnopqrstuvwxyz";
		String simboli=".,:;!?";
		String numeri="1234567890";
		System.out.print("Per comporre la tua nuova password a sei caratteri inserisci una lettera alla volta a scelta tra a, B, c, d: ");
		while (lunghezzaPassword>0){
			System.out.print("Per comporre la tua nuova password a sei caratteri inserisci una lettera alla volta a scelta tra a, B, c, d: ");
			String carattere=input.nextLine();
			char lettera=carattere.charAt(0);
			if (lettera=='a'){
				passwordParziale=RandomStringUtils.random(1,minuscole);
				password=password+passwordParziale;
				}
			else if (lettera=='B'){
				passwordParziale=RandomStringUtils.random(1,maiuscole);
				password=password+passwordParziale;
				}
			else if (lettera=='c'){
				passwordParziale=RandomStringUtils.random(1,numeri);
				password=password+passwordParziale;
				}
			else if (lettera=='d'){
				passwordParziale=RandomStringUtils.random(1,simboli);
				password=password+passwordParziale;
				}
			lunghezzaPassword=lunghezzaPassword-1;
			
			}
		System.out.println("La tua nuova password e': "+password);
		
		
		}
	
	}
