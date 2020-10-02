package LabSheet4.Exercise5;
/* Book.java
 * By: Faun Schutz
 * Start: 02/09/2020
 * Finish: 02/09/2020
 * */

import javax.swing.*;
import java.awt.*;

public class TestBook {
    public static void main(String[] args){
        JTextArea textArea = new JTextArea(5, 5);

        Font textAreaFont = new Font("monospaced", Font.PLAIN, 12);
        textArea.setFont(textAreaFont);

        textArea.setText(String.format("%-25s%-10s%-25s%5s", "Title", "Price", "ISBN", "Pages"));

        Book b1 = new Book();

        Book b2 = new Book();

        b1.setTitle(JOptionPane.showInputDialog("Please enter the title of your favourite book"));
        b1.setPrice(Double.parseDouble(JOptionPane.showInputDialog("Please enter the price of your favourite book")));
        b1.setISBN(JOptionPane.showInputDialog("Please enter the ISBN of your favourite book"));
        b1.setPages(Integer.parseInt(JOptionPane.showInputDialog("Please enter the pages of your favourite book")));

        textArea.append(String.format("\n\n%-25s%-10.2f%-25s%5d", b1.getTitle(), b1.getPrice(), b1.getISBN(), b1.getPages()));

        b2.setTitle(JOptionPane.showInputDialog("Please enter the title of your least favourite book"));
        b2.setPrice(Double.parseDouble(JOptionPane.showInputDialog("Please enter the price of your least favourite book")));
        b2.setISBN(JOptionPane.showInputDialog("Please enter the ISBN of your least favourite book"));
        b2.setPages(Integer.parseInt(JOptionPane.showInputDialog("Please enter the pages of your least favourite book")));

        textArea.append(String.format("\n\n%-25s%-10.2f%-25s%5d", b2.getTitle(), b2.getPrice(), b2.getISBN(), b2.getPages()));

        JOptionPane.showMessageDialog(null, textArea, "Book Object Data", JOptionPane.PLAIN_MESSAGE);
    }
}
