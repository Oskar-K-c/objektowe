package TASKS.LAB14;

import java.io.Console;
import java.sql.SQLException;

public class MenuSystem {

    public static void adminMenu(UserDAO dao, Console console) throws SQLException {
        while (true) {
            printBanner("MENU ADMINISTRATORA");
            System.out.println("1. Utwórz nowego uzytkownika");
            System.out.println("2. Wyloguj");
            System.out.println("Wybierz opcję:");
            //int choice = sc.nextInt();
            //sc.nextLine(); // czyszczenie bufora
            int choice = Integer.parseInt(console.readLine());

            switch (choice) {
                case 1:
//                    System.out.println("Podaj nazwę użytkownika:");
//                    String nazw = sc.nextLine();
//                    System.out.println("Podaj pin użytkownika:");
//                    String pin = sc.nextLine();

                    String nazw = console.readLine("Podaj nazwę użytkownika: ");
                    char[] pinChars = console.readPassword("Podaj pin użytkownika: ");
                    String pin = new String(pinChars);
                    dao.addUser(nazw, pin);
                    java.util.Arrays.fill(pinChars, ' ');
                    break;
                case 2:
                    System.out.println("Wylogowywanie ...");
                    return;
                default:
                    System.out.println("Błędne dane");
            }
        }

    }

    public static void userMenu(UserDAO dao,Console console, String username) throws SQLException {
        while(true){
            printBanner("MENU UŻYTKOWNIKA:"+username.toUpperCase());
            System.out.println("1. Wpłata pieniędzy");
            System.out.println("2. Wypłata pieniędzy");
            System.out.println("3. Zmiana PIN-u");
            System.out.println("4. Sprawdź stan konta");
            System.out.println("5. Wyloguj");
            System.out.print("Wybierz opcję: ");
            //int choice = sc.nextInt();
            //sc.nextLine();
            int choice = Integer.parseInt(console.readLine());
            switch (choice){
                case 1 :
//                    System.out.println("Podaj kwotę do wpłaty:");
//                    double amount = sc.nextDouble();
                    double amount = Double.parseDouble(console.readLine("Podaj kwotę do wpłaty: "));
                    if(amount<=0){
                        System.out.println("Kwota nie może być mniejsza lub równa zero!");
                        pressEnterToContinue(console);
                    }else{
                        dao.wplata(username,amount);
                        pressEnterToContinue(console);
                    }
                    break;
                case 2 :
//                    System.out.println("Podaj kwotę do wypłaty:");
//                    double kwotawyplaty = sc.nextDouble();
//                    sc.nextLine();
//                    if(kwotawyplaty>0){
//                        dao.wyplata(username,kwotawyplaty);
//                    }else{
//                        System.out.println("Podaj kwotę większą od zera!");
//                    }
//                    pressEnterToContinue(sc);
//                    break;
                    System.out.print("Podaj kwotę do wypłaty: ");
                    double kwotawyplaty = Double.parseDouble(console.readLine());
                    if (kwotawyplaty > 0) {
                        dao.wyplata(username, kwotawyplaty);
                    } else {
                        System.out.println("Podaj kwotę większą od zera!");
                    }
                    pressEnterToContinue(console);
                    break;
                case 3 :
//                    System.out.println("Podaj nowy PIN:");
//                    String newpin = sc.nextLine();
//                    if(newpin.length()!=4){
//                        System.out.println("PIN musi mieć dokładnie 4 cyfry!");
//                        pressEnterToContinue(console);
//                    }else{
//                        dao.changePin(username,newpin);
//                        pressEnterToContinue(console);
//                    }
//                    break;
                    char[] newPinChars = console.readPassword("Podaj nowy PIN (4 cyfry): ");
                    String newpin = new String(newPinChars);
                    if (newpin.length() != 4) {
                        System.out.println("PIN musi mieć dokładnie 4 cyfry!");
                    } else {
                        dao.changePin(username, newpin);
                    }
                    java.util.Arrays.fill(newPinChars, ' '); // Czyść dane wrażliwe
                    pressEnterToContinue(console);
                    break;
                case 4 :
                    System.out.println("Sprawdzanie salda...");
                    dao.checkBalance(username);
                    pressEnterToContinue(console);
                    break;
                case 5 :
                    System.out.println("Wylogowywanie...");
                    return;
                default :
                    System.out.println("Błędne dane");
            }
        }

    }

    private static void printBanner(String title) {
        System.out.println("\n" + "=".repeat(40));
        System.out.println(" " +title);
        System.out.println("=".repeat(40));
    }

    private static void pressEnterToContinue(Console console) {
        System.out.println("Naciśnij Enter, aby kontynuować...");
        //sc.nextLine();
        console.readLine();
    }

}
