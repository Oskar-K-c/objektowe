package TASKS.LAB07.zadania_domowe.Zad1;

public abstract class Vehicle implements Wynajem{
    private String id;
    private String marka;
    private String model;
    private boolean wynajety;

    public Vehicle(String id, String marka, String model) {
        this.id = id;
        this.marka = marka;
        this.model = model;
    }

    public String getId() {
        return id;
    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public boolean isWynajety() {
        return wynajety;
    }

    @Override
    public void wypozycz() {
        if (!wynajety) {
            wynajety = true;
            System.out.println("Pojazd o id = "+id +", Marka/Model: " + marka + " / " + model + " został wypożyczony");
        }else{
            System.out.println("Pojazd o id = "+id +", Marka/Model: " + marka + " / " + model + " jest już wypożyczony, nie można go wypożyczyć.");
        }
    }

    @Override
    public void zwroc() {
        if(wynajety) {
            wynajety = false;
            System.out.println("Pojazd o id = "+id +", Marka/Model: " + marka + " / " + model + " został zwrócony");
        }else{
            System.out.println("Pojazd o id = "+id +", Marka/Model: " + marka + " / " + model + " nie był wypożyczony.");
        }

    }

    @Override
    public abstract double obliczKoszt(int hours);

    @Override
    public String toString() {
        return String.format(
                "ID: %-5s | Marka: %-10s | Model: %-10s | Status: %s",
                id,
                marka,
                model,
                wynajety ? "Wypożyczony" : "Dostępny"
        );
    }
}
