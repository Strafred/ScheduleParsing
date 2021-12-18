package com.metanit;

import com.google.common.collect.Multimap;

public class View {
    public static void printFullSchedule(Multimap<String, Lesson> schedule, String day) {
        if (schedule != null) {
            for (Lesson lesson : schedule.get(day)) {
                System.out.println(lesson.teacher);
                System.out.println(lesson.subject);
                System.out.println(lesson.classroom);
                System.out.println(lesson.day);
                System.out.println(lesson.startTime);
                System.out.println(lesson.endTime);

                System.out.println("===============================================================");
            }
        } else {
            System.err.println("Something's fucked up :(");
        } // NEED TO IMPLEMENT IN TOSTRING()
    }
}