package LabSheet10.sampleprogram1;
/* TestInterface.java
 * By: Faun Schutz
 * Start: 04/11/2020
 * Finished: 04/11/2020
 *
 * A driver program that tests the functionality of the Student, UnderGraduate and
 * PostGraduate classes as well as the Person interface. */

import LabSheet10.exercise1.PermanentLecturer;
import LabSheet10.exercise1.TemporaryLecturer;

import java.util.*;

public class TestInterface {
     public static void main(String args[]){
		 System.out.println("Testing the UnderGraduate no-arg constructor: ");
		 UnderGraduate u1 = new UnderGraduate();
		 System.out.println(u1);

		 System.out.println("\n\nTesting the UnderGraduate multi-arg constructor: ");
		 UnderGraduate u2 = new UnderGraduate("Tommy Tiernan", "Galway", new GregorianCalendar(1970,5,22),"t123456","Comedy",3.12);
		 System.out.println(u2);

		 System.out.println("\n\nTesting the PostGraduate no-arg constructor: ");
		 PostGraduate p1 = new PostGraduate();
		 System.out.println(p1);

		 System.out.println("\n\nTesting the PostGraduate multi-arg constructor: ");
		 PostGraduate p2 = new PostGraduate("Eddie Murphy", "USA", new GregorianCalendar(1961,7,10), "t234567", "Comedy", "Frank Carson");
		 System.out.println(p2);

		 System.out.println("\n\nTesting the PermanentLecturer multi-arg constructor: ");
		 PermanentLecturer pl1 = new PermanentLecturer("Thomas Aquinas", "Philadelpia, USA", new GregorianCalendar(1984,12,31), "52673", new String[]{"Economics 101", "Media Presentation", "Political Debate"},
				                                        new GregorianCalendar(2003,06,23), "Lots and lots of Pension Entitlements :-)", "Full-time Professorship");
		 System.out.println(pl1);

		 System.out.println("\n\nTesting the PermanentLecturer multi-arg constructor: ");
		 PermanentLecturer pl2 = new PermanentLecturer("Uncle Bob Martin", "Dublin", new GregorianCalendar(1052,04,19), "t0044356", new String[]{"Agile Methods", "OO Analysis & Design", "Design Patterns"},
				                                        new GregorianCalendar(1986,03,18), "Oodles of Pension Entitlements :-)", "Part-time Senior Research Fellow");
		 System.out.println(pl2);

		 System.out.println("\n\nTesting the TemporaryLecturer multi-arg constructor: ");
		 TemporaryLecturer tl1 = new TemporaryLecturer("Richard O' Neill", "Tallaght, Dublin", new GregorianCalendar(1985,03,04), "3536278b", new String[]{"Applied Biology", "Microbiology"},
				                                        new GregorianCalendar(2018,04,15), 762);
		 System.out.println(tl1);

		 System.out.println("\n\nTesting the TemporaryLecturer multi-arg constructor: ");
		 TemporaryLecturer tl2 = new TemporaryLecturer("Mary McKenzie", "Bundoran, Donegal", new GregorianCalendar(1971,06,13), "647382", new String[]{"Fractal Geometry", "Tensors"},
				 									    new GregorianCalendar(2016,03,8), 1342);
		 System.out.println(tl2);
     }
}