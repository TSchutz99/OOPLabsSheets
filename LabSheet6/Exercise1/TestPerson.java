package LabSheet6.Exercise1;
/* TestPerson.java
 * By: Faun Schutz
 * Start: 09/09/2020
 * Finish: 09/09/2020
 * */
import javax.swing.*;

public class TestPerson{
    public static void main(String[] args){
        String output = "";

        Person Person1 = new Person();

        output += "******Person Class Tester******" +
                  "\n\nCalling the Person() constructor...." +
                  "\nValue of the first Peron object is : " + Person1.toString();

        String firstName = JOptionPane.showInputDialog("Please enter first name of the second person");
        String lastName = JOptionPane.showInputDialog("Please enter last name of the second person");

        Person Person2 = new Person(firstName, lastName);

        output += "\n\nCalling the Person(String, String) constructor after getting user supplied values...." +
                  "\nValue of the second Peron object is : " + Person2.toString();

        JOptionPane.showMessageDialog(null, output, " ", JOptionPane.INFORMATION_MESSAGE);
    }
}
