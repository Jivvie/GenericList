package ListPackage.gjvon;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final String DONE_PROMPT = "Are you done adding values? Press Y if you are. Note: The value you enter will not"
                + " be added. Use N for no; for clarity.";
        final String PROMPT = "Enter your value.";
       /* GenericLinkedList generics = new GenericLinkedList();
        boolean done = false;
        while (!done) {
            Scanner scanner = new Scanner(System.in);
            System.out.println(PROMPT);
            generics.add(scanner.next());
            System.out.println(DONE_PROMPT);
            String s = scanner.next();
            if (clickedDone(s)) {
                done = true;
            }
        }
        //System.out.println(generics.toString());
        JOptionPane.showMessageDialog(null, generics.toString());
        Object object = generics.getGenericList();
        Display d = new Display();
        d.enterDataintoList();
        System.exit(0);*/

       GenericLinkedList gL = new GenericLinkedList();
        Display d = new Display(gL);
    }

    public static boolean clickedDone(String y) {
        char[] array = y.toCharArray();
        if (array.length > 1) {
            return false;
        } else return array[0] == 'y' || array[0] == 'Y';
    }

    public static void showValues() {
        JOptionPane.showMessageDialog(null, "Title");
    }
}
