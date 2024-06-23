package response;

import java.util.List;

/** Cron expression response class. */
public class CronJobResponse {
    private final String command;

    private final List<List<String>> cronParserResult;

    public CronJobResponse(List<List<String>> cronParserResult, String command) {
        this.cronParserResult = cronParserResult;
        this.command = command;
    }

    public String getMinutes() {
        List<String> minutes = cronParserResult.get(0);
        return String.join(" ", minutes);
    }

    public String getHours() {
        List<String> hours = cronParserResult.get(1);
        return String.join(" ", hours);
    }

    public String getDaysOfMonth() {
        List<String> daysOfMonth = cronParserResult.get(2);
        return String.join(" ", daysOfMonth);
    }

    public String getMonths() {
        List<String> months = cronParserResult.get(3);
        return String.join(" ", months);
    }

    public String getDaysOfWeek() {
        List<String> daysOfWeek = cronParserResult.get(4);
        return String.join(" ", daysOfWeek);
    }

    public String getCommand() {
        return this.command;
    }

}
