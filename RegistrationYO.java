import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegistrationYO extends JFrame implements ActionListener {
    JButton firstButtonYO, secondButtonYO, registrationButtonYO;
    JTextField nameYO, passwordYO, newDepositYO;

    RegistrationYO(){
        setBounds(200, 200, 1000, 600);
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE );

        JLabel secondLabelYO = new JLabel("PORCELAIN BANK");
        secondLabelYO.setFont(new Font("Dialog", Font.BOLD, 40));
        secondLabelYO.setForeground(new Color(120, 0, 185));
        secondLabelYO.setBounds(300, 60, 800, 45);
        add(secondLabelYO);

        JLabel thirdLabelYO = new JLabel("Enter Username");
        thirdLabelYO.setFont(new Font("Dialog", Font.BOLD, 28));
        thirdLabelYO.setForeground(new Color(255,255,255));
        thirdLabelYO.setBounds(300, 150, 500, 30);
        add(thirdLabelYO);

        nameYO = new JTextField();
        nameYO.setBounds(300, 200, 400, 35);
        nameYO.setFont(new Font("Dialog", Font.BOLD, 20));
        add(nameYO);

        JLabel enterFieldYO = new JLabel("Enter Password");
        enterFieldYO.setFont(new Font("Dialog", Font.BOLD, 28));
        enterFieldYO.setForeground(new Color(255,255,255));
        enterFieldYO.setBounds(300, 250, 500, 30);
        add(enterFieldYO);

        passwordYO = new JTextField();
        passwordYO.setBounds(300, 300, 400, 35);
        passwordYO.setFont(new Font("Dialog", Font.BOLD, 20));
        add(passwordYO);

        JLabel depositYO = new JLabel("Deposit Amount");
        depositYO.setFont(new Font("Dialog", Font.BOLD, 28));
        depositYO.setForeground(new Color(255,255,255));
        depositYO.setBounds(300, 350, 500, 30);
        add(depositYO);

        newDepositYO = new JTextField();
        newDepositYO.setBounds(300, 400, 400, 35);
        newDepositYO.setFont(new Font("Dialog", Font.BOLD, 20));
        add(newDepositYO);

        firstButtonYO = new JButton("START");
        firstButtonYO.setBounds(300, 450, 100, 40);
        firstButtonYO.setBackground(new Color(0, 10, 200));
        firstButtonYO.setForeground(Color.BLACK);
        firstButtonYO.addActionListener(new ActionListener(){
                                            @Override
                                            public void actionPerformed (ActionEvent e){
                                                String sendName = nameYO.getText();
                                                String sendDeposit = newDepositYO.getText();

                                                new LandingYO(sendName, sendDeposit, 0).setVisible(true);
                                                dispose();
                                            }
                                        }
        );

        add(firstButtonYO);

        secondButtonYO = new JButton("EXIT");
        secondButtonYO.setBounds(550, 450, 100, 40);
        secondButtonYO.setBackground(new Color(150, 0, 10));
        secondButtonYO.setForeground(Color.BLACK);
        secondButtonYO.addActionListener(new ActionListener(){
                                             @Override
                                             public void actionPerformed (ActionEvent e){

                                                 new ExitYO().setVisible(true);
                                                 dispose();

                                             }
                                         }
        );

        add(secondButtonYO);
        setVisible(true);

        registrationButtonYO = new JButton("BACK");
        registrationButtonYO.setBounds(425, 450, 100, 40);
        registrationButtonYO.setBackground(new Color(0, 20, 250));
        registrationButtonYO.setForeground(Color.BLACK);
        registrationButtonYO.addActionListener(new ActionListener(){
                                                   @Override
                                                   public void actionPerformed (ActionEvent e){

                                                       new LoginYO().setVisible(true);
                                                       dispose();

                                                   }
                                               }
        );

        add(registrationButtonYO);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){


        if(ae.getSource() == firstButtonYO){
            String name = nameYO.getText();
            this.setVisible(false);
            new Guides(name);
        }else{
            System.exit(0);
        }
    }


    private static class Guides {
        public Guides(String name) {
        }
    }
}
