import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CheckBalanceYO extends JFrame implements ActionListener {
    JButton backButtonYO;

    CheckBalanceYO(String thisUserYO, String userBalanceYO, int UUID_YO){
        setBounds(200, 100, 600, 400);
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE );

        JLabel viewAcctBalanceYO = new JLabel("Hello " + thisUserYO + "!");
        viewAcctBalanceYO.setFont(new Font("Dialog", Font.BOLD, 25));
        viewAcctBalanceYO.setForeground(new Color(150, 80, 180));
        viewAcctBalanceYO.setBounds(75, 0, 400, 100);
        add(viewAcctBalanceYO);

        JLabel acctBalanceYO = new JLabel("You have $" + userBalanceYO + " in your account");
        acctBalanceYO.setFont(new Font("Dialog", Font.BOLD, 20));
        acctBalanceYO.setForeground(new Color(150, 80, 180));
        acctBalanceYO.setBounds(75, 25, 2880, 100);
        add(acctBalanceYO);

        backButtonYO = new JButton("BACK");
        backButtonYO.setBounds(100, 100, 100, 40);
        backButtonYO.setBackground(new Color(20, 0, 200));
        backButtonYO.setForeground(Color.BLACK);
        backButtonYO.addActionListener(new ActionListener(){
                                           @Override
                                           public void actionPerformed (ActionEvent e){

                                               new LandingYO(thisUserYO,userBalanceYO, UUID_YO).setVisible(true);
                                               dispose();

                                           }
                                       }
        );

        add(backButtonYO);
        setVisible(true);
    }


    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == backButtonYO){
            this.setVisible(false);
        }
        else{
            System.exit(0);
        }
    }
}