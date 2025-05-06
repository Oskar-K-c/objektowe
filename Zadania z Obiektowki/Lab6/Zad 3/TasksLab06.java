package TASKS.LAB06.zadania_domowe;

import TASKS.LAB06.zadania_domowe.flota_pojazdow.Car;
import TASKS.LAB06.zadania_domowe.flota_pojazdow.Engine;
import TASKS.LAB06.zadania_domowe.flota_pojazdow.FuelTank;
import TASKS.LAB06.zadania_domowe.flota_pojazdow.Truck;
import TASKS.LAB06.zadania_domowe.zad1.*;
import TASKS.LAB06.zadania_domowe.zad2.Samochod;
import TASKS.LAB06.zadania_domowe.zad2.SamochodOsobowy;
import TASKS.LAB06.zadania_domowe.zad3.*;

public class TasksLab06 {
    public static void zadanie3() {
        System.out.println("======================= ZADANIE 3 =================================");
        Ksiegarnia ksiegarnia = new Ksiegarnia("Ksiegarnia_Polska");
        Ksiazka powiesc1 = new Powiesc("Wiedźmin","Andrzej Sapkowski","SuperNowa",2000,450,45,"Fantastyczna");
        Ksiazka podrecznik1 = new Podrecznik("Java 8", "Robert Coleman","Nowa wersja",2017,200,30,"Programowanie","Zaawansowany");
        Ksiazka powiesc2 = new Powiesc("Dziady","Aldous Huxley","Nowa wersja",2017,500,50,"Fantastyczna");
        ksiegarnia.dodajKsiazke(powiesc1);
        ksiegarnia.dodajKsiazke(podrecznik1);
        ksiegarnia.dodajKsiazke(powiesc2);
        Klient klient1=new Klient("Jan", "Kowalski", "jankowal@email.com", "123453534432");
        Klient klient2=new Klient("Anna", "Nowak", "annanow@email.com", "987654321098");
        ksiegarnia.dodajKlienta(klient1);
        ksiegarnia.dodajKlienta(klient2);
        ksiegarnia.infoKsiegarnia();

    }

    public static void zadanie2() {
        System.out.println("======================= ZADANIE 2 =================================");
        System.out.println("Tworzenie samochodu osobowego");
        SamochodOsobowy samochodOsobowy=new SamochodOsobowy();
        Samochod sam1=new Samochod("Toyota","Yaris","Hatchback","Niebieski", 2014, 212000);
        System.out.println("wprowadź dane do samochodu nr2");
        Samochod sam2=new Samochod();// dane od użytkownika
        Samochod sam3=new Samochod("Fiat","Panda","Kompakt","Czerwony", 2016, 250000);
        System.out.println("Informacje o samochodzie 1");
        sam1.info();
        System.out.println("Informacje o samochodzie 2");
        sam2.info();
        System.out.println("Informacje o samochodzie 3");
        sam3.info();
        System.out.println("Informacje o samochodzie osobowym");
        samochodOsobowy.info();

    }

    public static void zadanie1() {
        System.out.println("======================= ZADANIE 1 =================================");
        Punkt p1 = new Punkt(3, 5);
        Punkt p2 = new Punkt(4, 7);
        Punkt p3 = new Punkt();
        System.out.println("Początkowe współrzędne:");
        p1.opis();
        p1.przesun(2, 3);
        System.out.println("Nowe współrzędne:");
        p1.opis();
        p1.zeruj();
        System.out.println("Wspołrzędne po zerowaniu:");
        p1.opis();
        System.out.println("Współrzędne punktu p2:");
        p2.opis();
        System.out.println("Współrzędne punktu p3");
        p3.opis();
        p3.przesun(-1, -2);
        System.out.println("Wspolrzędne po przesunięciu punktu p3:");
        p3.opis();

        System.out.println("FIGURY:");
        //Utworzyć obiekty typu Figura, Prostokat i Trojkat. Sprawdzić działanie wybranych metod dla
        //utworzonych obiektów.
        //Przykład:
        Prostokat pr = new Prostokat("Niebieski", 4, 7);
        Trojkat tr = new Trojkat("cyjan", 3, 5);
        pr.szer = 7;
        pr.wys = 8;
        pr.kolor = "czerwony";
        pr.przesun(3, 5);// punkt 15 zadania
        System.out.println(pr.opis());

        System.out.println("testowanie działania metod dla prostokąta:");
        System.out.println("Kolor: " + pr.kolor);
        System.out.println("Szerokość: " + pr.getSzer());
        System.out.println("Wysokość: " + pr.getWys());
        System.out.println("Powierzchnia: " + pr.getPowierzchnia());
        System.out.println("testowanie dla trójkąta:");
        System.out.println(tr.opis());
        Kwadrat kw = new Kwadrat("Purple", 5);
        System.out.println(kw.opis());
        Okrag ok = new Okrag("Róż", 5, new Punkt(4, 8));
        System.out.println(ok.opis());
        System.out.println("Czy punkt (4,5) wewnątrz okręgu? " + ok.wSrodku(new Punkt(4, 5)));

    }

    public static void zarzadzanieFlotąPojazdów() {
        System.out.println("======================= ZARZADZANIE FLOTA POJAZDÓW =================================");
        Engine carEngine = new Engine(120, "Benzyna");
        FuelTank carFuelTank = new FuelTank(100, 15);
        Car myCar = new Car("Toyota", "Corolla", 2015,150, carEngine, carFuelTank,5);
        myCar.displayInfo();
        carFuelTank.consume(11);
        carFuelTank.refuel(80);

        Engine truckEngine = new Engine(380, "Diesel");
        FuelTank truckFuelTank = new FuelTank(200, 100);
        Truck myTruck = new Truck("Ford", "F-150", 2018, 130, truckEngine, truckFuelTank, 2);
        System.out.println("Informacje o truck'u: ");
        myTruck.displayInfo();
        truckFuelTank.consume(90);
        truckFuelTank.refuel(120);



    }
}
