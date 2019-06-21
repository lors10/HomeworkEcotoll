/**
 * 
 */
package logica;

import entita.Veicolo;
import entita.Casello;
/**
 * @author macbookair
 *
 */
public class GestioneVeicolo extends Veicolo{
	
	

	
	public GestioneVeicolo(String modello, String marca, String targa, Integer anno, Integer peso, Integer assi,Integer altezza) 
	{
		super(modello, marca, targa, anno, peso, assi, altezza);
		
	}
	
	
	public String getCategoria(Veicolo v) {
		
		String categoria = null;
		
		if(v.assi==2 && v.altezza<=130) { categoria="A"; }
		else if(v.assi==2 && v.altezza>130) {categoria="B";}
		else if(v.assi==3) {categoria="3";}
		else if(v.assi==4) {categoria="4";}
		else if(v.assi>=5) {categoria="5";}
		
		return categoria;
	}
	
	public String getEuro(Veicolo v) {
		
		String euro = null;
		
		if(v.anno >= 1992) { euro="Euro 0";}
		if(v.anno >= 1993) { euro="Euro 1";}
		if(v.anno >= 1997) { euro="Euro 2";}
		if(v.anno >= 2001) { euro="Euro 3";}
		if(v.anno >= 2006) { euro="Euro 4";}
		if(v.anno >= 2011) { euro="Euro 5";}
		if(v.anno >= 2015) { euro="Euro 6";}

		return euro;
	}
	
	public Integer getDistanza(Casello c1,Casello c2) {
		
		Integer distanza=0;
		Integer distanzai=c1.numeroKm;
		Integer distanzaf=c2.numeroKm;
		
		distanza = distanzaf - distanzai;
		
		return distanza;
	}
	

	
	
	
}
