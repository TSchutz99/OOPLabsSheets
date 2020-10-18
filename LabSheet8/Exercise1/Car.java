package LabSheet8.Exercise1;
/* Car.java
 * By: Faun Schutz
 * Start: 18/09/2020
 * Finish: 18/09/2020
 */
public class Car extends Vehicle{
    private int maxPassengers;
    private String registrationNumber;

    public Car(){
        setMaxPassengers(0);
        setRegistrationNumber("No registration number specified");
    }
    public Car(double price, double length, double height, double weight, String manufacturer, String model, int maxPassengers, String registrationNumber){
        super(price,length,height,weight,manufacturer,model);
        setMaxPassengers(maxPassengers);
        setRegistrationNumber(registrationNumber);
    }

    public void setMaxPassengers(int maxPassengers){
        this.maxPassengers = maxPassengers;
    }
    public int getMaxPassengers(){
        return maxPassengers;
    }
    public void setRegistrationNumber(String registrationNumber){
        this.registrationNumber = registrationNumber;
    }
    public String getRegistrationNumber(){
        return registrationNumber;
    }

    public String toString(){
        return super.toString() + "\nMax passengers: " + getMaxPassengers() + "\nRegistration Number: " + getRegistrationNumber();
    }
}
