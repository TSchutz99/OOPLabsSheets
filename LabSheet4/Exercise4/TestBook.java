package LabSheet4.Exercise4;
/* Book.java
 * By: Faun Schutz
 * Start: 02/09/2020
 * Finish: 02/09/2020
 * */

import javax.swing.*;

public class TestBook {
    public static void main(String[] args){
        String output = " ";

        Book b1 = new Book();

        output += "\n\nCalling the no argument Book constructor. " +
                  "The first Book object details are: \n\n" + b1.toString();

        Book b2 = new Book("The Da Vinci Code", 19.99, "3452617232", 348);

        output += "\n\nCalling the multi-argument Book constructor. " +
                  "The second Book object details are: \n\n" + b2.toString();

        JOptionPane.showMessageDialog(null, output, "Book Object Data",
                                        JOptionPane.INFORMATION_MESSAGE);
    }
}
