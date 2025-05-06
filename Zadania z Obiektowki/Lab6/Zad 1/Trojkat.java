package TASKS.LAB06.zadania_domowe.zad1;

public class Trojkat extends Figura {
	double wys=0, podst=0;

	Trojkat(double wys, double podst)
	{
		super();
		this.wys = wys;
		this.podst = podst;
	}

	public Trojkat(String kolor, double wys, double podst) {
		super(kolor);
		this.wys = wys;
		this.podst = podst;
	}

	public double getWys() {
		return wys;
	}

	public void setWys(double wys) {
		this.wys = wys;
	}

	public double getPodst() {
		return podst;
	}

	public void setPodst(double podst) {
		this.podst = podst;
	}

	@Override
	public String opis() {
		return "Trójkąt o wysokości " + wys + " i podstawie " + podst + ". Kolor: " + getKolor();
	}
}