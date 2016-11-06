public class Nodo{

	private String info;
	private Nodo next;
	
	public Nodo(){
		 info=null;
		 next=null;
				}
				
	public Nodo(String info){
		 this.info=info;
		 next=null;
							}
				
	public Nodo(Nodo next){
		 info=null;
		 this.next=next;
							}
							
	public Nodo (Nodo next, String info){
		this.next=next;
		this.info=info;
										}
										
	public void setNext(Nodo next){
		this.next=next;
									}
									
	public void setInfo(String info){
		this.info=info;
									}
									
	public Nodo getNext(){
		return next;
						}
						
	public String getInfo(){
		return info;
							}
				
				}
