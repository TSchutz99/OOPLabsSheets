package LabSheet10.exercise1;

import java.util.GregorianCalendar;

/* TemporaryLecturer.java
 * By: Faun Schutz
 * Start: 04/11/2020
 * Finished: 04/11/2020
 */
public class TemporaryLecturer extends Lecturer{
    private int hoursWorked;

    public TemporaryLecturer(String name, String address, GregorianCalendar dateOfBirth, String staffID, String[] courseTaught, GregorianCalendar dateOfAppointment, int hoursWorked){
        super(name, address, dateOfBirth, staffID, courseTaught, dateOfAppointment);
        setHoursWorked(hoursWorked);
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    public int getHoursWorked() {
        return hoursWorked;
    }
    public String getStatus(){
        return "Contracted temporary lecturer on part-time hours";
    }
    public int getPointOnScale(){
        return 0;
    }

    public String toString(){
        return super.toString() + "\nLecturer Hours Worked: " + getHoursWorked();
    }
}
