package TASKS.LAB06.zadania_domowe;

import TASKS.LAB02.InputData;

public class MenuLab06 {
    public void Uruchom() {
        Menu();
    }
    private void Menu() {
        InputData input = new InputData();
        System.out.println("--- MENU LABORATORIUM 6 ---");
        System.out.println("1. Zadanie 1");
        System.out.println("2. Zadanie 2");
        System.out.println("3. Zadanie 3");
        System.out.println("4. System zarządzania flotą pojazdów");
        System.out.println("5. Zakoncz");
        System.out.print("Wybierz zadanie (1-3): ");
        int choice = input.InputInt();
        switch (choice) {
            case 1:
                Zadanie1RUN();
                Menu();
            case 2:
                Zadanie2RUN();
                Menu();
            case 3:
                Zadanie3RUN();
                Menu();
            case 4:
                zarzadzanieFlotąPojazdówRUN();
                Menu();
            case 5:
                System.out.println("Zakonczenie programu.");
                System.exit(0);
            default:
                System.out.println("Nieprawidlowe wybor. Sprobuj jeszcze raz.");
                Menu();
        }
    }

    private void zarzadzanieFlotąPojazdówRUN() {
        TasksLab06.zarzadzanieFlotąPojazdów();
    }

    private void Zadanie1RUN() {
        TasksLab06.zadanie1();
    }

    private void Zadanie2RUN() {
        TasksLab06.zadanie2();
    }

    private void Zadanie3RUN() {
        TasksLab06.zadanie3();
    }
}
