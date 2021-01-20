package FinalProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class forgetPasswordPanel extends JFrame implements ActionListener {

    JTextField t1,t2,t3;
    JPasswordField p1;
    JButton b1, b2;

    forgetPasswordPanel() {

        t1 = new JTextField("Username");
        t1.setBounds(150, 70, 125, 30);
        t1.setFont(new Font("null", Font.PLAIN, 20));
        t1.setBackground(Color.GRAY);
        t1.setForeground(Color.WHITE);
        t1.setFocusable(false);
        t1.setEditable(false);
        add(t1);

        t2 = new JTextField();
        t2.setBounds(75, 110, 275, 30);
        t2.setFont(new Font("null", Font.PLAIN, 20));
        t2.setCaretColor(Color.WHITE);
        t2.setBackground(Color.GRAY);
        t2.setForeground(Color.WHITE);
        add(t2);

        t3 = new JTextField("Secret Phrase");
        t3.setBounds(125, 150, 175, 30);
        t3.setFont(new Font("null", Font.PLAIN, 20));
        t3.setBackground(Color.GRAY);
        t3.setForeground(Color.WHITE);
        t3.setFocusable(false);
        t3.setEditable(false);
        add(t3);

        p1 = new JPasswordField();
        p1.setBounds(50, 190, 325, 30);
        p1.setFont(new Font("null", Font.PLAIN, 20));
        p1.setCaretColor(Color.WHITE);
        p1.setBackground(Color.GRAY);
        p1.setForeground(Color.white);
        add(p1);

        b1 = new JButton();
        b1.setText("Submit");
        b1.setBackground(Color.GRAY);
        b1.setForeground(Color.WHITE);
        b1.setFocusable(false);
        b1.setFont(new Font("null", Font.PLAIN, 20));
        b1.setBounds(100, 300, 200, 50);
        b1.addActionListener(this);
        add(b1);

        ImageIcon icon = new ImageIcon("back.png");

        b2 = new JButton();
        b2.setIcon(icon);
        b2.setBounds(0, 0, 40, 40);
        b2.addActionListener(this);
        add(b2);

        setSize(420, 420);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setBackground(Color.GRAY);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b1) {
            if (credentials.secretPhrase(t2.getText(), String.valueOf(p1.getPassword()))) {
                JOptionPane.showMessageDialog(null, "Correct SecretPhase \nDirecting to change Password section", null, JOptionPane.INFORMATION_MESSAGE);
                dispose();
                forgetPasswordframe f1 = new forgetPasswordframe();
            } else if (!credentials.secretPhrase(t2.getText(), String.valueOf(p1.getPassword()))) {
                JOptionPane.showMessageDialog(null, "Incorrect SecretPhase or Username \nClosing", null, JOptionPane.INFORMATION_MESSAGE);
                dispose();
            }

        } else if (e.getSource() == b2) {
            dispose();
            loginframe l1 = new loginframe();
        }

    }
}
