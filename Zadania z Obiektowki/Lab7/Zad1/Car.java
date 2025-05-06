package TASKS.LAB07.zadania_domowe.Zad1;

public class Car extends Vehicle  {
    private static final double KOSZT_GODZINOWY = 25.0;

    public Car(String id, String marka, String model) {
        super(id, marka, model);
    }

    @Override
    public double obliczKoszt(int hours) {
        return hours*KOSZT_GODZINOWY;
    }
}
