import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class BalanceEnquiry extends JFrame implements ActionListener {

    JButton back;
    String pinnumber;
    BalanceEnquiry(String pinnumber){
        this.pinnumber = pinnumber;

        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);

        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);

        back = new JButton("BACK");
        back.setBounds(385,520,120,30);
        back.addActionListener(this);
        image.add(back);

        connection c = new connection();
        int balance = 0;
        try {
            ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pinnumber+"'");
            while (rs.next()){
                if (rs.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(rs.getString("amount"));
                } else {
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            }
        }catch (Exception e ){
            System.out.println(e);

        }

        JLabel text = new JLabel("Your Account balance is Rs : " +balance);
        text.setBounds(170,300,400,30);
        text.setForeground(Color.white);
        image.add(text);





        setSize(900,900);
        setLocation(300,00);
        setUndecorated(true);
        setVisible(true);

    }


    public static void main(String[] args) {
        new BalanceEnquiry("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new transaction(pinnumber).setVisible(true);

    }
}
