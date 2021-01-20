package FinalProject;

import javax.swing.*;

public class Books {

    private String[] items = new String[100];
    private double[] price = new double[100];
    private int[] quantity = new int[100];

    public Books() {
        items[0] = "Chemistry";
        items[1] = "Physics";
        items[2] = "Islamiat";
        items[3] = "GeoPhysics";
        items[4] = "40 rules of Love";
        items[5] = "Python for Beginners";
        items[6] = "Java for Beginners";
        items[7] = "Multi-Variable Calculus";
        items[8] = "How to pass a Exam?";
        items[9] = "Ethical Hacking";
        price[0] = 200;
        price[1] = 340;
        price[2] = 100;
        price[3] = 160;
        price[4] = 190;
        price[5] = 213;
        price[6] = 699;
        price[7] = 453;
        price[8] = 345;
        price[9] = 114;
        quantity[0] = 120;
        quantity[1] = 120;
        quantity[2] = 120;
        quantity[3] = 120;
        quantity[4] = 120;
        quantity[5] = 120;
        quantity[6] = 120;
        quantity[7] = 120;
        quantity[8] = 120;
        quantity[9] = 120;
    }

    public void display() {
        for (int i = 0; i < 10; i++) {
            if (items[i] != null) {
                System.out.print("Book " + items[i] + "    ");
                System.out.print("Price " + price[i] + "    ");
                System.out.println("Quantity " + quantity[i]);
            }
        }
    }

    public String books() {
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


