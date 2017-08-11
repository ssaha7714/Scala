package com.sample.recursion;

import java.time.LocalDate;

/**
 * Created by RSAdmin on 7/31/2017.
 */
public class Sample {
    public static void main(String[] args) {
        String date = "22-07-2017";
        String reconDate = date;

        StringBuilder toDateBuilder = new StringBuilder();
        StringBuilder tempFromDateBuilder = new StringBuilder();
        StringBuilder dateBuilder = new StringBuilder();
        String fromDate = null;
        String toDate = null;

        String operationalDate = date;
        tempFromDateBuilder.append(operationalDate.substring(6, 10)).append("-")
                .append(operationalDate.substring(3, 5)).append("-").append(operationalDate.substring(0, 2));
        String calculatedFromDate = LocalDate.parse(tempFromDateBuilder.toString()).minusDays(1).toString();
        dateBuilder.append(calculatedFromDate);
        // Keeping half an hour buffer with actual from date 23:00:00
        fromDate = dateBuilder.append(" ").append("22:30:00").toString();

        toDateBuilder.append(date.substring(6, 10)).append("-").append(date.substring(3, 5)).append("-")
                .append(date.substring(0, 02));
        // Keeping half an hour buffer with actual to date 23:00:00
        toDate = toDateBuilder.append(" ").append("23:30:00").toString();

        //Current Format 2017-06-10 22:30:00 --> 10-JUN-2017 22:30:00
        tempFromDateBuilder = new StringBuilder();
        tempFromDateBuilder.append(fromDate.substring(8, 10)).append("-")
                .append(CommonUtil.getMonth(fromDate.substring(5, 7))).append("-").append(fromDate.substring(0, 4)).append(" ").append(fromDate.substring(11));
        fromDate = tempFromDateBuilder.toString();

        tempFromDateBuilder = new StringBuilder();
        tempFromDateBuilder.append(toDate.substring(8, 10)).append("-")
                .append(CommonUtil.getMonth(toDate.substring(5, 7))).append("-").append(toDate.substring(0, 4)).append(" ").append(toDate.substring(11));
        toDate = tempFromDateBuilder.toString();

        System.out.println(fromDate);
        System.out.println(toDate);
    }
}
