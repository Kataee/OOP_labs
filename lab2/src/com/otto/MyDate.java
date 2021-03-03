package com.otto;

public class MyDate {
    int year, month, day;

    //contructor

    public MyDate(int year, int month, int day) {
        String date = year + "-" + month + "-" + day;
        if (DateUtil.isValidDate(date)) {
            this.year = year;
            this.month = month;
            this.day = day;
        }
    }

    public int getYear() {
        return year;
    }
    public int getMonth() {
        return month;
    }
    public int getDay() {
        return day;
    }
}
