package bank.management.system;
import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.sql.SQLException;

public class Signup extends JFrame implements ActionListener {

    JRadioButton r1,r2,m1,m2,m3;

    JTextField textName,textFName,textEmail,textMarried
            ,textAddress,textCity,textPin,textState;
    JDateChooser dateChooser;
    JButton next;

    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    String first = " " + Math.abs(first4);

    Signup(){
        super("Application Form");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);


        JLabel label1 = new JLabel("Application Form No." + first);
        label1.setBounds(200,20,600,40);
        label1.setFont(new Font("Raleway",Font.BOLD,38));
        add(label1);


        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Raleway",Font.BOLD,22));
        label2.setBounds(380,70,600,30);
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setFont(new Font("Raleway",Font.BOLD,22));
        label3.setBounds(330,100,600,30);
        add(label3);


        JLabel label_name = new JLabel("Name :");
        label_name.setFont(new Font("Raleway",Font.BOLD,20));
        label_name.setBounds(100,240,100,30);
        add(label_name);
        textName = new JTextField();
        textName.setFont(new Font("Raleway",Font.BOLD,14));
        textName.setBounds(300,240,400,30);
        add(textName);


        JLabel father_name = new JLabel("Father's Name :");
        father_name.setFont(new Font("Raleway",Font.BOLD,20));
        father_name.setBounds(100,280,200,30);
        add(father_name);
        textFName = new JTextField();
        textFName.setFont(new Font("Raleway",Font.BOLD,14));
        textFName.setBounds(300,280,400,30);
        add(textFName);


        JLabel dob = new JLabel("Date Of Birth :");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,320,200,30);
        add(dob);
        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,320,400,30);
        add(dateChooser);


        JLabel labelG = new JLabel("Gender :");
        labelG.setFont(new Font("Raleway",Font.BOLD,20));
        labelG.setBounds(100,360,200,30);
        add(labelG);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBounds(300,360,60,30);
        r1.setBackground(new Color(222,255,228));
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBounds(400,360,80,30);
        r2.setBackground(new Color(222,255,228));
        add(r2);


        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);


        JLabel email = new JLabel("Email address :");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,400,200,30);
        add(email);
        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway",Font.BOLD,14));
        textEmail.setBounds(300,400,400,30);
        add(textEmail);


        JLabel married_status = new JLabel("Married Status :");
        married_status.setFont(new Font("Raleway",Font.BOLD,20));
        married_status.setBounds(100,440,200,30);
        add(married_status);
        m1 = new JRadioButton("Married");
        m1.setBounds(300,440,100,30);
        m1.setFont(new Font("Raleway",Font.BOLD,14));
        m1.setBackground(new Color(222,255,228));
        add(m1);

        m2 = new JRadioButton("UnMarried");
        m2.setBounds(450,440,100,30);
        m2.setFont(new Font("Raleway",Font.BOLD,14));
        m2.setBackground(new Color(222,255,228));
        add(m2);

        m3 = new JRadioButton("Other");
        m3.setBounds(600,440,100,30);
        m3.setFont(new Font("Raleway",Font.BOLD,14));
        m3.setBackground(new Color(222,255,228));
        add(m3);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(m1);
        buttonGroup1.add(m2);
        buttonGroup1.add(m3);


        JLabel address = new JLabel("Address :");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100,480,200,30);
        add(address);
        textAddress = new JTextField();
        textAddress.setFont(new Font("Raleway",Font.BOLD,14));
        textAddress.setBounds(300,480,400,30);
        add(textAddress);


        JLabel city = new JLabel("City :");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,520,200,30);
        add(city);
        textCity = new JTextField();
        textCity.setFont(new Font("Raleway",Font.BOLD,14));
        textCity.setBounds(300,520,400,30);
        add(textCity);


        JLabel pin = new JLabel("Pin Code :");
        pin.setFont(new Font("Raleway",Font.BOLD,20));
        pin.setBounds(100,560,200,30);
        add(pin);
        textPin = new JTextField();
        textPin.setFont(new Font("Raleway",Font.BOLD,14));
        textPin.setBounds(300,560,400,30);
        add(textPin);


        JLabel state = new JLabel("State :");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,600,200,30);
        add(state);
        textState = new JTextField();
        textState.setFont(new Font("Raleway",Font.BOLD,14));
        textState.setBounds(300,600,400,30);
        add(textState);

        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(680,680,80,30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formNo = first;
        String name = textName.getText();
        String fatherName = textFName.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if (r1.isSelected()){
            gender = "Male";
        } else if (r2.isSelected()) {
            gender = "Female";
        }
        String email = textEmail.getText();
        String marry = null;
        if (m1.isSelected()){
            marry = "Married";
        } else if (m2.isSelected()) {
            marry = "Unmarried";
        } else if (m3.isSelected()) {
            marry = "Other";
        }
        String add = textAddress.getText();
        String city = textCity.getText();
        String code = textPin.getText();
        String state = textState.getText();

        try {
            if (textName.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Fill all the fields.");
            } else {
                Con con1 = new Con();
                String q = "insert into signup values('" + formNo + "','" + name + "','" + fatherName + "'," +
                        "'" + dob + "','" + gender + "','" + email + "'," +
                        "'" + marry + "','" + add + "','" + city + "'," +
                        "'" + code + "','" + state + "')";
                con1.statement.executeUpdate(q);
                new Signup2(first);
                setVisible(false);
            }
        }catch (SQLException f) {
            if (f.getMessage().toLowerCase().contains("duplicate") || f.getMessage().toLowerCase().contains("primary")) {
                JOptionPane.showMessageDialog(null, "Email already exists. Please enter a different email.");
            } else {
                f.printStackTrace();
                JOptionPane.showMessageDialog(null, "An error occurred. Please try again.");
            }
        }catch (Exception g) {
            g.printStackTrace();
            JOptionPane.showMessageDialog(null, "An unexpected error occurred.");
        }
    }

    public static void main(String[] args) {
        new Signup();
    }
}