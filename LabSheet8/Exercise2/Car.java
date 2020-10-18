package LabSheet8.Exercise2;

/* Car.java
 * By: Faun Schutz
 * Start: 18/09/2020
 * Finish: 18/09/2020
 */
public class Car extends Vehicle {
    private int maxPassengers;
    private String registrationNumber;

    public Car(){
        setMaxPassengers(0);
        setRegistrationNumber("No registration number specified");
    }
    public Car(double price, double length, double height, double weight, String manufacturer, String model, int maxPassengers, String registNumber){
        super(price,length,height,weight,manufacturer,model);
        setMaxPassengers(maxPassengers);
        setRegistrationNumber(registNumber);
    }

    public void setMaxPassengers(int maxPassengers){
        this.maxPassengers = maxPassengers;
    }
    public int getMaxPassengers(){
        return maxPassengers;
    }
    public void setRegistrationNumber(String registNumber){
        if(Validator.isValidRegistrationNumber(registNumber) || registNumber == "No registration number specified")
            registrationNumber = registNumber;
        else
            registrationNumber = "Invalid Registration Number";

    }
    public String getRegistrationNumber(){
        return registrationNumber;
    }

    public String toString(){
        return super.toString() + "\nMax passengers: " + getMaxPassengers() + "\nRegistration Number: " + getRegistrationNumber();
    }
}
