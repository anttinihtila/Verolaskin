import java.util.Scanner;
import javax.swing.*;
import javax.swing.JOptionPane;

public class Verolaskin {

    public static void main(String[] args) {
        String num1, num2;
        float numero1, numero2, vero, veroton;

        num1 = JOptionPane.showInputDialog(null, "Hinta? ", "Verolaskin", JOptionPane.QUESTION_MESSAGE);
        numero1 = Float.parseFloat(num1);

        num2 = JOptionPane.showInputDialog(null, "Veroprosentti? ", "Verolaskin", JOptionPane.QUESTION_MESSAGE);
        numero2 = Float.parseFloat(num2);

        vero=numero1*numero2/100;
        veroton=numero1-vero;

        JOptionPane.showMessageDialog(null, "Vero: " + vero +" e\n" + "Veroton hinta: " +veroton +" e", "Verolaskin", JOptionPane.PLAIN_MESSAGE );
                
        System.exit(0);
    }
}
