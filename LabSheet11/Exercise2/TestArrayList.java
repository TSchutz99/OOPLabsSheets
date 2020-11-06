package LabSheet11.Exercise2;

/* TestArrayList.java
 * By: Faun Schutz
 * Start: 06/11/2020
 * Finish: 06/11/2020
 */

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class TestArrayList{
    public static void main(String[] args) {
        Product p1 = new Product(1, "Red Pen", "This is a red pen");
        Product p2 = new Product(2, "Pencil", "This is a pencil");
        Product p3 = new Product(3, "Ruler", "This is a ruler");
        Product p4 = new Product(4, "Black Marker", "This is a black permanent marker");
        Product p5 = new Product(5, "Compass", "This is a mathematical compass");
        Product p6 = new Product(6, "Protractor", "This is a protractor");
        Product p7 = new Product(7, "Refill Pad", "This is a 150 page refill pad");
        Product p8 = new Product(8, "Eraser", "This is an eraser");
        Product p9 = new Product(9, "Tippex", "This is tippex");
        Product p10 = new Product(10, "Stapler", "This is a stapler");
        Product p11 = new Product(11, "Black Pen","This is a black pen");
        Product p12 = new Product(12, "Blue Pen","This is a blue pen");
        Product p13 = new Product(13, "Red Marker", "This is a red permanent marker");
        Product p14 = new Product(14, "Blue Marker", "This is a blue permanent marker");
        Product p15 = new Product(15, "Calculator", "This is a Casio scientific calculator");

        ArrayList<Product> allProducts = new ArrayList<Product>(Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13,p14,p15));

        int choice = 0;

        while(choice != 5) {
            choice = Integer.parseInt(JOptionPane.showInputDialog("1. Add a Product" +
                    "\n2. Amend a Product" +
                    "\n3. Remove a Product" +
                    "\n4. View all Products" +
                    "\n5. Quit" +
                    "\n\nPlease enter your choice"));

            while(choice < 1 || choice > 5) {
                choice = Integer.parseInt(JOptionPane.showInputDialog("1. Add a Product" +
                        "\n2. Amend a Product" +
                        "\n3. Remove a Product" +
                        "\n4. View all Products" +
                        "\n5. Quit" +
                        "\n\nInvalid choice entered!! Must be between 1 and 5 inclusive"));
            }

            if (choice == 1)
                addProduct(allProducts);
            else if (choice == 2)
                amendProduct(allProducts);
            else if (choice == 3)
                removeProduct(allProducts);
            else if (choice == 4)
                viewProducts(allProducts);
        }

        JOptionPane.showMessageDialog(null, "Thanks for using the system!", "Farewell",
                JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
    public static void addProduct(ArrayList<Product> allProducts){
        int productID = Integer.parseInt(JOptionPane.showInputDialog("Please enter the product id"));
        String productName = JOptionPane.showInputDialog("Please enter the product name");
        String productDesc = JOptionPane.showInputDialog("Please enter the product description");

        Product p  = new Product(productID, productName, productDesc);
        allProducts.add(p);

        JOptionPane.showMessageDialog(null, "Product now created and added to array list", "Product Added",
                                        JOptionPane.INFORMATION_MESSAGE);
    }
    public static void amendProduct(ArrayList<Product> allProducts){
        String amendSearch = JOptionPane.showInputDialog("Please enter the name of the product you wish to amend");
        String listOfProducts = "";

        for(Product p : allProducts)
            if(p != null && p.getName().contains(amendSearch))
                listOfProducts += p + "\n";  // Appears not to be adding on for some reason

        int productID = Integer.parseInt(JOptionPane.showInputDialog("The following products matched your search phrase\n\n" + listOfProducts +
                                                                     "\n\nEnter the id of the one you want to amend"));

        int choice = Integer.parseInt(JOptionPane.showInputDialog("The details of the product you wish to amend is:\n\n" + allProducts.get(productID - 1) +
                                                                  "\n\n1. Amend Name\n2. Amend Description\n3. Cancel Amend" +
                                                                  "\n\nPlease enter your choice"));

        while(choice < 1 || choice > 3){
            choice = Integer.parseInt(JOptionPane.showInputDialog("The details of the product you wish to amend is:\n\n" + allProducts.get(productID - 1) +
                                                                  "\n\n1. Amend Name\n2. Amend Description\n3. Cancel Amend" +
                                                                  "\n\nInvalid choice entered!! Must be a value between 1 and 3 inclusive"));
        }

        if(choice == 1){
            String newName = JOptionPane.showInputDialog("Please enter the new Name for the product");
            allProducts.get(productID - 1).setName(newName);
            JOptionPane.showMessageDialog(null, "Product details now amended!", "Product Amended",
                                            JOptionPane.INFORMATION_MESSAGE);
        }
        if(choice == 2){
            String newDesc = JOptionPane.showInputDialog("Please enter the new description for the product");
            allProducts.get(productID - 1).setDescription(newDesc);
            JOptionPane.showMessageDialog(null, "Product details now amended!", "Product Amended",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public static void removeProduct(ArrayList<Product> allProducts){
        String removeSearch = JOptionPane.showInputDialog("Please enter the name of the product you wish to remove");
        String listOfProducts = "";

        for(Product p : allProducts)
            if(p != null && p.getName().contains(removeSearch))
                listOfProducts += p + "\n";  // Appears not to be adding on for some reason

        int productID = Integer.parseInt(JOptionPane.showInputDialog("The following products matched your search phrase\n\n" + listOfProducts +
                "\n\nEnter the id of the one you want to remove"));

        int choice = JOptionPane.showConfirmDialog(null,"The details of the product you wish to remove are:\n\n" + allProducts.get(productID - 1) +
                                                                    "\n\nAre you sure you wish to remove this product?", "Product Removal Confirmation",
                                                                    JOptionPane.YES_NO_CANCEL_OPTION);

        if(choice == JOptionPane.YES_OPTION){
            Iterator<Product> iterator = allProducts.iterator();

            while (iterator.hasNext()) {
                Product p = iterator.next();

                if(p != null && p.getId() == productID)
                    iterator.remove();
            }
            JOptionPane.showMessageDialog(null, "Product now removed from array list", "Product Removed", JOptionPane.INFORMATION_MESSAGE);
        }

        if(choice == 1 || choice == 2){
            JOptionPane.showMessageDialog(null, "Product removal cancelled", "Product Not Removed", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public static void viewProducts(ArrayList<Product> allProducts){
        String ouput = "";

        for(Product p : allProducts)
            if (p != null)
                ouput += p + "\n";

        JOptionPane.showMessageDialog(null, ouput, "List of all Products", JOptionPane.INFORMATION_MESSAGE);
    }

}
