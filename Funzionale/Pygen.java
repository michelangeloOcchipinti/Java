/*Scrivere il programma pygen che dato un "modello" (pattern)  di come si voglia generare una password, lo interpreti e ne stampi il risultato. Il modello e' il seguente:

    a. Il carattere 'a' sta ad indicare una qualsiasi lettera minuscola
    B. il carattere 'B' sta ad indicare una qualsiasi lettera MAIUSCOLA
    c. il carattere 'c' sta ad indicare un qualsiasi numero
    d. il carattere 'd' sta ad indicare un simbolo tra .,:,;,

Ad esempio se lanciamo il comando 'pygen aaBccd' vogliamo generare una password di 6 caratteri di cui i primi due sono due lettere casuali minuscole, la terza e' una lettera casuale MAIUSCOLA, la quarta e la quinta sono due cifre casuali e l'ultima un simbolo di interpunzione.
*/

//Importo le classi che utilizzerò nel programma
import java.util.Scanner;
import org.apache.commons.lang3.*;
public class Pygen{
//Inizializzo la procedura di input con Scanner
	public static void main(String args[]){
		String password=new String();
		String passwordParziale=new String();
		Scanner input=new Scanner(System.in);
//Creo le variabili da cui ricaverò le lettere, i simboli ed i numeri random da utilizzare per creare la password		
		String maiuscole="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String minuscole="abcdefghijklmnopqrstuvwxyz";
		String simboli=".,:;!?";
		String numeri="1234567890";
//Richiedo il primo input all'utente
		System.out.print("Per comporre la tua nuova password inserisci una parola composta dalle lettere a, B, c, d: ");
		String carattere=input.nextLine();
//Creo un ciclo che itererà fino alla lunghezza della stringa inserita dall'utente
		for (int i=0;i<carattere.length();i++){
//Creo un cast per trasformare il carattere in char usandone uno alla volta in sequenza attraverso l'indice
			char lettera=carattere.charAt(i);
/*Creo la procedura di selezione ed abbinamento attraverso una serie di if ed il primo mi permette di uscire dal ciclo nel caso in cui l'utente
 inserisca una lettera sbagliata*/
			if (lettera!='a' && lettera!='B'&& lettera!='c' && lettera!='d'){
				System.out.println("Hai inserito una lettera sbagliata, la procedura comincera' di nuovo dall'inizio.");
				password="";
				break;
				}
			else{
			
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
				
			}
		
		}
//Stampo a video la nuova password
		System.out.println("La tua nuova password e': "+password);
			}
	}
