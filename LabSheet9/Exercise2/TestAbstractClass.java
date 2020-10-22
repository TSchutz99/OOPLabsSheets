package LabSheet9.Exercise2;
/* TestAbstractClass.java
 * By: Faun Schutz
 * Start: 22/09/2020
 * Finish: 22/09/2020
 */
public class TestAbstractClass {
      public static void main(String args[])
         {
             Circle circle1 = new Circle();
             System.out.println("Details of first Circle object: \n" + circle1);

             Circle circle2 = new Circle(5.5);
             System.out.println("\n\nDetails of second Circle object: \n" + circle2);

             Rectangle rectangle1 = new Rectangle();
             System.out.println("\n\nDetails of first Rectangle object: \n" + rectangle1);

             Rectangle rectangle2 = new Rectangle(4.3,1.8);
             System.out.println("\n\nDetails of second Rectangle object: \n" + rectangle2);

             Triangle triangle1 = new Triangle();
             System.out.println("\n\nDetails of first Triangle object: \n" + triangle1);

             Triangle triangle2 = new Triangle(3.24, 4.23, 5.78);
             System.out.println("\n\nDetails of second Triangle object: \n" + triangle2);

             Ellipse ellipse1 = new Ellipse();
             System.out.println("\n\nDetails of first Ellipse object: \n" + ellipse1);

             Ellipse ellipse2 = new Ellipse(5.62, 4.19);
             System.out.println("\n\nDetails of second Ellipse object: \n" + ellipse2);

             Shape[] allShapes = {circle1,circle2,rectangle1,rectangle2,triangle1,triangle2,ellipse1,ellipse2};

             System.out.println("\n\nDetails of all Shape objects contained in the Shape array: \n");
             for(int i=0;i<allShapes.length;i++)
                 System.out.println(allShapes[i] + "\n\n");
         }
}