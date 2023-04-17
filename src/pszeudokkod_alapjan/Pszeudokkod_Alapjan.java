
package pszeudokkod_alapjan;

import java.util.Random;

public class Pszeudokkod_Alapjan {

    public static void main(String[] args) {
        //Buborékrendezés
        //int[] lista = {2,4,6,6};
        int[] lista = tomb(15);
        buborekRendezes(lista);
        kiir(lista);
        
    }

    private static void buborekRendezes(int[] lista) {
        
    }

    private static int[] tomb(int db) {
        int[] tomb = new int[db];
        Random rnd = new Random();
        
        for (int i = 0; i < db; i++) {
            int szam = rnd.nextInt(0, 100);
            tomb[i] = szam;
            
        }
        
        return tomb;
        
    }

    private static void kiir(int[] lista) {
        int i = 0;
        while (i < lista.length - 1) {            
            System.out.print(lista[i] + ", ");
            i++;            
        }
        System.out.println(lista[i]);
    }
    
}
