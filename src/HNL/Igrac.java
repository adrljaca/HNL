package HNL;

public class Igrac extends Osoba {
    private int broj;
    private double velicinaKopacke;

    public Igrac(String ime, String prezime, int broj, double velicinaKopacke) {
        super(ime, prezime);
        this.broj = broj;
        this.velicinaKopacke = velicinaKopacke;
    }

    public int getBroj() {
        return broj;
    }
}