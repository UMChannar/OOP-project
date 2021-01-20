package FinalProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class signupframe extends JFrame implements ActionListener {

    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15;
    JPasswordField p1,p2,p3;
    JButton b1,b2;
    JLabel l1;

    signupframe(){

        l1 = new JLabel();
        l1.setText("Khareed LO");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("Bradley Hand ITC",Font.PLAIN,50));
        l1.setBounds(800,0,300,100);
        add(l1);

        t2 = new JTextField("Username");
        t2.setEditable(false);
        t2.setBounds(600,300,100,30);
        t2.setFont(new Font("null",Font.PLAIN,15));
        t2.setCaretColor(Color.WHITE);
        t2.setBackground(Color.GRAY);
        t2.setForeground(Color.white);
        add(t2);


        t1 = new JTextField();
        t1.setBounds(750,300,400,30);
        t1.setFont(new Font("null",Font.PLAIN,20));
        t1.setCaretColor(Color.WHITE);
        t1.setBackground(Color.GRAY);
        t1.setForeground(Color.white);
        add(t1);

        t3 = new JTextField("Password");
        t3.setEditable(false);
        t3.setBounds(600,340,100,30);
        t3.setFont(new Font("null",Font.PLAIN,15));
        t3.setCaretColor(Color.WHITE);
        t3.setBackground(Color.GRAY);
        t3.setForeground(Color.white);
        add(t3);

        p1 = new JPasswordField();
        p1.setBounds(750,340,400,30);
        p1.setFont(new Font("null",Font.PLAIN,20));
        p1.setCaretColor(Color.WHITE);
        p1.setBackground(Color.GRAY);
        p1.setForeground(Color.white);
        add(p1);

        t4 = new JTextField("Confirm Password");
        t4.setEditable(false);
        t4.setBounds(600,380,100,30);
        t4.setFont(new Font("null",Font.PLAIN,10));
        t4.setCaretColor(Color.WHITE);
        t4.setBackground(Color.GRAY);
        t4.setForeground(Color.white);
        add(t4);

        p2 = new JPasswordField();
        p2.setBounds(750,380,400,30);
        p2.setFont(new Font("null",Font.PLAIN,20));
        p2.setCaretColor(Color.WHITE);
        p2.setBackground(Color.GRAY);
        p2.setForeground(Color.white);
        add(p2);

        t5 = new JTextField("Bank Name");
        t5.setEditable(false);
        t5.setBounds(600,420,100,30);
        t5.setFont(new Font("null",Font.PLAIN,15));
        t5.setCaretColor(Color.WHITE);
        t5.setBackground(Color.GRAY);
        t5.setForeground(Color.white);
        add(t5);

        t6 = new JTextField();
        t6.setBounds(750,420,400,30);
        t6.setFont(new Font("null",Font.PLAIN,20));
        t6.setCaretColor(Color.WHITE);
        t6.setBackground(Color.GRAY);
        t6.setForeground(Color.white);
        add(t6);

        t7 = new JTextField("Account Number");
        t7.setEditable(false);
        t7.setBounds(600,460,100,30);
        t7.setFont(new Font("null",Font.PLAIN,10));
        t7.setCaretColor(Color.WHITE);
        t7.setBackground(Color.GRAY);
        t7.setForeground(Color.white);
        add(t7);

        t8 = new JTextField();
        t8.setBounds(750,460,400,30);
        t8.setFont(new Font("null",Font.PLAIN,20));
        t8.setCaretColor(Color.WHITE);
        t8.setBackground(Color.GRAY);
        t8.setForeground(Color.white);
        add(t8);

        t9 = new JTextField("Bank Pin");
        t9.setEditable(false);
        t9.setBounds(600,500,100,30);
        t9.setFont(new Font("null",Font.PLAIN,15));
        t9.setCaretColor(Color.WHITE);
        t9.setBackground(Color.GRAY);
        t9.setForeground(Color.white);
        add(t9);

        p3 = new JPasswordField();
        p3.setBounds(750,500,400,30);
        p3.setFont(new Font("null",Font.PLAIN,20));
        p3.setCaretColor(Color.WHITE);
        p3.setBackground(Color.GRAY);
        p3.setForeground(Color.white);
        add(p3);

        t10 = new JTextField("Secret Phrase");
        t10.setEditable(false);
        t10.setBounds(600,540,100,30);
        t10.setFont(new Font("null",Font.PLAIN,13));
        t10.setCaretColor(Color.WHITE);
        t10.setBackground(Color.GRAY);
        t10.setForeground(Color.white);
        add(t10);

        t11 = new JTextField();
        t11.setBounds(750,540,400,30);
        t11.setFont(new Font("null",Font.PLAIN,20));
        t11.setCaretColor(Color.WHITE);
        t11.setBackground(Color.GRAY);
        t11.setForeground(Color.white);
        add(t11);

        b1 = new JButton();
        b1.setText("Signup");
        b1.setFocusable(false);
        b1.setBackground(Color.GRAY);
        b1.setForeground(Color.white);
        b1.setFont(new Font("null",Font.ITALIC,20));
        b1.setBounds(850,750,200,50);
        b1.addActionListener(this);
        add(b1);

        ImageIcon icon = new ImageIcon("back.png");

        b2 = new JButton();
        b2.setIcon(icon);
        b2.setBounds(0,0,40,40);
        b2.addActionListener(this);
        add(b2);

        setSize(1920,1080);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setBackground(Color.GRAY);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==b1){

            if(String.valueOf(p1.getPassword()).equals(String.valueOf(p2.getPassword()))) {
                if (credentials.search(t1.getText())) {
                    JOptionPane.showMessageDialog(null, "Account already exists \nDirecting to Login page", null, JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                    loginframe l1 = new loginframe();
                } else {
                    credentials c1 = new credentials(t1.getText(), String.valueOf(p2.getPassword()), t6.getText(), Integer.parseInt(t8.getText()), Integer.parseInt(String.valueOf(p3.getPassword())), t11.getText());
                    credentials.writeToFile(c1);
                    JOptionPane.showMessageDialog(null, "Account Created", null, JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                    loginframe l1 = new loginframe();
                }
            } else if (!String.valueOf(p1.getPassword()).equals(String.valueOf(p2.getPassword()))) {
                JOptionPane.showMessageDialog(null,"Passwords donot match",null,JOptionPane.WARNING_MESSAGE);
            }
        }else if(e.getSource()==b2){
            dispose();
            frame1 f1 = new frame1();
        }

    }
}
