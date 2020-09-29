package LabSheet1;
/* HeightStats.java
 * By: Faun Schutz
 * Start: 22/09/2020
 * Finish: 22/09/2020
 */
import java.util.Scanner;

public class HeightStats {
    public static void main(String[] args)  {
        int loop = 0, inclusive = 0, exceeding = 0;
        double height, allHeight = 0, smallest = 1.9;
        final double GLOBALAVERAGEHEIGHT = 1.665;
        Scanner input = new Scanner(System.in);

        while(loop < 6)
        {
            System.out.print("\nLoop " + (loop+1) + " - Please enter height = ");
            height = input.nextDouble();

            while(!(height > 0.5464f & height < 2.72f))
            {
                System.out.print("Loop " + (loop+1) + " - Height value invalid!!! Please re-enter height = ");
                height = input.nextDouble();
            }

            allHeight = allHeight + height;

            if(height < smallest)
                smallest = height;

            if(height > 1.3f & height < 1.7f)
                inclusive++;

            if(height > GLOBALAVERAGEHEIGHT)
                exceeding++;

            loop++;
        }
        System.out.print("\n_________________________\n\tHeight Statistics\n_________________________\n\n" +
                         "The Average heights entered is " + allHeight/loop + "m" +
                         "\nThe smallest height value entered is " + smallest + "m" +
                         "\nThe number of height values between 1.3m and 1.9m inclusive is " + inclusive +
                         "\nThe percentage of the height values exceeding the global average height is " +
                            (exceeding/loop)*100f + "%");
    }
}
