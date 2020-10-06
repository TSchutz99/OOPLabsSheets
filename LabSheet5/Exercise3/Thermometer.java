package LabSheet5.Exercise3;
/* Thermometer.java
 * By: Faun Schutz
 * Start: 06/09/2020
 * Finish: 06/09/2020
 * */

public class Thermometer{

    private int currentTemp;
    private int maximumTemp;
    private int minimumTemp;

    public Thermometer(){
        setTemperature(0);
        setMaximumTemp(Integer.MIN_VALUE);
        setMinimumTemp(Integer.MAX_VALUE);
    }
    public Thermometer(int currentTemp){
        setTemperature(currentTemp);
        setMaximumTemp(currentTemp);
        setMinimumTemp(currentTemp);
    }

    public void setTemperature(int currentTemp){
        this.currentTemp = currentTemp;
        updateMaxMinTemp(currentTemp);
    }
    public void setMaximumTemp(int maximumTemp){
        this.maximumTemp = maximumTemp;
    }
    public void setMinimumTemp(int minimumTemp){
        this.minimumTemp = minimumTemp;
    }
    private void updateMaxMinTemp(int currentTemp){
        if(currentTemp > maximumTemp)
            maximumTemp = currentTemp;

        if(currentTemp < minimumTemp)
            minimumTemp = currentTemp;
    }

    public int getCurrentTemp(){
        return currentTemp;
    }
    public int getMaximumTemp(){
        return maximumTemp;
    }
    public int getMinimumTemp(){
        return minimumTemp;
    }

}
