package TASKS.LAB09.ZadaniaDomowe;

import java.util.Scanner;

public class MenuLab09 {
    public void MENU() {
        System.out.println("-------------------MENU LAB09-----------------");
        System.out.println("1. Zadanie 1");
        System.out.println("2. Zadanie 2");
        System.out.println("3. Zadanie 3");
        System.out.println("4. Zadanie 4");
        System.out.println("5. Zadanie 5");
        System.out.println("0. Exit");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Zadanie 1");
                TasksLab09.zadanie1();
                MENU();
            case 2:
                System.out.println("Zadanie 2");
                TasksLab09.zadanie2();
                MENU();
            case 3:
                System.out.println("Zadanie 3");
                TasksLab09.zadanie3();
                MENU();
            case 4:
                System.out.println("Zadanie 4");
                TasksLab09.zadanie4();
                MENU();
            case 5:
                System.out.println("Zadanie 5");
                TasksLab09.zadanie5();
                MENU();
            case 0:
                System.out.println("EXIT");
                System.exit(0);
            default:
                System.out.println("Zły wybor. Sprobuj jeszcze raz");
                MENU();
        }



    }
}
