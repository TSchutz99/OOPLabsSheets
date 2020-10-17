package LabSheet7.Exercise3;

import java.util.Arrays;

/* Department.java
 * By: Faun Schutz
 * Start: 13/09/2020
 * Finish: 13/09/2020
 */
public class Department {
    private String name;
    private Student[] students;

    public Department(String name, Student[] students){
        setName(name);
        setStudents(students);
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setStudents(Student[] students){
        if(students != null)
            this.students = Arrays.copyOf(students,students.length);
    }
    public Student[] getStudents(){
        return students;
    }

    public String toString(){
        String output = "";
        output += "\nName: " + getName() + "\nList of Students: \n\n"; // + getStudents();

        for(int i = 0; i < getStudents().length; i++)
            if(getStudents()[i] != null)
                output += getStudents()[i] + "\n";

        return output;
    }
}
