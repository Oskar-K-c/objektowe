package TASKS.LAB12.ZADANIA;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public class PesetStatistics {
    private int kobiety;
    private int mezczyzni;
    private int zakres1950_1980;
    private int zakres1981_2000;
    private int zakres2001_2025;
    private int sumAge1950_1980;
    private int sumAge1981_2000;
    private int sumAge2001_2025;


    void analyze(List<PeselData> peselDataList){
        LocalDate now = LocalDate.now();

        for (PeselData data : peselDataList) {
            if(data.isFemale()){
                kobiety++;
            }else {
                mezczyzni++;
            }

            int year = data.getBirthDate().getYear();
            int age = Period.between(data.getBirthDate(),now).getYears();

            if(year>=1950 && year <= 1980){
                zakres1950_1980++;
                sumAge1950_1980+=age;
            } else if (year>=1981 && year <= 2000) {
                zakres1981_2000++;
                sumAge1981_2000+=age;

            } else if (year>=2001 && year <= 2025) {
                zakres2001_2025++;
                sumAge2001_2025+=age;
            }

        }

    }

    //gettery
    public int getKobiety() {
        return kobiety;
    }

    public int getMezczyzni() {
        return mezczyzni;
    }

    public int getZakres1950_1980() {
        return zakres1950_1980;
    }

    public int getZakres1981_2000() {
        return zakres1981_2000;
    }

    public int getZakres2001_2025() {
        return zakres2001_2025;
    }

    public double getAVGAge1950_1980() {
        return sumAge1950_1980 / zakres1950_1980;
    }
    public double getAVGAge1981_2000() {
        return sumAge1981_2000 / zakres1981_2000;
    }
    public double getAVGAge2001_2025() {
        return sumAge2001_2025 / zakres2001_2025;
    }
}