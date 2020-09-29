package LabSheet1;
/* SnackDeal.java
 * By: Faun Schutz
 * Start: 22/09/2020
 * Finish: 22/09/2020
 */
import javax.swing.JOptionPane;

public class SnackDeal {
    public static void main(String[] args) {
    String name = JOptionPane.showInputDialog("Please enter your name");
    String course = JOptionPane.showInputDialog("Please enter your course");
    int noOfSnacks = Integer.parseInt(JOptionPane.showInputDialog("How many snacks would you like?"));

    JOptionPane.showMessageDialog(null, "Name: " + name + "\nCourse: " + course +
                                        "\nSnacks: " + noOfSnacks + "\nCost: " + noOfSnacks*2,"Recept",
                                  JOptionPane.INFORMATION_MESSAGE);
    }
}
