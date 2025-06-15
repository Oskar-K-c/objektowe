package TASKS.LAB15.ZADANIA;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Zadanie1  extends JFrame {

    private JPanel JPanel1;
    private JTextField InputTemp;
    private JLabel Wynik;
    private JButton KONWERTUJTEMPButton;
    private JButton MENUButton;
    private JButton WYJSCIEButton;
    double valueA,score;

    public Zadanie1() {
        super("Konwerter temperatur");
        this.setContentPane(JPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int width=600;
        int height=400;
        this.setSize(width,height);
        this.setVisible(true);




        KONWERTUJTEMPButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textA = InputTemp.getText();
                if(textA.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Nie podano wartości. Przyjmuje wartość domyślną " +
                            "Temperatura C = 0 ", "Błąd danych wejściowych", JOptionPane.WARNING_MESSAGE);
                    valueA = 0;
                }else{
                    try{
                        valueA = Double.parseDouble(textA);
                    }catch (NumberFormatException ex){
                        JOptionPane.showMessageDialog(null, "Podano nieprawidłowe dane (nie liczby) " +
                                "Przyjmuje wartość domyślną Temperatura C = 0 ", "Błąd danych wejsciowych", JOptionPane.WARNING_MESSAGE);
                        valueA = 0;
                    }
                }
                score = (valueA*1.8)+32;
                Wynik.setText("Temperatura w °C = "+valueA+" = "+score+" °F");
            }
        });
        MENUButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu menu = new Menu();
                dispose();
            }
        });
        WYJSCIEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
}
