package HNL;

public class Trener extends Osoba {
    private int godineIskustva;

    public Trener(String ime, String prezime, int godineIskustva) {
        super(ime, prezime);
        this.godineIskustva = godineIskustva;
    }

    public int getGodineIskustva() {
        return godineIskustva;
    }
}