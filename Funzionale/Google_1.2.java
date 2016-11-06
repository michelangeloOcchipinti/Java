/* 
Esercitazione 4SA laboratorio - ottobre

Scrivere un programma in Java che usi una matrice per memorizzare una struttura del tipo:

(the, cat, in, the, hat)	1999	20
(the, cat, is, on, youtube)	1999	13
(how, are, you, doing, today)	1986	5000

e si pensi di memorizzare, per brevita', tale struttura in modo fisso nel main stesso.
Si realizzi un programma che legge due stringhe (ad es. 'the' e 'cat') e produca un output del tipo:

(the, cat)	1999	33	i.e., 20+13

Sintetizzando: se le stringhe si ripetono:
quando l'anno è lo stesso, si sommano i valori dell'ultimo campo delle righe 'simili'
altrimenti si riporta inalterata la riga
*/
                            
import java.util.Scanner;

public class Google{
    public static void main (String [] args){
        
//Creo le due matrici con i dati in cui cercare il risultato, una per i dati String ed una per i dati int
        
        String frasi[][]={{"the","cat","in","the","hat"},
                          {"the","cat","is","on","youtube"},
                          {"how","are","you","doing","today"}};
        int anno[][]={{1999,20},
                      {1999,13},
                      {1986,5000}};
        
//Creo la matrice dove salverò i risultati relativi all'anno e alle visualizzazioni mano a mano che li trovo durante la ricerca
        
        int risultatoInt[][]=new int[frasi.length][2];
        
//Chiedo all'utente d'inserire i dati da cercare e faccio un controllo se è stata inserita solamente una parola inviando nel caso un messaggio d'errore
		System.out.println();
        Scanner input=new Scanner(System.in);
        System.out.println("Inserire le due parole da cercare in un'unica riga separate da uno spazio e seguite da un invio: ");
        System.out.println();
        String fraseInserita=input.nextLine();
        
			
//Uso il metodo split per dividere le due parole da cercare e creare un array
        
		String fraseDaCercare[]=fraseInserita.split(" ");
		System.out.println();	
		if (fraseDaCercare.length>2 || fraseDaCercare.length<2){
			System.out.println("Sono state inserite più o meno parole, ricominciare dall'inizio.");	
			System.out.println();
																}
		else{
        
//Creo il doppio ciclo for per cercare i dati all'interno della matrice Stringa
        
			for (int i=0;i<frasi.length;i++){
            
/*Azzero la variabile k per far si che, una volta usciti dal ciclo interno, nella riga 
successiva si ritorni a cercare il primo valore inserito dall'utente*/ 
            
				int k=0;
				for (int j=0;j<frasi[0].length;j++){
						if (fraseDaCercare[k].equals(frasi[i][j])){
                        
//Se verrà trovata la prima parola si aumenterà il valore di k ad  uno così da cercare la seconda parola
							
							k=1;
							for (int y=0;y<frasi[0].length;y++){
								if (y==j) y+=1;
								j=frasi[0].length;	
							
//Inserisco una condizione che diminuisca il valore dell'indice j se arriviamo alla penultima od ultima cella dell'array per evitare errori out of range							
							
							
								if (fraseDaCercare[k].equals(frasi[i][y])){
									y=frasi[0].length;
								
/*Se nella stessa riga si trova anche la seconda parola allora si entra nel ciclo che salva i dati relativi 
all'anno e alle visualizzazioni nella matrice risultatoInt*/
                            
									for (int x=0;x<risultatoInt.length;x++){
                                
/*Se nelle celle della matrice risultatoInt ci sarà già un anno uguale a quello presente nella riga del valore trovato 
allora verrà solamente  sommato il valore delle visualizzazioni*/
                                
										if (anno[i][0]==risultatoInt[x][0]){
											risultatoInt[x][1]+=anno[i][1];
											j=frasi[0].length;
											x=risultatoInt.length;
																			}
                                    
/*Se invece non si troverà nessun anno uguale a quello presente nella riga del valore trovato in nessuna delle righe 
controllate nella matrice risultatoInt allora alla prima cella valorizzata a zero verranno salvati i due valori di anno e visualizzazioni*/
                                    
										else if(risultatoInt[x][0]==0){
											risultatoInt[x][0]=anno[i][0];
											risultatoInt[x][1]=anno[i][1];
											x=risultatoInt.length;
																	}
																	}                           
																	}
																	}
																}
													}
											}
			System.out.println();
        
/*Infine vengono stampati a video i risultati salvati nella matrice risultatoInt preceduti dalle due parole cercate.
Verranno stampate a video solamente le righe con valori dell'anno diversi da zero*/
        
        
			if (risultatoInt[0][0]==0){
				System.out.println("La ricerca non ha prodotto alcun risultato");
									}
			else{
				System.out.println("La ricerca ha prodotto i seguenti risultati:");
				System.out.println();
				for (int i=0;i<risultatoInt.length;i++){
					if (risultatoInt[i][0]!=0){
						System.out.print("| "+fraseDaCercare[0]+" | "+fraseDaCercare[1]+" | ");
						for(int j=0;j<risultatoInt[0].length;j++){
							System.out.print(risultatoInt[i][j]+" | ");
																}
					System.out.println();
												}
					else i=risultatoInt.length;
														}
				}
			System.out.println();
				}
													}
						}
