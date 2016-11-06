/**
 * Classe Materia che definisce le materie facenti parte dei percorsi.
 * 
 * @author Michelangelo Occhipinti
 * 
 * @version 1.0
 * 
 * @since 28/03/2016
 */
public class Materia {
	
	private String nome;
	private String asse;
	private int durata;
	private Modulo[] modulo;
	
	/**
	 * Costruttore della classe Materia con parametri.
	 * 
	 * @param nome Nome della materia.
	 * @param asse Asse di cui fa parte la materia.
	 * @param durata Durata in ore del corso della materia
	 * @param modulo Array che definisce i moduli della materia.
	*/	
	public Materia(String nome, String asse, int durata, Modulo[] modulo){
		
		this.nome=nome;
		this.asse=asse;
		this.durata=durata;
		this.modulo=modulo;
																			}
}

