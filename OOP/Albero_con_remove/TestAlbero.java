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
		Nodo n8=new Nodo(3);
		Nodo n9=new Nodo(4);
		Nodo n10=new Nodo(1);
		Nodo n11=new Nodo(0);
		Nodo n12=new Nodo(240);
		Nodo n13=new Nodo(270);
		Nodo n14=new Nodo(12);
		Nodo n15=new Nodo(18);
		
		albero.inserisci(n1,albero.getRoot());
		albero.inserisci(n2,albero.getRoot());
		albero.inserisci(n3,albero.getRoot());
		albero.inserisci(n4,albero.getRoot());
		albero.inserisci(n5,albero.getRoot());
		albero.inserisci(n6,albero.getRoot());
		albero.inserisci(n7,albero.getRoot());
		albero.inserisci(n8,albero.getRoot());
		albero.inserisci(n9,albero.getRoot());
		albero.inserisci(n10,albero.getRoot());
		albero.inserisci(n11,albero.getRoot());
		albero.inserisci(n12,albero.getRoot());
		albero.inserisci(n13,albero.getRoot());
		albero.inserisci(n14,albero.getRoot());
		albero.inserisci(n15,albero.getRoot());
		
		System.out.println("\n");
		albero.printInOrder(albero.getRoot());
		System.out.println("\n");
		//albero.printInOrder(albero.getRoot());
		System.out.println("\n");
		//System.out.println(albero.contaNodiSinistro(albero.getRoot().getDestro()));
		albero.removeNodo(albero.getRoot(),albero.getRoot(),1);
		System.out.println("\n");
		albero.printInOrder(albero.getRoot());
		albero.removeNodo(albero.getRoot(),albero.getRoot(),8);
		System.out.println("\n");
		albero.printInOrder(albero.getRoot());
		System.out.println("\n");
		//albero.eliminaFoglie(albero.getRoot(), albero.getRoot());
		//albero.printInOrder(albero.getRoot());
		System.out.println("\n");
		//System.out.println(albero.contaNodi(albero.getRoot()));
		System.out.println("\n");
		albero.removeNodo(albero.getRoot(),albero.getRoot(),5);
		System.out.println("\n");
		albero.printInOrder(albero.getRoot());
		
		
		
		
	}
}

