package pszeudokkod_alapjan;

import java.util.Random;

public class Pszeudokkod_Alapjan {

    public static void main(String[] args) {        
        int[] lista = tomb(15);
        kiir(lista);
        int[] rendezett = buborekRendezes(lista);
        
        kiir(rendezett);
        
        

    }

    private static int[] buborekRendezes(int[] lista) {
        int temptation = 0;
        
        for (int i = lista.length; i >= 1; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (lista[j] > lista[j + 1]) {
                    temptation = lista[j];
                    lista[j] = lista[j + 1];
                    lista[j + 1] = temptation;
                }
            }

        }
        return lista;
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
