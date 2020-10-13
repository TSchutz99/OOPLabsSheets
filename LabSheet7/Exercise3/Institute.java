package LabSheet7.Exercise3;

import java.util.Arrays;

/* Institute.java
 * By: Faun Schutz
 * Start: 13/09/2020
 * Finish: 13/09/2020
 */
public class Institute{
    private String name;
    private Department[] departments;

    public Institute(String name, Department[] departments){
        setName(name);
        setDepartments(departments);
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setDepartments(Department[] departments) {
        if(departments != null)
            this.departments = Arrays.copyOf(departments,departments.length);
    }
    public Department[] getDepartments(){
        return departments;
    }

    public int getTotalStudents(){
        return 0; // Next job to do.
    }

    public String toString(){
        return "Name: " + getName() + "\n\nDepartments: \n" + getDepartments() +  
               "\n\nTotal students in institute: " + getTotalStudents();
    }
}
