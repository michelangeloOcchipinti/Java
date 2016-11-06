/**
 * Classe che crea un nodo con un esame da superare da parte dello studente da assegnare ad una lista.
 * 
 * @author Michelangelo Occhipinti
 * 
 * @version 1.0
 * 
 * @since 28/03/2016
 */


public class Nodo {
	
	private String modulo;
	private String materia;
	private boolean superato;
	private String voto;
	
	/**
	 * Costruttore della classe Nodo con parametri.
	 * 
	 * @param modulo Il modulo della materia a cui si fa riferimento.
	 * @param materia Materia di cui fa parte il modulo.
	 * @param superato parametro che definisce se l'esame è stato superato o meno.
	 * @param voto il voto con il quale è stato superato l'esame.
	*/
	public Nodo(String modulo, String materia, boolean superato, String voto){
		
		this.modulo=modulo;
		this.materia=materia;
		this.superato=superato;
		this.voto=voto;
																			}
					}

