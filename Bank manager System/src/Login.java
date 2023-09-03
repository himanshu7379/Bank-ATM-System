import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Login extends JFrame implements ActionListener
{
    JButton login, signup, clear;
    JTextField cardTextField;
    JPasswordField pinTextField;

    Login() {

        setTitle("AUTOMATED TELLER MACHINE");
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image  i2  = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70,10,100,100);
        add(label);

        JLabel text = new JLabel("WELCOME TO APNA ATM");
        text.setFont(new Font("osward",Font.BOLD,38));
        text.setBounds(200,40,600,40);
        add(text);


        JLabel cardno = new JLabel("CARD No.");
        cardno.setFont(new Font("railway",Font.BOLD,28));
        cardno.setBounds(150,150,200,30);
        add(cardno);

        cardTextField = new JTextField();
        cardTextField.setBounds(350, 150, 230, 30);
        cardTextField.setFont(new Font("Arial",Font.BOLD,14));

        add(cardTextField);

        JLabel PIN = new JLabel("PIN ");
        PIN.setFont(new Font("raleway",Font.BOLD,28));
        PIN.setBounds(150,220,300,40);
        add(PIN);

        pinTextField = new JPasswordField();
        pinTextField.setBounds(350, 220, 230, 30);
        pinTextField.setFont(new Font("Arial",Font.BOLD,14));
        add(pinTextField);

        login = new JButton("SIGN IN");
        login.setBounds(350,300, 100, 30);
        login.setBackground(Color.LIGHT_GRAY);
        login.setForeground(Color.BLACK);
        login.addActionListener(this);
        add(login);

        clear = new JButton("CLEAR");
        clear.setBounds(480,300, 100, 30);
        clear.setBackground(Color.LIGHT_GRAY);
        clear.setForeground(Color.BLACK);
        clear.addActionListener(this);
        add(clear);


        signup = new JButton("SIGN UP");
        signup.setBounds(350,350, 230, 30);
        signup.setBackground(Color.LIGHT_GRAY);
        signup.setForeground(Color.BLACK);
        signup.addActionListener(this);
        add(signup);



        getContentPane().setBackground(Color.WHITE);
        setSize(800,400);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clear) {
            cardTextField.setText("");
            pinTextField.setText("");
        }   // 5040936010726843 ///  1342
        else if(e.getSource() == login){
            connection c = new connection();
            String cardnumber = cardTextField.getText();
            String pinnumber = pinTextField.getText();
            String query = "select * from login where cardnumber = '"+cardnumber+"' and pin = '"+pinnumber+"'";
            try{
                ResultSet rs = c.s.executeQuery(query);
                if (rs.next()){
                   setVisible(false);
                    new transaction(pinnumber).setVisible(true);
                }
                else {
                    JOptionPane.showMessageDialog(null,"Incorrect Card Number or Pin ");
                }
            }catch (Exception ex){
                System.out.println(ex);
            }


        }else if (e.getSource() == signup){
            setVisible(false);
            new singupOne().setVisible(true);
        }
    }
}
