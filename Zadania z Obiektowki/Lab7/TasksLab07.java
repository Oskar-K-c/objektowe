package TASKS.LAB07.zadania_domowe;

import TASKS.LAB02.InputData;
import TASKS.LAB07.zadania_domowe.Zad1.*;
import TASKS.LAB07.zadania_domowe.Zad2.*;

public class TasksLab07 {

    public static void Zadanie1() {
        InputData input = new InputData();
        System.out.println("========== Zadanie 1 ===========");
        Zarzadzanie_wypozyczalnia wypozyczalnia = new Zarzadzanie_wypozyczalnia();

        int choice;
        do {
            System.out.println("\n ====Menu wypożyczalni pojazdów======");
            System.out.println("1. Dodaj pojazd");
            System.out.println("2. Wyświetl dostępne pojazdy");
            System.out.println("3. Wyświetl wypożyczone pojazdy");
            System.out.println("4. Wypożycz pojazd");
            System.out.println("5. Zwróć pojazd");
            System.out.println("6. Oblicz koszt wypożyczenia");
            System.out.println("0. Wyjdź");
            System.out.println("Wybierz opcje: ");
            choice = input.InputInt();

            switch (choice) {
                case 1:
                    addVehicleMenu(wypozyczalnia, input);
                    break;
                case 2:
                    wypozyczalnia.displayAvailableVehicles();
                    break;
                case 3:
                    wypozyczalnia.displayRentedVehicles();
                    break;
                case 4:
                    rentVehicleMenu(wypozyczalnia, input);
                    break;
                case 5:
                    returnVehicleMenu(wypozyczalnia, input);
                    break;
                case 6:
                    calculateCostMenu(wypozyczalnia, input);
                    break;
                case 0:
                    System.out.println("Dziękujemy za skorzystanie z wypożyczalni pojazdów :)");
                    break;
                default:
                    System.out.println("Nieprawidłowa opcja. Sprobuj jeszcze raz. :)");
            }
        } while (choice != 0);

    }
        private static void calculateCostMenu (Zarzadzanie_wypozyczalnia wypozyczalnia, InputData input){
            System.out.println("Podaj ID pojazdu, który chcesz obliczyć koszt wypożyczenia:");
            input.InputString();
            String id = input.InputString();
            System.out.println("Podaj czas wypożyczenia (w godzinach):");
            int hours = input.InputInt();

            for (Vehicle vehicle : wypozyczalnia.getVehicles()) {
                if (vehicle.getId().equals(id)) {
                    System.out.println("Koszt wypożyczenia: " + vehicle.obliczKoszt(hours));
                    return;
                }
            }
            System.out.println("Pojazd o podanym ID nie istnieje.");
        }

        private static void rentVehicleMenu (Zarzadzanie_wypozyczalnia wypozyczalnia, InputData input){
            System.out.println("Podaj ID pojazdu, który chcesz wypożyczyć:");
            input.InputString();
            String id = input.InputString();
            wypozyczalnia.rentVehicle(id);

        }

        private static void returnVehicleMenu (Zarzadzanie_wypozyczalnia wypozyczalnia, InputData input){
            System.out.println("Podaj ID pojazdu, który chcesz zwrócić:");
            input.InputString(); // Dodaj tę linię, aby usunąć pozostały znak nowej linii
            String id = input.InputString();
            wypozyczalnia.returnVehicle(id);
        }

        private static void addVehicleMenu (Zarzadzanie_wypozyczalnia wypozyczalnia, InputData input){
            System.out.println("==== Dodawanie pojazdu ===========");
            System.out.println("1. Dodaj samochód");
            System.out.println("2. Dodaj rower");
            System.out.println("3. Dodaj hulajnogę elektryczną");
            System.out.println("Wybierz typ pojazdu: ");
            int type = input.InputInt();
            input.InputString();// Dodaj tę linię, aby usunąć pozostały znak nowej linii
            System.out.println("Podaj ID pojazdu:");
            String id = input.InputString();
            System.out.println("Podaj markę pojazdu:");
            String brand = input.InputString();
            System.out.println("Podaj model pojazdu:");
            String model = input.InputString();
            switch (type) {
                case 1:
                    wypozyczalnia.addVehicle(new Car(id, brand, model));
                    break;
                case 2:
                    wypozyczalnia.addVehicle(new Bike(id, brand, model));
                    break;
                case 3:
                    wypozyczalnia.addVehicle(new ElectricScooter(id, brand, model));
                    break;
                default:
                    System.out.println("Nieprawidłowy typ pojazdu");
            }
        }

    public static void Zadanie2() {
        System.out.println("========== Zadanie 2 ===========");
        GlownyProgram glownyProgram = new GlownyProgram();
        GlownyProgram.UruchomZadanie2();
    }


}

