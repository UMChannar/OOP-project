package FinalProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frame1 extends JFrame implements ActionListener {

    JButton b1, b2, b3;
    JLabel l1, l2;

    frame1() {

        l1 = new JLabel();
        l1.setText("Khareed LO");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("Bradley Hand ITC", Font.PLAIN, 50));
        l1.setBounds(800, 0, 300, 100);
        add(l1);

        b1 = new JButton();
        b1.setText("Login");
        b1.setBounds(650, 500, 150, 50);
        b1.setFocusable(false);
        b1.setFont(new Font("null", Font.ITALIC, 20));
        b1.setBackground(Color.GRAY);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton();
        b2.setText("SignUP");
        b2.setBounds(1050, 500, 150, 50);
        b2.setFocusable(false);
        b2.setFont(new Font("null", Font.ITALIC, 20));
        b2.setBackground(Color.GRAY);
        b2.setForeground(Color.WHITE);
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
            dispose();
            loginframe l1 = new loginframe();
        } else if (e.getSource() == b2) {
            dispose();
            signupframe s1 = new signupframe();
        } else if (e.getSource() == b3) {
            dispose();
        }
    }
}
