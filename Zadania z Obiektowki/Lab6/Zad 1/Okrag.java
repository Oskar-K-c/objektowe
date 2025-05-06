package TASKS.LAB06.zadania_domowe.zad1;

public class Okrag extends Figura {
    private double promien;
    private Punkt srodek;

    public Okrag() {
        super();
        this.srodek = new Punkt();
        this.promien = 0;
    }

    public Okrag(String kolor, double promien, Punkt srodek) {
        super(kolor);
        this.promien = promien;
        this.srodek = srodek;
    }

    public double getPowierzchnia() {
        return Math.PI * Math.pow(promien, 2);
    }

    public double getSrednica() {
        return 2 * promien;
    }

    public void setPromien(double p){
        this.promien=p;
    }
    public double getPromien() {
        return promien;
    }

    public boolean wSrodku(Punkt p) {
        double x = punkt.getX() - srodek.getX();
        double y = punkt.getY() - srodek.getY();
        return (x*x + y*y) <= (promien*promien);
    }

    @Override
    public String opis() {
        return "Okrąg o środku (" + srodek.getX() + "," + srodek.getY() + ") i promienie " + promien + " i kolorze " + kolor;
    }
}