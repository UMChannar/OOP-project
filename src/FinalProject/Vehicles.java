package FinalProject;

import javax.swing.*;

public class Vehicles {

    private String[] items = new String[100];
    private double[] price = new double[100];
    private int[] quantity = new int[100];

    public Vehicles() {
        items[0] = "HONDA ACCORD";
        items[1] = "PORSCHE CAYMAN";
        items[2] = "CHEVROLET CORVETTE";
        items[3] = "JEEP GLADIATOR";
        items[4] = "PORSCHE MACAN S";
        items[5] = "MAZDA CX-5";
        items[6] = "RAM 1500";
        items[7] = "TOYOTA SUPRA";
        items[8] = "KIA TELLURIDE";
        items[9] = "VOLKSWAGEN GOLF GTI";
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
                System.out.print("Vehicles " + items[i] + "      ");
                System.out.print("Price " + price[i] + "    ");
                System.out.println("Quantity " + quantity[i]);
            }
        }
    }

    public String cars() {
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

