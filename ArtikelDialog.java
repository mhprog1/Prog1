import java.util.Scanner;
/**
 * Testklasse zum Testen der Klasse Artikel
 * 
 * @author (Ezgi Senguel, Maike Hochstrasser) 
 * @version (11.11.2018)
 */

public class  ArtikelDialog{
    private static final int ANLEGEN    = 1;
    private static final int ABGANG     = 2; 
    private static final int ZUGANG     = 3; 
    private static final int ENDE       = 0; 

    private Artikel artikel1;
    private Scanner input = new Scanner (System.in);
    public ArtikelDialog () {

    }

    /**
     * Hauptschleife des Testprogramms
     */
    public void start () {
        artikel1 = null; 
        int funktion = -1; 

        while (funktion != ENDE) {
            try{
                funktion = einlesenFunktion();
                ausfuehrenFunktion(funktion);
            } catch (Exception e){
                System.out.println(e);
            }
            if(artikel1 == null || artikel1.getartikelnummer() == 0 && artikel1.getartikelbezeichnung() == null && artikel1.getartikelbestand() == 0){

            }else{
                System.out.println("Artikelnummer: " + artikel1.getartikelnummer() + ", Artikelbezeichnung: " + artikel1.getartikelbezeichnung() 
                    + ", Artikelbestand: " + artikel1.getartikelbestand());
            }
        }
    }

    /**
     * Main-Methode zum Erzeugen des ArtikelDialog-
     * Objektes und zum Anstarten der Testschleife 
     */
    public static void main (String[] args) {
        new ArtikelDialog().start(); 
    }

    private int einlesenFunktion() {
        System.out.print (ANLEGEN + ": anlegen; "+
            ABGANG + ": abbuchen; "+
            ZUGANG + ": zubuchen; "+ 
            ENDE   + ": beenden -> "); 
        return input.nextInt();
    }

    private void ausfuehrenFunktion(int funktion){
        int artikelnummer;
        String artikelbezeichnung;
        int artikelbestand;

        if (funktion == ANLEGEN){ 
            System.out.println ("Artikelnummer: ");
            artikelnummer = input.nextInt();
            System.out.println ("Artikelbezeichnung: ");
            artikelbezeichnung = input.next();
            System.out.println ("Artikelbestand: ");
            artikelbestand = input.nextInt();
            artikel1 = new Artikel (artikelnummer, artikelbezeichnung, artikelbestand);
        } else if (funktion == ABGANG) { 
            if(artikel1 == null || artikel1.getartikelnummer() == 0 && artikel1.getartikelbezeichnung() == null && artikel1.getartikelbestand() == 0){
                System.out.println ("Erst Artikel anlegen!");
            }
            else {
                System.out.println ("Abgehende Ware: ");
                artikel1.abgang(input.nextInt());
            }   
        } else if (funktion == ZUGANG) {
            if(artikel1 == null || artikel1.getartikelnummer() == 0 && artikel1.getartikelbezeichnung() == null && artikel1.getartikelbestand() == 0){
                System.out.println ("Erst Artikel anlegen!");
            }
            else {
                System.out.println ("Eingehende Ware: ");
                artikel1.zugang(input.nextInt());
            }
        } else if (funktion == ENDE) {
            System.out.println ("Programmende");
        } else {
            System.out.println ("Falsche Funktion!");
        } 
    }
}