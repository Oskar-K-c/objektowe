package TASKS.LAB07.zadania_domowe.Zad1;

public class Bike extends Vehicle {
    private static final double KOSZT_GODZINOWY=8.0;

    public Bike(String id, String marka, String model) {
        super(id, marka, model);
    }

    @Override
    public double obliczKoszt(int hours) {
        return hours*KOSZT_GODZINOWY;
    }


}
