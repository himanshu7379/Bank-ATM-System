import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class signupthree extends JFrame implements ActionListener {
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit, cancle;
    String formno;


    signupthree(String formno){
        this.formno = formno;
        setLayout(null);

        JLabel l1 = new JLabel("Page 3: Account Details : ");
        l1.setFont(new Font("raleway",Font.BOLD,22));
        l1.setBounds(280,40,400,40);
        add(l1);

        JLabel type = new JLabel("Account Type:");
        type.setFont(new Font("raleway",Font.BOLD,22));
        type.setBounds(100,140,200,30);
        add(type);

        r1 = new JRadioButton("Saving Account");
        r1.setBackground(Color.white);
        r1.setBounds(130,180,150,30);
        add(r1);

        r2 = new JRadioButton("FD Account");
        r2.setBackground(Color.white);
        r2.setBounds(380,180,150,30);
        add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setBackground(Color.WHITE);
        r3.setBounds(130,220,150,30);
        add(r3);

        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setBackground(Color.WHITE);
        r4.setBounds(380,220,230,30);
        add(r4);

        ButtonGroup groupaccount = new ButtonGroup();
        groupaccount.add(r1);
        groupaccount.add(r2);
        groupaccount.add(r3);
        groupaccount.add(r4);


        JLabel cardtype = new JLabel("Card Number:");
        cardtype.setFont(new Font("raleway",Font.BOLD,22));
        cardtype.setBounds(100,270,200,30);
        add(cardtype);

        JLabel number = new JLabel("XXXX-XXXX-XXXX-4185");
        number.setFont(new Font("raleway",Font.BOLD,22));
        number.setBounds(330,270,400,30);
        add(number);
        JLabel cardDetail = new JLabel("(Your 16 Digit card no.)");
        cardDetail.setFont(new Font("raleway",Font.BOLD,15));
        cardDetail.setBounds(100,300,400,20);
        add(cardDetail);

        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("raleway",Font.BOLD,22));
        pin.setBounds(100,340,200,30);
        add(pin);

        JLabel pinnumber = new JLabel(" XXXX");
        pinnumber.setFont(new Font("raleway",Font.BOLD,22));
        pinnumber.setBounds(330,340,400,30);
        add(pinnumber);

        JLabel pinDetail = new JLabel("(Your 4-Digit Pin)");
        pinDetail.setFont(new Font("raleway",Font.BOLD,15));
        pinDetail.setBounds(100,370,400,20);
        add(pinDetail);

        JLabel service = new JLabel("Services Required:");
        service.setFont(new Font("raleway",Font.BOLD,22));
        service.setBounds(100,400,300,30);
        add(service);

        c1 = new JCheckBox("ATM Card");
        c1.setBackground(Color.white);
        c1.setFont(new Font("Raleway",Font.BOLD,16));
        c1.setBounds(100,450,200,30);
        add(c1);
        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(Color.white);
        c2.setFont(new Font("Raleway",Font.BOLD,16));
        c2.setBounds(350,450,200,30);
        add(c2);
        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(Color.white);
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        c3.setBounds(100,480,200,30);
        add(c3);
        c4 = new JCheckBox("Emails $$ SMS Alerts");
        c4.setBackground(Color.white);
        c4.setFont(new Font("Raleway",Font.BOLD,16));
        c4.setBounds(350,480,220,30);
        add(c4);
        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(Color.white);
        c5.setFont(new Font("Raleway",Font.BOLD,16));
        c5.setBounds(100,510,200,30);
        add(c5);
        c6 = new JCheckBox("E-Statement");
        c6.setBackground(Color.white);
        c6.setFont(new Font("Raleway",Font.BOLD,16));
        c6.setBounds(350,510,200,30);
        add(c6);
        c7 = new JCheckBox("I hereby declares that the above entered details are correct to the best of my knowledge.");
        c7.setBackground(Color.white);
        c7.setFont(new Font("Raleway",Font.BOLD,15));
        c7.setBounds(100,550,750,30);
        add(c7);

        submit = new JButton("Submit");
        submit.setBackground(Color.gray);
        submit.setForeground(Color.BLACK);
        submit.setFont(new Font("Raleway",Font.BOLD,14));
        submit.setBounds(200,620,100,30);
        submit.addActionListener(this);
        add(submit);
        cancle = new JButton("Cancle");
        cancle.setBackground(Color.gray);
        cancle.setForeground(Color.BLACK);
        cancle.setFont(new Font("Raleway",Font.BOLD,14));
        cancle.setBounds(460,620,100,30);
        cancle.addActionListener(this);
        add(cancle);

        getContentPane().setBackground(Color.WHITE);






        setSize(850,820);
        setLocation(350,10);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == submit){
            String accountType = null;
            if (r1.isSelected())
            {
                accountType = "Saving Account";
            } else if (r2.isSelected()) {
                accountType = "Fixed Deposit Account ";
            }else if (r3.isSelected()) {
                accountType = "Current Account ";
            }else if (r4.isSelected()) {
                accountType = "Reccuring Deposit Account  ";
            }

            Random random = new Random();
            String cardnumber ="" + Math.abs((random.nextLong() %90000000L)+5040936000000000L);
            String pinnumber = ""+Math.abs((random.nextLong()%9000L)+1000L);
            String facility = "";
            if(c1.isSelected()){
                facility = facility + "ATM Card";
            } else if (c2.isSelected()) {
                facility = facility + " Internet Banking";
            }else if (c3.isSelected()) {
                facility = facility + " Mobile Banking";
            }else if (c4.isSelected()) {
                facility = facility + " Email & SMS Alerts";
            }else if (c5.isSelected()) {
                facility = facility + " Cheque Book";
            }else if (c6.isSelected()) {
                facility = facility + " E-Statement";
            }

            try {
                if(accountType.equals("")) {
                    JOptionPane.showMessageDialog(null, "Account type is required");
                }
                else {
                    connection c = new connection();
                    String query1 = "insert into signupthree values('"+formno+"', '"+accountType+"', '"+cardnumber+"', '"+pinnumber+"', '"+facility+"')";
                    String query2 = "insert into login values('"+formno+"', '"+cardnumber+"', '"+pinnumber+"')";
                    c.s.executeUpdate(query1);
                    c.s.executeUpdate(query2);
//                  new signupthree(formno).setVisible(true);
                    JOptionPane.showMessageDialog(null, "Card Number:" +cardnumber+ "\n Pin:" +pinnumber);
                    setVisible(false);
                    new deposit(pinnumber).setVisible(true);

                }

            }catch (Exception e){
                System.out.println(e);

            }
        } else if (ae.getSource() == cancle) {
            setVisible(false);
            new Login().setVisible(true);

        }
    }




    public static void main(String[] args) {
        new signupthree("");
    }
}
