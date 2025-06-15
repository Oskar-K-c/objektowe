package TASKS.LAB16;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckForm extends JFrame {
    private JPanel panel;
    private JCheckBox JAVAcheck;
    private JCheckBox csharpcheck;
    private JCheckBox cCheck;
    private JCheckBox PythonCheck;
    private JButton OKButton;
    private JButton CLOSEButton1;
    private JButton MENUButton;

    public CheckForm() {
        super("Check Form");
        this.setContentPane(this.panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 300);
        this.setVisible(true);


        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float price=0;
                String msg="";
                if(JAVAcheck.isSelected()){
                    price+=3500;
                    msg+="JAVA #price 3500 PLN\n";
                }
                if (csharpcheck.isSelected()) {
                    price+=3000;
                    msg+="C# #price 3000 PLN\n";
                }
                if (cCheck.isSelected()) {
                    price+=4000;
                    msg+="C++ #price 4000 PLN\n";
                }
                if(PythonCheck.isSelected()){
                    price+=5000;
                    msg+="Python #price 5000 PLN\n";
                }
                msg+="=".repeat(40)+"\n";
                JOptionPane.showMessageDialog(null,msg+"Razem: "+price+" PLN","Info",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        MENUButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new MenuForm();
            }
        });
        CLOSEButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
}
