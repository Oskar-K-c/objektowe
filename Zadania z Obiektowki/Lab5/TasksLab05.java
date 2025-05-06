package TASKS.LAB05.zadaniadomowe;

import java.util.Scanner;

public class TasksLab05 {
    protected void Zadanie1() {
        TASKS.LAB05.zadaniadomowe.DaneOsoby dane = new TASKS.LAB05.zadaniadomowe.DaneOsoby();
        dane.Uruchom();
    }

    public void Zadanie2() {
        Student student1 = new Student(new Osoba("Janusz", "Korwin", 25));
        Student student2 = new Student(new Osoba("Jan","Kowalski",20),123543,3);
        Student student3 = new Student(new Osoba("Anna", "Nowak", 21),"Informatyka", 2153,2);
        Student student4 = new Student(new Osoba("Kamil", "Wrona", 25),"Matematyka",43242);

        System.out.println("\nDane studenta 1: ");
        student1.wyswietl();
        System.out.println("\nDane studenta 2: ");
        student2.wyswietl();
        System.out.println("\nDane studenta 3: ");
        student3.wyswietl();
        System.out.println("\nDane studenta 4: ");
        student4.wyswietl();
    }


    public void Zadanie3() {
        WprowadzenieStudenta wp=new WprowadzenieStudenta();
        wp.WprowadzenieStudentaRun();
    }

    public void Zadanie4() {
        ZarzadzanieStudentami zarzadzanie = new ZarzadzanieStudentami();
        Scanner sc=new Scanner(System.in);
        boolean dzialaj = true;
        zarzadzanie.StworzStudentow();

        while (dzialaj) {
            System.out.println("Co chcesz zrobić z studentami?");
            System.out.println("1. Wprowadź dane studenta");
            System.out.println("2. Edytuj dane studenta");
            System.out.println("3. Usuń dane studenta");
            System.out.println("4. Wyświetl dane studenta");
            System.out.println("5. Wyświetl wszystkich studentów");
            System.out.println("6. Wyświetl studenci w podanym zakresie");
            System.out.println("7. Wyjdź z zarządzania studentami");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Podaj indeks, pod ktory chcesz dodać studenta: ");
                    int index = sc.nextInt();
                    zarzadzanie.wprowadzStudenta(index);
                    break;
                case 2:
                    System.out.println("Podaj indeks, pod ktorym chcesz edytowac studenta: ");
                    int editIndex = sc.nextInt();
                    zarzadzanie.EdytujStudenta(editIndex);
                    break;
                case 3:
                    System.out.println("Podaj indeks, pod ktorym chcesz usunąć studenta: ");
                    int deleteIndex = sc.nextInt();
                    zarzadzanie.usunStudenta(deleteIndex);
                    break;
                case 4:
                    System.out.println("Podaj indeks, pod ktorym chcesz Wyświetlić dane studenta: ");
                    int showIndex = sc.nextInt();
                    zarzadzanie.wyswietlDaneStudenta(showIndex);
                    break;
                case 5:
                    System.out.println("Wyswietlenie wszystkich studentow: ");
                    zarzadzanie.wyswietlWszystkich();
                    break;
                case 6:
                    System.out.println("Podaj dolny zakres studentow do wyswietlenia:");
                    int dolny = sc.nextInt();
                    System.out.println("Podaj gorny zakres studentow do wyswietlenia:");
                    int gorny = sc.nextInt();
                    zarzadzanie.wyswietlZakresStudentow(dolny,gorny);
                    break;
                case 7:
                    System.out.println("Wychodzenie...");
                    dzialaj=false;
                    break;
                default:
                    System.out.println("Zły wybór.");
                    break;
            }
        }

    }
}
