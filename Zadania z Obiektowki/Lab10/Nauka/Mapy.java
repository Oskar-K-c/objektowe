package TASKS.LAB10.Nauka;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Mapy {




//    public class Main {
//        public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Podaj tekst: ");
//        String tekst = input.nextLine();
//        tekst = tekst.toLowerCase().replaceAll("[.,!?;:]","");//wykorzystanie regex'a
//        // , . ! ? ; :        Ala. -> ala
//        String[] words = tekst.split("\\s++"); //pozbycie sie bialych znakow
//        Map<String, Integer> wordMap = new HashMap<>();
//        for (String word : words) {
//            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
//        }
//        System.out.println("Lista wystąpień słów:\n");
//        for(Map.Entry<String, Integer> entry : wordMap.entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }
//    }
//    }




//    public static void main(String[] args) {
//        //Przykład 3: LinkedHashMap
//        LinkedHashMap<Integer, String> kolejka = new LinkedHashMap<>();
//        kolejka.put(1, "Piotr");
//        kolejka.put(2, "Maria");
//        kolejka.put(3, "Kuba");
//
//        for (Integer key : kolejka.keySet()) {
//            System.out.println("Numer: "+key+" - "+kolejka.get(key));
//        }



//        //Przykład 2. TreeMap
//        HashMap<String, Double> saldo = new HashMap<>();
//        saldo.put("John", 205.3);
//        saldo.put("Jane", 115.3);
//        saldo.put("Jack", 5617.3);
//        saldo.put("Jill", 52.3);
//        saldo.put("Bob", 51.3);
//        saldo.put("Zofia", 1000.0);
//        saldo.put("Andrzej", 2500.0);
//        saldo.put("Beata", 1500.0);
//
//        System.out.println("Saldo Jacka: " + saldo.get("Jack")+"\n");
//        for (String name: saldo.keySet()) {
//            System.out.println(name+": "+saldo.get(name));
//        }



//        Przykład 1. HashMap
//        HashMap<String,Integer> ageMap = new HashMap<>();
//        ageMap.put("John",20);
//        ageMap.put("Mary",30);
//        ageMap.put("Jane",4);
//        ageMap.put("Jack",5);
//        ageMap.put("Bob",6);
//        ageMap.put("Anna",7);
//        ageMap.put("Bartek",21);
//        ageMap.put("Celina",22);
//        ageMap.put("Dominik",33);
//
//        System.out.println("Wiek Dominika: " +ageMap.get("Dominik"));
//
//        for(String key : ageMap.keySet()) {
//            System.out.println(key + ": " + ageMap.get(key));
//        }
//}
}
