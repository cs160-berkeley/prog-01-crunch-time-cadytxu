package com.cs160.cadyxu.crunchtime;

/**
 * Created by cadyxu on 2/5/16.
 */
public class unitConverter {
    public static double exerciseConvert (double number, String beforeType, String afterType){

        if (beforeType == null || afterType == null){
            return 0;
        }
        double multiplier = 1;
        double divisor = 1;

        switch (beforeType.toLowerCase()){
            case "calories":
                divisor = 100;
            case "pushup*":
                divisor = 350;
                break;
            case "situp*":
                divisor = 200;
                break;
        }
        switch (afterType.toLowerCase()){
            case "calories":
                multiplier = 100;
            case "pushup*":
                multiplier = 350;
                break;
            case "situp*":
                multiplier = 200;
                break;
        }
        return number * multiplier / divisor;
    }
}
