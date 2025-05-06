package TASKS.LAB05.zadaniadomowe;

import java.util.Scanner;

public class WprowadzenieStudenta {
    public Student nowyStudent;
    public void WprowadzenieStudentaRun() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Wprowadź dane Studenta: ");
        System.out.println("Imie: ");
        String imie=sc.nextLine();
        System.out.println("Nazwisko: ");
        String nazwisko=sc.nextLine();
        System.out.println("Wiek: ");
        int wiek=sc.nextInt();
        System.out.println("Specjalnosc: ");
        sc.nextLine();
        String specjalnosc=sc.nextLine();
        System.out.println("Nr Albumu: ");
        int nrAlbumu=sc.nextInt();
        System.out.println("Rok studiow: ");
        int rokStudiow=sc.nextInt();
        nowyStudent = new Student(new Osoba(imie,nazwisko,wiek),specjalnosc,nrAlbumu,rokStudiow);
        System.out.println("\nWprowadzone dane studenta: ");
        nowyStudent.wyswietl();
    }
    public Student getNowyStudent() {return nowyStudent;}
}
