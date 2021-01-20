package FinalProject;

import javax.swing.*;

public class Electronics {

    private String[] items = new String[100];
    private double[] price = new double[100];
    private int[] quantity = new int[100];

    public Electronics() {
        items[0] = "Bulb";
        items[1] = "Iron";
        items[2] = "Cooper Wire";
        items[3] = "Resistors";
        items[4] = "Electronics Board";
        items[5] = "Multimeter";
        items[6] = "Cells";
        items[7] = "Raw wires";
        items[8] = "Extension";
        items[9] = "MicroChips";
        price[0] = 300;
        price[1] = 5000;
        price[2] = 10;
        price[3] = 1.5;
        price[4] = 50;
        price[5] = 800;
        price[6] = 60;
        price[7] = 20;
        price[8] = 700;
        price[9] = 50;
        quantity[0] = 20;
        quantity[1] = 20;
        quantity[2] = 2000;
        quantity[3] = 20000;
        quantity[4] = 200;
        quantity[5] = 20;
        quantity[6] = 200;
        quantity[7] = 20000;
        quantity[8] = 20;
        quantity[9] = 2000;
    }

    public void display() {
        for (int i = 0; i < 10; i++) {
            if (items[i] != null) {
                System.out.print("Electronic " + items[i] + "      ");
                System.out.print("Price " + price[i] + "    ");
                System.out.println("Quantity " + quantity[i]);
            }
        }
    }

    public String electronics() {
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


