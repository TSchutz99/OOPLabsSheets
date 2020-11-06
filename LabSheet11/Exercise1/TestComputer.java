package LabSheet11.Exercise1;

/* TestComputer.java
 * By: Faun Schutz
 * Start: 05/11/2020
 * Finish: 05/11/2020
 *
 * A driver class for the Computer class that uses a for-each loop. */

public class TestComputer {
    public static void main(String[] args) {

        double totalPrice=0;
        Computer highestSpeedComputer;


        Computer c1 = new Computer();
        Computer c2 = new Computer("Dell","Laptop",3.25,16,550.99);
        Computer c3 = new Computer("Apple","Tablet",3.65,8,500.25);
        Computer c4 = new Computer("Sun","Server",4.25,32,1768.45);
        Computer c5 = new Computer("Lenovo" , "Desktop", 2.86, 14, 457.24);

        Computer allComputers[] = {c1, c2, c3, c4, c5};

        highestSpeedComputer = allComputers[0];

        Computer[] computer500 = new Computer[allComputers.length];
        Computer[] computerTablet = new Computer[allComputers.length];

        System.out.println("\n\nDetails of all Computers in the array\n");

        int j = 0;
        for (Computer c:allComputers) {

            totalPrice += c.getPrice();

            if(c.getSpeed() > highestSpeedComputer.getSpeed())
                highestSpeedComputer = c;

            if(c.getPrice() > 500)
                computer500[j] = c;

            if(c.getType().equals("Tablet"))
                computerTablet[j] = c;

            System.out.println(c);
            j++;
        }

        System.out.println("\n\nSome additional information" +
                           "\n\nAverage computer price is: €" + String.format("%.2f",totalPrice/allComputers.length)+
                           "\nDetails of highest speed computer: " + highestSpeedComputer +
                           "\nList of computer whose price exceeds €500:\n");

        for(int i = 0; i < computer500.length; i++)
            if(computer500[i] != null)
                System.out.println(computer500[i]);

        System.out.println("\n\nList of computers that are tablets:");

        for(int i = 0; i < computerTablet.length; i++)
            if(computerTablet[i] != null)
                System.out.println(computerTablet[i]);

        for(Computer c:allComputers){
            if(c.getManufacturer().equals("Lenovo"))
                c.setManufacturer("Dell");
        }

        System.out.println("Updated details of all computers in the array:\n\n");

        for(int i = 0; i < allComputers.length; i++)
            System.out.println(allComputers[i]);
    }
}
