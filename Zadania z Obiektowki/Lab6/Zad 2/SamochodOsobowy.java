package TASKS.LAB06.zadania_domowe.zad2;

import TASKS.LAB02.InputData;

public class SamochodOsobowy extends Samochod{
    private double waga;
    private double pojemnoscSilnika;
    private int iloscMiejsc;

    public SamochodOsobowy(){
        super();
        InputData input= new InputData();
        System.out.println("Podaj wage samochodu osobowego:(w tonach 2-4.5) ");
        setWaga(input.InputDouble());
        System.out.println("Podaj pojemnosc silnika samochodu osobowego(0.8-3.0): ");
        setPojemnoscSilnika(input.InputDouble());
        System.out.println("Podaj ilosc miejsc samochodu osobowego: ");
        this.iloscMiejsc=input.InputInt();

    }

    private void setPojemnoscSilnika(double v) {
        if(v>=0.8 && v<=3.0){
            this.pojemnoscSilnika=v;
        }else System.out.println("Pojemnosc silnika musi być w przedziale 0.8-3.0");
    }

    private void setWaga(double weight) {
        if(weight>=2 && weight<=4.5){
            this.waga=weight;
        }else System.out.println("Waga musi być w przedziale 2-4.5 t");
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Waga: "+waga+" t");
        System.out.println("Pojemnosc silnika: "+pojemnoscSilnika+" l");
        System.out.println("Ilosc osob: "+iloscMiejsc);
    }
}
