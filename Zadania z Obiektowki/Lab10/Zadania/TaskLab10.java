package TASKS.LAB10.Zadania;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TaskLab10 {
    static Scanner sc = new Scanner(System.in);
    public static void Zadanie1(){
        System.out.println("Wprowadź tekst: ");
        String tekst= sc.nextLine();
        tekst = tekst.toLowerCase().replaceAll("[,.!?;:@#$%^&*()_+]","");
        //ala
        String[] words = tekst.split("\\s++"); // pozbycie się biąłych znaków
        Map<String, Integer> wordMap = new HashMap<>();
        for (String word : words) {
            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
        }
        System.out.println("Lista wystąpień słów: ");
        for(Map.Entry<String, Integer> entry : wordMap.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void Zadanie2(){
        new SystemLogowania().MenuLogowania();
    }
    public static void Zadanie3(){
        new Dania().ListaDan();
    }
}
