import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionListener;


public class singupOne extends JFrame implements ActionListener {
    long random;
    JTextField nameTextField, fathersnameTextField, DOBTextField, emailTextField, addressTextField, cityTextField,
            stateTextField, pincodeTextField;
    JRadioButton male, female, genderothers, married, unmarried, maritalothers;
    JDateChooser dateChooser;
    JButton next;

    singupOne(){
        setLayout(null);
        Random ram = new Random();
        random = Math.abs((ram.nextLong()%2000L)+1000L);

//          center application heading

        JLabel formno = new JLabel("APPLICATION FORM NO. "+random);
        formno.setFont(new Font("raleway", Font.BOLD,35));
        formno.setBounds(140,20,600, 40);
        add(formno);

//         heading

        JLabel personalDetails  = new JLabel("Page 1: Personal Details ");
        personalDetails.setFont(new Font("raleway", Font.BOLD,22));
        personalDetails.setBounds(290,80,400, 30);
        add(personalDetails);
//        name ke liye

        JLabel name  = new JLabel("Name:");
        name.setFont(new Font("raleway", Font.BOLD,20));
        name.setBounds(100,140,100, 30);
        add(name);


        nameTextField = new JTextField();
        nameTextField.setFont(new Font("raleway", Font.BOLD,14));
        nameTextField.setBounds(350,140,250,30);
        add(nameTextField);

//       fathersname ke liye

        JLabel FathersName  = new JLabel("Father's name:");
        FathersName.setFont(new Font("raleway", Font.BOLD,20));
        FathersName.setBounds(100,190,200, 30);
        add(FathersName);

        fathersnameTextField = new JTextField();
        fathersnameTextField.setFont(new Font("raleway", Font.BOLD,14));
        fathersnameTextField.setBounds(350,190,250,30);
        add(fathersnameTextField);

//       dob ke liye

        JLabel DOB  = new JLabel("Date Of Birth:");
        DOB.setFont(new Font("raleway", Font.BOLD,20));
        DOB.setBounds(100,240,200, 30);
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setBounds(350,240,250,30);
        dateChooser.setForeground(Color.BLACK);
        add(dateChooser);
//       gendar ke liye


        JLabel gender  = new JLabel("Gender:");
        gender.setFont(new Font("raleway", Font.BOLD,20));
        gender.setBounds(100,290,200, 30);
        add(gender);

        male = new JRadioButton("Male");
        male.setBounds(350,290,60,30);
        male.setBackground(Color.white);
        add(male);

        female = new JRadioButton("Female");
        female.setBounds(420,290,100,30);
        female.setBackground(Color.white);
        add(female);

        genderothers = new JRadioButton("Other");
        genderothers.setBounds(530,290,80,30);
        genderothers.setBackground(Color.white);
        add(genderothers);

        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);
        gendergroup.add(genderothers);

        JLabel email  = new JLabel("Email a/c:");
        email.setFont(new Font("raleway", Font.BOLD,20));
        email.setBounds(100,340,200, 30);
        add(email);

        emailTextField = new JTextField();
        emailTextField.setFont(new Font("raleway", Font.BOLD,14));
        emailTextField.setBounds(350,340,250,30);
        add(emailTextField);

        JLabel marital  = new JLabel("Marital Status:");
        marital.setFont(new Font("raleway", Font.BOLD,20));
        marital.setBounds(100,390,200, 30);
        add(marital);


        married = new JRadioButton("Married");
        married.setBounds(350,390,80,30);
        married.setBackground(Color.white);
        add(married);

        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(440,390,100,30);
        unmarried.setBackground(Color.white);
        add(unmarried);

        maritalothers = new JRadioButton("Other");
        maritalothers.setBounds(550,390,80,30);
        maritalothers.setBackground(Color.white);
        add(maritalothers);

        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(married);
        maritalgroup.add(unmarried);
        maritalgroup.add(maritalothers);



        JLabel address  = new JLabel("Address:");
        address.setFont(new Font("raleway", Font.BOLD,20));
        address.setBounds(100,440,200, 30);
        add(address);

        addressTextField = new JTextField();
        addressTextField.setFont(new Font("raleway", Font.BOLD,14));
        addressTextField.setBounds(350,440,250,30);
        add(addressTextField);

        JLabel city  = new JLabel("City:");
        city.setFont(new Font("raleway", Font.BOLD,20));
        city.setBounds(100,490,200, 30);
        add(city);


        cityTextField = new JTextField();
        cityTextField.setFont(new Font("raleway", Font.BOLD,14));
        cityTextField.setBounds(350,490,250,30);
        add(cityTextField);

        JLabel state  = new JLabel("state:");
        state.setFont(new Font("raleway", Font.BOLD,20));
        state.setBounds(100,540,200, 30);
        add(state);

        stateTextField = new JTextField();
        stateTextField.setFont(new Font("raleway", Font.BOLD,14));
        stateTextField.setBounds(350,540,250,30);
        add(stateTextField);


        JLabel pincode  = new JLabel("Pincode:");
        pincode.setFont(new Font("raleway", Font.BOLD,20));
        pincode.setBounds(100,590,200, 30);
        add(pincode);

        pincodeTextField = new JTextField();
        pincodeTextField.setFont(new Font("raleway", Font.BOLD,14));
        pincodeTextField.setBounds(350,590,250,30);
        add(pincodeTextField);

        next = new JButton("Next");
        next.setBackground(Color.gray);
        next.setForeground(Color.BLACK);
        next.setFont(new Font("raleway", Font.BOLD,14));
        next.setBounds(620, 660, 80,30);
        next.addActionListener(this);
        add(next);



        getContentPane().setBackground(Color.WHITE);

        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }

    public static void main(String[] args) {
        new singupOne();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formno = " " + random;
        String name = nameTextField.getText();
        String fathersname = fathersnameTextField.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(male.isSelected())
        {
            gender = "Male";
        } else if (female.isSelected())
        {
            gender = "Female";
        } else if(genderothers.isSelected())
        {
           gender = "Others";
        }
        String email = emailTextField.getText();
        String marital = null;
        if(married .isSelected())
        {
            marital = "Married";
        } else if(unmarried.isSelected())
        {
            marital = "Unmarried";
        } else if(maritalothers.isSelected())
        {
            marital = "Others";
        }


        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String pin = pincodeTextField.getText();

        try {
            if (name.equals(""))
            {
                JOptionPane.showMessageDialog(null," NAME IS REQUIRED");
            }
//            else if (fathersname.equals(""))
//            {
//                JOptionPane.showMessageDialog(null," FATHERSNAME IS REQUIRED");
//            }
//            else if (genderothers.equals(""))
//            {
//                JOptionPane.showMessageDialog(null," GENDER IS REQUIRED");
//            }
//           else if (email.equals(""))
//            {
//                JOptionPane.showMessageDialog(null," EMAIL IS REQUIRED");
//            }
//            else if (address.equals(""))
//            {
//                JOptionPane.showMessageDialog(null," ADDRESS IS REQUIRED");
//            }
//            else if (city.equals(""))
//            {
//                JOptionPane.showMessageDialog(null,"CITY IS REQUIRED");
//            }
//            else if (state.equals(""))
//            {
//                JOptionPane.showMessageDialog(null,"STATE IS REQUIRED");
//            }
//            else if (pin.equals(""))
//            {
//                JOptionPane.showMessageDialog(null," PINCODE IS REQUIRED");
//            }

            else {
                connection c = new connection();
                String query = "insert into signup values('"+formno+"', '"+name+"', '"+fathersname+"', '"+dob+"', " +
                        "'"+gender+"', '"+email+"', '"+marital+"' '"+address+"', '"+city+"', '"+state+"', '"+pin+"')";
                c.s.executeUpdate(query);
                setVisible(false);
                new singuptwo(formno).setVisible(true);
            }

        } catch (Exception ex){
            System.out.println(ex);
        }



    }
}
