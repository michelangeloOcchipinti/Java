/*
 Classe MacchinaParcheggiata
 */


public class MacchinaParcheggiata {
	
	private String marchio;
	private String modello;
	private String colore;
	private String targa;
	private int minutiTrascorsi;
	
	public MacchinaParcheggiata(String marchio, String modello, String colore, String targa, int minutiTrascorsi){
					
					this.marchio=marchio;
					this.modello=modello;
					this.colore=colore;
					this.targa=targa;
					this.minutiTrascorsi=minutiTrascorsi;
																													}
																													
	
	public String toString(){
		return marchio+" "+modello+" "+colore+" "+targa;
							}
																													
	public String getMarchio(){
		return marchio;
								}
								
	public String getModello(){
		return modello;
								}
								
	public String getColore(){
		return colore;
							}
							
	public String getTarga(){
		return targa;
							}
							
	public int getMinutiTrascorsi(){
		return minutiTrascorsi;
									}
}

