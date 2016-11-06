/*
 Data una matrice quadrata di numeri interi, visualizzare solo gli elementi sopra alla diagonale
principale in modo che la stampa sia triangolare.
 */


public class Triangolo {
	
	public static void main (String args[]) {
		String spazio=" ";
		int indice=0;
		int matrice[][]={{1,3,6,9,5,7,2,4,6,4},
						 {1,3,6,9,5,7,2,4,6,4},
						 {1,3,6,9,5,7,2,4,6,4},
						 {1,3,6,9,5,7,2,4,6,4},
						 {1,3,6,9,5,7,2,4,6,4},
						 {1,3,6,9,5,7,2,4,6,4},
						 {1,3,6,9,5,7,2,4,6,4},
						 {1,3,6,9,5,7,2,4,6,4},
						 {1,3,6,9,5,7,2,4,6,4},
						 {1,3,6,9,5,7,2,4,6,5},	
						};
		for (int i=0;i<matrice.length-1;i++){
			indice+=1;
			System.out.println();
			System.out.print(spazio);
			spazio=spazio+" ";
			for (int j=indice;j<matrice[0].length;j++){
				System.out.print(matrice[i][j]);
														}
											}
		System.out.println();
		
											}
						}

