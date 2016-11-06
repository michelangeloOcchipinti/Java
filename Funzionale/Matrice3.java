
/*Date due matrici 3X2 crearne una terza avente per valori le somme dei corrispondenti.*/

import java.util.Random;

public class Matrice3 {

    public static void main(String[] args){
        int m1[][]=new int [3][2];
        int m2[][]=new int [3][2];
        int m3[][]=new int [3][2];
        Random rnd=new Random();
        for (int i=0;i<m1.length;i++){
            for (int j=0;j<m1[0].length;j++){
                m1[i][j]=rnd.nextInt(50-10+1)+10;
                m2[i][j]=rnd.nextInt(50-10+1)+10;
                m3[i][j]=m1[i][j]+m2[i][j];
                                            }
            
                                     }
        System.out.println(" I° array    II° array   III° array (sum)");
		for (int i=0;i<m3.length;i++){
			System.out.print("  ");
				for (int j=0;j<m3[0].length;j++){
						System.out.print(m1[i][j]+" ");
												}
				System.out.print("       ");
				for (int l=0;l<m3[0].length;l++){
						System.out.print(m2[i][l]+" ");
									}
				System.out.print("       ");
				for (int m=0;m<m3[0].length;m++){
						System.out.print(m3[i][m]+" ");
									}
				System.out.println();
       
        
        
       
                                           }
    
                        }
					}
