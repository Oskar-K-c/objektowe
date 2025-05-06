package TASKS.LAB06.zadania_domowe.zad1;

public class Punkt {
    public int x;
    public int y;

    public Punkt() {
        this(0, 0);
    }

    public Punkt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void zeruj() {
        this.x = 0;
        this.y = 0;

    }

    public void opis()  {
        System.out.println("Punkt o współrzędnych (" + x + ", " + y + ")");

    }

    public void przesun(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }


}
