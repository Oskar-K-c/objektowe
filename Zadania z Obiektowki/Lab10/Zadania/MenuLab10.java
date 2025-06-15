package TASKS.LAB10.Zadania;

import java.util.Scanner;

import static TASKS.LAB10.Zadania.TaskLab10.*;

public class MenuLab10 {
    public void Menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("====== MENU LAB 10 ========");
        System.out.println("1. Zadanie 1");
        System.out.println("2. Zadanie 2");
        System.out.println("3. Zadanie 3");
        System.out.println("0. Zakończenie lab10");

        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                Zadanie1Run();
                Menu();
            case 2:
                Zadanie2Run();
                Menu();
            case 3:
                Zadanie3Run();
                Menu();
            default:
                System.out.println("Zła opcja - wybierz jeszcze raz");
                Menu();
            case 0:
                System.out.println("Wyłączenie laba...");
                System.exit(0);
        }
    }

    private void Zadanie3Run() {
        Zadanie3();
    }

    private void Zadanie2Run() {
        Zadanie2();
    }

    private void Zadanie1Run() {
        Zadanie1();
    }
}
