package TASKS.LAB01;
import java.util.Scanner;
//klasa do wczytywania danych
public class InputDataLAB1 {
    //obiekt klasy scanner
    Scanner input = new Scanner(System.in);


    //metoda do pobierania danych od użytkownika
    protected int InputInt(){
        return input.nextInt();
    }
    //kolejne metody do wczytywania float, double, sting, boolen
    protected float InputFloat(){
        return input.nextFloat();
    }
    protected double InputDouble(){
        return input.nextDouble();
    }
    protected String InputString(){
        return input.nextLine();
    }
    protected boolean InputBoolean(){
        return input.nextBoolean();
    }


}
