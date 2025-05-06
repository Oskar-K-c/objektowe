package TASKS.LAB03;

import TASKS.LAB02.InputData;

public class MenuLab03 {
    //element klasy input_data
    InputData input = new InputData();
    public void Uruchom() {
        Menu();
    }

    private void Menu() {
        System.out.printf("1. Zadanie 1");
        System.out.printf("\n2. Zadanie 2");
        System.out.printf("\n3. Zadanie 3");
        System.out.printf("\n4. Zadanie 4");
        System.out.printf("\n5. Zadanie 5");
        System.out.printf("\n6. Zakoncz program\n");
        System.out.print("Wybierz zadanie: ");
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
                Zadanie4RUN();
                Menu();
            case 5:
                Zadanie5RUN();
                Menu();
            case 6:
                CloseProgramRUN();
            default:
                System.out.println("Nie ma takiej opcji!");
        }
    }

    private void Zadanie1RUN() {
        System.out.println("Podaj liczbę studentów: ");
        int n = input.InputInt();
        TASK_lab03.Zadanie1(n);
    }

    private void Zadanie2RUN() {
        System.out.println("Program wczytuje 10 liczb i wyznacza ilość oraz sumę liczb dodatnich oraz ujemnych podanych przez użytkownika.");
        TASK_lab03.Zadanie2();
    }

    private void Zadanie3RUN() {
        System.out.printf("Podaj dlugosc ciągu:");
        int n = input.InputInt();
        TASK_lab03.Zadanie3(n);
    }

    private void Zadanie4RUN() {
        TASK_lab03.Zadanie4();
    }

    private void Zadanie5RUN() {
        System.out.print("Podaj słowo: ");
        input.InputString();
        String word = input.InputString();
        TASK_lab03.Zadanie5(word);
    }


    private void CloseProgramRUN() {
        TASK_lab03.close();
        
    }
}
