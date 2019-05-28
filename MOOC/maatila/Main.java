package maatila;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        // Testaa täällä ohjelmaasi
        Maatila maatila = new Maatila("Esko", new Navetta(new Maitosailio()));
        maatila.lisaaLehma(new Lehma());
        maatila.lisaaLehma(new Lehma());
        maatila.lisaaLehma(new Lehma());
        System.out.println(maatila);
    }
}
