import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PinChange extends JFrame implements ActionListener {

    JPasswordField pin, repin;
    JButton change, back;
    String pinnumber;
    PinChange(String pinnumber){
        this.pinnumber = pinnumber;
        setLayout(null);



        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);

        JLabel text = new JLabel( "Change your Pin");
        text.setBounds(250,320,500,35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,16));
        image.add(text);

        JLabel pintext = new JLabel( "New Pin");
        pintext.setBounds(180,360,180,30);
        pintext.setForeground(Color.WHITE);
        pintext.setFont(new Font("System",Font.BOLD,16));
        image.add(pintext);


        pin = new JPasswordField();
        pin.setFont(new Font("Raleway",Font.BOLD,16));
        pin.setBounds(290,360,180,25);
        image.add(pin);


        JLabel repintext = new JLabel( "Re-Enter New Pin");
        repintext.setBounds(160,410,180,30);
        repintext.setForeground(Color.WHITE);
        repintext.setFont(new Font("System",Font.BOLD,16));
        image.add(repintext);


        repin = new JPasswordField();
        repin.setFont(new Font("Raleway",Font.BOLD,16));
        repin.setBounds(290,410,180,25);
        image.add(repin);

        change =  new JButton("CHANGE");
        change.setBounds(355,485,150,30);
        change.addActionListener(this);
        image.add(change);


        back =  new JButton("BACK");
        back.setBounds(355,520,150,30);
        back.addActionListener(this);
        image.add(back);



        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);



    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == change){
            try {

                String npin = pin.getText();
                String rpin = repin.getText();
                if (!npin.equals(rpin)) {
                    JOptionPane.showMessageDialog(null, "Entered PIN does not match");
                    return;
                }
                if (npin.equals("")){
                    JOptionPane.showMessageDialog(null, "Please entered new PIN");
                    return;
                }
                if(rpin.equals("")){
                    JOptionPane.showMessageDialog(null, "Please re-entered new PIN");
                    return;
                }
                connection c = new connection();
                String query1 = "update bank set pin = '"+rpin+"'  where pin='"+pinnumber+"'";
                String query2 = "update login set pin = '"+rpin+"'  where pin='"+pinnumber+"'";
                String query3 = "update signupthree set pin = '"+rpin+"'  where pin='"+pinnumber+"'";
                c.s.executeUpdate(query1);
                c.s.executeUpdate(query2);
                c.s.executeUpdate(query3);
                JOptionPane.showMessageDialog(null, "PIN changed successfully");
                setVisible(false);
                new transaction(npin).setVisible(true);

            }

          catch (Exception e) {
              System.out.println(e);
          }

        }
        else  {
            setVisible(false);
            new transaction(pinnumber).setVisible(true);

        }

    }
    public static void main(String[] args) {
        new PinChange("").setVisible(true);
    }



}
