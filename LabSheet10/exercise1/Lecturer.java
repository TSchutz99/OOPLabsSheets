package LabSheet10.exercise1;

import java.util.GregorianCalendar;

/* Lecturer.java
 * By: Faun Schutz
 * Start: 03/11/2020
 * Finished: /11/2020
 */
public abstract class Lecturer implements Person{
    String name;
    String address;
    GregorianCalendar dateOfBirth;
    String staffID;
    String[] courseTaught;
    GregorianCalendar dateOfAppointment;
}
