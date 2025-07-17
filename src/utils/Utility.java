package utils;

public class Utility {

    static int conteggio = 0;

    private Utility() {

    }

    /*
     * Metodi di utilità
     */
    public static void increment() {
        conteggio++;
    }

    public static void leggiConteggio() {
        System.out.println(conteggio);
    }
}
