package TASKS.LAB06.zadania_domowe.zad1;

public class Figura {
    
    //pola metody i kontruktory
    Punkt punkt;
    public String kolor = "bialy";
    
    public Figura() {
        punkt = new Punkt(0, 0);
    }
    
    public Figura(String kolor) {
        this.kolor = kolor;
        this.punkt = new Punkt(0, 0);
    }
    
    public Figura(Punkt punkt) {
        this.punkt = punkt;
    }
    
    public String getKolor() {
        return kolor;
    }
    
    public String opis() {
        return "Klasa Figura. Kolor obiektu: " + kolor;
    }
}