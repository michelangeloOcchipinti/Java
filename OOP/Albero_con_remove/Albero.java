/*
 Classe Albero
 */


public class Albero {
	
	private Nodo root;
	
	public Albero(){
		root=null;
		}
		
	public Albero(Nodo n){
		root=n;
		}
		
	public Nodo getRoot(){
		return root;
		}
		
	public void inserisci(Nodo nuovo, Nodo r){
		if (root==null) root=nuovo;
		else if (nuovo.getInfo()<=r.getInfo()){
			if (nuovo.getInfo()==r.getInfo()) return;
			else if (r.getSinistro()==null) r.setSinistro(nuovo);
			else inserisci(nuovo, r.getSinistro());
			}
		else{
			if (r.getDestro()==null) r.setDestro(nuovo);
			else inserisci(nuovo, r.getDestro());
			} 
		}
		
	public void printInOrder(Nodo n){
		if (n!=null) {
			printInOrder(n.getSinistro());
			n.stampa();
			printInOrder(n.getDestro());
			}
		}
			
	
		
	public int contaNodiSinistro(Nodo r){
		int ris=0;
		if (r!=null){
			ris=contaNodiSinistro(r.getSinistro())+contaNodiSinistro(r.getDestro())+1;
			}
		return ris;
		}
		
	public void removeNodo(Nodo parent, Nodo r, int info){
		
		if (r!=null){
			
			if (info==r.getInfo()){
				
				if(r.getSinistro()==null && r.getDestro()==null) {
					
					if(r.getInfo()<parent.getInfo()) parent.setSinistro(null);
					else parent.setDestro(null);
					
					}
				else if (r.getSinistro()==null){
					
					if (r.getInfo()<parent.getInfo()) parent.setSinistro(r.getDestro());
					else parent.setDestro(r.getDestro()); 
					
					}
				
				else if (r.getDestro()==null){
					
					if (r.getInfo()<parent.getInfo()) parent.setSinistro(r.getSinistro());
					else parent.setDestro(r.getSinistro());
					
					
					}
					
				else{
					
					if (r.getInfo()<parent.getInfo()) {
						
						parent.setSinistro(r.getSinistro());
						inserisci(r.getDestro(),root);
						}
					else {
						parent.setDestro(r.getDestro());
						inserisci(r.getSinistro(),root);
						}
					
					}
				
				
				}
			else  if (info>r.getInfo())	removeNodo(parent=r, r.getDestro(), info);
				
			else if (info<r.getInfo())	removeNodo(parent=r, r.getSinistro(), info); 
				
			
			
			}
		
		}
		
		public void eliminaFoglie(Nodo parent, Nodo r){
			if (r!=null){
				if (r.getDestro()==null && r.getSinistro()==null) {
					
					if (r.getInfo()<parent.getInfo()) parent.setSinistro(null);
					
					else parent.setDestro(null);
					
					}
				else {
					
					eliminaFoglie(parent=r, r.getSinistro());
					eliminaFoglie(parent=r, r.getDestro());
						
						}
				
				}
			
			}
			
		public int contaNodi(Nodo r){
			int ris=0;
			if (r!=null){
				ris=1+contaNodi(r.getSinistro())+contaNodi(r.getDestro());
				}
			return ris;
			}
			
	

}
