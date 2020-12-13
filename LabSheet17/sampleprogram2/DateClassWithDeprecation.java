package LabSheet17.sampleprogram2;

//DateClassWithDeprecation.java
/*A little demo program to illustrate the use of a deprecated method*/


import java.util.Date;

public class DateClassWithDeprecation {
    public static void main(String[] args) {

     Date today = new Date();

     System.out.println("Today's date is " + today.getDate());
    }
}
