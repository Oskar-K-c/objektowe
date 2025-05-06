package TASKS.LAB07.zadania_domowe.Zad1;

import java.util.ArrayList;
import java.util.List;

public class Zarzadzanie_wypozyczalnia {
    public List<Vehicle> getVehicles(){
        return vehicles;
    }
    private List<Vehicle> vehicles;

    public Zarzadzanie_wypozyczalnia() {
        this.vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
        System.out.println("Dodano pojazd: "+vehicle.getId() +" "+ vehicle.getMarka() + " " + vehicle.getModel());
    }

    public void rentVehicle(String id){
        for (Vehicle vehicle : vehicles) {
            if(vehicle.getId().equals(id)){
                vehicle.wypozycz();
                return;
            }
        }
        System.out.println("Pojazd o ID "+id+" nie istnieje w systemie.");
    }

    public void returnVehicle(String id){
        for (Vehicle vehicle : vehicles) {
            if(vehicle.getId().equals(id)){
                vehicle.zwroc();
                return;
            }
        }
        System.out.println("Pojazd o ID "+id+" nie istnieje w systemie.");
    }

    public void displayAvailableVehicles(){
        System.out.println("Dostępne pojazdy:");
        for (Vehicle vehicle : vehicles) {
            if(!vehicle.isWynajety()){
                System.out.println(vehicle);
            }
        }
    }

    public void displayRentedVehicles(){
        System.out.println("Wypożyczone pojazdy:");
        for (Vehicle vehicle : vehicles) {
            if(vehicle.isWynajety()){
                System.out.println(vehicle);
            }
        }
    }



}
