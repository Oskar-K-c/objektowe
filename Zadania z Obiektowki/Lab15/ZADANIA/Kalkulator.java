package TASKS.LAB15.ZADANIA;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Kalkulator extends JFrame {
    private JPanel JPanel1;
    private JPanel A;
    private JPanel B;
    private JPanel Wyniki;
    private JPanel Przyciski;
    private JTextField InputALabel;
    private JTextField InputBLabel;
    private JButton SUMAButton;
    private JButton ROZNICAButton;
    private JButton ILORAZButton;
    private JButton ILOCZYNButton;
    private JButton MENUButton;
    private JButton WYJSCIEButton;
    private JLabel Wynikd;
    double valueA, valueB, score;

    public Kalkulator(){
        super("=".repeat(3)+"MENU"+"=".repeat(3));
        this.setContentPane(this.JPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int width=600;
        int height=400;
        this.setSize(width,height);
        this.setVisible(true);


        SUMAButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textA = InputALabel.getText();
                String textB = InputBLabel.getText();
                if(textA.isEmpty() || textB.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Nie podano wartości. Przyjmuje wartości domyślne, " +
                            "a = 1, b = 1", "Błąd danych wejściowych", JOptionPane.WARNING_MESSAGE);
                    valueA = 1;
                    valueB = 1;
                }else{
                    try{
                        valueA = Double.parseDouble(textA);
                        valueB = Double.parseDouble(textB);
                    }catch (NumberFormatException ex){
                        JOptionPane.showMessageDialog(null, "Podano nieprawidłowe dane (nie liczby) " +
                                "Przyjmuję wartości domyślne a=1, b=1", "Błąd danych wejsciowych", JOptionPane.WARNING_MESSAGE);
                        valueA = 1;
                        valueB = 1;
                    }
                }
                score = valueA + valueB;
                Wynikd.setText("Suma "+ String.valueOf(valueA)+ " + "+String.valueOf(valueB)+ " = "+ String.valueOf(score));
                InputALabel.setText("");
                InputBLabel.setText("");
            }
        });
        ROZNICAButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textA = InputALabel.getText();
                String textB = InputBLabel.getText();
                if(textA.isEmpty() || textB.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Nie podano wartości. Przyjmuje wartości domyślne, " +
                            "a = 1, b = 1", "Błąd danych wejściowych", JOptionPane.WARNING_MESSAGE);
                    valueA = 1;
                    valueB = 1;
                }else{
                    try{
                        valueA = Double.parseDouble(textA);
                        valueB = Double.parseDouble(textB);
                    }catch (NumberFormatException ex){
                        JOptionPane.showMessageDialog(null, "Podano nieprawidłowe dane (nie liczby) " +
                                "Przyjmuję wartości domyślne a=1, b=1", "Błąd danych wejsciowych", JOptionPane.WARNING_MESSAGE);
                        valueA = 1;
                        valueB = 1;
                    }
                }
                score = valueA - valueB;
                Wynikd.setText("Roznica "+ String.valueOf(valueA)+ " - "+String.valueOf(valueB)+ " = "+ String.valueOf(score));
                InputALabel.setText("");
                InputBLabel.setText("");
            }
        });
        ILORAZButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textA = InputALabel.getText();
                String textB = InputBLabel.getText();
                if(textA.isEmpty() || textB.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Nie podano wartości. Przyjmuje wartości domyślne, " +
                            "a = 1, b = 1", "Błąd danych wejściowych", JOptionPane.WARNING_MESSAGE);
                    valueA = 1;
                    valueB = 1;
                }else{
                    try{
                        valueA = Double.parseDouble(textA);
                        valueB = Double.parseDouble(textB);
                    }catch (NumberFormatException ex){
                        JOptionPane.showMessageDialog(null, "Podano nieprawidłowe dane (nie liczby) " +
                                "Przyjmuję wartości domyślne a=1, b=1", "Błąd danych wejsciowych", JOptionPane.WARNING_MESSAGE);
                        valueA = 1;
                        valueB = 1;
                    }
                }
                score = valueA * valueB;
                Wynikd.setText("Iloraz "+ String.valueOf(valueA)+ " * "+String.valueOf(valueB)+ " = "+ String.valueOf(score));
                InputALabel.setText("");
                InputBLabel.setText("");
            }
        });
        ILOCZYNButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textA = InputALabel.getText();
                String textB = InputBLabel.getText();
                if(textA.isEmpty() || textB.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Nie podano wartości. Przyjmuje wartości domyślne, " +
                            "a = 1, b = 1", "Błąd danych wejściowych", JOptionPane.WARNING_MESSAGE);
                    valueA = 1;
                    valueB = 1;
                }else{
                    try{
                        valueA = Double.parseDouble(textA);
                        valueB = Double.parseDouble(textB);
                    }catch (NumberFormatException ex){
                        JOptionPane.showMessageDialog(null, "Podano nieprawidłowe dane (nie liczby) " +
                                "Przyjmuję wartości domyślne a=1, b=1", "Błąd danych wejsciowych", JOptionPane.WARNING_MESSAGE);
                        valueA = 1;
                        valueB = 1;
                    }
                }
                score = valueA / valueB;
                Wynikd.setText("Iloczyn "+ String.valueOf(valueA)+ " / "+String.valueOf(valueB)+ " = "+ String.valueOf(score));
                InputALabel.setText("");
                InputBLabel.setText("");

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
