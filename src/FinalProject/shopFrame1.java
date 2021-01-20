package FinalProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class shopFrame1 extends JFrame implements ActionListener {

    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11;
    JPanel p1;
    JLabel l1, l2, l3, l4, l5, l6, l7, l8;

    shopFrame1() {

        l1 = new JLabel();
        l1.setText("Khareed LO");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("Bradley Hand ITC", Font.PLAIN, 50));
        l1.setBounds(800, 0, 300, 100);
        add(l1);


        ImageIcon book = new ImageIcon("books.png");
        l2 = new JLabel();
        l2.setIcon(book);

        ImageIcon computer = new ImageIcon("computerParts.png");
        l3 = new JLabel();
        l3.setIcon(computer);

        ImageIcon electronics = new ImageIcon("electronics.png");
        l4 = new JLabel();
        l4.setIcon(electronics);

        ImageIcon food = new ImageIcon("food.png");
        l5 = new JLabel();
        l5.setIcon(food);

        ImageIcon groccery = new ImageIcon("groccery.png");
        l6 = new JLabel();
        l6.setIcon(groccery);

        ImageIcon gym = new ImageIcon("gym.png");
        l7 = new JLabel();
        l7.setIcon(gym);

        ImageIcon cars = new ImageIcon("cars.png");
        l8 = new JLabel();
        l8.setIcon(cars);

        p1 = new JPanel();
        p1.setLayout(new FlowLayout());
        p1.add(l2);
        p1.add(l3);
        p1.add(l4);
        p1.add(l5);
        p1.add(l6);
        p1.add(l7);
        p1.add(l8);
        p1.setBackground(Color.GRAY);
        p1.setBounds(0, 140, 1920, 200);
        add(p1);

        b1 = new JButton();
        b1.setText("Books");
        b1.setFocusable(false);
        b1.setBackground(Color.GRAY);
        b1.setForeground(Color.WHITE);
        b1.setFont(new Font("null", Font.PLAIN, 20));
        b1.setBounds(575, 450, 150, 30);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton();
        b2.setText("FoodItems");
        b2.setFocusable(false);
        b2.setBackground(Color.GRAY);
        b2.setForeground(Color.WHITE);
        b2.setFont(new Font("null", Font.PLAIN, 20));
        b2.setBounds(1100, 450, 150, 30);
        b2.addActionListener(this);
        add(b2);

        b3 = new JButton();
        b3.setText("Computer Parts");
        b3.setFocusable(false);
        b3.setBackground(Color.GRAY);
        b3.setForeground(Color.WHITE);
        b3.setFont(new Font("null", Font.PLAIN, 15));
        b3.setBounds(575, 530, 150, 30);
        b3.addActionListener(this);
        add(b3);

        b4 = new JButton();
        b4.setText("Electronics");
        b4.setFocusable(false);
        b4.setBackground(Color.GRAY);
        b4.setForeground(Color.WHITE);
        b4.setFont(new Font("null", Font.PLAIN, 20));
        b4.setBounds(1100, 530, 150, 30);
        b4.addActionListener(this);
        add(b4);

        b5 = new JButton();
        b5.setText("Groccery");
        b5.setFocusable(false);
        b5.setBackground(Color.GRAY);
        b5.setForeground(Color.WHITE);
        b5.setFont(new Font("null", Font.PLAIN, 20));
        b5.setBounds(575, 610, 150, 30);
        b5.addActionListener(this);
        add(b5);

        b6 = new JButton();
        b6.setText("Gym");
        b6.setFocusable(false);
        b6.setBackground(Color.GRAY);
        b6.setForeground(Color.WHITE);
        b6.setFont(new Font("null", Font.PLAIN, 20));
        b6.setBounds(1100, 610, 150, 30);
        b6.addActionListener(this);
        add(b6);

        b7 = new JButton();
        b7.setText("Vehicles");
        b7.setFocusable(false);
        b7.setBackground(Color.GRAY);
        b7.setForeground(Color.WHITE);
        b7.setFont(new Font("null", Font.PLAIN, 20));
        b7.setBounds(837, 690, 150, 30);
        b7.addActionListener(this);
        add(b7);

        ImageIcon back = new ImageIcon("back.png");
        b8 = new JButton();
        b8.setIcon(back);
        b8.setBounds(0, 0, 40, 40);
        b8.addActionListener(this);
        add(b8);

        ImageIcon update = new ImageIcon("update.png");
        b9 = new JButton();
        b9.setIcon(update);
        b9.setBounds(1815, 0, 55, 40);
        b9.addActionListener(this);
        add(b9);

        ImageIcon logout = new ImageIcon("logout.png");
        b10 = new JButton();
        b10.setIcon(logout);
        b10.setBounds(1870, 0, 55, 40);
        b10.addActionListener(this);
        add(b10);

        ImageIcon display = new ImageIcon("display.png");
        b11 = new JButton();
        b11.setIcon(display);
        b11.setBounds(1760, 0, 55, 40);
        b11.addActionListener(this);
        add(b11);

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
            bookFrame b1 = new bookFrame();
        } else if (e.getSource() == b2) {
            dispose();
            foodFrame f1 = new foodFrame();
        } else if (e.getSource() == b3) {
            dispose();
            computerFrame c1 = new computerFrame();
        } else if (e.getSource() == b4) {
            dispose();
            electronicsFrame e1 = new electronicsFrame();
        } else if (e.getSource() == b5) {
            dispose();
            grocceryFrame g1 = new grocceryFrame();
        } else if (e.getSource() == b6) {
            dispose();
            gymFrame gy1 = new gymFrame();
        } else if (e.getSource() == b7) {
            dispose();
            vehiclesFrame v1 = new vehiclesFrame();
        } else if (e.getSource() == b8) {
            dispose();
            loginframe l1 = new loginframe();
        } else if (e.getSource() == b9) {
            updateFrame u1 = new updateFrame();
        } else if (e.getSource() == b10) {
            int choice = JOptionPane.showConfirmDialog(null, "Are you sure?", null, JOptionPane.YES_NO_OPTION);
            if (choice == 0) {
                dispose();
                loginframe l1 = new loginframe();
            }
        } else if (e.getSource() == b11) {
            ArrayList<credentials> list = credentials.readAllDataFromFile();
            for (int i = 0; i < list.size(); i++) {
                JOptionPane.showMessageDialog(null, "Email \n" + list.get(i).getEmail(), null, JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "Password \n" + list.get(i).getPassword(), null, JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "Bank Name \n" + list.get(i).getBank(), null, JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "Account Number \n" + list.get(i).getAccountNumber(), null, JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "Account pin \n" + list.get(i).getPin(), null, JOptionPane.INFORMATION_MESSAGE);
            }
        }


    }
}
