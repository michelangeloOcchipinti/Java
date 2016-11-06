public class Nodo{

	private String info;
	private Nodo next;
	
	public String toString(){
		return info ;
							}

	public Nodo(String info, Nodo next){
		this.info=info;
		this.next=next;
										}
										
	public Nodo(String info){
		this.info=info;
		next=null;
							}
							
	public Nodo(Nodo next){
		this.next=next;
		info=null;
							}
							
	public Nodo(){
		next=null;
		info=null;
				}
				
	public String getInfo(){
		return info;
							}
							
	public Nodo getNext(){
		return next;
							}
							
	public void setInfo(String info){
		this.info=info;
							}
							
	public void setNext(Nodo next){
		this.next=next;
							}
				}
