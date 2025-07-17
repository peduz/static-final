package calcoliHelper;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class UsaCalcoliHelper {

    public static void main(String[] args) {
        int somma = CalcoliHelper.somma(5, 10);

        double prodotto = CalcoliHelper.moltiplicazione(5.5, 10.10);

        System.out.println("Somma " + somma + ", prodotto " + prodotto);

        double divisione = CalcoliHelper.divisione(0.21, 3.32);
        System.out.println("Divisione " + divisione);

        BigDecimal dividendo = new BigDecimal("1.21");
        BigDecimal dividendo1 = new BigDecimal("1.21");
        BigDecimal divisore = new BigDecimal("3.32");

        System.out.println(dividendo.add(divisore));
        System.out.println("Divisione: " + dividendo.divide(divisore, 4, RoundingMode.HALF_UP));

        System.out.println(dividendo.equals(dividendo1));
        System.out.println(dividendo.compareTo(dividendo1));
        

        
    }
}
            