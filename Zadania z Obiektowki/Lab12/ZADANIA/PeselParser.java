package TASKS.LAB12.ZADANIA;

import java.time.LocalDate;

public class PeselParser {
    public static PeselData parse(String pesel) {
        if(pesel ==null || pesel.length() !=11 || !pesel.matches("\\d+")) {
            throw new IllegalArgumentException("Invalid format pesel");
        }

        int year = Integer.parseInt(pesel.substring(0, 2));
        int month = Integer.parseInt(pesel.substring(2, 4));
        int day = Integer.parseInt(pesel.substring(4, 6));

        if(month>=80){
            year += 1800;
            month -= 80;
        } else if (month>=60) {
            year += 2200;
            month -= 60;
        }else if (month>=40) {
            year +=2100;
            month -= 40;
        }else if (month>=20) {
            year += 2000;
            month -= 20;
        }else {
            year += 1900;
        }

        LocalDate birthDate = LocalDate.of(year, month, day);
        return new PeselData(pesel, birthDate);
    }
}
