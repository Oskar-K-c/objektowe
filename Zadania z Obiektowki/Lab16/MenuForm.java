package TASKS.LAB16;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuForm extends JFrame {


    private JPanel panel;
    private JButton zadanie1Button;
    private JButton CHECKButton;
    private JButton CLOSEButton;
    private JButton WYLOGUJButton;
    private JButton RODIONButton;

    public MenuForm() {
        super("MENU FORM");
        this.setContentPane(this.panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(450,300);
        this.setVisible(true);
        WYLOGUJButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                LoginForm loginForm = new LoginForm();
            }
        });
        CLOSEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        zadanie1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Zadanie1 zadanie1 = new Zadanie1();
            }
        });
        RODIONButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                RodionForm rodionForm = new RodionForm();
            }
        });
        CHECKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                CheckForm checkForm = new CheckForm();
            }
        });
    }
}
