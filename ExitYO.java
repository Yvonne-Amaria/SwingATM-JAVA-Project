import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ExitYO extends JFrame implements ActionListener {
    JButton backButtonYO;
    ExitYO(){
        setBounds(300, 200, 600, 400);
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE );

        JLabel viewBalanceYO = new JLabel("LOGGING OUT...");
        viewBalanceYO.setFont(new Font("Dialog", Font.BOLD, 50));
        viewBalanceYO.setForeground(new Color(223,180,200));
        viewBalanceYO.setBounds(100, 100, 400, 140);
        add(viewBalanceYO);

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