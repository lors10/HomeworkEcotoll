/**
 * 
 */
package entita;

/**
 * @author macbookair
 *
 */
public class Veicolo {
	
	public String modello;
    public String marca;
    public String targa;
    public Integer anno;
    public Integer peso;
    public Integer assi;
    public Integer altezza;
    
    
    // costruttore
    public Veicolo(String modello, String marca, String targa, Integer anno, Integer peso, Integer assi, Integer altezza) {
        
        this.modello = modello;
        this.marca = marca;
        this.targa = targa;
        this.anno = anno;
        this.peso = peso;
        this.assi = assi;
        this.altezza = altezza;
    }
    
    
    // metodi get e metodi set
    
    public String getModello() {
        
        return modello;
    }
    
    public void setModello(String modello) {
        
        this.modello = modello;
    }
    
    public String getMarca() {
        
        return marca;
    }
    
    public void setMarca(String marca) {
        
        this.marca = marca;
    }
    
    public String getTarga() {
        
        return targa;
    }
    
    public void setTarga(String targa) {
        
        this.targa = targa;
    }
    
    public Integer getAnno() {
        
        return anno;
    }
    
    public void setAnno(Integer anno) {
        
        this.anno = anno;
    }
    
    public Integer getPeso() {
        
        return peso;
    }
    
    public void setPeso(Integer peso) {
        
        this.peso = peso;
    }
    
    public Integer getAssi() {
        
        return assi;
    }
    
    public void setAssi(Integer assi) {
        
        this.assi = assi;
    }
    
    public Integer getAltezza() {
        
        return altezza;
    }
    
    public void setAltezza(Integer altezza) {
        
        this.altezza = altezza;
    }
    
}
