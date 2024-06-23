package factory.implementation;

import constants.CronConstants;
import factory.Evaluator;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/** Evaluate hyphen */
public class HyphenEvaluator implements Evaluator {
    @Override
    public List<String> evaluate(String cronExp, int minRange, int maxRange) {
        String[] newRange = cronExp.split(CronConstants.HYPHEN);
        int start = Integer.parseInt(newRange[0]);
        int end = Integer.parseInt(newRange[1]);
        return IntStream.rangeClosed(start, end)
                .mapToObj(String::valueOf)
                .collect(Collectors.toList());
    }
}
