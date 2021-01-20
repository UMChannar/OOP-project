package FinalProject;

import java.io.*;
import java.util.*;

public class credentials implements Serializable {

    private String email;
    private String password;
    private String bank;
    private int accountNumber;
    private int pin;
    private String s1;


    public credentials() {
    }

//    public credentials(String e, String p) {
//        this.email = e;
//        this.credentials = p;
//    }

    public credentials(String e, String p, String b, int an, int pi, String s1) {
        this.email = e;
        this.password = p;
        this.bank = b;
        this.accountNumber = an;
        this.pin = pi;
        this.s1 = s1;

    }

    public String getS1() {
        return s1;
    }

    public void setS1(String s1) {
        this.s1 = s1;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String credentials) {
        this.password = credentials;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public static void deleteFromFile(String name) {
        ArrayList<credentials> list = readAllDataFromFile();
        int index = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getEmail().equals(name)) {
                index = i;
                break;
            }
        }
        list.remove(index);

        try {
            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("credentialss Record.txt"));
            output.writeObject(list);
        } catch (IOException e) {

        }

    }

    public static void writeToFile(credentials s) {
        ArrayList<credentials> list = readAllDataFromFile();
        list.add(s);
        try {
            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("credentialss Record.txt"));
            output.writeObject(list);
        } catch (IOException e) {

        }
    }

    public static ArrayList<credentials> readAllDataFromFile() {
        ArrayList<credentials> list = new ArrayList<credentials>();

        try {
            ObjectInputStream input = new ObjectInputStream(new FileInputStream("credentialss Record.txt"));
            list = (ArrayList<credentials>) input.readObject();
        } catch (ClassNotFoundException c) {

        } catch (IOException e) {

        }
        System.out.println(list);
        return list;
    }

    public static String displayAllRecords() {
        ArrayList<credentials> list = readAllDataFromFile();
        String data = "";
        for (int i = 0; i < list.size(); i++) {
            data += ("\n Email: " + list.get(i).getEmail() + "\n Passwords: " + list.get(i).getPassword());
        }
        return data;
    }

    public static boolean search(String name, String p) {
        ArrayList<credentials> list = readAllDataFromFile();
        for (credentials s : list) {
            if (s.getEmail().equals(name)) {
                if (s.getPassword().equals(p)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean search(String name) {
        ArrayList<credentials> list = readAllDataFromFile();
        for (credentials s : list) {
            if (s.getEmail().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public static boolean secretPhrase(String n, String s1) {
        ArrayList<credentials> list = readAllDataFromFile();
        for (credentials s : list) {
            if (s.getEmail().equals(n)) {
                if (s.getS1().equals(s1)) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    public static void changePassword(String n, String p) {
        ArrayList<credentials> list = readAllDataFromFile();
        for (credentials s : list) {
            if (s.getEmail().equals(n)) {
                s.setPassword(p);
                try {
                    ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("credentialss Record.txt"));
                    output.writeObject(list);
                } catch (IOException e) {

                }
            }
        }
    }

    public static void update(String name, String bn, int ac, int ap) {
        ArrayList<credentials> list = readAllDataFromFile();
        for (credentials s : list) {
            if (s.getEmail().equals(name)) {
                s.setBank(bn);
                s.setAccountNumber(ac);
                s.setPin(ap);
                try {
                    ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("credentialss Record.txt"));
                    output.writeObject(list);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
