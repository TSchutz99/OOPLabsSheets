package LabSheet9.Exercise2;
/* Ellipse.java
 * By: Faun Schutz
 * Start: 22/09/2020
 * Finish: 22/09/2020
 */
public class Ellipse extends Shape{
    private double majorAxis;
    private double minorAxis;

    public Ellipse(){
        super("Ellipse");
        setMajorAxis(0);
        setMinorAxis(0);
    }
    public Ellipse(double majorAxis, double minorAxis){
        super("Ellipse");
        setMajorAxis(majorAxis);
        setMinorAxis(minorAxis);
    }

    public void setMajorAxis(double majorAxis){
        this.majorAxis = majorAxis;
    }
    public void setMinorAxis(double minorAxis){
        this.minorAxis = minorAxis;
    }

    public double getMajorAxis(){
        return majorAxis;
    }
    public double getMinorAxis(){
        return minorAxis;
    }

    public double area(){
        return Math.PI * (getMajorAxis() * (getMinorAxis()));
    }
    public double perimeter(){
        return 2 * Math.PI * Math.sqrt((Math.pow(getMajorAxis(),2) + Math.pow(getMinorAxis(),2)) / 2);
    }

    public String toString(){
        return "Shape type: " + type + "\nArea: " + area() + "\nPerimeter: " + perimeter();
    }
}
