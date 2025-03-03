package HNL;

public class Klub {
    private static int idBrojac = 1;
    private int id;
    private String naziv;
    private String grad;
    Trener trener;

    public Klub(String naziv, String grad, Trener trener) {
        this.id = idBrojac++;
        this.naziv = naziv;
        this.grad = grad;
        this.trener = trener;
    }

    public String getKlub() {
        return id + ". " + naziv + " (" + grad + ") - Trener: " + trener.getImePrezime() +
                " - Godine iskustva: " + trener.getGodineIskustva();
    }

    public String getNaziv() {
        return naziv;
    }

    public int getId() {
        return id;
    }
}