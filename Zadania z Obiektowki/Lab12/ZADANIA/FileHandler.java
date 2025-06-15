package TASKS.LAB12.ZADANIA;

import jdk.dynalink.StandardOperation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FileHandler {
    public static List<String> readPeselFromFile() throws IOException {
        Path path = Paths.get("src/TASKS/LAB12/ZADANIA/pesele.txt");
        return Files.readAllLines(path).stream()
                .filter(line -> !line.trim().isEmpty())
                .collect(Collectors.toList());
    }

    public static void writeResultsToFile(List<String>birthsDates, PesetStatistics stats)
            throws IOException {
        Path path= Paths.get("src/TASKS/LAB12/ZADANIA/wyniki.txt");
        List<String> linie = new ArrayList<>();

        linie.add("===Dane Urodzenia===");
        linie.addAll(birthsDates);
        linie.add("\n===Statystyki===");
        linie.add("Kobiety: " + stats.getKobiety());
        linie.add("Mężczyźni: "+ stats.getMezczyzni());
        linie.add("\nUrodzeni w latach 1950-1980: "+stats.getZakres1950_1980());
        linie.add("\nSredni wiek w latach 1950-1980: "+stats.getAVGAge1950_1980());
        linie.add("\nUrodzeni w latach 1981-2000: "+stats.getZakres1981_2000());
        linie.add("\nSredni wiek w latach 1981-2000: "+stats.getAVGAge1981_2000());
        linie.add("\nUrodzeni w latach 2001-2025: "+stats.getZakres2001_2025());
        linie.add("\nSredni wiek w latach 2001-2025: "+stats.getAVGAge2001_2025());

        Files.write(path, linie);
        System.out.println("Statystyki zapisane do pliku 'wyniki.txt'");

    }

}
