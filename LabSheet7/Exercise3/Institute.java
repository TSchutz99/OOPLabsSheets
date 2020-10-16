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
        int totalStudents = 0;

        Department temporaryD = new Department;

        for(int i = 0; i < getDepartments().length; i++){
            if (getDepartments()[i] != null){
                temporaryD = getDepartments()[i];

                Student[] temporaryS = new Student[temporaryD[1].length];

                temporaryS = temporaryD[1];

                if(temporaryS[i] != null)
                    totalStudents++;
            }
        }
        return totalStudents;
    }

    public String toString(){
        String output = "";
        output += "Name: " + getName() + "\n\nDepartments: \n" + getDepartments();

        for(int i = 0; i < getDepartments().length; i++)
            if(getDepartments()[i] != null)
                output += getDepartments()[i];

        output += "\n\nTotal students in institute: " + getTotalStudents();

        return output;
    }
}
