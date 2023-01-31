import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WithdrawFundsYO extends JFrame implements ActionListener {
    JButton backButtonYO, enterFieldYO;
    String testBalanceYO;
    //int finalBalanceYO = 0;
    JTextField amountYO;

    WithdrawFundsYO(String thisUserYO, String currBalanceYO, int UUID_YO){
        setBounds(200, 100, 600, 400);
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE );

        testBalanceYO = currBalanceYO;

        amountYO = new JTextField("0");
        amountYO.setBounds(100, 100, 200, 35);
        amountYO.setFont(new Font("Dialog", Font.BOLD, 20));
        add(amountYO);

        JLabel acctBalanceYO = new JLabel("Your account balance is $" + currBalanceYO);


        enterFieldYO = new JButton("ENTER");
        enterFieldYO.setBounds(100, 150, 100, 40);
        enterFieldYO.setBackground(new Color(10, 0, 200));
        enterFieldYO.setForeground(Color.BLACK);
        enterFieldYO.addActionListener(new ActionListener(){
                                           @Override
                                           public void actionPerformed (ActionEvent e){
                                               int thisUserBalanceYO =  viewWithdrawalYO(testBalanceYO);
                                               acctBalanceYO.setText("Your account balance is $"+thisUserBalanceYO);
                                           }
                                       }
        );

        add(enterFieldYO);

        JLabel viewAcctBalanceYO = new JLabel("Hello " + thisUserYO + "!");
        viewAcctBalanceYO.setFont(new Font("Dialog", Font.BOLD, 25));
        viewAcctBalanceYO.setForeground(new Color(150, 80, 180));
        viewAcctBalanceYO.setBounds(75, 0, 250, 100);
        add(viewAcctBalanceYO);

        acctBalanceYO.setFont(new Font("Dialog", Font.BOLD, 20));
        acctBalanceYO.setForeground(new Color(150, 80, 180));
        acctBalanceYO.setBounds(75, 25, 2880, 100);
        add(acctBalanceYO);

        backButtonYO = new JButton("BACK");
        backButtonYO.setBounds(100, 200, 100, 40);
        backButtonYO.setBackground(new Color(10, 0, 200));
        backButtonYO.setForeground(Color.BLACK);
        backButtonYO.addActionListener(new ActionListener(){
                                           @Override
                                           public void actionPerformed (ActionEvent e){
                                               new LandingYO(thisUserYO,String.valueOf(testBalanceYO) ,UUID_YO).setVisible(true);
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

    public int viewWithdrawalYO(String x ){
        String text = amountYO.getText();
        System.out.println(text);
        int withdrawCashYO = Integer.parseInt(text);
        int thisUserBalanceYO = Integer.parseInt(x);

        thisUserBalanceYO = thisUserBalanceYO-  withdrawCashYO;
        testBalanceYO = String.valueOf(thisUserBalanceYO) ;

        amountYO.setText("");

        return thisUserBalanceYO;
    }
}