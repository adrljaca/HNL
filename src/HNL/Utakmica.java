package HNL;

import java.util.ArrayList;
import java.util.List;

public class Utakmica {
    private static int idBrojac = 1;
    private int id;
    private Klub domacin;
    private Klub gost;
    private int rezDomacin;
    private int rezGost;
    List<Igrac> strijelacDomacin = new ArrayList<>();
    List<Igrac> strijelacGost = new ArrayList<>();

    public Utakmica(Klub domacin, Klub gost) {
        this.id = idBrojac++;
        this.domacin = domacin;
        this.gost = gost;
    }

    public void setRez(int rezDomacin, int rezGost) {
        if (strijelacDomacin.isEmpty() || strijelacGost.isEmpty()) {
            System.out.println("Ne možete unijeti rezultat bez strijelca!");
        } else {
            this.rezDomacin = rezDomacin;
            this.rezGost = rezGost;
        }
    }

    public void addStrijelacDomacin(Igrac igrac) {
        strijelacDomacin.add(igrac);
    }

    public void addStrijelacGost(Igrac igrac) {
        strijelacGost.add(igrac);
    }

    public String getUtakmicaInfo() {
        StringBuilder utakmicaInfo = new StringBuilder();
        utakmicaInfo.append(id + ".\t").append(domacin.getNaziv()).append(" vs. ").append(gost.getNaziv()).append(" | ")
                .append(rezDomacin).append(" : ").append(rezGost).append("\n");
        utakmicaInfo.append("Trener domaćih: ").append(domacin.trener.getImePrezime()).append(", Godine iskustva: ")
                .append(domacin.trener.getGodineIskustva()).append("\n");
        utakmicaInfo.append("Strijelci domaćin: ");
        for (Igrac i : strijelacDomacin) {
            utakmicaInfo.append("\n\t(#" + i.getBroj() + ") " + i.getImePrezime());
        }

        utakmicaInfo.append("\n\nTrener gostiju: ").append(gost.trener.getImePrezime()).append(", Godine iskustva: ")
                .append(gost.trener.getGodineIskustva()).append("\n");
        utakmicaInfo.append("Strijelci gosti: ");
        for (Igrac i : strijelacGost) {
            utakmicaInfo.append("\n\t(#" + i.getBroj() + ") " + i.getImePrezime());
        }
        utakmicaInfo.append("\n-----------------------------------------------------------------");
        return utakmicaInfo.toString();
    }
}