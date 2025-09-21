package Sets;

import java.util.EnumSet;

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

public class EnumSetDemo {
    public static void main(String[] args) {
        // Create EnumSet
        EnumSet<Day> weekend = EnumSet.of(Day.SATURDAY, Day.SUNDAY);
        EnumSet<Day> weekdays = EnumSet.range(Day.MONDAY, Day.FRIDAY);

        System.out.println("Weekend: " + weekend);
        System.out.println("Weekdays: " + weekdays);

        // add/remove
        weekdays.add(Day.SUNDAY);
        System.out.println("After adding Sunday in weekdays: " + weekdays);

        // complementOf (opposite set)
        EnumSet<Day> notWeekend = EnumSet.complementOf(weekend);
        System.out.println("Not weekend: " + notWeekend);

        // allOf
        EnumSet<Day> allDays = EnumSet.allOf(Day.class);
        System.out.println("All days: " + allDays);

        // clear
        allDays.clear();
        System.out.println("After clear: " + allDays);
    }
}
