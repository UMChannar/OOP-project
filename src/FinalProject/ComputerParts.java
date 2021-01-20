package FinalProject;

import javax.swing.*;

public class ComputerParts {

    private String[] items = new String[100];
    private int[] price = new int[100];
    private int[] quantity = new int[100];

    public ComputerParts() {
        items[0] = "Ryzen 2600";
        items[1] = "Asus Z87-A";
        items[2] = "Nvidia 3090";
        items[3] = "Cross-Hair Hydro";
        items[4] = "Intel UHD 630";
        items[5] = "AMD 530 ";
        items[6] = "Keyboard";
        items[7] = "Speakers";
        items[8] = "Nvidia 3070";
        items[9] = "Panels for laptops";
        price[0] = 51000;
        price[1] = 21000;
        price[2] = 305000;
        price[3] = 71000;
        price[4] = 12000;
        price[5] = 20000;
        price[6] = 3000;
        price[7] = 5000;
        price[8] = 299999;
        price[9] = 8000;
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
                System.out.print("Computer Part " + items[i] + "      ");
                System.out.print("Price " + price[i] + "    ");
                System.out.println("Quantity " + quantity[i]);
            }
        }
    }

    public String parts() {
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


