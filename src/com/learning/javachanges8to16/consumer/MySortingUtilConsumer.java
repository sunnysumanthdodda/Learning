package com.learning.javachanges8to16.consumer;

import com.learning.javachanges8to16.sorting.MySortingUtil;

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