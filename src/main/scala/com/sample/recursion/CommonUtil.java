package com.sample.recursion;

/**
 * Created by RSAdmin on 7/31/2017.
 */
public class CommonUtil {



    /**
     * Returns MMM format of month from MM format
     *
     * @param numericMonth
     * @return
     */
    public static String getMonth(String numericMonth) {
        String month = null;
        switch (numericMonth) {
            case "01":
                month = "JAN";
                break;
            case "02":
                month = "FEB";
                break;
            case "03":
                month = "MAR";
                break;
            case "04":
                month = "APR";
                break;
            case "05":
                month = "MAY";
                break;
            case "06":
                month = "JUN";
                break;
            case "07":
                month = "JUL";
                break;
            case "08":
                month = "AUG";
                break;
            case "09":
                month = "SEP";
                break;
            case "10":
                month = "OCT";
                break;
            case "11":
                month = "NOV";
                break;
            case "12":
                month = "DEC";
                break;
        }
        return month;
    }



    /**
     * Determine the cycle from filename
     *
     * @param fileName
     * @return
     * @throws ArrayIndexOutOfBoundsException
     */
    public static String determineCycle(String fileName) throws ArrayIndexOutOfBoundsException {
        return fileName.split("\\_")[1].split("\\.")[0];
    }



    /**
     * Determine the cycle start time
     *
     * @param cycle
     * @return
     */
    public static String transactionFromTimeByCycle(String cycle) {
        String time = null;
        switch (cycle) {
            case "1C":
                time = "17:00:01";
                //time = "17:30:01";
                break;
            case "2C":
                time = "22:30:01";
                //time = "23:00:01";
                break;
            case "3C":
                time = "09:30:01";
                //time = "10:00:01";
                break;
            case "4C":
                time = "13:30:01";
                //time = "14:00:01";
                break;
            default:
                break;
        }
        return time;
    }

    /**
     * Determine the cycle end time
     *
     * @param cycle
     * @return
     */
    public static String transactionToTimeByCycle(String cycle) {
        String time = null;
        switch (cycle) {
            case "1C":
                time = "23:30:00";
                //time = "23:00:00";
                break;
            case "2C":
                time = "10:30:00";
                //time = "10:00:00";
                break;
            case "3C":
                time = "14:30:00";
                //time = "14:00:00";
                break;
            case "4C":
                time = "18:00:00";
                //time = "17:30:00";
                break;
            default:
                break;
        }
        return time;
    }







}
