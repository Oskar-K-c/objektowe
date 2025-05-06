package TASKS.LAB03;

import TASKS.LAB02.InputData;

import java.util.Arrays;
import java.util.Collections;

public class NAUKA {
    //obiekt klasy inputdata
    InputData inputData=new InputData();

    public void RunMain() {
        System.out.println("=========================");
        System.out.println("Tablice jednowymiarowe");
        System.out.println("=========================");
        int[] tablica1 = {1, 2, 3, 4, 5};
        tablica1[4]=7;
        tablica1[0]=5;
        //petla for, lenght - dlugosc tablicy,
        for(int i=0; i<tablica1.length; i++) {
            System.out.println("Element " + (i+1) + ": " + tablica1[i]);
        }
        System.out.println("Pętla foreach");
        for (int item:tablica1) {
            System.out.println(item);
        }

        //tablice dwuwymiarowe
        System.out.println("tablice dwuwymiarowe");
        int[][] arr=new int[3][4];
        //nieregularna tablica dwuwymiarowa
        int[][] arr2={
                {1,2,3,7,4,8,3},
                {4,5},
                {7,5,2,1,8}
        };

        for (int i=0; i<arr2.length; i++) {
            for(int j=0; j<arr2[i].length; j++) {
                System.out.print(arr2[i][j]+" \t\t");
            }
            System.out.println();
        }

        System.out.println("Kopiowanie tablicy");
        int[] kopiatablica=new int[tablica1.length];
        //kopiowanie tablicy, metoda copyOf() z biblioteki java.util.Arrays
        kopiatablica= Arrays.copyOf(tablica1, tablica1.length);
        for(int i=0; i<kopiatablica.length; i++) {
            System.out.println((i+1)+".Element tablicy: " +kopiatablica[i]);
        }

        //kopiowanie talicy metodą clone
        int[] original = {1, 22,3, 4,7,1,3,6,1,656,23,45,4234,546,456,35,5,7654};
        int[] copy = original.clone();
        System.out.println("Kopiowanie tablicy przy użyciu metody clone");
        for (int i = 0; i < copy.length; i++) {
            System.out.println((i+1)+".Element tablicy: " + copy[i]);
        }
        //kopiowanie tablicy metodą arrays.copyOfRange()
        int[] kopiatablica2=Arrays.copyOfRange(original, 2, 7);
        System.out.println("Kopiowanie tablicy przy użyciu metody arrays.copyOfRange()");
        for(int i=0; i<kopiatablica2.length; i++) {
            System.out.println((i+1)+".Element tablicy: " + kopiatablica2[i]);
        }

        //wypiswanie tablicy jako stringa
        System.out.println("Wypisywanie tablicy za pomocą metody toString() - tablica jako string");
        //Arrays.toString(original);
        System.out.println(Arrays.toString(original));
        System.out.printf("Wypisanie tablicy dwuwymiarowej za pomoca metody deepToString() - tablica jako string\n");
        System.out.println(Arrays.deepToString(arr2));

        //sortowanie tablicy
        int[] original1={7,52,3,5,-1,6,7,1,34,3,21,5};
        System.out.println("Sortowanie tablicy według indeksu");
        Arrays.sort(original1,2,10);
        System.out.println(Arrays.toString(original1));

        System.out.println("Sortowanie tablicy według wartości");
        Arrays.sort(original1);
        System.out.println(Arrays.toString(original1));

        //typ obiektowy
        Integer[] obiekt={1,2,3,-55,3,5,823,34,-54,-11,6,2};
        System.out.printf("Tablica: "+ Arrays.toString(obiekt));
        System.out.printf("\nTablica posortowana według wartości malejąco: ");
        Arrays.sort(obiekt, Collections.reverseOrder());
        System.out.printf(Arrays.toString(obiekt));

        Integer[] arrInteger;
        arrInteger = Arrays.stream(obiekt).toArray(Integer[]::new);
        Arrays.sort(arrInteger, Collections.reverseOrder());
        System.out.println("\nTablica posortowana według wartości malejąco (przez strumienie): " + Arrays.toString(arrInteger));

        //automatyczne generowanie tablicy
        int[] generowanaTablica = new int[15];
        Arrays.fill(generowanaTablica,1,14,3);
        System.out.println("Tablica generowana automatycznie: " + Arrays.toString(generowanaTablica));

        //porównywanie tablic metodą equals()
        int[] tablica1_2 = {11, 23, 35, 46, 56};
        int[] tablica2_2 = {1, 2, 3, 4, 5};
        int[] tablica3_2 = {11, 23, 35, 46, 56};
        System.out.printf("metoda equals() - porównywanie tablic czy są identyczne: \n");
        System.out.println("Porównanie tablicy 1 i 2: " + Arrays.equals(tablica1_2, tablica2_2));//false
        System.out.printf("Porównanie tablicy 1 i 3: " + Arrays.equals(tablica1_2, tablica3_2));//true
        System.out.println("\nPorównanie tablicy 2 i 3: " + Arrays.equals(tablica2_2, tablica3_2));//false

        //obiektowo integer
        Integer[] tablica1_3 = {1, 2, 3, 4, 5};
        Integer[] tablica2_3 = {11, 22, 33, 44, 55};
        Integer[] tablica3_3 = {1, 2, 3, 4, 6};
        Integer[] tablica4_3 = {1, 2, 3, 4, 5};
        System.out.printf("Metoda deepEquals() \n");
        System.out.printf("Porównanie tablicy 1 i 2: " + Arrays.deepEquals(tablica1_3, tablica2_3));
        System.out.printf("\nPorównanie tablicy 1 i 3: " + Arrays.deepEquals(tablica1_3, tablica3_3));
        System.out.printf("\nPorównanie tablicy 2 i 3: " + Arrays.deepEquals(tablica2_3, tablica3_3));
        System.out.printf("\nPorównanie tablicy 1 i 4: " + Arrays.deepEquals(tablica1_3, tablica4_3));//true


        //compare
        System.out.printf("Porównanie tablic przy użyciu metody compare()\n");
        int[] com1 = {1, 2, 3};
        int[] com2 = {1, 2, 3};
        int[] com3 = {1, 2, 4};
        int[] com4 = {1, 2};
        int[] com5 = {1, 2,2554};
        //porównanie leksykograficzne
        System.out.println("Porównanie tablicy com1 i com2: " + Arrays.compare(com1, com2)); // 0 - takie samo
        System.out.println("Porównanie tablicy com1 i com3: " + Arrays.compare(com1, com3)); // -1 - com1 jest mniejsze od com3
        System.out.println("Porównanie tablicy com1 i com4: " + Arrays.compare(com1, com4)); // 1 - com1 jest wieksze od com4
        System.out.println("Porównanie tablicy com1 i com5: " + Arrays.compare(com1, com5)); // -1 -com1 jest mniejsze od com5

    }
}
