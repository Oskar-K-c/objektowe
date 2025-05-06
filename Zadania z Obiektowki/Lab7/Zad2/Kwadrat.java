package TASKS.LAB07.zadania_domowe.Zad2;


class Kwadrat extends Figura implements IFigury {
	int bok = 0;

	public Kwadrat(String kolor, int bok) {
		super(kolor);
		this.bok = bok;
		this.punkt=new Punkt(0,0);
	}

	@Override
	public String opis() {
		return "Kwadrat o wymiarach " + bok + "x" + bok;
	}

	@Override
	public void skaluj(float skala) {
		this.bok = (int) (bok * skala);
	}

	@Override
	public float getPowierzchnia() {
		return (float) Math.pow(bok, 2);
	}

	@Override
	public boolean wPolu(Punkt p) {
		return (p.x >= punkt.x && p.x <= punkt.x + bok &&
				p.y >= punkt.y && p.y <= punkt.y + bok);
	}
}