package TASKS.LAB16;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame {
    private JPanel panel;
    private JTextField LoginLabel;
    private JPasswordField passwordField1;
    private JButton CLOSEButton;
    private JButton LOGINButton;

    String user = "admin", passwd = "admin";
    public LoginForm(){
        super("LOGIN");
        this.setContentPane(this.panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(450,300);
        this.setVisible(true);
        CLOSEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        LOGINButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userInput = LoginLabel.getText();
                String passwdInput=new String(passwordField1.getPassword());
                if(userInput.equals(user)&&passwdInput.equals(passwd)){
                    dispose();
                    MenuForm menuFrom=new MenuForm();
                }else{
                    JOptionPane.showMessageDialog(null, "Wrong Username or Password");
                }
            }
        });
    }
}
