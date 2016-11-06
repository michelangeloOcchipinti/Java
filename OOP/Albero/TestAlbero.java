public class TestAlbero {
	
	public static void main (String args[]) {
		Nodo n=new Nodo(5);
		Albero albero=new Albero(n);
		albero.printInOrder(albero.getRoot());
		Nodo n1=new Nodo(2);
		Nodo n2=new Nodo(8);
		Nodo n3=new Nodo(20);
		Nodo n4=new Nodo(16);
		Nodo n5=new Nodo(256);
		Nodo n6=new Nodo(6);
		Nodo n7=new Nodo(8);
		albero.inserisci(n1,albero.getRoot());
		albero.inserisci(n2,albero.getRoot());
		albero.inserisci(n3,albero.getRoot());
		albero.inserisci(n4,albero.getRoot());
		albero.inserisci(n5,albero.getRoot());
		albero.inserisci(n6,albero.getRoot());
		albero.inserisci(n7,albero.getRoot());
		System.out.println("\n");
		albero.printInOrder(albero.getRoot());
		
		
	}
}

