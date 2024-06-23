package factory.implementation;

import factory.Evaluator;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/** Evaluate asterisk */
public class AsteriskEvaluator implements Evaluator {
    @Override
    public List<String> evaluate(String cronExp, int minRange, int maxRange) {
        return IntStream
                .range(minRange, maxRange)
                .mapToObj(String::valueOf)
                .collect(Collectors.toList());

    }
}
