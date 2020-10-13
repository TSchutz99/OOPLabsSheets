package LabSheet7.Exercise3;
/* TestCollegeApp.java
 * By: Faun Schutz
 * Start: 13/09/2020
 * Finish: /09/2020
 */
public class TestCollegeApp {
    public static void main(String[] args){
        Student student1 = new Student(154345, "Jake", "Computing");
        Student student2 = new Student(234532, "Mary", "Creative Media");
        Student student3 = new Student(453726, "Tommy", "Computing");
        Student student4 = new Student(623456, "Peter", "Creative Media");

        Student[] computingStudents = new Student[10];
        computingStudents[0] = student1;
        computingStudents[1] = student3;

        Student[] creativeMediaStudents = new Student[10];
        creativeMediaStudents[0] = student2;
        creativeMediaStudents[1] = student4;

        Department department1 = new Department("Computing", computingStudents);
        Department department2 = new Department("Creative Media", creativeMediaStudents);

        Department[] departments = new Department[5];
        departments[0] = department1;
        departments[1] = department2;

        Institute ITT = new Institute("Institute of Technology, Tralee", departments);

        System.out.println(ITT);
    }
}
