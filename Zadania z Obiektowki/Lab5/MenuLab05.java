package TASKS.LAB05.zadaniadomowe;

import java.util.Scanner;

public class MenuLab05 {
    TasksLab05 tasks = new TasksLab05();
    Scanner sc = new Scanner(System.in);
    public void Menu() {
        System.out.println("Wybierz zadanie:");
        System.out.println("1. Zadanie 1");
        System.out.println("2. Zadanie 2");
        System.out.println("3. Zadanie 3");
        System.out.println("4. Zadanie 4");
        System.out.println("0. Wyjście");

        int choice = sc.nextInt();
        switch (choice) {
            case 1: Task001Run();Menu();
            case 2: Task002Run();Menu();
            case 3: Task003Run();Menu();
            case 4: Task004Run();Menu();
            case 0: CloseProgramRun();break;
            default:
                System.out.println("Błędne dane. Wybierz ponownie");break;
        }
    }

    private void CloseProgramRun() {
        System.out.println("Zamykanie ...");
        System.exit(0);
    }

    private void Task004Run() {
        tasks.Zadanie4();
    }

    private void Task003Run() {
        tasks.Zadanie3();
    }

    private void Task002Run() {
        tasks.Zadanie2();
    }

    private void Task001Run() {
        tasks.Zadanie1();
    }
}
