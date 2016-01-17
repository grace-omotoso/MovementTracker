package com.andela.omotoso.bukola.movementtracker.Utilities;

/**
 * Created by GRACE on 1/9/2016.
 */
public class Constants {
    public static final String PACKAGE_NAME = "com.andela.omotoso.bukola.locationfinder";
    public static final String BROADCAST_ACTION = PACKAGE_NAME+".BROADCAST_ACTION";
    public static final String ACTIVITY_EXTRA = PACKAGE_NAME+".ACTIVITY_EXTRA";
    public static final String SHARED_PREFERENCES = PACKAGE_NAME+".SHARED_PREFRENCES";
    public static final String ACTIVITY_UPDATES_REQUESTED_KEY = PACKAGE_NAME+".ACTIVITY_UPDATES_REQUESTED";
    public static final String DETECTED_ACTIVITIES = PACKAGE_NAME+".DETECTED_ACTIVITIES";
    public static final long DETECTION_INTERVAL_IN_MILLISECONDS = 0;
    public static final String ON_VEHICLE = "In a Vehicle";
    public static final String ON_BICYCLE = "On Bicycle";
    public static final String ON_FOOT = "On foot";
    public static final String RUNNING = "Running";
    public static final String STANDING_STILL = "Standing Still";
    public static final String TILTING = "Tilting";
    public static final String UNKNOWN = "Unknown";
    public static final String WALKING = "Walking";
    public static final String UNIDENTIFIABLE = "Unidentifiable Activity";
    public static final String DEFAULT_DELAY = "5 minutes";
    public static final int TICK_IN_MILLISECONDS = 1000;
    public static final int MINUTES_TO_MILLISECONDS = 60000;
    public static final String APP_INFO = "This app serves as a tool that can be used to monitor where most of " +
            "one's daily activity is spent and what it is spent on. This is because it gives the users details" +
            "like the name of places visited, the duration of the time spent doing things like (Walking, Standing still"+
            ", In a Vehicle or Bicycle ... This is majorly provided through Google Activity recognition services. The user "
            +"however needs to take note that a very good internet connection is highly needed for optimized performance";

}
