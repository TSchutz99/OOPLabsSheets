package LabSheet10.exercise1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestYearsBeteenTwoDates {
    public static void main(String[] args){
        GregorianCalendar AppDate = new GregorianCalendar(2003,06,23);
        Date currentDate = new Date();
        SimpleDateFormat formatDate = new SimpleDateFormat("dd-MM-yyyy");

        formatDate.format(currentDate);

        System.out.println(currentDate);
        System.out.println(formatDate.format(currentDate));

        String strAppDate = formatDate.format(AppDate.getTime());
        System.out.println(strAppDate);

        int year1 = Integer.parseInt(strAppDate.substring(6));
        int year2 = Integer.parseInt(formatDate.format(currentDate).substring(6));
        int yearsBetween = year2 - year1 - 1;

        System.out.println(yearsBetween);
    }
}
