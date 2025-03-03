package HNL;

public class Main {
    public static void main(String[] args) {

        //Treneri
        Trener zoran = new Trener("Zoran", "Zekić", 9);
        Trener zeljko = new Trener("Željko", "Sopić", 6);
        Trener gennaro = new Trener("Gennaro", "Gattuso", 10);
        Trener nenad = new Trener("Nenad", "Bjelica",12);

        //Klubovi
        Klub dinamo = new Klub("Dinamo", "Zagreb", nenad);
        Klub hajduk = new Klub("Hajduk", "Split", gennaro);
        Klub rijeka = new Klub("HNK Rijeka", "Rijeka", zeljko);
        Klub osijek = new Klub("NK Osijek", "Osijek", zoran);

        //Igraci
        Igrac marko1 = new Igrac("Marko", "Livaja", 10, 43.0);
        Igrac marko2 = new Igrac("Marko", "Pjaca", 20, 43.5);
        Igrac bruno = new Igrac("Bruno", "Petković",16,45.5);
        Igrac duje = new Igrac("Duje", "Čop",9,44.0);
        Igrac arnel = new Igrac("Arnel", "Jakupović",17,46.5);

        //Utakmice
        Utakmica utakmica1 = new Utakmica(dinamo, hajduk);
        utakmica1.addStrijelacDomacin(bruno);
        utakmica1.addStrijelacDomacin(marko2);
        utakmica1.addStrijelacGost(marko1);
        utakmica1.addStrijelacGost(marko1);
        utakmica1.setRez(2,2);

        Utakmica utakmica2 = new Utakmica(rijeka, osijek);
        utakmica2.addStrijelacDomacin(duje);
        utakmica2.addStrijelacGost(arnel);
        utakmica2.addStrijelacGost(arnel);
        utakmica2.setRez(1,2);

        //Liga
        Liga liga = new Liga();
        liga.addKlub(dinamo);
        liga.addKlub(hajduk);
        liga.addKlub(rijeka);
        liga.addKlub(osijek);

        liga.addUtakmica(utakmica1);
        liga.addUtakmica(utakmica2);

        //Ispis
        liga.ispisAktivnih();
        System.out.println();
        liga.ispisUtakmica();
        System.out.println();
    }
}