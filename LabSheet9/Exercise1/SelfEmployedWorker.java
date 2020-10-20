package LabSheet9.Exercise1;
/* SelfEmployedWorker.java
 * By: Faun Schutz
 * Start: 20/10/2020
 * Finish: 20/10/2020
 */

public class SelfEmployedWorker extends Employee{

    public SelfEmployedWorker(String firstName, String lastName){
        super(firstName, lastName);
    }

    public double earnings() {
        return (int)(Math.random() * 501) + 400;
    }

    public String toString() {
        return  "Self-employed worker's name is " + super.toString();
    }
}
