package com.metanit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class User {
    public static void main(String[] args) throws IOException {
        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please, write your group number!");
        String groupNumber = userInput.readLine();
        System.out.println("Please, write the day (first 2 characters)");
        String day = userInput.readLine();

        var schedule = ScheduleParser.parseGroupSchedule(groupNumber);

        View.printFullSchedule(schedule, day);
    }
}