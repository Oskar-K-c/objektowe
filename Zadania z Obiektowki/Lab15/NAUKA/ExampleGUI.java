package TASKS.LAB15.NAUKA;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class ExampleGUI extends JFrame {
    private JPanel JPanel1;
    private JButton Change;
    private JButton witajButton;
    private JButton wyjscieButton;
    private JLabel tekst;
    private JButton DATAButton;

    public ExampleGUI(){
        super("Example GUI - tytuł: Moje Pierwsze GUI");
        this.setContentPane(this.JPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int width = 400, height = 300;
        this.setSize(width,height); //rozmiar okna

        Change.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tekst.setText("Zmieniony tekst");
            }
        });
        wyjscieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        witajButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = JOptionPane.showInputDialog("Podaj imie: ");
                //JOptionPane.showMessageDialog(null,"Witaj " + tekst, "Powitanie",JOptionPane.WARNING_MESSAGE);
                int a = JOptionPane.showConfirmDialog(null, "Wpisano dane: "+text, "OKno Powitalne", JOptionPane.YES_NO_OPTION);
            }
        });
        DATAButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tekst.setText(new Date().toString());
            }
        });
    }
}
