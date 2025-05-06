package TASKS.LAB06.zadania_domowe.zad1;

public class Kwadrat extends Prostokat {
    public Kwadrat(double bok) {
        super(bok, bok);
    }

    public Kwadrat(String kolor, double bok) {
        super(kolor, bok, bok);
    }

    public double getBok() {
        return super.getWys();
    }

    public void setBok(double bok) {
        super.setWys(bok);
        super.setSzer(bok);
    }

    @Override
    public void przesun(float x, float y) {
        super.przesun(x, y);
    }

    @Override
    public String opis() {
        return "Kwadrat o boku " + getBok() + " i kolorze " + getKolor();
    }
}
