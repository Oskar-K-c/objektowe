package TASKS.LAB04;
import TASKS.LAB02.InputData;
import TASKS.LAB03.RandomValue;

import java.util.Arrays;


public class TASK_LAB04 {

    public static void zadanie1() {
        InputData input = new InputData();
        System.out.println("Podaj początek przedziału:");
        int start = input.InputInt();
        System.out.println("Podaj koniec przedziału:");
        int end = input.InputInt();
        System.out.println("Podaj ilosc elementow ciągu: ");
        int ilosc = input.InputInt();
        RandomValue Rand = new RandomValue();
        //losowanie elementów tablicy i wyświetlanie ich
        int[] arr = Rand.RandValue(start, end, ilosc);
        System.out.println("Wylosowana tablica: \n");
        System.out.printf(Arrays.toString(arr));

        int sumafor = 0, sumaforeach = 0;
        double avgfor = 0, avgforeach = 0;
        //petla for
        for (int i = 0; i < arr.length; i++) {
            sumafor += arr[i];
        }
        avgfor = ((double) sumafor / arr.length);
        System.out.println("\nSuma dla petli for: " + sumafor);
        System.out.println("\nSrednia dla petli for: " + avgfor);

        //petla foreach
        for (int liczba : arr) {
            sumaforeach += liczba;
        }
        avgforeach = ((double) sumaforeach / arr.length);
        System.out.println("\nSuma dla petli foreach: " + sumaforeach);
        System.out.println("\nSrednia dla petli foreach: " + avgforeach);

    }

    public static void zadanie2() {
        InputData input = new InputData();
        RandomValue Rand = new RandomValue();
        int[] arr1 = new int[10];
        int[] arr2 = new int[9];
        arr1 = Rand.RandValue(-100, 1000, 10);
        arr2 = Rand.RandValue(-100, 1000, 9);
        System.out.println("Wyświetlenie tablic: ");
        System.out.println("Tablica 1(parzysta): " + Arrays.toString(arr1));
        System.out.println("Tablica 2(nieparzysta): " + Arrays.toString(arr2));
        //wypisywanie co 2 elementy z tablic
        System.out.println("\nWypisywanie co 2 elementy z tablic: ");
        System.out.println("Tablica 1(parzysta): ");
        for (int i = 0; i < arr1.length; i += 2) {
            System.out.println("Element " + (i + 1) + ": " + arr1[i]);
        }
        System.out.println("\nTablica 2(nieparzysta): ");
        for (int i = 0; i < arr2.length; i += 2) {
            System.out.println("Element " + (i + 1) + ": " + arr2[i]);
        }


    }

    public static void zadanie3() {
        String[] words = {"pies", "kot", "królik", "słon", "wilk", "osoba", "żaba", "zwierzak", "ryba", "gigaCzad"};
        for (String word : words) {
            System.out.println("Słowo: " + word.toUpperCase() + ", długość: " + word.length());
        }
    }

/*      //typ obiektowy
        Integer[] obiekt={1,2,3,-55,3,5,823,34,-54,-11,6,2};
        System.out.printf("Tablica: "+ Arrays.toString(obiekt));
        System.out.printf("\nTablica posortowana według wartości malejąco: ");
        Arrays.sort(obiekt, Collections.reverseOrder());
        System.out.printf(Arrays.toString(obiekt));
    */


    public static void zadanie4() {
        String[] words = new String[5];
        InputData input = new InputData();
        for (int i = 0; i < 5; i++) {
            System.out.println("Podaj " + (i + 1) + " słowo:");
            words[i] = input.InputString();
        }
        System.out.println("Podane słowa: ");
        for (String word : words) {
            System.out.println(word);
        }
        System.out.println("Słowa w odwrotnej kolejności: ");
        for (int i = words.length - 1; i >= 0; i--) {
            String reversedWord = new StringBuilder(words[i]).reverse().toString();
            System.out.println(reversedWord);
        }
    }

    public static void zadanie5() {
        InputData input = new InputData();
        System.out.println("Sortowanie elementów w tablicy: ");
        int[] arr = new int[8];
        for (int i = 0; i < 8; i++) {
            System.out.println("Podaj " + (i + 1) + " liczbę:");
            arr[i] = input.InputInt();
        }
        System.out.println("Wybierz metodę sortowania: ");
        System.out.println("1-sortowanie z użyciem Arrays.sort");
        System.out.println("2-własny algorytm sortowania (sortowanie bąbelkowe))");
        int choice = input.InputInt();
        switch (choice) {
            case 1:
                Arrays.sort(arr);
                System.out.println("Posortowane elementy: " + Arrays.toString(arr));
                break;
            case 2:
                bubbleSort(arr);
                System.out.println("Posortowane elementy: " + Arrays.toString(arr));
                break;
            default:
                System.out.println("Nieprawidłowa opcja!");
                break;
        }
    }

    public static void zadanie6() {
        InputData input = new InputData();
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Podaj " + (i + 1) + " liczbę:");
            arr[i] = input.InputInt();
        }
        System.out.println("Podane liczby: " + Arrays.toString(arr));
        for(int liczby: arr){
            if(liczby<0){
                System.out.println("Liczba :"+liczby+" jest ujemna. Silnia nie może być ujemna!");
            }else{
                System.out.println("Silnia liczby " + liczby + " to: " + silnia(liczby));
            }
        }
    }

    public static void zadanie7() {
        /*Napisz program, w którym zdefiniujesz dwie tablice przechowujące wartości typu String.
        Zainicjalizuj obie tablice takimi samymi wartościami, w takiej samej kolejności. Napisz kod,
        który porówna obie tablice i odpowie na pytanie, czy są one takie same.*/
        String[] tab1 = {"abc", "def", "ghi"};
        String[] tab2 = {"abc", "def", "ghi"};
        if (Arrays.equals(tab1, tab2)) {
            System.out.println("Obie tablice są takie same.");
        } else {
            System.out.println("Obie tablice nie są takie same.");
        }

    }

    public static void zadanie4b() {
        //chciałem zrobić na wzor tego co robiłem w c, ale cos nie wyszlo
        InputData input = new InputData();
        System.out.println("Podaj słowo do odwrocenia:  ");
        String word = input.InputString();
        System.out.println("Wprowadzony napis to: " + word);
        //usuwam znak nowej lini(jeśli istnieje)
        word = word.replace("\n", "").replace("\r", "");
        //odwracam napis i zmieniam na duze litery
        System.out.println("Odwracam napis i zmieniam na duze litery: ");
        for (int i = word.length() - 1; i >= 0; i--) {
            System.out.println(Character.toUpperCase(word.charAt(i)));
        }
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    //swap elements
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
    }

    public static int silnia(int n) {
        if(n == 0) return 1;
        else return n * silnia(n - 1);
    }
}
