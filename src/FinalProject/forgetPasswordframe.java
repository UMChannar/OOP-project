package FinalProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class forgetPasswordframe extends JFrame implements ActionListener {

    JTextField t1,t2,t3,t4;
    JPasswordField p1,p2;
    JButton b1,b2;

    forgetPasswordframe(){

        t1 = new JTextField("Username");
        t1.setEditable(false);
        t1.setBackground(Color.GRAY);
        t1.setForeground(Color.WHITE);
        t1.setFocusable(false);
        t1.setCaretColor(Color.WHITE);
        t1.setBounds(200,50,125,30);
        t1.setFont(new Font("null",Font.PLAIN,20));
        add(t1);

        t2 = new JTextField();
        t2.setBounds(75,90,400,30);
        t2.setBackground(Color.GRAY);
        t2.setForeground(Color.WHITE);
        t2.setCaretColor(Color.white);
        t2.setFont(new Font("null",Font.PLAIN,20));
        add(t2);

        t3 = new JTextField("Password");
        t3.setEditable(false);
        t3.setBackground(Color.GRAY);
        t3.setForeground(Color.WHITE);
        t3.setFocusable(false);
        t3.setCaretColor(Color.WHITE);
        t3.setBounds(200,130,125,30);
        t3.setFont(new Font("null",Font.PLAIN,20));
        add(t3);

        p1 = new JPasswordField();
        p1.setBounds(75,170,400,30);
        p1.setBackground(Color.GRAY);
        p1.setForeground(Color.WHITE);
        p1.setCaretColor(Color.white);
        p1.setFont(new Font("null",Font.PLAIN,20));
        add(p1);

        t4 = new JTextField("Confirm Password");
        t4.setEditable(false);
        t4.setBackground(Color.GRAY);
        t4.setForeground(Color.WHITE);
        t4.setFocusable(false);
        t4.setCaretColor(Color.WHITE);
        t4.setBounds(185,210,150,30);
        t4.setFont(new Font("null",Font.PLAIN,15));
        add(t4);

        p2 = new JPasswordField();
        p2.setBounds(75,250,400,30);
        p2.setBackground(Color.GRAY);
        p2.setForeground(Color.WHITE);
        p2.setCaretColor(Color.white);
        p2.setFont(new Font("null",Font.PLAIN,20));
        add(p2);


        b1 = new JButton();
        b1.setText("Change Password");
        b1.setBackground(Color.GRAY);
        b1.setForeground(Color.WHITE);
        b1.setFocusable(false);
        b1.setFont(new Font("null", Font.PLAIN, 20));
        b1.setBounds(100, 400, 300, 50);
        b1.addActionListener(this);
        add(b1);

        ImageIcon icon = new ImageIcon("back.png");

        b2 = new JButton();
        b2.setIcon(icon);
        b2.setBounds(0, 0, 40, 40);
        b2.addActionListener(this);
        add(b2);

        setSize(520, 520);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setBackground(Color.GRAY);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==b1){
            if(String.valueOf(p1.getPassword()).equals(String.valueOf(p2.getPassword()))){
                credentials.changePassword(t2.getText(),String.valueOf(p2.getPassword()));
                JOptionPane.showMessageDialog(null,"Password Changed",null,JOptionPane.INFORMATION_MESSAGE);
                dispose();
                loginframe l1 = new loginframe();
            }else if(!String.valueOf(p1.getPassword()).equals(String.valueOf(p2.getPassword()))){
                JOptionPane.showMessageDialog(null,"Passwords are not same",null,JOptionPane.ERROR_MESSAGE);
            }
        }else if(e.getSource()==b2){
            dispose();
            forgetPasswordPanel f1 = new forgetPasswordPanel();
        }

    }
}
