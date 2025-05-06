package TASKS.LAB02;

import java.util.Scanner;

public class InputData {
    Scanner input = new Scanner(System.in);
    public int InputInt(){
        return input.nextInt();
    }
    public double InputDouble(){
        return  input.nextDouble();
    }
    public String InputString() {return input.nextLine();}
    public float InputFloat(){return  input.nextFloat();}
    public boolean InputBoolean(){return input.nextBoolean();}
}
