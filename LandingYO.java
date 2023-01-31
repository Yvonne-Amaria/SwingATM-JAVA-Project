import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LandingYO extends JFrame implements ActionListener {
    JButton depositButtonYO, exitButtonYO, withdrawalButtonYO, balanceButtonYO;
    LandingYO(String currUserYO, String currBalanceYO, int idYO){
        setBounds(300, 200, 1000, 500);
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE );

        JLabel secondLabelYO = new JLabel("Welcome " + currUserYO + "🎊");
        secondLabelYO.setFont(new Font("Dialog", Font.BOLD, 35));
        secondLabelYO.setForeground(new Color(255, 100, 0));
        secondLabelYO.setBounds(100, 150, 600, 45);
        add(secondLabelYO);

        int check = 0;

        depositButtonYO = new JButton("DEPOSIT");
        depositButtonYO.setBounds(750, 50, 150, 40);
        depositButtonYO.setBackground(new Color(190, 180, 0));
        depositButtonYO.setForeground(Color.BLACK);
        depositButtonYO.addActionListener(new ActionListener(){
                                              @Override
                                              public void actionPerformed (ActionEvent e){
                                                  new DepositFundsYO(currUserYO, currBalanceYO, idYO).setVisible(true);
                                                  dispose();
                                              }
                                          }
        );

        add(depositButtonYO);

        withdrawalButtonYO = new JButton("WITHDRAW");
        withdrawalButtonYO.setBounds(750, 150, 150, 40);
        withdrawalButtonYO.setBackground(new Color(190, 180, 0));
        withdrawalButtonYO.setForeground(Color.BLACK);
        withdrawalButtonYO.addActionListener(new ActionListener(){
                                                 @Override
                                                 public void actionPerformed (ActionEvent e){
                                                     new WithdrawFundsYO(currUserYO,currBalanceYO, idYO).setVisible(true);
                                                     dispose();
                                                 }
                                             }
        );

        add(withdrawalButtonYO);

        balanceButtonYO = new JButton("CHECK BALANCE");
        balanceButtonYO.setBounds(750, 250, 150, 40);
        balanceButtonYO.setBackground(new Color(190, 180, 0));
        balanceButtonYO.setForeground(Color.BLACK);
        balanceButtonYO.addActionListener(new ActionListener(){
                                              @Override
                                              public void actionPerformed (ActionEvent e){
                                                  new CheckBalanceYO(currUserYO,currBalanceYO, idYO).setVisible(true);
                                                  dispose();
                                              }
                                          }
        );

        add(balanceButtonYO);

        exitButtonYO = new JButton("EXIT");
        exitButtonYO.setBounds(750, 350, 150, 40);
        exitButtonYO.setBackground(new Color(200, 0, 0));
        exitButtonYO.setForeground(Color.BLACK);
        exitButtonYO.addActionListener(new ActionListener(){
                                           @Override
                                           public void actionPerformed (ActionEvent e){

                                               new ExitYO().setVisible(true);
                                               dispose();

                                           }
                                       }
        );
        add(exitButtonYO);

        setVisible(true);
    }


    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == depositButtonYO){
            this.setVisible(false);
        }
        else{
            System.exit(0);
        }
    }
}

