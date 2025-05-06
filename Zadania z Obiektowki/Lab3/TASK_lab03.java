package TASKS.LAB03;

import TASKS.LAB02.InputData;

public class TASK_lab03 {

    public static void close() {
        System.out.println("Zamykanie programu");
        System.exit(0);
    }

    public static void Zadanie5(String word) {
        //usuwam biale znaki i zamieniam na małe litery
        word=word.replaceAll("\\s+", "").toLowerCase();
        String reverseword= new StringBuilder(word).reverse().toString();// odwracam kolejność liter
        System.out.println("Słowo odwrotne: " + reverseword);
        if(word.equals(reverseword)) {
            System.out.println("Słowo jest palindromem");
        }else {
            System.out.println("słowo nie jest palindromem");
        }

    }

    public static void Zadanie4() {
        InputData input = new InputData();
        System.out.println("Podaj początek przedziału:");
        int start = input.InputInt();
        System.out.println("Podaj koniec przedziału:");
        int end = input.InputInt();
        System.out.println("Podaj ilosc elementow ciągu: ");
        int ilosc = input.InputInt();
        RandomValue Rand = new RandomValue();
        int[] arr=Rand.RandValue(start, end, ilosc);
        int sumaparzystych = 0;
        //wyswietlamy tablice
        for (int number : arr) {
            System.out.print(number + " ");
            if(number % 2 == 0) {
                sumaparzystych+=number;
            }
        }
        System.out.println("\nSuma parzystych elementow: " + sumaparzystych);
    }

    public static void Zadanie3(int n) {
        InputData input_data = new InputData();
        int i = 0,sumaparzyste = 0;
        while (n > 0) {
            System.out.println("Podaj "+(i+1)+" liczbę:  ");
            int liczba = input_data.InputInt();
            if(liczba%2==0){
                sumaparzyste += liczba;
            }
            n--;i++;
        }
        System.out.println("Suma parzystych liczb: " + sumaparzyste);
    }

    public static void Zadanie2() {
        InputData input_data = new InputData();
        int iloscplus = 0, iloscminus = 0, sumaplus = 0, sumaminus = 0;
        for (int i = 0; i < 10; i++) {
            System.out.printf("Podaj "+(i+1)+" liczbę:  ");
            int liczba = input_data.InputInt();
            if (liczba >= 0) {
                iloscplus++;
                sumaplus += liczba;
            } else {
                iloscminus++;
                sumaminus += liczba;
            }
        }
        System.out.println("Ilość liczb dodatnich: " + iloscplus);
        System.out.println("Suma liczb dodatnich: " + sumaplus);
        System.out.println("Ilość liczb ujemnych: " + iloscminus);
        System.out.println("Suma liczb ujemnych: " + sumaminus);
    }

    public static void Zadanie1(int n) {
        InputData input_data = new InputData();
        int punkty=0,i=0;
        while(n>0){
            System.out.println("Podaj liczbę punktów dla "+(i+1)+" studenta: ");
            int punkty_studenta=input_data.InputInt();
            punkty+=punkty_studenta;
            n--;i++;
        }
        System.out.println("Średnia punków wynosi: "+(punkty/n));
    }
}
