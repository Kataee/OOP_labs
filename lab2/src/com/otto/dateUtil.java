package com.otto;

public class dateUtil {
    //Methods

    public static boolean leapYear (int year) {
        if (year % 4 == 0) {
            //if the year is century
            if (year % 100 == 0) {
                //if year is divided by 400
                //then is a leap year
                if (year % 400 == 0) {
                    return true;
                } else {return false; }
            }
        return true;
        }else {return false; }
    }

    public static boolean isValidDate (int year, int month, int day) {

    }
}
