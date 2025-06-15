package TASKS.LAB11.ZADANIA;

import java.util.Scanner;

public class MenuLab11 {
    public void Menu() {
        Scanner in = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Zadanie 1 ");
        System.out.println("2. Zadanie 2 ");
        System.out.println("0. Wyjście ");

        switch (in.nextInt()){
            case 1:
                Zadanie1Run();
                Menu();
            case 2:
                Zadanie2Run();
                Menu();
            default:
                System.out.println("Zły wybór");
                Menu();
            case 0:
                System.out.println("Exiting .... ");
                System.exit(0);
        }

    }

    private void Zadanie1Run() {
        TaskLab11.Zadanie1();
    }

    private void Zadanie2Run() {
        TaskLab11.Zadanie2();

    }
}
