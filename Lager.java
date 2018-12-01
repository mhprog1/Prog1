import java.util.Scanner;
/**
 * Write a description of class Lager here.
 *
 * Ezgi Senguel, Maike Hochstrasser
 * 28.11.2018
 */
public class Lager
{
   
   int artikelbestand;
   int ware;
   public void start() {
   }
   
    /**
    * Array
    */
   public class eArray {
   int [] Artikel = {};
   /**
   * Methode zum zubuchen einer Ware 
   * @param zubuchen
   */
   public void zugang (int ware) {
       artikelbestand = artikelbestand + ware;
   }
    
   /**
    * Methode zum Abbuchen einer Ware 
    * @param abbuchen
    */
   public void abbuchen (int ware) {
       artikelbestand = artikelbestand - ware;
   }
   }
   
   public static void main (String[] args){
           int [] Artikel = {};
        
       }
     
   
   
}
