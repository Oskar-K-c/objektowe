package TASKS.LAB07.zadania_domowe.Zad2;
public class GlownyProgram
{
	public static void UruchomZadanie2()
	{
		Prostokat maly_punkt = new Prostokat("czerwony",3, 6);
		Trojkat rownoboczny = new Trojkat("biały",7, 4);
		Kwadrat kwadrat= new Kwadrat("niebieski",5);
		Okrag okrag = new Okrag("pomarańczowy",4);

		//tablica figur punkt 6
		Figura[] tablicaFigur = new Figura[10];
		tablicaFigur[0] = maly_punkt;
		tablicaFigur[1] = rownoboczny;
		tablicaFigur[2] = kwadrat;
		//tworzenie nowych
		tablicaFigur[3] = okrag;
		tablicaFigur[4] = new Okrag("czerwony",6);
		tablicaFigur[5] = new Kwadrat("fioletowy",3);
		tablicaFigur[6] = new Prostokat("żółty",5, 7);
		tablicaFigur[7] = new Okrag("Turkusowy",8);
		tablicaFigur[8] = new Kwadrat("zielony",4);
		tablicaFigur[9] = new Prostokat("niebieski",6, 8);

/*
		Dla każdego obiektu tablicy wywołać metodę opis().
*/
		for(Figura figura : tablicaFigur){
			if(figura !=null){
				System.out.println(figura.opis());
				System.out.println();
			}
		}

		//punkt 10
		IFigury[] figury = new IFigury[4];
		figury[0] = maly_punkt;
		figury[1] = rownoboczny;
		figury[2] = kwadrat;
		figury[3] = okrag;

		Punkt testPunkt = new Punkt(2, 3);
		for(IFigury figura : figury){
			System.out.println("Powierzchnia: "+ figura.getPowierzchnia());
			System.out.println("Czy znajduje się w punkcie: "+figura.wPolu(testPunkt));
		}

		okrag.przesun(3, 15);
		System.out.println("Okrag po przesunięciu: "+okrag.opis());
		System.out.println("czy znajduje się w punkcie: "+okrag.wPolu(testPunkt));

	}
}