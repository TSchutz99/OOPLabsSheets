package LabSheet3.Exercise2;
/* TestComputer.java
 * By: Faun Schutz
 * Start: 29/08/2020
 * Finish: 29/08/2020
 * */

import javax.swing.*;

public class TestComputer {
    public static void main(String[] args) {
        String output = "";

        Computer c1 = new Computer();

        output += "Calling the no-argument Computer constructor. " +
                  "The first Computer object details are: \n\n" + c1.toString();

        Computer c2 = new Computer("Dell","Laptop",3.25,16,550.99);

        c2.setSpeed(2.75);
        c2.setSpeed(-3.15);

        output += "\n\nCalling the multi-argument Computer constructor. " +
                  "The second Computer object details are: \n\n" + c2.toString();

        Computer c3 = new Computer("Apple","Desktop",2.9,12,865.00);

        c3.setRAM(-8);

        output += "\n\nCalling the multi-argument Computer constructor. " +
                "The third Computer object details are: \n\n" + c3.toString();

        JOptionPane.showMessageDialog(null,output,"Computer Object Data",
                                            JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }

}
