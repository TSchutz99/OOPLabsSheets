package LabSheet7.Exercise3;
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
        this.departments = departments;
    }
    public Department[] getDepartments(){
        return departments;
    }

    public int getTotalStudents(){
        return 0;
    }

    public String toString(){
        return "Departments: \n" + getDepartments();
    }
}
