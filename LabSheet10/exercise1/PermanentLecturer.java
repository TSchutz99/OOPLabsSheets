package LabSheet10.exercise1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

/* PermanentLecturer.java
 * By: Faun Schutz
 * Start: 04/11/2020
 * Finished: 04/11/2020
 */
public class PermanentLecturer extends Lecturer{
    private String pensionEntitlements;
    private String status;

    public PermanentLecturer(String name, String address, GregorianCalendar dateOfBirth, String staffID, String[] courseTaught, GregorianCalendar dateOfAppointment, String pensionEntitlements, String status){
        super(name, address, dateOfBirth, staffID, courseTaught, dateOfAppointment);
        setPensionEntitlements(pensionEntitlements);
        setStatus(status);
    }

    public void setPensionEntitlements(String pensionEntitlements) {
        this.pensionEntitlements = pensionEntitlements;
    }
    public String getPensionEntitlements() {
        return pensionEntitlements;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getStatus() {
        return status;
    }
    public int getPointOnScale(){
        Date currentDate = new Date();
        SimpleDateFormat formatDate = new SimpleDateFormat("dd-MM-yyyy");

        String strDateApp = formatDate.format(getDateOfAppointment().getTime());

        int year1 = Integer.parseInt(strDateApp.substring(6));
        int year2 = Integer.parseInt(formatDate.format(currentDate).substring(6));
        int yearsBetween = year2 - year1 - 1;

        if(yearsBetween > 20)
            yearsBetween = 20;

        return yearsBetween;
    }

    public String toString(){
        return super.toString() + "\nLecturer Pension Entitlements: " + getPensionEntitlements();
    }
}
