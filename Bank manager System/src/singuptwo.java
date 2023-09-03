
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionListener;


public class singuptwo extends JFrame implements ActionListener {
    JTextField panTextField, adharTextField, phoneTextField;
    JRadioButton senoiryes, senoirno, existingyes, existingno;
    JButton next;
    JComboBox religion, category, occupation, education, income;
    String formno;

    singuptwo(String formno){
        this.formno = formno;
        setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION FROM - PAGE 2");
        JLabel fformno = new JLabel("APPLICATION FORM NO. ");
        fformno.setFont(new Font("raleway", Font.BOLD,35));
        fformno.setBounds(140,20,600, 40);
        add(fformno);

//         heading

        JLabel additionalDetails  = new JLabel("Page 2: ADDITIONAL Details ");
        additionalDetails.setFont(new Font("raleway", Font.BOLD,22));
        additionalDetails.setBounds(290,80,400, 30);
        add(additionalDetails);
//        name ke liye

        JLabel name  = new JLabel("RELIGION:");
        name.setFont(new Font("raleway", Font.BOLD,20));
        name.setBounds(100,140,120, 30);
        add(name);


        String valReligion[] = {"Hindu", "Muslim", "Sikh", "Christan", "Others"} ;
        religion = new JComboBox(valReligion);
        religion.setBounds(350,140,250,30);
        religion.setBackground(Color.LIGHT_GRAY);
        add(religion);


        panTextField = new JTextField();
        panTextField.setFont(new Font("raleway", Font.BOLD,14));
        panTextField.setBounds(350,140,250,30);
        add(panTextField);

//       fathersname ke liye

        JLabel FathersName  = new JLabel("CATEGORY : ");
        FathersName.setFont(new Font("raleway", Font.BOLD,20));
        FathersName.setBounds(100,190,200, 30);
        add(FathersName);


        String valcategory[] = {"General", "OBC", "sc", "Other"};
        category = new JComboBox(valcategory);
        category.setBounds(350,190,250,30);
        category.setBackground(Color.LIGHT_GRAY);
        add(category);

//       dob ke liye

        JLabel DOB  = new JLabel("INCOME:");
        DOB.setFont(new Font("raleway", Font.BOLD,20));
        DOB.setBounds(100,240,200, 30);
        add(DOB);

        String valincome[] = {"Student", "Farmer","1L-3L", "5L-10L", "More 10L"};
        income = new JComboBox(valincome);
        income.setBounds(350,240,250,30);
        income.setBackground(Color.LIGHT_GRAY);
        add(income);

//       gendar ke liye


        JLabel phone  = new JLabel("PHONE NO.:");
        phone.setFont(new Font("raleway", Font.BOLD,20));
        phone.setBounds(100,290,200, 30);
        add(phone);

        phoneTextField = new JTextField();
        phoneTextField.setFont(new Font("raleway", Font.BOLD,14));
        phoneTextField.setBounds(350,290,250,30);
        add(phoneTextField);




        JLabel email  = new JLabel("EDUCATION:");
        email.setFont(new Font("raleway", Font.BOLD,20));
        email.setBounds(100,340,200, 30);
        add(email);

        String valeducation[] = {"10TH", "12TH","UG", "PG", "Phd.", "Others"};
        education = new JComboBox(valeducation);
        education.setBounds(350,340,250,30);
        education.setBackground(Color.LIGHT_GRAY);
        add(education);


        JLabel Occupation  = new JLabel("OCCUPATION:");
        Occupation.setFont(new Font("raleway", Font.BOLD,20));
        Occupation.setBounds(100,390,200, 30);
        add(Occupation);

        String valoccupation[] = {"Salaried", "Self-Employed","Bussiness", "Student", "Retried.", "Others"};
        occupation = new JComboBox(valoccupation);
        occupation.setBounds(350,390,250,30);
        occupation.setBackground(Color.LIGHT_GRAY);
        add(occupation);


        senoiryes = new JRadioButton("Yes");
        senoiryes.setBounds(350,530,100,35);
        senoiryes.setBackground(Color.gray);
        add(senoiryes);

        senoirno = new JRadioButton("No");
        senoirno.setBounds(480,530,100,35);
        senoirno.setBackground(Color.gray);
        add(senoirno);

        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(senoiryes);
        maritalgroup.add(senoirno);



        JLabel pan  = new JLabel("PAN NUMBER:");
        pan.setFont(new Font("raleway", Font.BOLD,20));
        pan.setBounds(100,440,200, 30);
        add(pan);

        panTextField = new JTextField();
        panTextField.setFont(new Font("raleway", Font.BOLD,14));
        panTextField.setBounds(350,440,250,30);
        add(panTextField);

        JLabel adhar  = new JLabel("ADHAR CARD:");
        adhar.setFont(new Font("raleway", Font.BOLD,20));
        adhar.setBounds(100,490,200, 30);
        add(adhar);


        adharTextField = new JTextField();
        adharTextField.setFont(new Font("raleway", Font.BOLD,14));
        adharTextField.setBounds(350,490,250,30);
        add(adharTextField);

        JLabel state  = new JLabel("SENIOR CITIZEN:");
        state.setFont(new Font("raleway", Font.BOLD,20));
        state.setBounds(100,540,200, 30);
        add(state);

//        stateTextField = new JTextField();
//        stateTextField.setFont(new Font("raleway", Font.BOLD,14));
//        stateTextField.setBounds(350,540,250,30);
//        add(stateTextField);


        JLabel existing  = new JLabel("EXISTING ACCOUNT:");
        existing.setFont(new Font("raleway", Font.BOLD,20));
        existing.setBounds(100,590,200, 30);
        add(existing);

        existingyes = new JRadioButton("Yes");
        existingyes.setBounds(350,590,100,30);
        existingyes.setBackground(Color.white);
        add(existingyes);

        existingno = new JRadioButton("No");
        existingno.setBounds(480,590,100,30);
        existingno.setBackground(Color.white);
        add(existingno);

        ButtonGroup existing_ac= new ButtonGroup();
        existing_ac.add(existingyes);
        existing_ac.add(existingno);

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

        new singuptwo("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String sreligion = (String) religion.getSelectedItem();
        String scategory = (String) category.getSelectedItem();
        String sincome = (String) income.getSelectedItem();
        String seducation = (String) education.getSelectedItem();
        String soccupation = (String) occupation.getSelectedItem ();
        String senoircitizen = null;
        if(senoiryes.isSelected())
        {
            senoircitizen = "Yes";
        } else if (senoirno.isSelected())
        {
            senoircitizen = "No";
        }
        String existingaccount = null;
        if(existingyes.isSelected())
        {
            existingaccount = "Yes";
        } else if(existingno.isSelected())
        {
            existingaccount = "No";
        }



        String span = panTextField.getText();
        String sadhar = adharTextField.getText();
        String sphone = phoneTextField.getText();

        try {
                connection c = new connection();
                String query = "insert into signuptwo values('"+formno+"', '"+sreligion+"','"+scategory+"', '"+sphone+"', '"+sincome+"','"+seducation+"', '"+soccupation+"', '"+span+"', '"+sadhar+"', '"+senoircitizen+"', '"+existingaccount+"')";
                c.s.executeUpdate(query);
//                 new signupthree(this.formno);
//                 this.setVisible(false);
                 new signupthree(this.formno).setVisible(true);

            }
         catch (Exception ex){
            System.out.println(ex);
        }



    }
}

