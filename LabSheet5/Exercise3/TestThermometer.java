package LabSheet5.Exercise3;

import javax.swing.JOptionPane;

public class TestThermometer{
    public static void main(String[] args){
        Thermometer T1 = new Thermometer(35);

        Thermometer T2 = new Thermometer();

        Thermometer T3 = new Thermometer(25);

        JOptionPane.showMessageDialog(null,"******Thermometer Testing******" +
                                "\n\nCalling the single-argument constructor .... setting the temperature of first thermometer to 35C" +
                                "\nFirst Thermometer:\nCurrent temperature: " + T1.getCurrentTemp() +
                                "\nMaximum temperature: " + T1.getMaximumTemp() + "\nMinimum temperature: " + T1.getMinimumTemp() +
                                "\n\nCalling the single-argument constructor .... setting the temperature of second thermometer to 0C" +
                                "\nSecond Thermometer:\nCurrent temperature: " + T2.getCurrentTemp() +
                                "\nMaximum temperature: " + T2.getMaximumTemp() + "\nMinimum temperature: " + T2.getMinimumTemp() +
                                "\n\nCalling the single-argument constructor .... setting the temperature of third thermometer to 25C" +
                                "\nThird Thermometer:\nCurrent temperature: " + T3.getCurrentTemp() +
                                "\nMaximum temperature: " + T3.getMaximumTemp() + "\nMinimum temperature: " + T3.getMinimumTemp(),
                            " ", JOptionPane.INFORMATION_MESSAGE);

        int temperature = Integer.parseInt(JOptionPane.showInputDialog("Please enter the current temperature of the first thermometer:"));

        T1.setTemperature(temperature);

        JOptionPane.showMessageDialog(null, "******Thermometer Testing******" +
                                    "\n\nCalling setTemperature() .... setting the temperature of the first Thermometer to " + temperature + "C" +
                                    "\nFirst Thermometer:\nCurrent temperature: " + T1.getCurrentTemp() +
                                    "\nMaximum temperature: " + T1.getMaximumTemp() + "\nMinimum temperature: " + T1.getMinimumTemp());

    }
}