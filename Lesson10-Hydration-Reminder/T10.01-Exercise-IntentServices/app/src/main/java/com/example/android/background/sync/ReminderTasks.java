package com.example.android.background.sync;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.Nullable;

import com.example.android.background.utilities.PreferenceUtilities;

// complete (1) Create a class called ReminderTasks
public class ReminderTasks {
    // complete (2) Create a public static constant String called ACTION_INCREMENT_WATER_COUNT
    public static final String ACTION_INCREMENT_WATER_COUNT = "increment";

    // complete (3) Create a private static void method called incrementWaterCount
    // complete (4) Add a Context called context to the argument list
    private static void incrementWaterCount(Context context){
        // complete (5) From incrementWaterCount, call the PreferenceUtility method that will ultimately update the water count
        PreferenceUtilities.incrementWaterCount(context);
    }

    // complete (6) Create a public static void method called executeTask
    // complete (7) Add a Context called context and String parameter called action to the parameter list
    public static void executeTask(Context context, String action){
        // complete (8) If the action equals ACTION_INCREMENT_WATER_COUNT, call this class's incrementWaterCount
        if(ACTION_INCREMENT_WATER_COUNT.equals(action)){
            incrementWaterCount(context);
        }
    }

}



