
public class Pila {
	
	private int[] numeri;
	private int posizione;
	
	public Pila(int info){
		
		numeri=new int[info];
		posizione=0;
		
						}
						
	public void push(int info){
		
		if(posizione<numeri.length && numeri[posizione]==0){
			numeri[posizione]=info;
			posizione++;
									}
								}
								
	public int pop(){
		int ris=0;
		if(posizione>0){
		ris=numeri[posizione-1];
		numeri[posizione-1]=0;
		posizione--;
						}
		return ris;
					}
					
	public void printPila(){
		
		for(int i=0;i<numeri.length;i++){
			if (numeri[i]!=0) {
				System.out.println("| "+numeri[i]+" |");
								}
										}
			System.out.println(" --- ");
							}
}

