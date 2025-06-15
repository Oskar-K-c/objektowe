package TASKS.LAB10.Zadania;

import java.util.*;

public class Dania {
    Scanner sc = new Scanner(System.in);
    Map<String,Double> dania = new HashMap<>();
    public void ListaDan(){
        while(true){
            System.out.println("1.Dodanie nowego dania");
            System.out.println("2.Wyświetlenie całej karty dań");
            System.out.println("3.Usunięcie dania");
            System.out.println("4.Obliczenie rachunku za wybrane dania");
            System.out.println("5.Wyjście");
            switch(sc.nextInt()){
                case 1:
                    DodajDanie();
                    break;
                case 2:
                    WyswietlKarte();
                    break;
                case 3:
                    UsunDanie();
                    break;
                case 4:
                    ObliczRachunek();
                    break;
                case 5:
                    System.out.println("Exit...");
                    return;
                default:
                    break;
            }
        }
    }

    private void ObliczRachunek() {
        sc.nextLine();
        if(dania.isEmpty()){
            System.out.println("Karta dań jest pusta!");
            return;
        }
        List<String> zamowienie = new ArrayList<>();
        double suma = 0.0;
        WyswietlKarte();
        while(true){
            System.out.println("Podaj nazwę dania: (wpisz ' - ' aby zakończyć)");
            String nazwa = sc.nextLine();

            if(nazwa.equals("-")){
                break;
            }
            if(dania.containsKey(nazwa)){
                zamowienie.add(nazwa);
                suma += dania.get(nazwa);
            }else{
                System.out.println("Nie znaleziono takiego dania w menu. Spróbuj ponownie");
            }
        }

        if(!zamowienie.isEmpty()){
            System.out.println("\n Rachunek: ");
            System.out.println("Zamówione dania: ");
            zamowienie.forEach(System.out::println);
            System.out.println("Suma: " + suma+" zł");
        }else{
            System.out.println("Nie wybrano żadnych dań!");
        }


    }

    private void UsunDanie() {
        if(dania.isEmpty()){
            System.out.println("Karta dań jest pusta!");
            return;
        }
        sc.nextLine();
        System.out.println("Podaj nazwę dania: ");
        String nazw = sc.nextLine();
        if(dania.containsKey(nazw)){
            dania.remove(nazw);
            System.out.println("Usunięto "+nazw);
        }
        else{
            System.out.println("Takie danie nie istnieje");
        }
    }

    private void WyswietlKarte() {
        if(dania.isEmpty()){
            System.out.println("Karta dań jest pusta!");
            return;
        }
        System.out.println("=====MENU=====");
        for(Map.Entry<String,Double> entry : dania.entrySet()){
            System.out.println(entry.getKey() + "-" + entry.getValue()+" zł");
        }
        System.out.println("==============");

    }

    private void DodajDanie() {
        sc.nextLine();
        System.out.println("Podaj danie: ");
        String danie = sc.nextLine();
        if(dania.containsKey(danie)){
            System.out.println("Takie danie już istnieje ");
        }
        else{
            System.out.println("Podaj cenę dania: ");
            double cena = sc.nextDouble();
            dania.put(danie, cena);
            System.out.println("Dodano "+ danie+ " - "+cena+" zł");
        }
    }
}
