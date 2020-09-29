package LabSheet1;
/* PlanetGravity.java
 * By: Faun Schutz
 * Start: 22/09/2020
 * Finish: 22/09/2020
 */
import java.util.Scanner;

public class PlanetGravity {
    public static void main(String[] args) {
        final double G = 9.81f;
        double massEarth, radiusEarth, massOther, radiusOther;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the mass of planet Earth: ");
        massEarth = input.nextDouble();

        System.out.print("Please enter the radius of planet Earth: ");
        radiusEarth = input.nextDouble();

        System.out.print("Please enter the mass of other planet: ");
        massOther = input.nextDouble();

        System.out.print("Please enter the radius of other planet: ");
        radiusOther = input.nextDouble();

        double acceleration = (G * massOther * Math.pow(radiusEarth, 2f)) / (massEarth * Math.pow(radiusOther, 2f));

        System.out.print("\nThe acceleration dueto gravity on the other planet is " + String.format("%.2f", acceleration) + " m/s/s");
    }
}
