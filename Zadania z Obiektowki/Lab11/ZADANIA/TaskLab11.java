package TASKS.LAB11.ZADANIA;


import java.util.Scanner;

public class TaskLab11 {

    public static void Zadanie2() {
        Scanner sc = new Scanner(System.in);
        enum PizzaSize{
            MALA(24,19.99),
            SREDNIA(32,32),
            DUZA(44,50.5);

            private int srednica;
            private double cena;

            PizzaSize(int srednica, double cena) {
                this.srednica = srednica;
                this.cena = cena;
            }

            public int getSrednica() {
                return srednica;
            }

            public double getCena() {
                return cena;
            }
        }
        System.out.println("Wybierz rozmiar pizzy:");
        System.out.println("1.Mala");
        System.out.println("2.Srednia");
        System.out.println("3.Duza");
        System.out.println("Wybierz opcje");
        switch (sc.nextInt()){
            case 1:
                System.out.println("Pizza MALA");
                System.out.println("Srednica " + PizzaSize.MALA.getSrednica());
                System.out.println("Cena " + PizzaSize.MALA.getCena());
                break;
            case 2:
                System.out.println("Pizza SREDNIA");
                System.out.println("Srednica " + PizzaSize.SREDNIA.getCena());
                System.out.println("Cena " + PizzaSize.SREDNIA.getCena());
                break;
            case 3:
                System.out.println("Pizza DUZA:");
                System.out.println("Średnica: " + PizzaSize.DUZA.getSrednica());
                System.out.println("Cena: " + PizzaSize.DUZA.getCena());
                break;
            default:
                System.out.println("Zły wybór");
                break;

        }
    }

    public static void Zadanie1() {
        enum Swiatlo {
            Czerwone("STÓJ!!!"),
            Zolte("UWAGA!!"),
            Zielone("JEDZ!");

            private String opis;
            Swiatlo(String opis) {
                this.opis = opis;
            }
            public String getKomunikat() {
                return opis;
            }
        }


        Swiatlo kolor = Swiatlo.Czerwone;
        System.out.println("Obecny kolor: " + kolor);
        System.out.println("Komunikat: " + kolor.getKomunikat());

        Swiatlo kolor1 = Swiatlo.Zolte;
        System.out.println("Obecny kolor: " + kolor1);
        System.out.println("Komunikat: " + kolor1.getKomunikat());

        Swiatlo kolor2 = Swiatlo.Zielone;
        System.out.println("Obecny kolor: " + kolor2);
        System.out.println("Komunikat: " + kolor2.getKomunikat());
    }
}
