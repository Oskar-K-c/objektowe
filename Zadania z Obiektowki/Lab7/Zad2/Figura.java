package TASKS.LAB07.zadania_domowe.Zad2;

//deklaracja klasy abstrakcyjnej

public abstract class Figura{
	//pola metody i kontruktory
	Punkt punkt;
	String kolor = "bialy";

	Figura(String kolor){
		this.kolor=kolor;
		this.punkt = new Punkt(0,0);
	}


	String getKolor() {
		return kolor;
	}

	//metody abstrakcyjne
	public abstract String opis();
	public abstract void skaluj(float skala); //skaluje wielkosc figury

	
	}
