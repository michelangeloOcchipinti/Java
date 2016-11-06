/*
 Si abbia un array di interi da 1 a N. Supponiamo per semplicità da 1 a 10 ma con un elemento mancante. Trovare il modo più efficiente per determinare quello mancante. Ad esempio: 

[5, 6, 9, 4, 1, 2, 8, 3, 10] manca il 7

[2, 10, 4, 5, 6, 7, 8, 9, 3] manca l'1

[1, 3, 2, 6, 5, 7, 8, 10, 9] manca il  4
 */

public class ChiManca {

   
    public static void main(String[] args) {
        
        /* Creo l'array con i valori e le variabili */
        int numeri[]={1, 3, 6, 5, 7, 8, 10, 9, 4};
        int varTemp=0;
        int mancante=0;
        
        /* Creo il ciclo for per ordinare i valori all'interno dell'array in ordine crescente. */
        for (int i=0;i<numeri.length;i++){
            for (int j=0;j<numeri.length-1;j++){
                if (numeri[j]>numeri[j+1]){
                    varTemp=numeri[j];
                    numeri[j]=numeri[j+1];
                    numeri[j+1]=varTemp;
                                          }
                                             }
                                         }
        
        /* Controllo se la prima cifra è uguale ad uno, nel caso non lo sia invio il messaggio a video ed aggiorno il valore della variabile mancante ad 1. */
        if (numeri[0]>1){
            System.out.println("Il numero mancante e' 1");
            mancante=1;
                        }
        
        /* Controllo con un ciclo for che attraversa tutti i valori all'interno delle celle dell'array se il valore inserito dentro la cella che segue è più grande di due unità 
        rispetto al valore dentro la cella precedente, se lo è scrivo a video il numero mancante aggiungendo una unità al valore della cella array[i]. */
        for (int i=0;i<numeri.length-1;i++){
            if (numeri[i+1]-numeri[i]>1){
                mancante=numeri[i]+1;
                System.out.println("Il numero mancante e' "+mancante);
                                        }
            
                                            }
        System.out.println();
        
        /* Controllo se la variabile "mancante" ha valore 0, se lo ha scrivo a video che l'array ha la sequenza di numeri completi. */
        if (mancante==0) {System.out.println("La sequenza di numeri e' completa!");}
        
        System.out.println();
                                            }
    
                      }
