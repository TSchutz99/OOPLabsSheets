package LabSheet5.Exercise4;
/* TestBankAccount.java
 * By: Faun Schutz
 * Start: 07/09/2020
 * Finish: 07/09/2020
 * */
import javax.swing.*;

public class TestBankAccount{
    public static void main(String[] args){
        String output = "";

        BankAccount account1 = new BankAccount();

        BankAccount account2 = new BankAccount("Richy Rich",2342343,0.75);

        output += "Calling the no-argument constructor. The first bank account details are: \n\n" + account1.toString() +
                  "\n\nCalling the multi-argument constructor. The second bank account details are: \n\n" + account2.toString() +
                  "\n\nNow we are calling the setInterestRate() method to change the interest rate to 0.5.";
        account1.setInterestRate(0.5);
        account2.setInterestRate(0.5);
        output += "\n\nThe first bank account details are: \n\n" + account1.toString() +
                  "\n\nThe second bank account details are: \n\n" + account2.toString();

        JOptionPane.showMessageDialog(null, output," ", JOptionPane.INFORMATION_MESSAGE);
    }
}
