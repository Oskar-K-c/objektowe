package TASKS.LAB07.zadania_domowe.Zad2;

class Prostokat extends Figura implements IFigury{
	int wys=0;
	int szer=0;

	public Prostokat(String kolor, int wys, int szer) {
		super(kolor);
		this.wys = wys;
		this.szer = szer;
		this.punkt=new Punkt(0,0);
	}

	@Override
	public String opis() {
		return "Prostokąt o wymiarach: " + wys + "x" + szer + ", kolor: " + kolor;
	}

	@Override
	public void skaluj(float skala) {
		this.wys = (int) (wys * skala);
		this.szer = (int) (szer * skala);
	}

	@Override
	public boolean wPolu(Punkt p) {
		return (p.x>=punkt.x && p.x<=punkt.x+szer
				&& p.y>=punkt.y && p.y<=punkt.y+wys);
	}

	@Override
	public float getPowierzchnia() {
		return wys*szer;
	}
}