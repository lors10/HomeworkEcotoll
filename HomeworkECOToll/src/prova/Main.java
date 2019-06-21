/**
 * 
 */
package prova;

import entita.Veicolo;

import java.util.ArrayList;
import java.util.List;

import entita.Casello;
import logica.Autostrada;
import logica.GestioneVeicolo;

/**
 * @author macbookair
 *
 */
public class Main {
	
	public static void main(String[] args) {
		
		String categoria;
		String euro;
		Integer distanzav;
		
		// veicolo di prova 1
		Veicolo v1 = new Veicolo("PANDA4x4","FIAT","AB234MB",2015,120,2,130);
		categoria = new GestioneVeicolo("PANDA4x4","FIAT","AB234MB",2015,120,2,130).getCategoria(v1);
		euro = new GestioneVeicolo("PANDA4x4","FIAT","AB234MB",2015,120,2,130).getEuro(v1);
		
		
		System.out.println("Il veicolo: "+v1.modello+" "+v1.marca+" "+v1.targa+" "+v1.anno+" "+v1.peso+" "+v1.assi+" "+v1.altezza+" appartiene alla categoria: "+categoria+" classificazione: "+euro);
		
		// veicolo di prova 2
		Veicolo v2 = new Veicolo("RENEGADE","JEEP","XT123AB",2014,250,2,150);
		categoria = new GestioneVeicolo("RENEGADE","JEEP","XT123AB",2014,250,2,150).getCategoria(v2);
		euro = new GestioneVeicolo("RENEGADE","JEEP","XT123AB",2014,250,2,150).getEuro(v2);
		System.out.println("Il veicolo: "+v2.modello+" "+v2.marca+" "+v2.targa+" "+v2.anno+" "+v2.peso+" "+v2.assi+" "+v2.altezza+" appartiene alla categoria: "+categoria+" classificazione: "+euro);
		
		// veicolo di prova 3
		Veicolo v3 = new Veicolo("EVOQUE","RANGE ROVER","BD456EF",2012,250,2,160);
		categoria = new GestioneVeicolo("EVOQUE","RANGE ROVER","BD456EF",2012,250,2,160).getCategoria(v3);
		euro = new GestioneVeicolo("EVOQUE","RANGE ROVER","BD456EF",2012,250,2,160).getEuro(v3);
		System.out.println("Il veicolo: "+v3.modello+" "+v3.marca+" "+v3.targa+" "+v3.anno+" "+v3.peso+" "+v3.assi+" "+v3.altezza+" appartiene alla categoria: "+categoria+" classificazione: "+euro);
		
		
		// casello 1
		Casello c1 = new Casello("AQ","Ovest",300,0);
		System.out.println(c1.nome+" "+c1.posizione+" "+c1.numeroKm+" "+c1.codice);
		
		// casello 2
		Casello c2 = new Casello("AQ","Ovest",305,1);
		System.out.println(c2.nome+" "+c2.posizione+" "+c2.numeroKm+" "+c2.codice);
		
		// distanza del veicolo v1 percorsa fino ad ora (passandogli la targa)
		distanzav= new GestioneVeicolo("PANDA4x4","FIAT","AB234MB",2015,120,2,130).getDistanza(c1, c2);
		System.out.println("Il veicolo: "+v1.targa+" ha percorso: "+distanzav+" km");
		
		//autostrada di prova
		Autostrada A24 = new Autostrada(null,1);
		List<Casello> caselli = new ArrayList<>();
		caselli.add(c1);
		caselli.add(c2);
		A24.setListaCaselli(caselli);
		
	}

}
