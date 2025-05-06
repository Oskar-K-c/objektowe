package TASKS.LAB01;

import java.util.Random;

public class TASK_LAB01 {
    //zadanie 1
    protected String Task001(String name, int age){
        return "Imie: "+name+", wiek: "+age;
    }

    public void Task002(double x, double y) {
        double sum=x+y;
        double roznica=x-y;
        double iloczyn=x*y;
        double iloraz;
        System.out.println("Suma: "+sum);
        System.out.println("Roznica: "+roznica);
        System.out.println("Iloczyn: "+iloczyn);
        if(y!=0){
            iloraz=(x/y);
            System.out.println("Iloraz: "+iloraz);
        }else{
            System.out.println("Nie można dzielić przez 0");
        }
    }

    protected void Task003(int liczba) {
        System.out.println("Podana liczba to: "+liczba);
        System.out.println(liczba%2==0);

    }

    protected void Task004(int liczba) {
        System.out.println("Podana liczba to: "+liczba);
        System.out.println(liczba%3==0 && liczba%5==0);
    }

    protected void Task005(int liczba) {
        System.out.println("Podana liczba to: "+liczba+
                "podniesiona do 3 potegi = "+Math.pow(liczba,3));
    }

    protected void Task006(int liczba) {
        System.out.println("Podana liczba to: "+liczba+
                ", a jej pierwiastek kwadratowy " +
                "wynosi= "+Math.sqrt(liczba));
    }

    protected void Task007(int a, int b) {
        System.out.println("Podany zakres losowania to: "+a+" - "+b);
        Random rand = new Random();
        int x = rand.nextInt(b-a+1)+a;
        System.out.println("1. Wylosowana liczba to: " + x);
        int y = rand.nextInt(b-a+1)+a;
        System.out.println("2. Wylosowana liczba to: " + y);
        int z = rand.nextInt(b-a+1)+a;
        System.out.println("3. Wylosowana liczba to: " + z);

        System.out.println("Sprawdzenie, czy z wylosowanych liczb można utworzyć trójkąt prostokątny");
        boolean isrighttriangle = isrighttrianglee(x,y,z);
        if(isrighttriangle){
            System.out.println("TAK, z tych odcinków można zbudować trójkąt prostokątny.");
            System.out.print(isrighttriangle);
        }else{
            System.out.println("Z tych odcinków NIE można zbudować trujkąta prostokątnego");
            System.out.print(isrighttriangle);
        }
    }

    protected void CloseProgram() {
        System.out.println("Zamykanie programu");
        System.exit(0);
    }
    // Metoda sprawdzająca, czy z podanych długości można zbudować trójkąt prostokątny
    public static boolean isrighttrianglee(int x,int y,int z) {
        // Sprawdzenie warunku trójkąta prostokątnego
        if(x*x+y*y==z*z||x*x+z*z==y*y||y*y+z*z==x*x){
            return true;
        }
        return false;
    }
}
