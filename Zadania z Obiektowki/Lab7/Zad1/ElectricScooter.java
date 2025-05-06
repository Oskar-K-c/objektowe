package TASKS.LAB07.zadania_domowe.Zad1;

public class ElectricScooter extends Vehicle{
    public static final double KOSZT_GODZINOWY = 1.5;

    public ElectricScooter(String id, String marka, String model) {
        super(id, marka, model);
    }

    @Override
    public double obliczKoszt(int hours) {
        return hours*KOSZT_GODZINOWY;
    }
}
