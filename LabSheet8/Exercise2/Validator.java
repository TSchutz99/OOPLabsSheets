package LabSheet8.Exercise2;
/* Validator.java
 * By: Faun Schutz
 * Start: 18/09/2020
 * Finish: 18/09/2020
 */
public class Validator{
    public static boolean isValidRegistrationNumber(String registrationNumber){
        if(registrationNumber.length() >= 6 && registrationNumber.length() <= 12)
            if(Character.isDigit(registrationNumber.charAt(0)) && Character.isDigit(registrationNumber.charAt(1)))
                if(registrationNumber.charAt(2) == '-')
                    if(Character.isUpperCase(registrationNumber.charAt(3)) && Character.isUpperCase(registrationNumber.charAt(4)) &&
                       registrationNumber.charAt(5) == '-' || Character.isUpperCase(registrationNumber.charAt(3)) &&
                       registrationNumber.charAt(4) == '-' && Character.isDigit(registrationNumber.charAt(5))){
                        int i;
                        for(i = 6; i < registrationNumber.length(); i++)
                            if(!Character.isDigit(registrationNumber.charAt(i)))
                                break;

                        if(i == registrationNumber.length())
                            return true;
                    }

        return false;
    }
}
