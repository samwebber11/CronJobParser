package factory;

import constants.CronConstants;
import factory.implementation.*;

/** Cron Factory to selected which evaluator needs to be used. */
public class CronFactory {

    public Evaluator getEvaluator(String cronExp) {
        if (CronConstants.ASTERISK.equals(cronExp)) {
            return new AsteriskEvaluator();
        } else if (cronExp.contains(CronConstants.HYPHEN)) {
            return new HyphenEvaluator();
        } else if (cronExp.contains(CronConstants.SLASH)) {
            return new SlashEvaluator();
        } else if (cronExp.contains(CronConstants.COMMA)) {
            return new CommaEvaluator();
        } else {
            return new DefaultEvaluator();
        }
    }
}
