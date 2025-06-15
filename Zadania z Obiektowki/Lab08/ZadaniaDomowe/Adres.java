package TASKS.LAB08.ZadaniaDomowe;

import java.util.Scanner;

public class Adres {
    Scanner input = new Scanner(System.in);
    private String ulica;
    private String miasto;
    private int numerDomu;
    private String kodPocztowy;
/*     komunikatBledu to obiekt StringBuilder, który przechowuje wszystkie błędy
       dotyczące podanych wartości (np. brak ulicy, błędny numer domu).
       toString() konwertuje obiekt StringBuilder na zwykły String, który można użyć jako komunikat błędu.
       trim() usuwa zbędne spacje na początku i końcu komunikatu, dzięki czemu wygląda bardziej estetycznie.*/

    public Adres(String ulica, String miasto, int numerDomu, String kodPocztowy) throws NieprawidlowyAdresException {
        StringBuilder komunikat = new StringBuilder();
        if(ulica == null){
            komunikat.append("Ulica nie może być nullem. ");
        }
        if(miasto == null){
            komunikat.append("Miasto nie może być nullem. ");
        }
        if(numerDomu <= 0){
            komunikat.append("Numer domu musi być większy od 0 ");
        }
        if(kodPocztowy == null){
            komunikat.append("Kod pocztowy nie może być nullem");
        }

        if(komunikat.length() > 0){
            throw new NieprawidlowyAdresException(komunikat.toString().trim());
        }

        this.ulica = ulica;
        this.miasto = miasto;
        this.numerDomu = numerDomu;
        this.kodPocztowy = kodPocztowy;
    }

    public void wyswietl(){
        System.out.println("Adres:\nMiasto:"+miasto+"\n" + "Ulica: "+ulica+"\nNumer domu:"+numerDomu+"\nKod pocztowy:"+kodPocztowy);
    }

}
