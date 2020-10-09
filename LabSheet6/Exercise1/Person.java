package LabSheet6.Exercise1;
/* Person.java
 * By: Faun Schutz
 * Start: 09/09/2020
 * Finish: 09/09/2020
 * */

public class Person{
    private String firstName;
    private String lastName;

    public Person(){
        this("Not Supplied","Not Supplied");
    }
    public Person(String firstName, String lastName){
        setFirstName(firstName);
        setLastName(lastName);
    }

    public String toString(){
        return "First name: " + getFirstName() + "   Last name: " + getLastName();
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
}
