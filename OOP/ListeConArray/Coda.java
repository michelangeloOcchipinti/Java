
public class Coda {
	
	private int[] numeri;
	private int posizioneHead;
	private int posizioneCoda;
	
	public Coda(int info){
		
		numeri=new int[info];
		posizioneHead=0;
		posizioneCoda=0;
		
						}
						
	public void push(int info){
		
		if (posizioneHead<numeri.length){
			
			numeri[posizioneHead]=info;
			posizioneHead++;
										}
								}
								
	public int pop(){
		
		int ris=numeri[posizioneCoda];
		int indice=posizioneCoda;
		while(indice<posizioneHead-1){
			numeri[indice]=numeri[indice+1];
			indice++;
									}
									
		numeri[indice]=0;
		if (posizioneHead>0){posizioneHead--;}
		return ris;
					}
					
	public void printCoda(){
		
		for(int i=numeri.length-1;i>=0;i--){
			
			if(numeri[i]!=0)	{System.out.println("| "+numeri[i]+" |");}
								
										}
			System.out.println(" --- ");
							}
}

