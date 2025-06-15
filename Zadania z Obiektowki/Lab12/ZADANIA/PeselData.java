package TASKS.LAB12.ZADANIA;

import java.time.LocalDate;

public class PeselData {
    private String pesel;
    private LocalDate birthDate;

    public PeselData(String pesel, LocalDate birthDate) {
        this.pesel = pesel;
        this.birthDate = birthDate;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getPesel() {
        return pesel;
    }

    private String IsMale(){
        int plec = Character.getNumericValue(pesel.charAt(9));
        if(plec % 2 == 0){
            return "Kobieta";
        }else{
            return "Mężczyzna";
        }
    }

    @Override
    public String toString() {
        return "Pesel='" + pesel + '\'' +
                ", birthDate=" + birthDate +
                ", Plec: " + IsMale();
    }

    public boolean isFemale() {
        int genderDigit = Character.getNumericValue(pesel.charAt(9));
        return genderDigit % 2 == 0;
    }
}
