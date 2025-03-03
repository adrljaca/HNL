package HNL;

import java.util.ArrayList;
import java.util.List;

public class Liga {
    List<Klub> klubovi = new ArrayList<>();
    List<Utakmica> utakmice = new ArrayList<>();

    public void addKlub(Klub klub) {
        klubovi.add(klub);
    }

    public void addUtakmica(Utakmica utakmica) {
        utakmice.add(utakmica);
    }

    public void ispisAktivnih() {
        System.out.println("Aktivni klubovi: ");
        for (Klub k : klubovi) {
            System.out.println(k.getKlub());
        }
    }

    public void ispisUtakmica() {
        System.out.println("Utakmice: ");
        for (Utakmica u : utakmice) {
            System.out.println(u.getUtakmicaInfo());
        }
    }
}