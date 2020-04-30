package com.example.problemstatement2;

public class HolidayDate {
    private String name;
    private String date;
    private String intro;

    public HolidayDate(String name, String date, String intro) {
        this.name = name;
        this.date = date;
        this.intro = intro;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getIntro() {
        return intro;
    }
}
