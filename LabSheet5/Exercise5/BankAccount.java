package LabSheet5.Exercise5;
/* BankAccount.java
 * By: Faun Schutz
 * Start: 07/09/2020
 * Finish: 07/09/2020
 * */

public class BankAccount {

    private String owner;
    private int number;
    private static double interestRate;
    private static int count = 1;

    public BankAccount(){
        this("Owner not Available",0,0);
    }
    public BankAccount(String owner, int number, double interestRate){
        setOwner(owner);
        setNumber(number);
        setInterestRate(interestRate);
        incrementCount();
    }

    public void setOwner(String owner){
        this.owner = owner;
    }
    public void setNumber(int number){
        this.number = count;
    }
    public static void setInterestRate(double interestRate) {
        BankAccount.interestRate = interestRate;
    }
    private static void incrementCount() {
        count++;
    }

    public String getOwner(){
        return owner;
    }
    public int getNumber(){
        return number;
    }
    public static double getInterestRate(){
        return interestRate;
    }

    public String toString(){
        return "Owner: " + getOwner() + "   Number: " + getNumber() + "   Interest Rate: " + getInterestRate();
    }
}
