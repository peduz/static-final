package calcoliHelper;

public final class CalcoliHelper {

    private final String NOME_CLASSE = "CalcoliHelper";

    public static final double PI = 3.14;

    public static final int somma(int a, int b) {
        return a + b;
    }

    public static final double somma(double a, double b) {
        return a + b;
    }

    public static int differenza(int a, int b) {
        return a - b;
    }

    public static double differenza(double a, double b) {
        return a - b;
    }

    public static long moltiplicazione(int a, int b) {
        return a * b;
    }

    public static double moltiplicazione(double a, double b) {
        return a * b;
    }

    public static int valoreAssoluto(int a) {
        if(a < 0) {
            return - a;
        } else {
            return a;
        }
    }

    public static double valoreAssoluto(double a) {
        if(a < 0) {
            return - a;
        } else {
            return a;
        }
    }

     public static int minimo(int a, int b) {
        if(a > b) {
            return b;
        } else if(a < b) {
            return a;
        } else {
            System.out.println("I due numeri sono uguali");
            return a;
        }
     }

     public static double minimo(double a, double b) {
        if(a > b) {
            return b;
        } else if(a < b) {
            return a;
        }else {
            System.out.println("I due numeri sono uguali");
            return a;
        }
     }

    public static int massimo(int a, int b) {
        if(a > b) {
            return a;
        } else if(a < b) {
            return b;
        } else {
            System.out.println("I due numeri sono uguali");
            return a;
        }
    }

    public static double massimo(double a, double b) {
        if(a > b) {
            return a;
        } else if(a < b) {
            return b;
        } else {
            System.out.println("I due numeri sono uguali");
            return b;
        }
    }
    
    public static double divisione(double a, double b) {
        if(b == 0) {
            System.out.println("Impossibile dividere per zero");
            return 0;
        }
        return a / b;
    }
}
