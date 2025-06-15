package TASKS.LAB10.Zadania;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SystemLogowania {
    Scanner sc = new Scanner(System.in);
    Map<String, String> uzytkownik = new HashMap<>();

    public void MenuLogowania(){
        while(true){
            System.out.println("1. Dodaj uzytkownika");
            System.out.println("2. Zaloguj się");
            System.out.println("0. Wyjście");
            System.out.println("Wybierz opcję: ");
            int opcja = sc.nextInt();
            switch (opcja){
                case 1:
                    System.out.println("Podaj nazwe uzytkownika (login)");
                    sc.nextLine();
                    String login = sc.nextLine();
                    if(uzytkownik.containsKey(login)){
                        System.out.println("Taki użytkownik istnieje!!!");
                    }else{
                        System.out.println("Podaj hasło: ");
                        String haslo = sc.nextLine();
                        uzytkownik.put(login, haslo);
                        System.out.println("Użytkownik "+ login+ " został dodany");
                    }
                    break;
                case 2:
                    sc.nextLine();
                    System.out.println("Podaj login");
                    String loginuzytkownika = sc.nextLine();

                    if(uzytkownik.containsKey(loginuzytkownika)){
                        System.out.println("Podaj hasło:");
                        String haslo = sc.nextLine();
                        if(uzytkownik.get(loginuzytkownika).equals(haslo)){
                            System.out.println("Zalogowano pomyślnie");

                        }else {
                            System.out.println("Błędne hasło");
                        }
                    }else{
                        System.out.println("Taki login nie istnieje");
                    }
                    break;
                default:
                    System.out.println("Nie ma takiego wyboru...");
                case 0:
                    System.out.println("Wyjście...");
                    return;
            }
        }
    }
}
