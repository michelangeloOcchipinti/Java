/**
 * Sottoclasse della classe Disciplina che gestisce la disciplina Nuoto.
 * 
 * @author Michelangelo Occhipinti
 * 
 * @version 1.0
 * 
 * @since 31/03/2016
 */

public class Nuoto extends Disciplina {
	
		private String codiceCorso;
		public int corsia;
		
		/**
		 * Metodo costruttore con parametri.
		 * 
		 * @param corsia Numero di corsie della piscina.
		 * @param mensile La quota mensile per la disciplina
		 * @param annuale La quota annuale per la disciplina
		 * @param codiceCorso Il codice del corso
		 */
		public Nuoto(String codiceCorso, int corsia, float annuale, float mensile){
			
			
			super(mensile, annuale);
			this.corsia=corsia;
			this.codiceCorso=codiceCorso;
																		}
										
}

