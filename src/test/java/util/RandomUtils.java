package util;

import java.util.Random;

public class RandomUtils {
    public static int getRandomNumber(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public static String getRandomGender() {
        String[] gender = {"Female", "Male", "Other"};
        int genderIndex = getRandomNumber(0, 2);
        return gender[genderIndex];
    }

    public static String getRandomMonth() {
        String[] listOfMonth = {
                "January",
                "February",
                "March",
                "April",
                "May",
                "June",
                "July",
                "August",
                "September",
                "October",
                "November",
                "December"
        };
        int MonthIndex = getRandomNumber(0, 11);
        return listOfMonth[MonthIndex];
    }

    public static String getRandomHobby() {
        String[] hobbies = {"Sports", "Reading", "Music"};
        int hobbyIndex = getRandomNumber(0, 2);
        return hobbies[hobbyIndex];
    }

    public static String getRandomDay() {
        int day = getRandomNumber(10, 28);
        return String.valueOf(day);
    }
}