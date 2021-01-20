package FinalProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class loginframe extends JFrame implements ActionListener {

    JTextField t1, t2, t3;
    JPasswordField p1;
    JButton b1, b2, b3;
    JLabel l1;

    loginframe() {

        l1 = new JLabel();
        l1.setText("Khareed LO");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("Bradley Hand ITC", Font.PLAIN, 50));
        l1.setBounds(800, 0, 300, 100);
        add(l1);

        t1 = new JTextField();
        t1.setBounds(750, 400, 400, 30);
        t1.setFont(new Font("null", Font.PLAIN, 20));
        t1.setCaretColor(Color.WHITE);
        t1.setBackground(Color.GRAY);
        t1.setForeground(Color.white);
        add(t1);

        t2 = new JTextField("Username");
        t2.setEditable(false);
        t2.setBounds(600, 400, 100, 30);
        t2.setFont(new Font("null", Font.PLAIN, 15));
        t2.setCaretColor(Color.WHITE);
        t2.setBackground(Color.GRAY);
        t2.setForeground(Color.white);
        add(t2);

        t3 = new JTextField("Password");
        t3.setEditable(false);
        t3.setBounds(600, 440, 100, 30);
        t3.setFont(new Font("null", Font.PLAIN, 15));
        t3.setCaretColor(Color.WHITE);
        t3.setBackground(Color.GRAY);
        t3.setForeground(Color.white);
        add(t3);

        p1 = new JPasswordField();
        p1.setBounds(750, 440, 400, 30);
        p1.setFont(new Font("null", Font.PLAIN, 20));
        p1.setCaretColor(Color.WHITE);
        p1.setBackground(Color.GRAY);
        p1.setForeground(Color.white);
        add(p1);

        b1 = new JButton();
        b1.setText("Login");
        b1.setFocusable(false);
        b1.setBackground(Color.GRAY);
        b1.setForeground(Color.white);
        b1.setFont(new Font("null", Font.ITALIC, 20));
        b1.setBounds(600, 750, 200, 50);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton();
        b2.setText("Forget Password");
        b2.setFocusable(false);
        b2.setBackground(Color.GRAY);
        b2.setForeground(Color.white);
        b2.setFont(new Font("null", Font.ITALIC, 20));
        b2.setBounds(1000, 750, 200, 50);
        b2.addActionListener(this);
        add(b2);

        ImageIcon icon = new ImageIcon("back.png");

        b3 = new JButton();
        b3.setIcon(icon);
        b3.setBounds(0, 0, 40, 40);
        b3.addActionListener(this);
        add(b3);

        setSize(1920, 1080);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setBackground(Color.GRAY);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b1) {
            if (credentials.search(t1.getText(), String.valueOf(p1.getPassword()))) {
                JOptionPane.showMessageDialog(null, "Account Found", "Search Complete", JOptionPane.PLAIN_MESSAGE);
                dispose();
                shopFrame1 s1 = new shopFrame1();
            } else if (credentials.search(t1.getText())) {
                JOptionPane.showMessageDialog(null, "Password is Incorrect \nDirecting to Confirm SecretPhase sect", "Search Complete", JOptionPane.ERROR_MESSAGE);
                forgetPasswordPanel fg1 = new forgetPasswordPanel();
            } else {
                JOptionPane.showMessageDialog(null, "Register Account First \nDirecting to SignUp page", "Search Complete", JOptionPane.PLAIN_MESSAGE);
                dispose();
                signupframe s1 = new signupframe();
            }
        } else if (e.getSource() == b2) {
            JOptionPane.showMessageDialog(null, "Directing to Confirm SecretPhase section", "Search Complete", JOptionPane.PLAIN_MESSAGE);
            forgetPasswordPanel fg1 = new forgetPasswordPanel();

        } else if (e.getSource() == b3) {
            dispose();
            frame1 f1 = new frame1();
        }

    }
}
