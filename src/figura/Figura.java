package figura;

import java.awt.Color;
import java.util.*;

import java.awt.*;
import javax.swing.*;

public class Figura {

    public static void main(String[] args) {
        test test1 = new test();
        Scanner scan1 = new Scanner(System.in);
        String ancora;
        do {
            test1.test();
            System.out.println("--------------------------");
            System.out.println("Uscire? [Exit]");
            ancora = scan1.next();
        } while (!ancora.toLowerCase().equals("exit"));
    }
}
