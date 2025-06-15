package TASKS.LAB14;

import java.io.Console;

public class TasksLab14 {
    public static void Zadanie1() {
        UserDAO dao = new UserDAO();
        Console console = System.console();  // stosuje by ukryć hasło w konsoli podczas wpisywania
        if (console == null) {
            System.err.println("Błąd: Konsola nie jest dostępna.");
            System.exit(1);
        }
        
        System.out.println("ATM SYSTEM BANK");
        String username = console.readLine("Podaj nazwę użytkownika: ");
        char[] pinChars = console.readPassword("Podaj PIN: ");
        String pin = new String(pinChars);
        
        try{
            if(dao.authenticateUser(username,pin,"admin")){
                System.out.println("Zalogowano jako administrator");
                MenuSystem.adminMenu(dao, console);
            } else if (dao.authenticateUser(username,pin,"user")) {
                System.out.println("Zalogowano jako user");
                MenuSystem.userMenu(dao, console, username);
            }else {
                System.out.println("Nieprawidłowe dane logowania");
            }
        }catch (Exception e){
            System.out.println("Wystąpił błąd: " + e.getMessage());
        }finally {
            java.util.Arrays.fill(pinChars, ' ');
        }

    }
}