package TASKS.LAB09.ZadaniaDomowe;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Uczestnicy {
    private int id;
    private String imie;
    private int wiek;

    public Uczestnicy(int id, String imie, int wiek) {
        this.id = id;
        this.imie = imie;
        this.wiek = wiek;
    }

    @Override
    public String toString() {
        return "Uczestnicy{" +
                "id=" + id +
                ", name='" + imie + '\'' +
                ", wiek=" + wiek +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Uczestnicy uczestnicy = (Uczestnicy) o;
        return id==uczestnicy.id && uczestnicy.wiek==wiek && Objects.equals(imie, uczestnicy.imie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, imie,wiek);
    }

    public int getWiek() {
        return wiek;
    }

    //arraylist
    public static List<Uczestnicy> pelnoletniArrays(ArrayList<Uczestnicy>uczestnicy){
        List<Uczestnicy> pelnoletni = new ArrayList<>();
        for(Uczestnicy ucz : uczestnicy){
            if(ucz.getWiek()>=18){
                pelnoletni.add(ucz);
            }
        }
        return pelnoletni;
    }

    public static List<Uczestnicy> pelnoletniList(List<Uczestnicy>uczestnicy){
        List<Uczestnicy> pelnoletni = new LinkedList<>();
        for(Uczestnicy ucz : uczestnicy){
            if(ucz.getWiek()>=18){
                pelnoletni.add(ucz);
            }
        }
        return pelnoletni;
    }

}
