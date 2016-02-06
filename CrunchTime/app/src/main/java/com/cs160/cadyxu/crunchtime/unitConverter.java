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

        switch (beforeType){
            case "Calories":
                divisor = 100;
                break;
            case "Pushups (Reps)":
                divisor = 350;
                break;
            case "Situps (Reps)":
                divisor = 200;
                break;
            case "Jumping Jacks (Mins)":
                divisor = 10;
                break;
            case "Jogging (Mins)":
                divisor = 12;
                break;
            case "Squats (Reps)":
                divisor = 225;
                break;
            case "Leg-lift (Mins)":
                divisor = 25;
                break;
            case "Plank (Mins)":
                divisor = 25;
                break;
            case "Pullup (Reps)":
                divisor = 100;
                break;
            case "Cycling (Mins)":
                divisor = 12;
                break;
            case "Walking (Mins)":
                divisor = 20;
                break;
            case "Swimming (Mins)":
                divisor = 13;
                break;
            case "Stair-climbing (Mins)":
                divisor = 15;
                break;
        }
        switch (afterType){
            case "Calories":
                multiplier = 100;
                break;
            case "Pushups (Reps)":
                multiplier = 350;
                break;
            case "Situps (Reps)":
                multiplier = 200;
                break;
            case "Jumping Jacks (Mins)":
                multiplier = 10;
                break;
            case "Jogging (Mins)":
                multiplier = 12;
                break;
            case "Squats (Reps)":
                multiplier = 225;
                break;
            case "Leg-lift (Mins)":
                multiplier = 25;
                break;
            case "Plank (Mins)":
                multiplier = 25;
                break;
            case "Pullup (Reps)":
                multiplier = 100;
                break;
            case "Cycling (Mins)":
                multiplier = 12;
                break;
            case "Walking (Mins)":
                multiplier = 20;
                break;
            case "Swimming (Mins)":
                multiplier = 13;
                break;
            case "Stair-climbing (Mins)":
                multiplier = 15;
                break;
        }
        return number * multiplier / divisor;
    }
}
