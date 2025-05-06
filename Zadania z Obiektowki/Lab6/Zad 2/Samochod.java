package TASKS.LAB06.zadania_domowe.zad2;

import TASKS.LAB02.InputData;

public class Samochod {
    private String marka;
    private String model;
    private String nadwozie;
    private String kolor;
    private int rokProdukcji;
    private int przebieg;

    public Samochod(String marka, String model, String nadwozie, String kolor, int rokProdukcji, int przebieg) {
        this.marka = marka;
        this.model = model;
        this.nadwozie = nadwozie;
        this.kolor = kolor;
        this.rokProdukcji = rokProdukcji;
        this.przebieg = przebieg;
    }
    public Samochod(){
        InputData input=new InputData();
        System.out.println("Podaj markę samochodu: ");
        this.marka = input.InputString();

        System.out.println("Podaj model samochodu: ");
        this.model = input.InputString();

        System.out.println("Podaj rodzaj nadwoże: ");
        this.nadwozie = input.InputString();

        System.out.println("Podaj kolor samochodu: ");
        this.kolor = input.InputString();

        System.out.println("Podaj rok produkcji samochodu: ");
        this.rokProdukcji = input.InputInt();

        System.out.println("Podaj przebieg samochodu: ");
        int odometer = input.InputInt();
        if(odometer < 0) {
            System.out.println("Przebieg nie może być ujemny!");
            return;
        }else this.przebieg = odometer;
    }


    public void info(){
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Rodzaj nadwoże: " + nadwozie);
        System.out.println("Kolor: " + kolor);
        System.out.println("Rok produkcji: " + rokProdukcji);
        System.out.println("Przebieg: " + przebieg + " km");
    }
}
