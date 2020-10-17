package LabSheet7.Exercise3;
/* TestCollegeApp.java
 * By: Faun Schutz
 * Start: 13/09/2020
 * Finish: 15/09/2020
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

        Department computing = new Department("Computing", computingStudents);
        Department creativeMedia = new Department("Creative Media", creativeMediaStudents);

        Department[] departments = new Department[5];
        departments[0] = computing;
        departments[1] = creativeMedia;

        Institute ITT = new Institute("Institute of Technology, Tralee", departments);

        System.out.println(ITT);
        System.out.println("\n\nTotal students in institute: " + ITT.getTotalStudents());

        // Switching Jakes Department

        int computingSubscript = -1, creativeMediaSubscript = -1;

        for(int i = 0; i < departments.length; i++){
            if(departments[i] != null && departments[i].getName().equals("Computing"))
                computingSubscript = i;
            if(departments[i] != null && departments[i].getName().equals("Creative Media"))
                creativeMediaSubscript = i;
        }

        if(computingSubscript != -1 && creativeMediaSubscript != -1){
            Student[] allDepartmentStudents = departments[computingSubscript].getStudents();

            int j;
            for (j = 0; j < allDepartmentStudents.length; j++){
                if(allDepartmentStudents[j] != null){
                   if (allDepartmentStudents[j].getId() == 154345){
                       System.out.println("\nFound Jake!\n");

                       allDepartmentStudents[j].setDepartment("Creative Media");

                       for(int t = 0; t < departments[creativeMediaSubscript].getStudents().length; t++){
                           if(departments[creativeMediaSubscript].getStudents()[t] == null){
                               departments[creativeMediaSubscript].getStudents()[t] = allDepartmentStudents[j];
                               break;
                           }
                       }
                       allDepartmentStudents[j] = null;

                       break;
                   }
                }
            }

            if(j == allDepartmentStudents.length)
                System.out.println("\nCouldn't find Jake\n");
        }
        System.out.println(ITT);

        System.exit(0);
    }
}
