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
        /* The way John B did this got it after completing my own
        Calendar today = GregorianCalendar.getInstance();
        int yearsWorked =  today.get(Calendar.YEAR)-getDateOfAppointment().get(Calendar.YEAR);

        if(today.get(Calendar.MONTH)<getDateOfAppointment().get(Calendar.MONTH)
            || (today.get(Calendar.MONTH)==getDateOfAppointment().get(Calendar.MONTH)
                && today.get(Calendar.DATE)<getDateOfAppointment().get(Calendar.DATE)))
            yearsWorked--;

        if(yearsWorked>=20) //we will say there are only 20 points on the scale in total here
            return 20;
        else
            return yearsWorked;
        */
    }

    public String toString(){
        return super.toString() + "\nLecturer Pension Entitlements: " + getPensionEntitlements();
    }
}
