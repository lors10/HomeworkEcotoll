/**
 * 
 */
package interfaces;

import logica.GestioneVeicolo;
import entita.Veicolo;
import entita.Casello;

/**
 * @author macbookair
 *
 */
public interface VeicoloInterface{

	public String getCategoria(Veicolo v);
	public String getEuro(Veicolo v);
	public Integer getDistanza(Casello c1, Casello c2);
}
