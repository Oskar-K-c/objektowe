package TASKS.LAB01;


public class MenuLab01 {
    //obiekt klasy task
    TASK_LAB01 task_lab01=new TASK_LAB01();

    //obiekt klasy input data
    InputDataLAB1 inputData=new InputDataLAB1();

    public void Uruchom() {
        Menu();
    }

    private void Menu() {
        System.out.println("1. Zadanie 1");
        System.out.println("2. Zadanie 2");
        System.out.println("3. Zadanie 3");
        System.out.println("4. Zadanie 4");
        System.out.println("5. Zadanie 5");
        System.out.println("6. Zadanie 6");
        System.out.println("7. Zadanie 7");
        System.out.println("8. EXIT");
        System.out.println("Wybierz zadanie: ");
        int wybor=inputData.InputInt();
        switch(wybor) {
            case 1: Task001Run();break;
            case 2: Task002Run();break;
            case 3: Task003Run();break;
            case 4: Task004Run();break;
            case 5: Task005Run();break;
            case 6: Task006Run();break;
            case 7: Task007Run();break;
            case 8: CloseProgramRun();break;
            default:
                System.out.println("Błędne dane. Wybierz ponownie");break;
        }

    }// koniec metody menu

    private void Task007Run() {
        System.out.println("Program losuje 3 długości odcinków trójkąta z którego utworzy trójkąt");
        int a,b;
        System.out.println("Podaj dolny zakres losowanych liczb : ");
        a=inputData.InputInt();
        System.out.println("Podaj Górny zakreslosowanych liczb : ");
        b=inputData.InputInt();
        task_lab01.Task007(a,b);
    }

    private void Task006Run() {
        System.out.println("Podaj liczbę, z której chcesz obliczyć pierwiastek kwadratowy");
        int liczba=inputData.InputInt();
        task_lab01.Task006(liczba);
    }

    private void Task005Run() {
        System.out.println("Podaj liczbę, którą chcesz podnieść do 3 potęgi");
        int liczba=inputData.InputInt();
        task_lab01.Task005(liczba);
    }

    private void Task004Run() {
        System.out.println("Podaj liczbę, którą chcesz sprawdzić czy jest podzielna przez 3 i przez 5");
        int liczba1=inputData.InputInt();
        task_lab01.Task004(liczba1);
    }

    private void Task003Run() {
        System.out.println("Podaj liczbę, którą chcesz sprawdzić, czy jest parzysta: ");
        int liczba=inputData.InputInt();
        task_lab01.Task003(liczba);
    }

    private void Task002Run() {
        System.out.println("Podaj pierwszą liczbę: ");
        double x=inputData.InputDouble();
        System.out.println("Podaj drugą liczbę");
        double y=inputData.InputInt();
        task_lab01.Task002(x,y);
    }

    private void CloseProgramRun() {
        task_lab01.CloseProgram();
    }


    //metoda uruchomieniowa do zadania1 Task001();
    private void Task001Run(){
        inputData.input.nextLine();
        System.out.println("Podaj imie:");
        String name=inputData.InputString();
        System.out.println("Podaj wiek:");
        int age=inputData.InputInt();
        String result = task_lab01.Task001(name,age);
        System.out.println(result);
    }
}
