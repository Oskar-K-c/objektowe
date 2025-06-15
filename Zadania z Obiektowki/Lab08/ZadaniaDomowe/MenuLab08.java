package TASKS.LAB08.ZadaniaDomowe;

import java.util.Scanner;

public class MenuLab08 {
    public void Uruchom(){ Menu();}
    Scanner input = new Scanner(System.in);
    private void Menu() {
        System.out.println("======MENU LAB08=======");
        System.out.println("1.Zadanie 1");
        System.out.println("2.Zadanie 2");
        System.out.println("3.Zadanie 3");
        System.out.println("0.Zakończ");

        int choice = input.nextInt();
        switch (choice){
            case 1:
                Zadanie1Run();
                Menu();
            case 2:
                Zadanie2Run();
                Menu();
            case 3:
                Zadanie3Run();
                Menu();
            case 0:
                System.out.println("Zakończenie programu.");
                System.exit(0);
            default:
                System.out.println("Nieprawidlowe wybor. Sprobuj jeszcze raz.");
                Menu();
        }


    }

    private void Zadanie3Run() {
        TASKSLAB08.Zadanie3();
    }

    private void Zadanie2Run() {
        TASKSLAB08.Zadanie2();
    }

    private void Zadanie1Run() {
        TASKSLAB08.Zadanie1();
    }
}
