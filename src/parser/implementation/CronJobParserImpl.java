package parser.implementation;

import constants.CronConstants;
import exceptions.CronJobException;
import factory.CronFactory;
import factory.Evaluator;
import models.Range;
import parser.CronJobParser;
import response.CronJobResponse;
import utils.CronParserUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** Parse the cron expression and return a cron job response */
public class CronJobParserImpl implements CronJobParser {

    private final String cronJobExpression;

    public CronJobParserImpl(String cronJobExpression) {
        this.cronJobExpression = cronJobExpression;
    }

    public CronJobResponse parse() {
        String[] cronList = cronJobExpression.split(CronConstants.SPLIT_EXP);
        if (cronList.length < CronConstants.MIN_LENGTH_CRON) {
            throw new CronJobException("Please provide a valid cron expression");
        }

        CronFactory cronFactory = new CronFactory();
        List<Range> rangeList = CronParserUtil.getRangeList();
        List<List<String>> result = new ArrayList<>();

        for(int i = 0; i < CronConstants.MIN_LENGTH_CRON - 1; i++) {
            Evaluator evaluator = cronFactory.getEvaluator(cronList[i]);
            List<String> cronResult = evaluator.evaluate(cronList[i], rangeList.get(i).getMinRange(), rangeList.get(i).getMaxRange());
            result.add(cronResult);
        }

        String command = String.join(" ", Arrays.copyOfRange(cronList, 5, cronList.length));

        return new CronJobResponse(result, command);

    }

}
