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

        Department computing[] = new Department[10];

        computing[0] = student1;
        computing[1] = student3;
    }
}
