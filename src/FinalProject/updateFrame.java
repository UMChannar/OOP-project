package FinalProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class updateFrame extends JFrame implements ActionListener {

    JTextField t1,t2,t3,t4,t5,t6,t7;
    JPasswordField p1;
    JButton b1,b2;


    updateFrame(){

        t1 = new JTextField("Username");
        t1.setEditable(false);
        t1.setBackground(Color.GRAY);
        t1.setForeground(Color.WHITE);
        t1.setFocusable(false);
        t1.setCaretColor(Color.WHITE);
        t1.setBounds(250,50,125,30);
        t1.setFont(new Font("null",Font.PLAIN,20));
        add(t1);

        t2 = new JTextField();
        t2.setBounds(100,90,400,30);
        t2.setBackground(Color.GRAY);
        t2.setForeground(Color.WHITE);
        t2.setCaretColor(Color.white);
        t2.setFont(new Font("null",Font.PLAIN,20));
        add(t2);

        t3 = new JTextField("Bank Name");
        t3.setEditable(false);
        t3.setBackground(Color.GRAY);
        t3.setForeground(Color.WHITE);
        t3.setFocusable(false);
        t3.setCaretColor(Color.WHITE);
        t3.setBounds(250,130,125,30);
        t3.setFont(new Font("null",Font.PLAIN,20));
        add(t3);

        t4 = new JTextField();
        t4.setBounds(100,170,400,30);
        t4.setBackground(Color.GRAY);
        t4.setForeground(Color.WHITE);
        t4.setCaretColor(Color.white);
        t4.setFont(new Font("null",Font.PLAIN,20));
        add(t4);

        t5 = new JTextField("Account Number");
        t5.setEditable(false);
        t5.setBackground(Color.GRAY);
        t5.setForeground(Color.WHITE);
        t5.setFocusable(false);
        t5.setCaretColor(Color.WHITE);
        t5.setBounds(225,210,175,30);
        t5.setFont(new Font("null",Font.PLAIN,20));
        add(t5);

        t6 = new JTextField();
        t6.setBounds(100,250,400,30);
        t6.setBackground(Color.GRAY);
        t6.setForeground(Color.WHITE);
        t6.setCaretColor(Color.white);
        t6.setFont(new Font("null",Font.PLAIN,20));
        add(t6);

        t7 = new JTextField("Account Pin");
        t7.setEditable(false);
        t7.setBackground(Color.GRAY);
        t7.setForeground(Color.WHITE);
        t7.setFocusable(false);
        t7.setCaretColor(Color.WHITE);
        t7.setBounds(225,290,175,30);
        t7.setFont(new Font("null",Font.PLAIN,20));
        add(t7);

        p1 = new JPasswordField();
        p1.setBounds(100,330,400,30);
        p1.setBackground(Color.GRAY);
        p1.setForeground(Color.WHITE);
        p1.setCaretColor(Color.white);
        p1.setFont(new Font("null",Font.PLAIN,20));
        add(p1);

        b1 = new JButton();
        b1.setText("Update");
        b1.setBackground(Color.GRAY);
        b1.setForeground(Color.WHITE);
        b1.setFocusable(false);
        b1.setFont(new Font("null", Font.PLAIN, 20));
        b1.setBounds(250, 500, 150, 50);
        b1.addActionListener(this);
        add(b1);

        ImageIcon icon = new ImageIcon("back.png");

        b2 = new JButton();
        b2.setIcon(icon);
        b2.setBounds(0, 0, 40, 40);
        b2.addActionListener(this);
        add(b2);

        setSize(620, 620);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setBackground(Color.GRAY);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==b1){
            int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to update?", null, JOptionPane.YES_NO_OPTION);
            if(choice==0){
                credentials.update(t2.getText(),t4.getText(),Integer.parseInt(t6.getText()),Integer.parseInt(String.valueOf(p1.getPassword())));
                JOptionPane.showMessageDialog(null,"Information Updated",null,JOptionPane.INFORMATION_MESSAGE);
                dispose();
            }
        }else if(e.getSource()==b2){
            dispose();
            shopFrame1 s1 = new shopFrame1();
        }
    }
}
