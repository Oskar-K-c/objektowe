package TASKS.LAB05.zadaniadomowe;

import java.util.Scanner;

public class ZarzadzanieStudentami {
    private Student[] studenci =  new Student[50];

    public void StworzStudentow() {
        for (int i = 0; i < studenci.length; i++) {
            studenci[i] = new Student(new Osoba("","",0),"",0,0);
        }
    }

    public void wprowadzStudenta(int index) {
        if(index>=0 && index<studenci.length){
            WprowadzenieStudenta wp = new WprowadzenieStudenta();
            wp.WprowadzenieStudentaRun();
            studenci[index]=wp.getNowyStudent();
            System.out.println("Dane studenta zostały wprowadzone i znajdują się pod indexem: "+index);
        }else{
            System.out.println("Nieprawidłowy index studenta");
        }
    }

    public void EdytujStudenta(int index) {
        Scanner sc = new Scanner(System.in);
        if(index>=0 && index<studenci.length){
            System.out.println("Jaki rodzaj danych chcesz zmodyfikować ? ");
            System.out.println("1. Imie");
            System.out.println("2. Nazwisko");
            System.out.println("3. Wiek");
            System.out.println("4. Specjalnosc");
            System.out.println("5. nrAlbumu");
            System.out.println("6. rokStudiow");
            System.out.println("0. ANULUJ");
            int choice= sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    System.out.println("Podaj imie:");
                    String imie = sc.nextLine();
                    studenci[index].getOsoba().setImie(imie);
                    break;
                case 2:
                    System.out.println("Podaj nazwisko:");
                    String nazwisko = sc.nextLine();
                    studenci[index].getOsoba().setNazwisko(nazwisko);
                    break;
                case 3:
                    System.out.println("Podaj wiek:");
                    int wiek = sc.nextInt();
                    studenci[index].getOsoba().setWiek(wiek);
                    break;
                case 4:
                    System.out.println("Podaj specjalnosc:");
                    String specjalnosc = sc.nextLine();
                    studenci[index].setSpecjalnosc(specjalnosc);
                    break;
                case 5:
                    System.out.println("Podaj nrAlbumu:");
                    int nrAlbumu = sc.nextInt();
                    studenci[index].setNrIndeks(nrAlbumu);
                    break;
                case 6:
                    System.out.println("Podaj rokStudiow:");
                    int rokStudiow = sc.nextInt();
                    studenci[index].setRokStudiow(rokStudiow);
                    break;
                default:
                    System.out.println("Anulowano edycję.");
                    break;
            }
        }else{
            System.out.println("Nieprawidłowy index studenta");
        }
    }

    public void usunStudenta(int deleteIndex) {
        if(deleteIndex>=0 && deleteIndex<studenci.length){
            studenci[deleteIndex]=new Student(new Osoba("","",0),"",0,0);
            System.out.println("Studen został usuniety pod indexem: "+ deleteIndex);
        }else {
            System.out.println("Nieprawidłowy index studenta");
        }
    }

    public void wyswietlDaneStudenta(int showIndex) {
        if(showIndex>=0 && showIndex<studenci.length){
            studenci[showIndex].wyswietl();
        }else {
            System.out.println("Nieprawidłowy index studenta");
        }
    }

    public void wyswietlWszystkich() {
        for(int i=0;i<studenci.length;i++){
            System.out.println("\nNR."+(i+1)+": ");
            studenci[i].wyswietl();
        }
    }

    public void wyswietlZakresStudentow(int dolny, int gorny) {
        if(dolny>=0 && gorny<studenci.length && dolny<gorny){
            System.out.println("Studenci w zakresie od indeksu "+dolny+" do "+gorny);
            for(int i=dolny; i<=gorny;i++){
                System.out.println("\nNR."+(i+1)+": ");
                studenci[i].wyswietl();
            }
        }else{
            System.out.println("Nieprawidlowy zakes studentow");
        }
    }
}
