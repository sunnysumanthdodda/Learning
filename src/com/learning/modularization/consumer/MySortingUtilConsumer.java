package com.learning.modularization.consumer;

import com.learning.modularization.sorting.MySortingUtil;

import java.util.List;
import java.util.logging.Logger;

public class MySortingUtilConsumer{
    public static void main(String[] args) {

        Logger logger = Logger.getLogger(MySortingUtilConsumer.class.getName());
        MySortingUtil util = new MySortingUtil();
        List<String> sorted = util.sort(List.of("Sunny","Sumanth","Dodda"));
        logger.info(sorted.toString());
    }
}