package LabSheet8.Exercise1;
/* TestVehicle.java
 * By: Faun Schutz
 * Start: 18/09/2020
 * Finish: 18/09/2020
 */
public class TestVehicle{
    public static void main(String[] args){
        String text = "Testing the Car no-arg constructor:\n\n";
        Car car1 = new Car();
        text += car1;

        text += "\n\n\nTesting the Car multi-arg constructor:\n\n";
        Car car2 = new Car(100000.0, 4.5, 1.25, 2000.0,
                            "Ferrari", "F2", 2, "05KY1");
        text += car2;

        text += "\n\n\nTesting the Bicycle no-arg constructor:\n\n";
        Bicycle bicycle1 = new Bicycle();
        text += bicycle1;

        text += "\n\n\nTesting the Bicycle multi-arg constructor:\n\n";
        Bicycle bicycle2 = new Bicycle(500.0, 1.5, 1.0, 50.0,
                                        "Raleigh", "Mountain bike", 4, true);
        text += bicycle2;

        System.out.println(text);
    }
}
