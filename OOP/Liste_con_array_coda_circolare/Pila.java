
public class Pila {
	
	private int posizione;
	private int numeri[];
	
	public Pila(int nodi){
		
		posizione=0;
		numeri=new int[nodi];
						}
						
	public void push(int info){
		
		if(posizione<numeri.length){
			numeri[posizione]=info;
			posizione++;
									}
		else{System.out.println("La pila e' piena!");}
						}
						
	public int pop(){
		int ris=0;
		if(posizione>0){
		ris=numeri[posizione-1];
		numeri[posizione-1]=0;
		if (posizione>0){posizione--;}
		
						}
		return ris;
					
					}
					
	public void printPila(){
		
		for (int i=0;i<numeri.length;i++){
			if(numeri[i]!=0){System.out.println("| "+numeri[i]+" |");}
										}
		System.out.println(" --- ");
							}
	
}

