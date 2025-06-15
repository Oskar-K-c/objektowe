package TASKS.LAB16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RodionForm extends JFrame{
    private JPanel panel;
    private JRadioButton linuxRadioButton;
    private JRadioButton windowsRadioButton;
    private JRadioButton macRadioButton;
    private JButton CLOSEButton;
    private JButton OKButton;
    private JButton MENUButton;
    private JLabel iconView;

    //wczytanie ikon
    private ImageIcon iconLinux = new ImageIcon(getClass().getResource("figurs/icons8-linux-100.png"));
    private ImageIcon iconWindows = new ImageIcon(getClass().getResource("figurs/icons8-windows-100.png"));
    private ImageIcon iconMac = new ImageIcon(getClass().getResource("figurs/icons8-apple-100.png"));

    private static ImageIcon resize(ImageIcon src, int width, int height){
        return new ImageIcon(src.getImage().getScaledInstance(width,height, Image.SCALE_SMOOTH));
    }


    public RodionForm(){
        super("Rodion");
        this.setContentPane(this.panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,450);
        this.setVisible(true);


        CLOSEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        MENUButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                MenuForm menuForm = new MenuForm();
            }
        });
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = "";
                if(linuxRadioButton.isSelected()) {
                    text += "Linux";
                } else if (windowsRadioButton.isSelected()) {
                    text+= "Windows";
                }else if(macRadioButton.isSelected()) {
                    text+="Mac";
                }
                JOptionPane.showMessageDialog(null,"Wybrano system: "+text,"Info",JOptionPane.INFORMATION_MESSAGE);
            }
        });
        linuxRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(linuxRadioButton.isSelected()){
                    iconView.setIcon(resize(iconLinux, 100, 80));
                }
            }
        });
        windowsRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(windowsRadioButton.isSelected()){
                    iconView.setIcon(resize(iconWindows, 100, 80));
                }
            }
        });
        macRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(macRadioButton.isSelected()){
                    iconView.setIcon(resize(iconMac, 100, 80));
                }
            }
        });
    }

}
