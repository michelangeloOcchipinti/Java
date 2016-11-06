public class Coda{
	
	private int posizioneHead;
	private int posizioneCoda;
	private int[] numeri;
	
	public Coda(int nodi){
		
		posizioneHead=0;
		posizioneCoda=0;
		numeri=new int[nodi];
						}
						
	public void push(int info){
		if(numeri[posizioneHead]==0){
		numeri [posizioneHead]=info;
		if (posizioneHead<numeri.length-1){posizioneHead++;}
		else {posizioneHead=0;}
									}
									
		else{System.out.println("Le celle sono tutte occupate!");}
		
						}
						
	public int pop(){
		int ris=numeri[posizioneCoda];
		numeri[posizioneCoda]=0;
		if (posizioneCoda<numeri.length-1){posizioneCoda++;}
		else {posizioneCoda=0;}
		return ris;
					}
					
	public void printCoda(){
		
				System.out.println("\n");
				int i=0;
				System.out.print("   ");
				while(i<numeri.length/2-1){
					if (numeri[i]<10){System.out.print("0");}
					System.out.print(numeri[i]+" ");
					i++;
										}
				System.out.println();
				if (numeri[i]<10){
					System.out.println("   0"+numeri[numeri.length-1]+"    0"+numeri[i]);
								}
				else{System.out.println("   "+numeri[numeri.length-1]+"    "+numeri[i]);}						
				i=numeri.length-2;
				System.out.print("   ");
				while(i>=numeri.length/2){
					if (numeri[i]<10){System.out.print("0");}
					System.out.print(numeri[i]+" ");
					i--;
											}
				System.out.println("\n");
				
				
				
				
							
										
							}
	
				}
