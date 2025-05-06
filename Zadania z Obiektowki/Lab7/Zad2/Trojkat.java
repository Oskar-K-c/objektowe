package TASKS.LAB07.zadania_domowe.Zad2;


class Trojkat extends Figura implements IFigury{
	int wys=0;
	int podst=0;

	public Trojkat(String kolor, int wys, int podst) {
		super(kolor);
		this.punkt=new Punkt(0,0);
		this.wys = wys;
		this.podst = podst;
	}

	@Override
	public String opis() {
		return "Trojkąt o wymiarach: wys: " + wys + ", podst: " + podst + ", kolor: " + kolor;
	}

	@Override
	public void skaluj(float skala) {
        this.wys = (int) (this.wys * skala);
        this.podst = (int) (this.podst * skala);
	}

	@Override
	public float getPowierzchnia() {
		return (wys*podst)/2.0f;
	}

	@Override
	public boolean wPolu(Punkt p) {
		return false;
	}
}