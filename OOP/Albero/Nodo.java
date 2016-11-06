/*
 Classe Nodo
 */


public class Nodo {
	
	private int info;
	private Nodo sinistro;
	private Nodo destro;
	
	public Nodo(){
		info=-1;
		sinistro=null;
		destro=null;
				}
	
	public Nodo(int info){
		this.info=info;
		sinistro=null;
		destro=null;
		}
		
	public void setInfo(int info){
		this.info=info;
		}
		
	public void setSinistro(Nodo n){
		sinistro=n;
		}
	
	public void setDestro(Nodo n){
		destro=n;
		}
		
	public int getInfo(){
		return info;
		}
		
	public Nodo getSinistro(){
		return sinistro;
		}
		
	public Nodo getDestro(){
		return destro;
		}	
		
	public void stampa(){
		System.out.println(info);
		}
		
	
	
}

