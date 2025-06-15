package TASKS.LAB12.NAUKA;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Pliki_FileWriter {
    public static void main(String[] args) {

        //tworzenie pliku
        File plik = new File("dane1.txt");
        try{
            if(plik.createNewFile()){
                System.out.println("Utworzono plik: "+ plik.getName());
            }else {
                System.out.println("Plik już istnieje");
            }
        }catch (IOException e){
            System.out.println("Wystąpił błąd:  " + e.getMessage());
            e.printStackTrace();
        }

        //zapis do pliku
        try{
            FileWriter writer = new FileWriter("dane.txt");
            writer.write("1.To jest przykładowy tekst\n");
            writer.write("2. Zapisujemy kolejną linię.");
            writer.close();
            System.out.println("Zapisano dane do pliku.");
        }catch (IOException e){
            System.out.println("Błąd zapisu: "+ e.getMessage());
            e.printStackTrace();
        }

        //odczyt z pliku
        try{
            File plik2 = new File("dane1.txt");
            Scanner sc = new Scanner(plik2);
            while(sc.hasNextLine()){
                String linia = sc.nextLine();
                System.out.println(linia);
            }
            sc.close();
        }catch (FileNotFoundException e){
            System.out.println("Plik nie został znaleziony");
            e.printStackTrace();
        }

        //usuwanie pliku
        File plik3 = new File("dane1.txt");
        if(plik3.delete()){
            System.out.println("Usunięto plik: "+plik3.getName());
        }else{
            System.out.println("Nie udało się usunąć pliku.");
        }
    }
}

