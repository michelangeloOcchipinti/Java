/**
 * Sottoclasse della classe Disciplina che gestisce la disciplina Aerobica.
 * 
 * @author Michelangelo Occhipinti
 * 
 * @version 1.0
 * 
 * @since 31/03/2016
 */

public class Aerobica extends Disciplina {
	
		private String codiceCorso;
		
		/**
		 * Metodo costruttore con parametri.
		 * 
		 * @param codiceCorso Il codice del corso.
		 * @param mensile La quota mensile per la disciplina
		 * @param annuale La quota annuale per la disciplina
		 */
		public Aerobica(String codiceCorso, float annuale, float mensile){
			
			
			super(mensile, annuale);
			this.codiceCorso=codiceCorso;
																		}
										
}

