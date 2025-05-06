package TASKS.LAB06.zadania_domowe.zad1;

public class Prostokat extends Figura {
	public double wys=0;
    public double szer=0;

	Prostokat(double wys,double szer){
		super();
		this.wys = wys;
		this.szer = szer;
		this.punkt = new Punkt(0,0);
	}

	public Prostokat(String kolor, double wys, double szer) {
		super(kolor);
		this.wys = wys;
		this.szer = szer;
		this.punkt = new Punkt(0,0);
	}

	public double getSzer() {
		return szer;
	}

	public void setSzer(double szer) {
		this.szer = szer;
	}

	public double getWys() {
		return wys;
	}

	public void setWys(double wys) {
		this.wys = wys;
	}

	public double getPowierzchnia() {
		return (szer * wys);
	}

	public void przesun(float x, float y){
		this.punkt.przesun((int)x, (int)y);
	}

	@Override
	public String opis() {
		return "Prostokąt o wymiarach: " + wys + "x" + szer + ", powierzchnią: " + getPowierzchnia() + ", kolor: " +kolor;
	}
}