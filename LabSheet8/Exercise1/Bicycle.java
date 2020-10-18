package LabSheet8.Exercise1;
/* Bicycle.java
 * By: Faun Schutz
 * Start: 18/09/2020
 * Finish: 18/09/2020
 */
public class Bicycle extends Vehicle{
    private int gearCount;
    private boolean baseBell;

    public Bicycle(){
        setGearCount(0);
        setBaseBell(false);
    }
    public Bicycle(double price, double length, double height, double weight, String manufacturer, String model, int gearCount, boolean baseBell){
        super(price,length,height,weight,manufacturer,model);
        setGearCount(gearCount);
        setBaseBell(baseBell);
    }

    public void setGearCount(int gearCount){
        this.gearCount = gearCount;
    }
    public int getGearCount(){
        return gearCount;
    }
    public void setBaseBell(boolean baseBell) {
        this.baseBell = baseBell;
    }
    public boolean getBaseBell(){
        return baseBell;
    }

    public String toString(){
        String str = super.toString() + "\nHas bell: ";

        if(baseBell == false)
            str += "No";
        if(baseBell == true)
            str += "Yes";

        str += "\nGear Count: " + getGearCount();

        return str;
    }
}
