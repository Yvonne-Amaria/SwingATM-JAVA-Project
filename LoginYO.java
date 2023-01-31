import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class LoginYO extends JFrame implements ActionListener {
    JTextField firstTextYO;
    JButton firstButtonYO, secondButtonYO, registrationButtonYO;

    LoginYO(){
        setBounds(300, 200, 1000, 500);
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE );

        JLabel secondLabelYO = new JLabel("PORCELAIN BANK");
        secondLabelYO.setFont(new Font("Dialog", Font.BOLD, 80));
        secondLabelYO.setForeground(new Color(135, 0, 120));
        secondLabelYO.setBounds(140, 150, 1000, 70);
        add(secondLabelYO);

        JLabel thirdLabelYO = new JLabel("We Love Your Money!");
        thirdLabelYO.setFont(new Font("Dialog", Font.BOLD, 40));
        thirdLabelYO.setForeground(new Color(255,255,255));
        thirdLabelYO.setBounds(280, 250, 1000, 45);
        add(thirdLabelYO);


        int setColumnsYO = 4;
        int setRowsYO = 4;

        String[][] Users = new String[setColumnsYO][setRowsYO];
        Users[0][0] = "John Doe";
        Users[0][1] = "passwordDoe";
        Users[0][2] = "10000";

        Users[1][0] = "Jane Doe";
        Users[1][1] = "passwordJane";
        Users[1][2] = "500";

        Users[2][0] = "Sarah Conner";
        Users[2][1] = "helloword2000";
        Users[2][2] = "600";

        Users[3][0] = "New Subscriber";
        Users[3][1] = "New Subscriber";
        Users[3][2] = "828282";


        secondButtonYO = new JButton("EXIT");
        secondButtonYO.setBounds(500, 350, 150, 60);
        secondButtonYO.setBackground(new Color(120, 0, 20));
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

        registrationButtonYO = new JButton("REGISTER");
        registrationButtonYO.setBounds(350, 350, 150, 60);
        registrationButtonYO.setBackground(new Color(10, 24, 250));
        registrationButtonYO.setForeground(Color.BLACK);
        registrationButtonYO.addActionListener(new ActionListener(){
                                                   @Override
                                                   public void actionPerformed (ActionEvent e){
                                                       new RegistrationYO().setVisible(true);
                                                       dispose();
                                                   }
                                               }
        );

        add(registrationButtonYO);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == firstButtonYO){
            String name = firstTextYO.getText();
            this.setVisible(false);
            new Guides(name);
        }
        else{
            System.exit(0);
        }
    }

    private static class Guides {
        public Guides(String name) {
        }
    }
}
