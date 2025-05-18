package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class Signup2 extends JFrame implements ActionListener {
    String formNo;
    JComboBox comboBox,comboBox2,
            comboBox3,comboBox4
            ,comboBox5;
    JTextField textFieldPAN, textFieldAdhar;
    JRadioButton r1,r2,r3,r4;
    JButton next;
    String form_no;

    Signup2(String form_no){
        super("Application Form");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(20,5,100,100);
        add(image);

        this.form_no = form_no;

        JLabel l1 = new JLabel("Page 2");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(370,30,600,40);
        add(l1);

        JLabel l2 = new JLabel("Additional Details");
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        l2.setBounds(320,70,600,40);
        add(l2);

        JLabel l3 = new JLabel("Religion :");
        l3.setFont(new Font("Raleway",Font.BOLD,20));
        l3.setBounds(100,160,100,30);
        add(l3);
        String rel[] = {"Hindu","Muslim","Sikh","Christian","Other"};
        comboBox = new JComboBox(rel);
        comboBox.setBackground(new Color(222,255,228));
        comboBox.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox.setBounds(350,160,320,30);
        add(comboBox);

        JLabel l4 = new JLabel("Category :");
        l4.setFont(new Font("Raleway",Font.BOLD,20));
        l4.setBounds(100,200,100,30);
        add(l4);
        String cat[] = {"General","OBC","SC","ST","Other"};
        comboBox2 = new JComboBox(cat);
        comboBox2.setBackground(new Color(222,255,228));
        comboBox2.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox2.setBounds(350,200,320,30);
        add(comboBox2);


        JLabel l5 = new JLabel("Income :");
        l5.setFont(new Font("Raleway",Font.BOLD,20));
        l5.setBounds(100,240,100,30);
        add(l5);
        String inc[] = {"Null","<1,50,000","<2,50,000","<5,00,000",">5,00,000"};
        comboBox3 = new JComboBox(inc);
        comboBox3.setBackground(new Color(222,255,228));
        comboBox3.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox3.setBounds(350,240,320,30);
        add(comboBox3);


        JLabel l6 = new JLabel("Education :");
        l6.setFont(new Font("Raleway",Font.BOLD,20));
        l6.setBounds(100,280,150,30);
        add(l6);
        String edu[] = {"UnEducated","10th Pass","PUC","Doctorate","UG","PG"};
        comboBox4 = new JComboBox(edu);
        comboBox4.setBackground(new Color(222,255,228));
        comboBox4.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox4.setBounds(350,280,320,30);
        add(comboBox4);


        JLabel l7 = new JLabel("Occupation :");
        l7.setFont(new Font("Raleway",Font.BOLD,20));
        l7.setBounds(100,320,150,30);
        add(l7);
        String occu[] = {"Unemployed", "Student", "Self-employed", "Private Job",
                "Government Job", "Business", "Retired", "Farmer", "Engineer", "Doctor",
                "Teacher", "Lawyer", "Driver", "Technician", "Clerk", "Housewife", "Other"};
        comboBox5 = new JComboBox(occu);
        comboBox5.setBackground(new Color(222,255,228));
        comboBox5.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox5.setBounds(350,320,320,30);
        add(comboBox5);


        JLabel l8 = new JLabel("PAN No :");
        l8.setFont(new Font("Raleway",Font.BOLD,20));
        l8.setBounds(100,360,100,30);
        add(l8);

        textFieldPAN = new JTextField();
        textFieldPAN.setFont(new Font("Raleway",Font.BOLD,14));
        textFieldPAN.setBounds(350,360,322,30);
        add(textFieldPAN);


        JLabel l9 = new JLabel("Adhar No :");
        l9.setFont(new Font("Raleway",Font.BOLD,20));
        l9.setBounds(100,400,100,30);
        add(l9);

        textFieldAdhar = new JTextField();
        textFieldAdhar.setFont(new Font("Raleway",Font.BOLD,14));
        textFieldAdhar.setBounds(350,400,322,30);
        add(textFieldAdhar);


        JLabel l10 = new JLabel("Senior Citizen :");
        l10.setFont(new Font("Raleway",Font.BOLD,20));
        l10.setBounds(100,440,150,30);
        add(l10);

        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(222,255,228));
        r1.setBounds(350, 440, 100, 30);
        add(r1);

        r2 = new JRadioButton("No");
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(new Color(222,255,228));
        r2.setBounds(460, 440, 100, 30);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);


        JLabel l11 = new JLabel("Existing Account :");
        l11.setFont(new Font("Raleway",Font.BOLD,20));
        l11.setBounds(100,480,180,30);
        add(l11);

        r3 = new JRadioButton("Yes");
        r3.setFont(new Font("Raleway",Font.BOLD,14));
        r3.setBackground(new Color(222,255,228));
        r3.setBounds(350, 480, 100, 30);
        add(r3);

        r4 = new JRadioButton("No");
        r4.setFont(new Font("Raleway",Font.BOLD,14));
        r4.setBackground(new Color(222,255,228));
        r4.setBounds(460, 480, 100, 30);
        add(r4);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(r3);
        buttonGroup1.add(r4);


        JLabel l12 = new JLabel("Form No : ");
        l12.setFont(new Font("Raleway", Font.BOLD,14));
        l12.setBounds(700,10,100,30);
        add(l12);

        JLabel l13 = new JLabel(form_no);
        l13.setFont(new Font("Raleway", Font.BOLD,14));
        l13.setBounds(760,10,60,30);
        add(l13);

        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(570,550,100,30);
        next.addActionListener(this);
        add(next);


        setLayout(null);
        setSize(850,750);
        setLocation(450,80);
        getContentPane().setBackground(new Color(222,255,228));
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String rel = (String) comboBox.getSelectedItem();
        String cate = (String) comboBox2.getSelectedItem();
        String inc = (String) comboBox3.getSelectedItem();
        String edu = (String) comboBox4.getSelectedItem();
        String occ = (String) comboBox5.getSelectedItem();

        String pan = textFieldPAN.getText();
        String aadhar = textFieldAdhar.getText();

        String s_city = " ";
        if ((r1.isSelected())){
            s_city = "Yes";
        }else if((r2.isSelected())){
            s_city = "No";
        }

        String e_account = " ";
        if ((r3.isSelected())){
            e_account = "Yes";
        } else if (r4.isSelected()) {
            e_account = "No";
        }

        try{
            if (textFieldPAN.getText().isEmpty() || textFieldAdhar.getText().isEmpty()){
                JOptionPane.showMessageDialog(null,"Fill all the fields.");
            }
            else{
                Con c = new Con();
                String q = "insert into signuptwo values('"+form_no+"','"+rel+"', '"+cate+"','"+inc+"','"+edu+"','"+occ+"','"+pan+"','"+aadhar+"','"+s_city+"','"+e_account+"')";
                c.statement.executeUpdate(q);
                new Signup3(form_no);
                setVisible(false);
            }
        }catch (SQLException f) {
            if (f.getMessage().toLowerCase().contains("duplicate") || f.getMessage().toLowerCase().contains("primary")) {
                JOptionPane.showMessageDialog(null, "Check you Aadhar or PAN number.");
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
        new Signup2("");
    }
}
