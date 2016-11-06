/* Data una matrice di dimensioni decise dall' utente, determinare:

a) Se è quadrata

b) Nel caso lo sia dire se è simmetrica, altrimenti azzerare solo i valori minori di 15 e visualizzare la diagonale principale.*/

import java.util.Scanner;
import java.util.Random;

public class Matrice2 {

    public static void main(String[] args) {
       Scanner input=new Scanner (System.in);
       System.out.println("Inserisci il numero di righe della matrice: ");
       System.out.println();
       int righe=input.nextInt();
       System.out.println("Inserisci il numero di colonne della matrice: ");
       System.out.println();
       int colonne=input.nextInt();
       int m1[][]=new int[righe][colonne];
       int contatore=0;
       int contatore2=0;
       String spazio=" ";
       Random rnd=new Random();
       System.out.println();
       System.out.println("Stampo la matrice.");
       System.out.println();
       for (int i=0;i<m1.length;i++){
           for (int j=0;j<m1[0].length;j++){
               m1[i][j]=rnd.nextInt(50-10+1)+10;
               System.out.print(m1[i][j]+" ");
                                           }
           System.out.println();
                                   }
       
       if (righe==colonne){
           for (int i=0;i<m1.length;i++){
               for (int j=0;j<m1[0].length;j++){
                    if (m1[i][j]!=m1[j][i]){
                        i=m1.length;
                        j=m1[0].length;
                        System.out.println();
                        System.out.println("La matrice non e' simmetrica!");
                        System.out.println();
                        System.out.println("La diagonale principale e' uguale a: ");
                        for (int l=0;l<m1.length;l++){
                            for (int m=0;m<m1[0].length;m++){
                                if (m1[l][m]<15){
                                    m1[l][m]=0;
                                                }
                   
                                               }
               System.out.println(spazio+m1[l][contatore2]);
               spazio=spazio+" ";
               contatore2+=1; 
                                        }
                                            }
                    else{
                        contatore+=1;
                        }
                                               }
                                        }
           if (contatore==m1[0].length*m1.length){
               System.out.println("La matrice e' simmetrica!");
               
                                                 }
                           }
       else{
		   System.out.println();
           System.out.println("La matrice non e' quadrata!");
            }
                                            }
    
                      }
