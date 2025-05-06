package TASKS.LAB02;

public class TASKS_lab02 {
    //obiekt klasy input data
    InputData input_data=new InputData();
    public void CloseProgram() {
        System.out.println("Zamykanie programu");
        System.exit(0);
    }

    public void task06(int a, int b,int c) {
        switch(a) {
            case 1:
                System.out.println("Wybrano opcję 1- dodawanie");
                System.out.println("Suma: " + (b+c));
                break;
            case 2:
                System.out.println("Wybrano opcję 2 - odejmowanie");
                System.out.println("Różnica: " + (b-c));
                break;
            case 3:
                System.out.println("Wybrano opcję 3 - mnożenie");
                System.out.println("Iloczyn: " + (b*c));
                break;
            case 4:
                System.out.println("Wybrano opcję 4 - dzielenie z resztą");
                if(c==0){
                    System.out.println("Dzielnik nie może być 0");
                    System.exit(0);
                }else{
                    int wynik=(b/c);
                    int reszta=(b%c);
                    System.out.println("Wynik dzielenia: " + wynik + ", Reszta: " + reszta);
                }
                break;
            default:
                System.out.println("Nie wybrano żadnej opcji");
                System.exit(0);
        }
    }

    public void task05(int a, int b) {
        boolean discount=false;
        boolean Bonus=false;
       if(a==1) {
           discount = true; // jest zniżka
       }
       if(b==1) {
           Bonus = true; //otrzymano premię
       }
       if(!discount || Bonus) {
           System.out.println("Możesz kupić samochód");
           if(!discount){
               System.out.println("Zniżki na samochód nie ma");
           }
       }
       if(!discount || !Bonus){
           System.out.println("Zakup samochód trzeba odłożyć na później...");
           if(!discount){
               System.out.println("Zniżki na samochód nie ma");
           }
       }
    }

    public void task04(int a, int b) {
        if(a==1 && b==1) {
            System.out.println("Weź parasol. Dostaniesz się na uczelnię");
        }else if(a==1 && b==0) {
            System.out.println("Nie dostaeniesz się na uczelnię");
        }else if(a==0 && b==1) {
            System.out.println("Dostaniesz się na uczelnię. Miłego dnia i pieknej pogody");
        }
    }

    public void task03(int x, int y, int z) {
        int min=0,max=0,med=0;
        if(x<=y && x<=z){
            min=x;
            if(y<=z){
                med=y;
                max=z;
            }else {
                med=z;
                max=y;
            }
        }else if(y<=x && y<=z){
            min=y;
            if(x<=z){
                med=x;
                max=z;
            }else  {
                med=z;
                max=x;
            }
        }else if(z<=x && z<=y){
            min=z;
            if(x<=y){
                med=x;
                max=y;
            }else  {
                med=y;
                max=x;
            }
        }
        System.out.println("MIN= "+min);
        System.out.println("MED= "+med);
        System.out.println("MAX= "+max);
    }

    public void task02(int a, int b, int c) {
        if(a>0){
            System.out.println("Wartość funkcji a(x) = "+2*a);
        }else if(a==0){
            System.out.println("Wartość funkcji a(x) = "+a);
        }else System.out.println("Wartość funkcji a(x) = "+(-3*a));

        if(b>=1){
            System.out.println("Wartość funkcji b(x) = "+Math.pow(b,2));
        }else{
            System.out.println("Wartość funkcji b(x) = "+b);
        }

        if(c>2){
            System.out.println("Wartość funkcji c(x)= "+(2+c));
        }else if(c==2){
            System.out.println("Wartość funkcji c(x)= "+ 8);
        }else {
            System.out.println("Wartość funkcji c(x)= "+ (c-4));
        }

    }

    public void task01(double a, double b, double c) {
        if(a==0){
            System.out.println("a nie może być równe 0");
            System.out.println("Zamykanie programu");
            System.exit(0);
        }
        double delta=(b*b-4*a*c);
        if(delta<0){
            System.out.println("Brak miejsc zerowych");
            System.out.println("Zamykanie programu");
            System.exit(0);
        }else if(delta==0){
            double x0=(-b/2*a);
            System.out.println("Funckcja ma jedno miesjce zerowe wynoszące = "+x0);
        }else{
            double x1=(-b-Math.sqrt(delta))/(2*a);
            double x2=(-b+Math.sqrt(delta))/(2*a);
            System.out.println("Funkcja ma dwa miejsca zerowe, x1= "+x1+", x2="+x2);

        }
    }
}
