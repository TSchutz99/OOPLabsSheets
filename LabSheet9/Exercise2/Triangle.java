package LabSheet9.Exercise2;
/* Triangle.java
 * By: Faun Schutz
 * Start: 22/09/2020
 * Finish: 22/09/2020
 */
public class Triangle extends Shape{
    private double sideLength1;
    private double sideLength2;
    private double sideLength3;

    public Triangle(){
        super("Triangle");
        setSideLength1(0);
        setSideLength2(0);
        setSideLength3(0);
    }
    public Triangle(double sideLength1, double sideLength2, double sideLength3){
        super("Triangle");
        setSideLength1(sideLength1);
        setSideLength2(sideLength2);
        setSideLength3(sideLength3);
    }

    public void setSideLength1(double sideLength1){
        this.sideLength1 = sideLength1;
    }
    public void setSideLength2(double sideLength2){
        this.sideLength2 = sideLength2;
    }
    public void setSideLength3(double sideLength3){
        this.sideLength3 = sideLength3;
    }

    public double getSideLength1(){
        return sideLength1;
    }
    public double getSideLength2(){
        return sideLength2;
    }
    public double getSideLength3(){
        return sideLength3;
    }

    public double area(){
        double s = (getSideLength1()*getSideLength2()*getSideLength3())/2;
        return Math.sqrt(s * (s - getSideLength1()) * (s - getSideLength2()) * (s - getSideLength3()));
    }
    public double perimeter(){
        return getSideLength1() + getSideLength2() + getSideLength3();
    }

    public String tpString(){
        return "Shape type: " + type + "\nArea: " + area() + "\nPerimeter: " + perimeter();
    }
}
