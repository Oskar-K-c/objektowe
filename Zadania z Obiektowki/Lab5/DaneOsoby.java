package TASKS.LAB05.zadaniadomowe;

public class DaneOsoby {
    public void Uruchom(){
        Osoba osoba1=new Osoba("Dominik", "Kuraś", 21);
        Osoba osoba2=new Osoba("Bartosz",25);
        Osoba osoba3=new Osoba();

        System.out.println("Dane osoby 1:");
        osoba1.pokazDane();
        System.out.println("Dane osoby 2:");
        osoba2.pokazDane();
        System.out.println("Dane osoby 3:");
        osoba3.pokazDane();
    }
}
