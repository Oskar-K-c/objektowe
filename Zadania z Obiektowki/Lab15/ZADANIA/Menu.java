package TASKS.LAB15.ZADANIA;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame {
    private JPanel JPanel1;
    private JButton zadanie1Button;
    private JButton zadanie2Button;
    private JButton kalkulatorButton;
    private JButton WYJSCIEButton;


    public Menu(){
        super("=".repeat(3)+"MENU"+"=".repeat(3));
        this.setContentPane(this.JPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //int width=600;
        //int height=400;
        //this.setSize(width,height);
        this.pack();
        this.setVisible(true);

        WYJSCIEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        kalkulatorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Kalkulator kalkulator=new Kalkulator();
                dispose();
            }
        });
        zadanie1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Zadanie1 zadanie1=new Zadanie1();
                dispose();
            }
        });
    }
}
