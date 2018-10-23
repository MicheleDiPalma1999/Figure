package figura;

import java.util.*;
import javax.swing.JOptionPane;


public class Figura {

    public static void main(String[] args) {
        test test1 = new test();
        Scanner scan1 = new Scanner(System.in);
        int ancora;
        do {
            test1.test();
            System.out.println("--------------------------");
             ancora = JOptionPane.showConfirmDialog(null, "Ancora?");
        } while (ancora == JOptionPane.YES_OPTION);
    }
}
