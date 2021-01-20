package FinalProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class grocceryFrame extends JFrame implements ActionListener {

    JLabel l1,l2;
    JButton b1,b2;
    JPanel p1;
    JTextField tf1,tf2,tf3,tf4;
    JTextArea t1,t2,t3;
    Groccery bo1 = new Groccery();

    grocceryFrame(){
        l1 = new JLabel();
        l1.setText("Khareed LO");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("Bradley Hand ITC", Font.PLAIN, 50));
        l1.setBounds(800, 0, 300, 100);
        add(l1);

        t1 = new JTextArea();
        t1.setText(bo1.groccery());
        t1.setEditable(false);
        t1.setBackground(Color.GRAY);
        t1.setForeground(Color.WHITE);
        t1.setFont(new Font(null,Font.PLAIN,30));
        t1.setBounds(1100, 200, 300, 500);
        add(t1);

        t2 = new JTextArea();
        t2.setText(bo1.price());
        t2.setEditable(false);
        t2.setBackground(Color.GRAY);
        t2.setForeground(Color.WHITE);
        t2.setFont(new Font(null,Font.PLAIN,30));
        t2.setBounds(1400, 200, 150, 500);
        add(t2);

        t3 = new JTextArea();
        t3.setText(bo1.quantity());
        t3.setEditable(false);
        t3.setBackground(Color.GRAY);
        t3.setForeground(Color.WHITE);
        t3.setFont(new Font(null,Font.PLAIN,30));
        t3.setBounds(1600, 200, 150, 500);
        add(t3);

        tf1 = new JTextField("Book Name");
        tf1.setEditable(false);
        tf1.setBackground(Color.GRAY);
        tf1.setForeground(Color.WHITE);
        tf1.setFocusable(false);
        tf1.setCaretColor(Color.WHITE);
        tf1.setBounds(300,300,125,30);
        tf1.setFont(new Font("null",Font.PLAIN,20));
        add(tf1);

        tf2 = new JTextField();
        tf2.setBackground(Color.GRAY);
        tf2.setForeground(Color.WHITE);
        tf2.setCaretColor(Color.WHITE);
        tf2.setBounds(175,350,400,30);
        tf2.setFont(new Font("null",Font.PLAIN,20));
        add(tf2);

        tf3 = new JTextField("Quantity");
        tf3.setEditable(false);
        tf3.setBackground(Color.GRAY);
        tf3.setForeground(Color.WHITE);
        tf3.setFocusable(false);
        tf3.setCaretColor(Color.WHITE);
        tf3.setBounds(300,400,125,30);
        tf3.setFont(new Font("null",Font.PLAIN,20));
        add(tf3);

        tf4 = new JTextField();
        tf4.setBackground(Color.GRAY);
        tf4.setForeground(Color.WHITE);
        tf4.setCaretColor(Color.WHITE);
        tf4.setBounds(175,450,400,30);
        tf4.setFont(new Font("null",Font.PLAIN,20));
        add(tf4);

        ImageIcon back = new ImageIcon("back.png");
        b1 = new JButton();
        b1.setIcon(back);
        b1.setBounds(0, 0, 40, 40);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Buy");
        b2.setBackground(Color.GRAY);
        b2.setForeground(Color.WHITE);
        b2.setBounds(300,600,125,30);
        b2.setFocusable(false);
        b2.setFont(new Font(null,Font.PLAIN,20));
        b2.addActionListener(this);
        add(b2);

        setSize(1920, 1080);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setBackground(Color.GRAY);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==b1){
            dispose();
            shopFrame1 s1 = new shopFrame1();
        }else if(e.getSource()==b2){
            bo1.buy(tf2.getText(), Integer.parseInt(tf4.getText()));
            t3.setText(bo1.quantity());
        }

    }
}
