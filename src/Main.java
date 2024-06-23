import parser.CronJobParser;
import parser.implementation.CronJobParserImpl;
import response.CronJobResponse;

public class Main {
    public static void main(String args[]) {
        if (args.length != 1) {
            System.err.println("Please provide valid cron expression");
            System.exit(2);
        }

        String cronExpression = args[0];
        CronJobParser cronJobParser = new CronJobParserImpl(cronExpression);
        CronJobResponse response = cronJobParser.parse();

        System.out.println("minute        " + response.getMinutes());
        System.out.println("hour          " + response.getHours());
        System.out.println("day of month  " + response.getDaysOfMonth());
        System.out.println("month         " + response.getMonths());
        System.out.println("day of week   " + response.getDaysOfWeek());
        System.out.println("command       " + response.getCommand());
    }
}
