package TASKS.LAB08.ZadaniaDomowe;

import java.util.Scanner;

public class TASKSLAB08 {
    public static void Zadanie3() {
        try{
            Adres adres1 = new Adres("Mickiewicza","Leżajsk", 5,"37-310");
            adres1.wyswietl();
            Adres adres2 = new Adres(null,"rzeszów",5,null);
            adres2.wyswietl();
        }catch (NieprawidlowyAdresException e){
            System.out.println("Bład: "+e.getMessage());
        }

    }

    public static void Zadanie2() {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        try{
            int liczba = input.nextInt();
            System.out.println("Silnia z "+ liczba+ " = "+ obliczSilnie(liczba));
        }catch (BlednaWartoscDlaSilniException e){
            System.out.println("Błąd: "+ e.getMessage());
        }

    }

    private static long obliczSilnie(int n) throws BlednaWartoscDlaSilniException{
        if(n<0){
            throw new BlednaWartoscDlaSilniException("Silnie obliczamy tylko z dodatnich");
        }
        long wynik = 1;
        for (int i=1; i<=n; i++){
            wynik = wynik * i;
        }
        return wynik;
    }

    public static void Zadanie1() {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        try{
            String wejscie = input.next();
            double liczba = Double.parseDouble(wejscie);
            if(liczba<0){
                throw new IllegalArgumentException("Nie można obliczyć pierwsiastka z liczby ujemnej");
            }
            double pierwiastek = Math.sqrt(liczba);
            System.out.println("Pierwiastek z "+liczba+ " = "+ pierwiastek);
        }catch (NumberFormatException e ){
            System.out.println("Bład: podano niepoprawna liczbe");
        }
        catch (IllegalArgumentException e){
            System.out.println("błąd: "+ e.getMessage());
        }
    }
}
