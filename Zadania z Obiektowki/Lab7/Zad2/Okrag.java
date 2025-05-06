package TASKS.LAB07.zadania_domowe.Zad2;

public class Okrag extends Figura implements IFigury, RuchFigury{
    int promien;

    public Okrag(String kolor, int promien) {
        super(kolor);
        this.promien = promien;
    }

    @Override
    public String opis() {
        return "Okrag o promieniu " + promien + " i kolorze " + kolor+  ", w srodku ("
                +punkt.x + "," + punkt.y+")";
    }

    @Override
    public void skaluj(float skala) {
        this.promien = (int) (this.promien * skala);
    }

    @Override
    public float getPowierzchnia() {
        return (float) (Math.PI * Math.pow(promien, 2));
    }

    @Override
    public boolean wPolu(Punkt p) {
        float dx = p.x - punkt.x;
        float dy = p.y - punkt.y;
        return dx * dx + dy * dy <= promien * promien;
    }

    @Override
    public void przesun(int x, int y) {
        this.punkt.x += x;
        this.punkt.y += y;
    }
}
