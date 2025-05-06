package TASKS.LAB02;

public class MenuLab02 {
    public void Uruchom() {
        Menu();
    }

    //obiekt klasy task
    TASKS_lab02 task_lab02=new TASKS_lab02();

    //obiekt klasy input data
    InputData input_data=new InputData();

    private void Menu() {
        System.out.println("1. Zadanie 1 ");
        System.out.println("2. Zadanie 2 ");
        System.out.println("3. Zadanie 3 ");
        System.out.println("4. Zadanie 4 ");
        System.out.println("5. Zadanie 5 ");
        System.out.println("6. Zadanie 6 ");
        System.out.println("7. EXIT");
        int choice=input_data.InputInt();
        switch (choice){
            case 1:Task01Run();Menu();
            case 2:Task02Run();Menu();
            case 3:Task03Run();Menu();
            case 4:Task04Run();Menu();
            case 5:Task05Run();Menu();
            case 6:Task06Run();Menu();
            case 7:CloseProgramRun();
            default:
                System.out.println("Błędne dane.Wybierz ponownie");
        }
    }

    private void Task06Run() {
        System.out.println("===============KALKULATOR======================");
        System.out.println("PODAJ JAKIE CHCESZ WYKONAC DZIAŁANIE");
        System.out.println("1. Dodawanie");
        System.out.println("2. Odejmowanie");
        System.out.println("3. Mnożenie");
        System.out.println("4. Dzielenie");
        int a=input_data.InputInt();
        System.out.println("Podaj pierwszą liczbę");
        int b=input_data.InputInt();
        System.out.println("Podaj drugą liczbę");
        int c=input_data.InputInt();
        task_lab02.task06(a,b,c);
    }

    private void Task05Run() {
        System.out.println("TAK - wpisz 1");
        System.out.println("NIE - wpisz 0");
        System.out.println("Czy jest zniżka na samochód ? ");
        int a=input_data.InputInt();
        System.out.println("Otrzymałeś premię/podwyżkę ? ");
        int b=input_data.InputInt();
        task_lab02.task05(a,b);
    }

    private void Task04Run() {
        System.out.println("TAK - wpisz 1");
        System.out.println("NIE - wpisz 0");
        System.out.println("Czy dzisiaj pada deszcz?");
        int a=input_data.InputInt();
        System.out.println("Czy jest autobus?");
        int b=input_data.InputInt();
        task_lab02.task04(a,b);
    }

    private void Task03Run() {
        System.out.println("Program będzie porządkował 3 liczby");
        System.out.println("Podaj 3 liczby");
        int x=input_data.InputInt();
        int y=input_data.InputInt();
        int z=input_data.InputInt();
        task_lab02.task03(x,y,z);
    }

    private void Task02Run() {
        System.out.println("Podaj wartość x dla funkcji a(x): ");
        int a = input_data.InputInt();
        System.out.println("Podaj wartość x dla funkcji b(x): ");
        int b = input_data.InputInt();
        System.out.println("Podaj wartość x dla funckji c(x)");
        int c = input_data.InputInt();
        task_lab02.task02(a,b,c);
    }

    private void Task01Run() {
        System.out.println("Zadanie będzie rozwiązywać równanie kwadratowe");
        System.out.println("Podaj a: ");
        double a = input_data.InputDouble();
        System.out.println("Podaj b: ");
        double b = input_data.InputDouble();
        System.out.println("Podaj c: ");
        double c = input_data.InputDouble();
        task_lab02.task01(a,b,c);
    }

    private void CloseProgramRun() {
        task_lab02.CloseProgram();
    }
}
