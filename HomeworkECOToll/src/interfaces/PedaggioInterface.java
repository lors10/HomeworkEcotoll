/**
 * 
 */
package interfaces;

import entita.Veicolo;
import logica.GestionePedaggio;
import logica.GestioneVeicolo;

/**
 * @author macbookair
 *
 */
public interface PedaggioInterface {
	
	public Integer setArrotondamento(Integer tariffa);
	public String getTariffaunitaria(GestioneVeicolo gv, Veicolo v);

}
