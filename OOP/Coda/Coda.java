public class Coda {
	
	private Nodo head;
	private Nodo end;
	
	public Coda(){
		head=null;
		end=null;
				}
				
	public void setHead(Nodo head){
		this.head=head;
							}
							
	public Nodo getHead(){
		return head;
						}
						
	public void setEnd(Nodo end){
		this.end=end;
								}
								
	public Nodo getEnd(){
		return end;
						}
						
	public void push(String info){
		Nodo n=new Nodo(info);
		n.setNext(head);
		head=n;
		if (head.getNext()==null){
			end=n;
								}
		
								}
								
	public int size(){
		Nodo inizio=head;
		int indice=1;
		while(inizio.getNext()!=null){
			indice++;
			inizio=inizio.getNext();
									}							
		return indice;
					}
								
	public void pop(){
		Nodo inizio=head;
		while (inizio.getNext()!=null){
			if (inizio.getNext().getNext()==null){
				inizio.setNext(null);
				end=null;
				end=inizio;
												}
			
			if (!inizio.equals(end)){
			inizio=inizio.getNext();	}	
			
												}
		
		
					}
					
	public void printCoda(){
		Nodo inizio=head;
		while (inizio!=null){
			System.out.print(inizio.getInfo()+" ");
			inizio=inizio.getNext();
										}
							}
				
	
					}
