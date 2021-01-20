package FinalProject;

import javax.swing.*;

public class Gym {

    private String[] items = new String[100];
    private double[] price = new double[100];
    private int[] quantity = new int[100];

    public Gym() {
        items[0] = "Treadmill";
        items[1] = "Ellipticals";
        items[2] = "Stationary Bikes";
        items[3] = "Aerobic steppers";
        items[4] = "Cable Pulley Machines";
        items[5] = "Weight machines";
        items[6] = "Free weights";
        items[7] = "Rowing Machines";
        items[8] = "Abdominal Crunchers";
        items[9] = "Exercise Balls";
        price[0] = 100;
        price[1] = 100;
        price[2] = 100;
        price[3] = 100;
        price[4] = 100;
        price[5] = 100;
        price[6] = 100;
        price[7] = 100;
        price[8] = 100;
        price[9] = 100;
        quantity[0] = 20;
        quantity[1] = 20;
        quantity[2] = 20;
        quantity[3] = 20;
        quantity[4] = 20;
        quantity[5] = 20;
        quantity[6] = 20;
        quantity[7] = 20;
        quantity[8] = 20;
        quantity[9] = 20;
    }

    public void display() {
        for (int i = 0; i < 10; i++) {
            if (items[i] != null) {
                System.out.print("Gyn " + items[i] + "      ");
                System.out.print("Price " + price[i] + "    ");
                System.out.println("Quantity " + quantity[i]);
            }
        }
    }

    public String things() {
        String b = ("Available Books " + "\n\n");
        for (int i = 0; i < 10; i++) {
            if (items[i] != null) {
                b += (items[i] + "\n");
            }
        }
        return b;
    }

    public String price() {
        String b = ("Price" + "\n\n");
        for (int i = 0; i < 10; i++) {
            if (items[i] != null) {
                b += (price[i] + "\n");
            }
        }
        return b;
    }

    public String quantity() {
        String b = ("Quantity" + "\n\n");
        for (int i = 0; i < 10; i++) {
            if (items[i] != null) {
                b += ("    " + quantity[i] + "\n");
            }
        }
        return b;
    }

    public void buy(String name, int f) {

        for (int i = 0; items[i] != null; i++) {
            if (quantity[i] > f) {
                if (items[i].equals(name)) {
                    quantity[i] -= f;
                    JOptionPane.showMessageDialog(null, "Item purchased \n Total price " + price[i] * f, null, JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Not In Stock", null, JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}


