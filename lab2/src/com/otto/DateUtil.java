package com.otto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;



public class DateUtil {
    //Methods

    public static boolean leapYear (int year) {
        if (year % 4 == 0) {
            //if the year is century
            if (year % 100 == 0) {
                //if year is divided by 400
                //then is a leap year
                return year % 400 == 0;
            }
        return true;
        }else {return false; }
    }

    //private DateTimeFormatter dateFormatter;
    public static boolean isValidDate(final String date) {
        boolean valid = false;

        try {
            LocalDate.parse(date, DateTimeFormatter.ofPattern("uuuu-M-d").withResolverStyle(ResolverStyle.STRICT));

            valid = true;
        } catch (DateTimeParseException e) {
            //print error msg to the console to see why the input is not a valid year
            //e.printStackTrace();
            //valid = false;
        }
        return valid;
    }

}


