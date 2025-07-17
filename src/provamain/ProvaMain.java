package provamain;

import provastatic.Prova;
import utils.Utility;

public class ProvaMain {

    public ProvaMain() {
        Utility.increment();
        Prova p3Main = new Prova();
        p3Main.setDescrizione("descrizioneMain");
        p3Main.setNome("nome");
        // p3Main.setScopo("scopoMain");
        Prova.setScopo("scopoMain");

        System.out.println(p3Main);
    }
}
