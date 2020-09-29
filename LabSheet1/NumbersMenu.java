package LabSheet1;
/* HelloOOPWorld.java
 * By: Faun Schutz
 * Start: 22/09/2020
 * Finish: 22/09/2020
 */
import javax.swing.JOptionPane;

public class NumbersMenu {
    public static void main(String[] args)
    {
        int i = 0, choice;

        do{
            int wholeNumber = Integer.parseInt(JOptionPane.showInputDialog("------Iteration " + (i+1) + "------" +
                                                                           "\n\nPlease enter any whole number:"));

            choice = Integer.parseInt(JOptionPane.showInputDialog("What would you like to do?" +
                                                                      "\n\n1. Determine if the number is odd or even" +
                                                                      "\n\n2. Find the factorial of the number " +
                                                                      "\n\n3. Quit the program"));

            switch(choice)
            {
                case 1:
                    if(wholeNumber % 2 == 1)
                        JOptionPane.showMessageDialog(null, "The number you entered is odd",
                                                      "Number Data", JOptionPane.INFORMATION_MESSAGE);
                    else
                        JOptionPane.showMessageDialog(null, "The number you entered is even",
                                "Number Data", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 2:
                    if(wholeNumber < 0)
                        JOptionPane.showMessageDialog(null, "Cannot get the factorial of a negative number!",
                                "Number Data", JOptionPane.INFORMATION_MESSAGE);
                    else
                    {
                        double factorial = 1;

                        for(int j = 1; j <= wholeNumber; j++)
                            factorial *= j;

                        JOptionPane.showMessageDialog(null, "The factorial of the number you entered is " + factorial,
                                "Number Data", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Quitting the program earlier than anticipated ....",
                            "Number Data", JOptionPane.INFORMATION_MESSAGE);
                    break;
            }

            i++;
        }while(i < 10 && choice != 3);
    }
}
