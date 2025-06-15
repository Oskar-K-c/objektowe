package TASKS.LAB16;

import javax.swing.*;

public class WelcomeForm extends JFrame{
    private JPanel panel1;
    private JLabel pleaseWaiting;
    private JProgressBar progressBar2;


    public WelcomeForm(){
        super("Welcome");
        this.setContentPane(this.panel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(450,300);
        this.setVisible(true);

        progression();
        dispose();

        LoginForm login=new LoginForm();
    }

    private void progression() {
        int counter=0;
        while(counter<100){
            pleaseWaiting.setText("Please waiting...");
            progressBar2.setValue(counter);

            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            counter+=1;
        }
    }
}