package HNL;

public abstract class Osoba {
    private String ime;
    private String prezime;

    public Osoba(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
    }

    public String getImePrezime() {
        return ime + " " + prezime;
    }
}