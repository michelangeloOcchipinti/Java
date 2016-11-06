
public class TestLista {
	
	public static void main (String args[]) {
		
		Lista lista=new Lista();
		
		lista.push(3);
		lista.push(1);
		lista.push(5);
		lista.push(9);
		lista.push(4);
		lista.push(2);
		
		lista.printLista();
		
		lista.ordinaLista();
		
		lista.printLista();
		
		lista.popTail();
		
		lista.printLista();
		
		lista.popPila();
		
		lista.printLista();
		
		System.out.println("Il numero cercato si trova nel nodo n: "+lista.cercaNumeroNodoConInfo(2));
		System.out.println("\n");
		
		lista.inserisciNodoDopoPosizione(3, 15);
		
		lista.printLista();
		
		lista.ordinaLista();
		
		lista.printLista();
		
		lista.inserisciNodoPrimaDelNodoCercatoConInfo(15,30);
		
		lista.printLista();
		
		lista.ordinaLista();
		
		lista.printLista();
	}
}

