package LabSheet1;
/* CyclistSponser.java
 * By: Faun Schutz
 * Start: 22/09/2020
 * Finish: 22/09/2020
 */
import javax.swing.JOptionPane;

public class CyclistSponser {
    public static void main(String[] args) {
        final double RATEKMUNDER10 = 1.75, RATEKMOVER10 = 2.5;

        String name = JOptionPane.showInputDialog("Please enter your name");
        int noOfKmCycled = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of km Cycled"));
        double amountdue = 0;

        if(noOfKmCycled >= 10)
        {
            amountdue = (10*RATEKMUNDER10) + (noOfKmCycled-10)*RATEKMOVER10;
        }
        else
        {
            amountdue = noOfKmCycled*RATEKMUNDER10;
        }

            JOptionPane.showMessageDialog(null, "Name: " + name + "\nDistance cycled: " + noOfKmCycled +
                                                                  "\nSponsorship amount due: €" + String.format("%.2f", amountdue),"Recept",
                                      JOptionPane.INFORMATION_MESSAGE);
    }
}
