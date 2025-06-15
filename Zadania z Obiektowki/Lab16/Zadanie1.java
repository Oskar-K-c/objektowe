package TASKS.LAB16;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Zadanie1 extends JFrame {

    private JPanel panel;
    private JButton CLOSEButton;
    private JButton MENUButton;
    private JPasswordField passwordField1;
    private JPasswordField passwordField2;
    private JButton OKButton;


    public Zadanie1() {
        super("Swing JPasswordField Demo Program");
        this.setContentPane(this.panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        CLOSEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String pass1= new String(passwordField1.getPassword());
                String pass2= new String(passwordField2.getPassword());
                if(!pass1.equals(pass2)){
                    JOptionPane.showMessageDialog(null,"Password do not match!","Error", JOptionPane.ERROR_MESSAGE);
                } else if (!pass1.equals("codejava")) {
                    JOptionPane.showMessageDialog(null,"Wrong password!","INFO", JOptionPane.ERROR_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(null,"Contratulations! You entered the correct password","Succes",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        MENUButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                MenuForm menuFrom=new MenuForm();
            }
        });
    }
}
