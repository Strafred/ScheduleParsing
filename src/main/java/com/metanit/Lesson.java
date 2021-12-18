package com.metanit;

import java.time.LocalTime;
import java.util.HashMap;

enum Parity {
    everyWeek, //0
    odd, //1
    even //2
}

public class Lesson {
    String teacher;
    String subject;
    String classroom;
    String day;

    LocalTime startTime;
    LocalTime endTime;
    Parity parity;
    int interval;

    public Lesson(HashMap<String, String> icsFields) {
        this.teacher = icsFields.get("DESCRIPTION");
        this.subject = icsFields.get("SUMMARY");
        this.classroom = icsFields.get("LOCATION");
        this.day = LessonParser.parseLessonDay(icsFields.get("RRULE"));

        this.startTime = LessonParser.parseLessonStartTime(icsFields.get("DTSTART;TZID=Asia/Krasnoyarsk"));
        this.endTime = LessonParser.parseLessonEndTime(icsFields.get("DTEND;TZID=Asia/Krasnoyarsk"));
        this.parity = LessonParser.parseLessonParity(icsFields.get("DTSTART;TZID=Asia/Krasnoyarsk"));
        this.interval = LessonParser.parseLessonInterval(icsFields.get("RRULE"));
    }
}