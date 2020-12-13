package LabSheet17.sampleprogram3;

//DateClassWithSuppressWarnings.java
/*A little demo program to illustrate the use of a @SuppressWarnings annotation to
*prevent compiler warning when using a deprecated method*/

import java.util.Date;

public class DateClassWithSuppressWarnings {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {

     Date today = new Date();

     System.out.println("Today's date is " + today.getDate());
    }
}
