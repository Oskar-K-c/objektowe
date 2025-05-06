package TASKS.LAB03;

import java.util.Random;

public class RandomValue {
    public int[] RandValue(int a, int b, int ilosc){
        if(a > b){
            System.out.println("Początek przedziału musi być mniejszy od końca.\n");
            return null;
        }
        if(ilosc<= 0){
            System.out.println("Liczba losowań musi być większa od 0.\n");
            return null;
        }
        Random rand = new Random();
        int[] values = new int[ilosc];
        for(int i = 0; i < values.length; i++){
            values[i] = rand.nextInt(b - a + 1) + a;
        }
        return values;
    }
}
