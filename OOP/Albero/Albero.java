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
}

