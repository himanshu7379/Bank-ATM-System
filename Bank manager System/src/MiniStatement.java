import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;

public class MiniStatement  extends JFrame {
    String pinnumber;

    MiniStatement (String pinnumber) {
        setTitle("Mini Statement: ");

        setLayout(null);

        JLabel mini = new JLabel();
        mini.setBounds(20,140,400,200);
        add(mini);


        JLabel bank = new JLabel("APNA BANK");
        bank.setBounds(150,20,100,30);
        add(bank);


        JLabel card = new JLabel();
        card.setBounds(50,90,300,20);
        add(card);

        JLabel balance = new JLabel();
        balance.setBounds(20,350,300,20);
        add(balance);

        try {
            connection c =new connection();
            ResultSet rs = c.s.executeQuery("select * from login where pin = '"+pinnumber+"'");
            while (rs.next()) {
                card.setText("Card Number:  " + rs.getString("cardnumber").substring(0,4) + "XXXXXXXX" + rs.getString("cardnumber").substring(12));

            }

        }catch (Exception e) {
            System.out.println(e);
        }

        try {
            connection c = new connection();
            int bal = 0;
            ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pinnumber+"'");
            while (rs.next()) {
                mini.setText(mini.getText() + "<html>" + rs.getString("date") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("type") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("amount") + "<br><br><html>");
                if (rs.getString("type").equals("Deposit")){
                    bal += Integer.parseInt(rs.getString("amount"));
                } else {
                    bal -= Integer.parseInt(rs.getString("amount"));
                }
            }
            balance.setText("Your current account balanace is Rs " +bal);

        }catch (Exception e) {
            System.out.println(e);
        }




        setSize(400,600);
        setLocation(20,20);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
    }



    public static void main(String[] args) {
        new MiniStatement("");

    }
}


