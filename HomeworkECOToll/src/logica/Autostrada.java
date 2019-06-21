/**
 * 
 */
package logica;

import java.util.*;
import entita.Casello;

/**
 * @author macbookair
 *
 */
public class Autostrada {
	
	private List<Casello> listaCaselli;
	private Integer tariffa;
	
	
	
	public Autostrada(List<Casello> listaCaselli, Integer tariffa) {
		this.listaCaselli = listaCaselli;
		this.tariffa = tariffa;
	}
	
	public Autostrada() {
		this.listaCaselli=new ArrayList<>();
		this.tariffa=0;
	}

	
	
	public List<Casello> getListaCaselli() {
		return listaCaselli;
	}

	
	public void setListaCaselli(List<Casello> listaCaselli) {
		this.listaCaselli = listaCaselli;
	}

	
	public Integer getTariffa() {
		return tariffa;
	}

	
	public void setTariffa(Integer tariffa) {
		this.tariffa = tariffa;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
