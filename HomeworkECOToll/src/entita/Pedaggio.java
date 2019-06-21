/**
 * 
 */
package entita;

/**
 * @author macbookair
 *
 */
public class Pedaggio {
	
	public Integer tariffa;
	public String classeVeicolo;
	
	
	public Pedaggio(Integer tariffa, String classeVeicolo) {
		this.tariffa = tariffa;
		this.classeVeicolo = classeVeicolo;
	}
	
	
	public Integer getTariffa() {
		return tariffa;
	}
	
	
	public void setTariffa(Integer tariffa) {
		this.tariffa = tariffa;
	}
	
	
	public String getClasseVeicolo() {
		return classeVeicolo;
	}
	
	
	public void setClasseVeicolo(String classeVeicolo) {
		this.classeVeicolo = classeVeicolo;
	}
	
	

}
