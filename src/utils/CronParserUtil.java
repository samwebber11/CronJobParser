package utils;

import models.Range;

import java.util.List;

/** Utility class to get range list and perform other static operations. */
public class CronParserUtil {

    public static List<Range> getRangeList() {

        Range minuteRange = new Range(0, 59);
        Range hourRange = new Range(0, 23);
        Range dayOfMonthRange = new Range(1, 31);
        Range monthRange = new Range(1, 12);
        Range dayOfWeekRange = new Range(0, 6);

        return List.of(minuteRange, hourRange, dayOfMonthRange, monthRange, dayOfWeekRange);
    }
}
