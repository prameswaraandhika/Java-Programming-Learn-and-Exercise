package org.example.days.myanswer;

public class DaysRunner {
    public static void main(String[] args) {
        final String[] daysOfWeeks = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        String dayWithMostCharacter = "";
        for (String day: daysOfWeeks) {
            if (day.length() > dayWithMostCharacter.length())
                dayWithMostCharacter = day;
        }

        System.out.println("Day with Most number of characters: " + dayWithMostCharacter);
        for (int i = daysOfWeeks.length - 1; i >= 0; i--) {
            System.out.println(daysOfWeeks[i]);
        }

    }
}
