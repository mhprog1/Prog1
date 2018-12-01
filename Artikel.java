
/**
 * Beschreiben Sie hier die Klasse Artikel.
 * 
 * @author Ezgi Senguel & Maike Hochstrasser 
 * @version 29.11.2018
 */
public class Artikel{
    private int artikelnummer; 
    private String artikelbezeichnung;
    private int artikelbestand;
    private double preis;

    /**
     * Konstruktoren
     */
    public Artikel (int artikelnummer, String artikelbezeichnung, double preis, int artikelbestand){
        try{
            if (artikelnummer <1000 || artikelnummer>=10000){
                throw new IllegalArgumentException("Artikelnummer muss vierstellig sein !"); 
            }
            if (artikelbezeichnung == null){
                throw new IllegalArgumentException("Artikelbezeichnung darf nicht 0 sein !"); 
            }
            if (preis < 0){
                throw new IllegalArgumentException ("Preis muss größer als 0 sein!");
            }
            if (artikelbestand <0 ){ 
                throw new IllegalArgumentException("Artikelbestand darf nie kleiner als 0 werden !");
            }
        }catch (Exception e){
            System.out.println(e);
        }

        this.artikelnummer = artikelnummer;
        this.artikelbezeichnung = artikelbezeichnung;
        this.preis = preis;
        this.artikelbestand = artikelbestand; 
    }

    public Artikel (int artikelnummer, String artikelbezeichnung, double preis){
        try{
            if (artikelnummer <1000 || artikelnummer>=10000){
                throw new IllegalArgumentException("Artikelnummer muss vierstellig sein !"); 
            }
            if (artikelbezeichnung == null){
                throw new IllegalArgumentException("Artikelbezeichnung darf nicht 0 sein !"); 
            }
            if (preis < 0){
                throw new IllegalArgumentException ("Preis muss größer als 0 sein!");
            }
        }catch (Exception e){
            System.out.println(e);
        }
        
        this.artikelnummer = artikelnummer;
        this.artikelbezeichnung = artikelbezeichnung;
        this.preis = preis;
    }

    /**
     * Methode zum zubuchen einer Ware 
     */
    public void zugang (int ware) {
        if (ware <0) {
            throw new IllegalArgumentException ("Eingehende Ware darf nicht negativ sein!");
        }

        artikelbestand = artikelbestand + ware;
    }

    /**
     * Methode zum abbuchen einer Ware 
     */  
    public void abgang (int ware) {
        if (artikelbestand - ware < 0)    
            throw new IllegalArgumentException( 
                "Artikelbestand darf nicht unter 0 sein!");
        if (ware < 0) {
            throw new IllegalArgumentException ("Abgehende Ware darf nicht negativ sein!");
        }

        artikelbestand = artikelbestand - ware; 
    }

    /**
     * to-String Methode 
     */  
    public String toString () {
        return "Artikel: " + artikelnummer 
        +" Bezeichnung: " + artikelbezeichnung
        +" Bestand: " + artikelbestand; 
    }

    /**
     * get-Methode für alle Attribute
     */ 
    public int getartikelnummer() {
        return artikelnummer;
    }

    public String getartikelbezeichnung () {
        return artikelbezeichnung;
    }
    
    public double getpreis() {
        return preis;
    }
    
    public int getartikelbestand () {
        return artikelbestand;
    }

    /**
     *set-Methode 
     */
    public void setArtikelnummer (int artikelnr) {
        if (artikelnr < 1000 || artikelnr < 1000)
            throw new IllegalArgumentException (
                "Artikelnummer muss vierstellig sein!"); 

        artikelnummer = artikelnr;
    }

    public void setArtikelbezeichnung (String bezeichnung){
        artikelbezeichnung = bezeichnung;
    }
    
    public void setPreis(double neu) {
        preis = neu;
    }

    public void setArtikelbestand (int bestand) {
        if (bestand < 0 ) 
            throw new IllegalArgumentException (
                "Artikelbestand darf nicht unter 0 sein!");
        
        artikelbestand = bestand;
    }
} 
