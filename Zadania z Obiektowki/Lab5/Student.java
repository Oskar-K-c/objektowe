package TASKS.LAB05.zadaniadomowe;

public class Student {
    private Osoba osoba;
    private String Specjalnosc;
    private int nrIndeks;
    private int rokStudiow;

    public Student(Osoba osoba, String Specjalnosc, int nrIndeks, int rokStudiow) {
        this.osoba = osoba;
        this.Specjalnosc = Specjalnosc;
        this.nrIndeks = nrIndeks;
        this.rokStudiow = rokStudiow;
    }

    public Student(Osoba osoba, String Specjalnosc, int nrIndeks) {
        this.osoba = osoba;
        this.Specjalnosc = Specjalnosc;
        this.nrIndeks = nrIndeks;
    }

    public Student(Osoba osoba) {
        this.osoba = osoba;
    }

    public Student(Osoba osoba, int nrIndeks, int rokStudiow) {
        this.osoba = osoba;
        this.nrIndeks = nrIndeks;
        this.rokStudiow = rokStudiow;
    }

    public Osoba getOsoba() {
        return osoba;
    }

    public void setOsoba(Osoba osoba) {
        this.osoba = osoba;
    }

    public String getSpecjalnosc() {
        return Specjalnosc;
    }

    public void setSpecjalnosc(String specjalnosc) {
        Specjalnosc = specjalnosc;
    }

    public int getNrIndeks() {
        return nrIndeks;
    }

    public void setNrIndeks(int nrIndeks) {
        this.nrIndeks = nrIndeks;
    }

    public int getRokStudiow() {
        return rokStudiow;
    }

    public void setRokStudiow(int rokStudiow) {
        this.rokStudiow = rokStudiow;
    }

    public void wyswietl() {
        osoba.pokazDane();
        System.out.println("Specjalnosc: " + Specjalnosc);
        System.out.println("Nr Albumu: " + nrIndeks);
        System.out.println("Rok studiow: " + rokStudiow);
    }
}
