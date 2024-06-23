package factory.implementation;

import constants.CronConstants;
import factory.Evaluator;

import java.util.ArrayList;
import java.util.List;

/** Evaluate slash */
public class SlashEvaluator implements Evaluator {
    @Override
    public List<String> evaluate(String cronExp, int minRange, int maxRange) {
        String[] split = cronExp.split(CronConstants.SLASH);

        List<String> result = new ArrayList<>();

        // Evaluate the time range.
        int interval = Integer.parseInt(split[1]);

        if (CronConstants.ASTERISK.equals(split[0])) {
            for (int i = minRange; i <= maxRange; i += interval) {
                result.add(String.valueOf(i));
            }
        } else {
            int startTime = Integer.parseInt(split[0]);
            for (int i = startTime; i <= maxRange; i += interval) {
                result.add(String.valueOf(i));
            }
        }
        return result;
    }
}
