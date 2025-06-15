package TASKS.LAB08.NAUKA;

import java.util.Scanner;
import java.util.SortedMap;

public class EXCEPTIONv1{
   // public static void main(String[] args) {






//        Scanner input = new Scanner(System.in);
//        System.out.println("Podaj liczbę:");
//
//        try{
//            String wejscie= input.next();
//            double liczba= Double.parseDouble(wejscie);
//
//            if(liczba< 0){
//                throw new IllegalArgumentException("Nie można obliczyć pierwiastka z liczby ujemnej");
//            }
//            double pierwiastek = Math.sqrt(liczba);
//            System.out.println("Pierwiastek z "+liczba+ " = "+ pierwiastek);
//        }catch (NumberFormatException e ){
//            System.out.println("Bład: podano niepoprawna liczbe");
//        }
//        catch (IllegalArgumentException e){
//            System.out.println("błąd: "+ e.getMessage());
//        }


//        try{
//            sprawdz(17);
//        }catch (MojeWyjatki e){
//            System.out.println("Bład: "+ e.getMessage());
//        }

//        try{
//            System.out.println("Wynik = "+ dziel(11,0));
//        }catch (NiepoprawneDzielenieException e){
//            System.out.println("Błąd: "+ e.getMessage());
//        }

/*        try{
            float a=5;
            float b=3;
            if(b==0){
                throw new ArithmeticException("Nie można dzielić przez 0");
            }
            float wynik = a/b;
            System.out.println("Wynik = " + wynik);
        }catch (ArithmeticException e ){
            System.out.println("Błąd: " + e.getMessage());
        } finally {
            System.out.println("Blok finally - Sprzątanie zasobów");
        }*/

//        try{
//            int dzielenie =5/0;
//            System.out.println("Wynik = "+ dzielenie);
//        }catch (ArithmeticException e){
//            System.out.println("Błąd: "+ e.getMessage());
//        }finally {
//            System.out.println("Blok finally - zawsze się wykonuje");
//        }


//        try {
//            throw new IllegalArgumentException("Zły argument");
//        } catch (IllegalArgumentException e) {
//            System.out.println("Błąd: " + e.getMessage());
//        } finally {
//            System.out.println("Blok finally");
//        }



    //}
    public static void sprawdz (int wiek) throws MojeWyjatki {
        if (wiek <18){
            throw new MojeWyjatki("Uzytkownik jest niepełnoletni");
        }else System.out.println("Użytkownij jest pełnoletni");
    }
//    public static int dziel(int i, int i1) throws NiepoprawneDzielenieException{
//        if(i1 ==0){
//            throw new NiepoprawneDzielenieException("Nie można dzielić przez 0");
//        }
//        return i/i1;
//    }

//    public static int getNumberofSeconds(int hours){
//        if (hours < 0 ){
//            throw new IllegalArgumentException("Godziny muszą być >= 0: "+ hours);
//        }
//        return hours * 60 *60;
//    }
}
