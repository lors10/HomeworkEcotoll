/**
 * 
 */
package entita;

/**
 * @author macbookair
 *
 */
public class Casello {
	
	
	public String nome;
	public String posizione;
	public Integer numeroKm;
	public Integer codice;
	
	public Casello(String nome, String posizione, Integer numeroKm,Integer codice) {
		
		this.nome=nome;
		this.posizione=posizione;
		this.numeroKm=numeroKm;
		this.codice=codice;
	}

	
	public String getNome() {
		return nome;
	}

	
	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public String getPosizione() {
		return posizione;
	}

	
	public void setPosizione(String posizione) {
		this.posizione = posizione;
	}

	
	public Integer getNumeroKm() {
		return numeroKm;
	}

	
	public void setNumeroKm(Integer numeroKm) {
		this.numeroKm = numeroKm;
	}


	public Integer getCodice() {
		return codice;
	}


	public void setCodice(Integer codice) {
		this.codice = codice;
	}
	
	
	
}
