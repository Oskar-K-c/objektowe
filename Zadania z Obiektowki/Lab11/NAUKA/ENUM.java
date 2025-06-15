//package TASKS.LAB11.NAUKA;
//
//enum DzienTygodnia {
//    PONIEDZIALEK,
//    WTOREK,
//    SRODA,
//    CZWARTEK,
//    PIATEK,
//    SOBOTA,
//    NIEDZIELA
//}
//enum StatusZamowienia {
//    NOWE("Zamówienie przyjęte"),
//    W_TRAKCIE("Zamówienie w realizacji"),
//    ZREALIZOWANE("Zamówienie zakończone");
//    private String opis;
//    // Konstruktor
//    StatusZamowienia(String opis) {
//        this.opis = opis;
//    }
//    public String getOpis() {
//        return opis;
//    }
//}
//
//public class ENUM {
//    public static void main(String[] args) {
//        DzienTygodnia dzien = DzienTygodnia.PONIEDZIALEK;
//        System.out.println("Dzień tygodnia: "+dzien);
//        switch (dzien) {
//            case SOBOTA:
//                break;
//            case NIEDZIELA:
//                System.out.println("Weekend");
//                break;
//            default:
//                System.out.println("Dzien roboczy");
//                break;
//        }
//
//        System.out.println("\n");
//        StatusZamowienia status = StatusZamowienia.NOWE;
//        System.out.println("Status: " + status);
//        System.out.println("Opis: " + status.getOpis());
//        StatusZamowienia status2 = StatusZamowienia.W_TRAKCIE;
//        System.out.println("Status2: " + status2);
//        System.out.println("Opis: " + status2.getOpis());
//        StatusZamowienia status3 = StatusZamowienia.ZREALIZOWANE;
//        System.out.println("Status3: " + status3);
//        System.out.println("Opis: " + status3.getOpis());
//
//
//
//    }
//}
