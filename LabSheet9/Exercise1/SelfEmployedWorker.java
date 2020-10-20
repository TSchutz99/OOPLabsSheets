package LabSheet9.Exercise1;
/* SelfEmployedWorker.java
 * By: Faun Schutz
 * Start: 20/10/2020
 * Finish: 20/10/2020
 */

public class SelfEmployedWorker extends Employee{
    private double estimatedIncome;

    public SelfEmployedWorker(String firstName, String lastName){
        super(firstName, lastName);
        setEstimatedIncome();
    }

    public void setEstimatedIncome() {
        this.estimatedIncome = (int)(Math.random() * 501) + 400;
    }
    public double earnings() {
        return estimatedIncome;
    }

    public String toString() {
        return  "Self-employed worker's name is " + super.toString();
    }
}
