
public class Nodo {
	
	private int info;
	private Nodo next;
	
	public Nodo(){
		info=0;
		next=null;
				}
				
	public Nodo(int info){
		this.info=info;
		next=null;
						}
						
	public Nodo(int info, Nodo next){
		this.info=info;
		this.next=next;
									}
									
	public Nodo(Nodo next){
		info=0;
		this.next=next;
							}
							
	public void setNext(Nodo next){
		this.next=next;
									}
									
	public Nodo getNext(){
		return next;
						}
						
	public void setInfo(int info){
		this.info=info;
									}
									
	public int getInfo(){
		return info;
						}
}

