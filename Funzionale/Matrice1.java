
/*Data una matrice 3X2 di interi, crearne una seconda con valori tali che nelle righe pari avrà valori tripli,
 *  e nelle righe dispari avrà tutti i valori uguali a uno. */
 
public class Matrice1 {
    public static void main(String[] args) {
      int m1[][]={  {2,3,5,4,9},
                    {4,7,9,7,3},
                    {1,0,8,1,6}};
      int m2[][]=new int[3][5];
      for (int i=0;i<m1.length;i++){
        for (int j=0;j<m1[0].length;j++){
            if (i%2==0) m2[i][j]=m1[i][j]*3;       
            else m2[i][j]=1;
            System.out.print(m2[i][j]+" ");
                }
        System.out.println();
                                        }
        
                                    } 
                                            }
          
                        
          
                                          
                       
