package factory;

import java.util.List;

public interface Evaluator {

    List<String> evaluate(String cronExp, int maxRange, int minRange);
}
