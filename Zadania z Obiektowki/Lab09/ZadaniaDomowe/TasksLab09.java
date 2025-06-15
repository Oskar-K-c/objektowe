package TASKS.LAB09.ZadaniaDomowe;

import java.util.*;

import static TASKS.LAB09.ZadaniaDomowe.Uczestnicy.pelnoletniArrays;
import static TASKS.LAB09.ZadaniaDomowe.Uczestnicy.pelnoletniList;

public class TasksLab09 {
    public static void zadanie1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imiona ----wpisz ( - ) aby zakończyć)");
        List<String> name = new ArrayList<>();
        while (true) {
            String imie = scanner.nextLine();
            if (imie.equals("-")) {
                break;
            }
            name.add(imie);
        }
//        for (String ime : name) {
//            System.out.println(ime);
//        }

        Set<String> unique = new HashSet<>(name);
        System.out.println("Liczba unikalnych imion: "+unique.size());
    }

    public static void zadanie2() {
        Scanner scanner = new Scanner(System.in);
        List<String> names = new ArrayList<>();
        while (true) {
            System.out.println("Podaj imiona Pary----wpisz ( - ) aby zakończyć");
            System.out.println("1 Osoba z pary:");
            String imie1 = scanner.nextLine();
            System.out.println("2 Osoba z pary:");
            String imie2 = scanner.nextLine();
            if (imie1.equals("-")) {
                break;
            }
            if (imie2.equals("-")) {
                break;
            }
            names.add(imie1);
            names.add(imie2);
        }

        System.out.println("Podaj imie, aby znaleźć partnera: ");
        String szukaneImie = scanner.nextLine();
        boolean znalez = false;
        for(int i = 0; i<names.size(); i+=2){
            if (names.get(i).equalsIgnoreCase(szukaneImie)){
                System.out.println("Partner dla: "+ szukaneImie+ " to "+names.get(i+1));
                znalez = true;
                break;
            }else if (i+1<names.size() && names.get(i+1).equalsIgnoreCase(szukaneImie)){
                System.out.println("Partner dla: "+ szukaneImie+ " to "+names.get(i));
                znalez = true;
                break;
            }
        }

        if (!znalez){
            System.out.println("Nie znaleziono partnera dla imienia:" + szukaneImie);
        }
    }

    public static void zadanie3() {
        LinkedList<Uczestnicy> uczestnicyLinkedList = new LinkedList<>();
        uczestnicyLinkedList.add(new Uczestnicy(1,"Jan",25));
        uczestnicyLinkedList.add(new Uczestnicy(2, "Anna", 16));
        uczestnicyLinkedList.add(new Uczestnicy(3, "Piotr", 17));
        uczestnicyLinkedList.add(new Uczestnicy(4, "Maria", 30));
        uczestnicyLinkedList.add(new Uczestnicy(5, "Dominik", 21));

        System.out.println("Wszyscy użytkownicy: ");
        //uczestnicyLinkedList.forEach(uczestnicy -> System.out.println(uczestnicy));
        uczestnicyLinkedList.forEach(System.out::println);

        System.out.println("Pełnoletni uczestnicy: ");
        List<Uczestnicy> pelnoletnilinkedlist = pelnoletniList(uczestnicyLinkedList);
        pelnoletnilinkedlist.forEach(System.out::println);

        System.out.println("ARRAYSY");
        ArrayList<Uczestnicy> uczestnikArray = new ArrayList<>();
        uczestnikArray.add(new Uczestnicy(1,"Jan",25));
        uczestnikArray.add(new Uczestnicy(2, "Dominik Kuraś", 5));
        uczestnikArray.add(new Uczestnicy(5, "Krzysztof", 15));
        uczestnikArray.add(new Uczestnicy(6, "Agnieszka", 22));
        uczestnikArray.add(new Uczestnicy(7, "Michał", 17));
        uczestnikArray.add(new Uczestnicy(8, "Barbara", 19));

        System.out.println("Wszyscy użytkownicy: (Array list):");
        uczestnikArray.forEach(System.out::println);
        System.out.println("Pełnoletni uczestnicy: ");
        List<Uczestnicy> pelnoletniArray = pelnoletniArrays(uczestnikArray);
        pelnoletniArray.forEach(System.out::println);

    }

    public static void zadanie4() {
        Book[] books={
                new Book("Pan Tadeusz", "Adam Mickiewicz", 1834),
                new Book("Lalka", "Bolesław Prus", 1890),
                new Book("W pustyni i w puszczy", "Henryk Sienkiewicz", 1911),
                new Book("Zbrodnia i kara", "Fiodor Dostojewski", 1866),
                new Book("Mistrz i Małgorzata", "Michaił Bułhakow", 1967)
        };

        List<Book> bookList = new ArrayList<>(Arrays.asList(books));
        System.out.println("Lista: ");
        bookList.forEach(System.out::println);

        List<Book> subList = bookList.subList(1, 3);
        System.out.println("Podlista (indeksy 1-2):");
        subList.forEach(System.out::println);

        subList.clear();
        System.out.println("Lista po usunieciu podlisty:");
        bookList.forEach(System.out::println);
    }

    public static void zadanie5() {
        List<Integer> Numbers = new ArrayList<>();
        Numbers.add(1);
        Numbers.add(22);
        Numbers.add(3);
        Numbers.add(4);
        Numbers.add(577);
        Numbers.add(66);
        Numbers.add(3);
        Numbers.add(10);

        System.out.println("Oryginalna lista: ");
        for(Integer number : Numbers) {
            System.out.println(number);
        }

        //druga lista
        List<Integer> Numbers2 = new ArrayList<>(); //-pusta lista

        ListIterator<Integer> listIterator = Numbers.listIterator(Numbers.size()); //iterator na koniec listy
        while(listIterator.hasPrevious()) { // do momentu gdy iterator ma cos poprzedniego to się wykonuje
            Integer element = listIterator.previous();
            Numbers2.add(element);
        }

        System.out.println(" 2. Lista: ");
        for(Integer number : Numbers2) {
            System.out.println(number);
        }

    }
}
