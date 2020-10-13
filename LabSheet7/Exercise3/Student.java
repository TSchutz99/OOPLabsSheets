package LabSheet7.Exercise3;
/* Students.java
 * By: Faun Schutz
 * Start: 13/09/2020
 * Finish: 13/09/2020
 */
public class Student {
    private int id;
    private String name;
    private String department;

    public Student(int id, String name, String department){
        setId(id);
        setName(name);
        setDepartment(department);
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    public String getDepartment(){
        return department;
    }

    public String toString(){
        return "Name: " + getName() + "  ID: " + getId() + "  Department: " + getDepartment();
    }
}
