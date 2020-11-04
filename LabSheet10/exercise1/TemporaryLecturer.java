package LabSheet10.exercise1;

import java.text.SimpleDateFormat;
import java.util.Date;
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
        Date currentDate = new Date();
        SimpleDateFormat formatDate = new SimpleDateFormat("dd-MM-yyyy");

        String strDateApp = formatDate.format(getDateOfAppointment().getTime());

        int year1 = Integer.parseInt(strDateApp.substring(6));
        int year2 = Integer.parseInt(formatDate.format(currentDate).substring(6));
        int yearsBetween = year2 - year1 - 1;

        if(yearsBetween >= 3 && getHoursWorked() > 1500)
            return 4;
        else if(yearsBetween >= 3 && getHoursWorked() > 1000){
            return (int)((getHoursWorked() * 1.33) / 700) + 1;
        }
        else return yearsBetween;
    }

    public String toString(){
        return super.toString() + "\nLecturer Hours Worked: " + getHoursWorked();
    }
}
