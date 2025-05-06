package TASKS.LAB07.zadania_domowe;

import TASKS.LAB02.InputData;

public class MenuLab07 {
    public void Uruchom(){
        Menu();
    }

    private void Menu() {
        InputData input = new InputData();
        System.out.println("Menu:");
        System.out.println("1. Zadanie 1");
        System.out.println("2. Zadanie 2");
        System.out.println("3. Zakończ program");

        int choice = input.InputInt();
        switch (choice) {
            case 1:
                Zadanie1Run();
                Menu();
            case 2:
                Zadanie2RUN();
                Menu();
            case 3:
                System.out.println("Zamykanie programu... Bye! :)");
                System.exit(0);
            default:
                System.out.println("Nieprawidlowa opcja!");
                break;
        }

    }

    private void Zadanie1Run() {
        TasksLab07.Zadanie1();
    }

    private void Zadanie2RUN() {
        TasksLab07.Zadanie2();
    }
}
