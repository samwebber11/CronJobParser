package factory.implementation;

import factory.Evaluator;

import java.util.List;

/** Default evaluator for any other exp. */
public class DefaultEvaluator implements Evaluator {
    @Override
    public List<String> evaluate(String cronExp, int minRange, int maxRange) {
        return List.of(cronExp);
    }
}
