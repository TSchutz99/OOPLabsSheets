package LabSheet10.exercise1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

/* Lecturer.java
 * By: Faun Schutz
 * Start: 03/11/2020
 * Finished: 04/11/2020
 */
public abstract class Lecturer implements Person{
    String name;
    String address;
    GregorianCalendar dateOfBirth;
    String staffID;
    String[] courseTaught;
    GregorianCalendar dateOfAppointment;

    public Lecturer(String name, String address, GregorianCalendar dateOfBirth, String staffID, String[] courseTaught, GregorianCalendar dateOfAppointment){
        setName(name);
        setAddress(address);
        setDateOfBirth(dateOfBirth);
        setStaffID(staffID);
        setCoursesTaught(courseTaught);
        setDateOfAppointment(dateOfAppointment);
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }
    public void setDateOfBirth(GregorianCalendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public GregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }
    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }
    public String getStaffID() {
        return staffID;
    }
    public void setCoursesTaught(String[] courseTaught) {
        this.courseTaught = courseTaught;
    }
    public String[] getCoursesTaught() {
        return courseTaught;
    }
    public void setDateOfAppointment(GregorianCalendar dateOfAppointment) {
        this.dateOfAppointment = dateOfAppointment;
    }
    public GregorianCalendar getDateOfAppointment() {
        return dateOfAppointment;
    }
    public abstract String getStatus();
    public abstract int getPointOnScale();

    public String toString(){
        String str = "Lecturer name is " + getName() +
                     "\nLecturer address is " + getAddress() +
                     "\nLecturer date of birth is ";

        if(dateOfBirth != null){
            Date dob = getDateOfBirth().getTime();

            SimpleDateFormat formatDate = new SimpleDateFormat("dd-MM-yyyy");
            String strDob = formatDate.format(dob);
            str += strDob; //Not adding onto the Sting for some reason
        }
        else
            str += "Undefined"; //Not adding onto the Sting for some reason

        str = "\nLecturer staff ID is " + getStaffID() +
              "\nLecturer course taught " + getCoursesTaught() +
              "\nLecturer date of appointment ";

        if(dateOfAppointment != null){
            Date doa = getDateOfAppointment().getTime();

            SimpleDateFormat formatDate = new SimpleDateFormat("dd-MM-yyyy");
            String strDoa = formatDate.format(doa);
            str += strDoa; //Not adding onto the Sting for some reason
        }
        else
            str += "Undefined"; //Not adding onto the Sting for some reason

        str = "\nLecturer status is " + getStatus() +
              "\nLecturer point on scale is " + getPointOnScale();
        return str;
    }
}
