package LabSheet7.Exercise3;
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
        this.students = students;
    }
    public Student[] getStudents(){
        return students;
    }

    public String toString(){
        return "Name: " + getName() + "\nList of Students: \n\n" + getStudents();
    }
}
