package TASKS.LAB12.NAUKA;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

public class Pliki_Path {
    public static void main(String[] args) {
        Path sciezka = Paths.get("test_pliki", "dane.txt");
        System.out.println("Ścieżka: "+sciezka);
        System.out.println("Ścieżka absolutna: "+sciezka.toAbsolutePath());
        System.out.println("Nazwa pliku: "+ sciezka.getFileName());
        System.out.println("Katalog nadrzedny: "+ sciezka.getParent());
        System.out.println("Liczba segmentow: "+ sciezka.getNameCount());
        System.out.println("Pierwszy segment: "+ sciezka.getName(0));

        //Tworzenie pliku / katalogu

        try{
            Files.createDirectories(Paths.get("test_pliki/test_path"));
        }catch (IOException e){
            System.out.println("Folder istnieje");
        }

        try {
            Files.createFile(Paths.get("test_pliki","Nowy_plik1.txt"));
        } catch (IOException e) {
            System.out.println("BŁĄD: "+e.getMessage());
        }
        //Sprawdzanie istnienia
        Path sprsciezka = Paths.get("test_pliki","dane.txt");
        if(Files.exists(sprsciezka)){
            System.out.println("Plik istnieje");
        }else{
            System.out.println("Plik NIE istnieje");
        }

        //Kopiowanie i przenoszenie
        try {
            Files.copy(Paths.get("test_pliki","dane.txt"),Paths.get("Kopia.txt"), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //przenoszenie
        try{
            Files.move(Paths.get("Kopia.txt"), Paths.get("test_pliki","Kopia.txt"),StandardCopyOption.REPLACE_EXISTING);
        }catch (IOException e){
            throw new RuntimeException(e);
        }
        //Usuwanie pliku
        try {
            Files.deleteIfExists(Paths.get("test_pliki/Nowy_plik1.txt"));
            Files.deleteIfExists(Paths.get("test_pliki/Nowy_plik.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Odczyt I zapis zawartości pliku
        // Zapis listy linii do pliku
        Path sciezka5 = Paths.get("test_pliki/lista.txt");
        List<String> linie = List.of("Pierwszy segment", "Drugi segment", "Dane segment", "Nowy segment");
        try {
            Files.write(sciezka5,linie);
        } catch (IOException e) {
            System.out.println("Błąd podczas zapisu do pliku: " + e.getMessage());
        }

        // Odczyt wszystkich linii
        try {
            List<String> wczytane = Files.readAllLines(sciezka5);
            System.out.println("\nZawartość pliku:");
            for (String linia : wczytane) {
                System.out.println(linia);
            }
        } catch (IOException e) {
            System.out.println("Błąd podczas odczytu pliku: " + e.getMessage());
        }

        //sprawdzenie uprawnień
        System.out.println("Czy plik jest do odczytu? " + Files.isReadable(sciezka5));
        System.out.println("Czy plik jest do zapisu? " + Files.isWritable(sciezka5));
        System.out.println("Czy plik jest wykonywalny? " + Files.isExecutable(sciezka5));

        //Odczyt i zapis strumieniowy (BufferedReader / BufferedWriter)
        // Zapis przy użyciu BufferedWriter
        try (BufferedWriter writer =
                Files.newBufferedWriter(sciezka5)){
            writer.write("Hello world");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Odczyt przy użyciu BufferedReader
        try(BufferedReader reader =
                Files.newBufferedReader(sciezka5)){
            String line;
            while((line = reader.readLine())!=null){
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
