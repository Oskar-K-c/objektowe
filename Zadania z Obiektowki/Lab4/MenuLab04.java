package TASKS.LAB04;

import TASKS.LAB02.InputData;

public class MenuLab04 {
    public void Uruchom() {
        MENU();
    }
    InputData input=new InputData();

    private void MENU() {
        System.out.println("--- MENU ---");
        System.out.println("1. TASK 1");
        System.out.println("2. TASK 2");
        System.out.println("3. TASK 3");
        System.out.println("4. TASK 4");
        System.out.println("5. TASK 5");
        System.out.println("6. TASK 6");
        System.out.println("7. TASK 7");
        System.out.println("8. Exit");
        System.out.println("10. TASK 4b- additionally");
        System.out.print("Enter your choice: ");

        int choice = input.InputInt();
        switch (choice) {
            case 1:
                zadanie1RUN();
                MENU();
            case 2:
                zadanie2RUN();
                MENU();
            case 3:
                zadanie3RUN();
                MENU();
            case 4:
                Zadanie4RUN();
                MENU();
            case 10:
                Zadanie4bRUN();
                MENU();
            case 5:
                Zadanie5RUN();
                MENU();
            case 6:
                Zadanie6RUN();
                MENU();
            case 7:
                Zadanie7RUN();
                MENU();
            case 8:
                System.out.println("Exiting...");
                System.exit(0);
            default:
                System.out.println("Invalid choice. Please try again.");
                MENU();
        }
    }

    private void Zadanie4bRUN() {
        TASK_LAB04.zadanie4b();
    }

    private void Zadanie7RUN() {
        TASK_LAB04.zadanie7();
    }

    private void Zadanie6RUN() {
        TASK_LAB04.zadanie6();
    }

    private void Zadanie5RUN() {
        TASK_LAB04.zadanie5();
    }

    private void Zadanie4RUN() {
        TASK_LAB04.zadanie4();
    }

    private void zadanie3RUN() {
        TASK_LAB04.zadanie3();
    }

    private void zadanie2RUN() {
        TASK_LAB04.zadanie2();
    }

    private void zadanie1RUN() {
        TASK_LAB04.zadanie1();
    }
}
