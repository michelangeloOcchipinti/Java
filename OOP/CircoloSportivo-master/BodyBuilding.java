/**
 * Sottoclasse della classe Disciplina che gestisce la disciplina Body Building.
 * 
 * @author Michelangelo Occhipinti
 * 
 * @version 1.0
 * 
 * @since 31/03/2016
 */

public class BodyBuilding extends Disciplina {
	
		private String peso;
		
		/**
		 * Metodo costruttore con parametri.
		 * 
		 * @param peso Il peso del socio.
		 * @param mensile La quota mensile per la disciplina
		 * @param annuale La quota annuale per la disciplina
		 */
		public BodyBuilding(String peso, float mensile, float annuale){
			
			
			super(mensile, annuale);
			this.peso=peso;
																		}
										
}

