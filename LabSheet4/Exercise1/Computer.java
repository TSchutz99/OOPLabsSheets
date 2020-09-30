package LabSheet4.Exercise1;
/* Computer.java
 * By: Faun Schutz
 * Start: 29/08/2020
 * Finish: 29/08/2020
 * */
public class Computer {

    private String manufacturer;
    private String type;
    private double speed;
    private int RAM;
    private double price;

    public Computer(){
        setManufacturer("Not available");
        setType("Not available");
        setSpeed(0);
        setRAM(0);
        setPrice(0);
    }
    public Computer(String manufacturer,String type,double speed,int RAM,double price){
        setManufacturer(manufacturer);
        setType(type);
        setSpeed(speed);
        setRAM(RAM);
        setPrice(price);
    }

    public String toString(){
        return  "Manufacturer: " + getManufacturer() + "   Type: " + getType() + "   Speed: " + getSpeed() +
                "   RAM: " + getRAM() + "   Price: " + getPrice();
    }

    public String getManufacturer(){
        return manufacturer;
    }
    public String getType(){
        return type;
    }
    public double getSpeed(){
        return speed;
    }
    public int getRAM(){
        return RAM;
    }
    public double getPrice(){
        return price;
    }

    public void setManufacturer(String manufacturer){
        this.manufacturer = manufacturer;
    }
    public void setType(String type){
        this.type = type;
    }
    public void setSpeed(double speed){
        if(speed>0)
            this.speed = speed;
    }
    public void setRAM(int RAM){
        this.RAM = RAM;
    }
    public void setPrice(double price){
        this.price = price;
    }
}
