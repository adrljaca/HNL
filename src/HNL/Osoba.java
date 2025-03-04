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

//DZ 24-02-2025

//Napišite program koji vodi rezultate o 1. HNL-u.

//Program mora omogućiti sljedeće:
//•	klubovi i utakmice imaju ključ (id) koji se sam uvećava (autoincrement) pri instanciranju novog objekta
//•	unos novog rezultata
//•	trener je dio kluba, ali igrači se unose samo kao strijelci utakmice
//•	unos strijelaca (obavezan podatak, ne možete unijeti rezultat ako niste unijeli i strijelce)
//•	ispis tablice utakmica
//•	+ ispis tablice strijelaca
//•	ispis aktivnih klubova lige

//Klubove i igrače definirajte u programu, ne morate ih unositi kroz izbornik. Koristeći paradigmuOOP, oblikujte rješenje (hint: liga sadrži klubove i utakmice, igrači i trener imaju zajedničke elemente, ali i zasebne).

//Osoba je apstraktna klasa.

//Igrač ima osobine:
//•	broj
//•	veličina kopačke
//•	ime, prezime

//Trener ima osobine:
//•	Ime, prezime
//•	Godine iskustva

//Klub ima osobine:
//•	ID
//•	Naziv
//•	Grad
//•	Trener

//Liga se sastoji od dvije kolekcije – List/ArrayList (Utakmice, Klubovi) i treba imati metode za ispis Aktivnih klubova i Ispis Utakmica.

//Utakmica ima osobine:
//•	ID
//•	Klub domaćin
//•	Klub gost
//•	Rezultat domaćin
//•	Rezultat gost
//•	Strijelci domaći
//•	Strijelci gost
