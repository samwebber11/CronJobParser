package factory.implementation;

import constants.CronConstants;
import factory.Evaluator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** Evaluate comma */
public class CommaEvaluator implements Evaluator {
    @Override
    public List<String> evaluate(String cronExp, int maxRange, int minRange) {
        String[] values = cronExp.split(CronConstants.COMMA);
        return new ArrayList<>(Arrays.asList(values));
    }
}
