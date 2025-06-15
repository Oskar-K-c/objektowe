package TASKS.LAB12.ZADANIA;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class TaskLab12 {
    public static void Zadanie1() {
        System.out.println("Program do analizy przechowywanych danych w pliku pesele.txt");
        try{
            //wczytanie danych
            List<String> pesels=FileHandler.readPeselFromFile();

            //przetworzenie peseli
            List<PeselData> peselDataList = pesels.stream().map(PeselParser::parse).toList();

            List<String> birthDates=peselDataList.stream().map(PeselData::toString).toList();

            //statystyki
            PesetStatistics stats =new PesetStatistics();
            stats.analyze(peselDataList);

            //zapisz wyniki
            FileHandler.writeResultsToFile(birthDates, stats);



        } catch (IOException e) {
            System.err.println("Błąd pliku: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.err.println("Błąd danych: " + e.getMessage());
        }


    }
}
/*Wykorzystując OOP oraz operacje na plikach (wersja starsza i nowa z użyciem File, Scanner, FileWriter
oraz Path, Files) napisz program do analizy przechowywanych danych w pliku pesele.txt. Plik
wygeneruj z użyciem generatora peseli. https://pesel.cstudios.pl/o-generatorze/generator-on-line
Informacje na temat tego, co zawiera PESEL:
Każda z 11 cyfr w numerze PESEL ma swoje znaczenie. Można je podzielić następująco:
•RRMMDDPPPPK
•RR – to 2 ostanie cyfry roku urodzenia,
•MM – to miesiąc urodzenia (zapoznaj się z sekcją "Dlaczego osoby urodzone po 1999 roku
mają inne oznaczenie miesiąca urodzenia”),
•DD – to dzień urodzenia,
•PPPP – to liczba porządkowa oznaczająca płeć. U kobiety ostatnia cyfra tej liczby jest parzysta
(0, 2, 4, 6, 8), a u mężczyzny - nieparzysta (1, 3, 5, 7, 9),
•K – to cyfra kontrolna.
Przykład: PESEL 810203PPP6K należy do kobiety, która urodziła się 3 lutego 1981 roku, a PESEL
761115PPP3K - do mężczyzny, który urodził się 15 listopada 1976 ro-ku.
Po 1999 inne oznaczenia miesięcy:
•1900 – 1999 do mc dodawane jest 0, np. 01
•2000 – 2099 do mc dodajemy 20, np. 21 (styczeń 2005)
•2100 – 2199 – 40 np. 21 (styczeń 2005)
Dla danych z pliku:
•wyznacz ile jest kobiet a ile mężczyzn
•wyznacz ile osób urodziła się między:
o 1950 – 1980
o 1981 – 2000
o 2001 – 2025
•Dla powyższych zakresów wyznać średni wiek osób.
•Pobierz dane z pliku i przekształć każdy pesel na postać daty urodzenia zapisaną jako
RRRR-MM-DD. Wyniki zapisz do pliku wyniki.txt.
*/