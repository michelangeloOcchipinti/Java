public class Pila{
	
	private Nodo top;
	
	public Pila(Nodo top){
		this.top=top;
						}
						
	public Pila(){
		top=null;
				}
				
	public void push(String info){
		Nodo n=new Nodo(info, top);
		top=n;
								}
						
	public Nodo pop(){
		Nodo oldTop=top;
		top=top.getNext();
		return oldTop;
					}
					
	public Nodo getTop(){
		return top;
						}
						
	public void size(){
		int indice=0;
		Nodo inizio=top;
		while (inizio.getNext()!=null){
			inizio=inizio.getNext();
			indice++;
							}
	
		System.out.println("Il numero di elementi nella pila e' uguale a: "+indice);
							
						}
						
	public void printPila(){
		Nodo inizio=top;
		System.out.print("La pila e' uguale a: ");
		while (inizio!=null){
			System.out.print(inizio+" ");
			inizio=inizio.getNext();
							}
							}
							
	public void isPari(){
		int diff=0;
		Nodo inizio=top;
		while (inizio!=null && diff>=0){
				if (inizio.getInfo().equals("(")){
					diff++;
												}
				else{
					diff--;
					}
				inizio=inizio.getNext();
										}
						
								
		if (diff<0 || diff>0){
			System.out.println("Le parentesi non corrispondono!");
							}
		else{
			System.out.println("Il numero di parentesi corrisponde");
		
			
			}
						}
	
					
	
				}
