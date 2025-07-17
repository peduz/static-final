
import provamain.ProvaMain;
import provamain.SoloStatic;
import provastatic.Prova;
import utils.Utility;



public class App {


    public static void main(String[] args) throws Exception {
        
        Prova p1 = new Prova();
        p1.setDescrizione("descrizioneProva");
        p1.setNome("nomeProva");
        // p1.setScopo("scopoProva");
        Prova.setScopo("scopoProva");

        System.out.println(p1);

        Prova p2 = new Prova();
        p2.setDescrizione("descrizioneProva2");
        p2.setNome("nomeProva2");
        // p2.setScopo("scopoProva2");
        Prova.setScopo("scopoProva2");

        System.out.println(p2);
        System.out.println(p1);

        ProvaMain pM = new ProvaMain();
        
        System.out.println(p2);
        System.out.println(p1);

        SoloStatic s1 = new SoloStatic();
        
        System.out.println(p2);
        System.out.println(p1);

        Utility.increment();
        Utility.leggiConteggio();
    }
}
