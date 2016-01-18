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
    public static final String APP_INFO =
            "This app serves as a tool that can be used to monitor where most of " +
            "one's daily activity is spent and what it is spent on\n\n. This is because it gives the users details" +
            " like the name of places visited, the logitude and latitude of such places, the duration of the time spent doing things like (Walking, Standing still"+
            ", In a Vehicle or Bicycle, ...). \n\nThe activity detection feature of this app is majorly provided through Google Activity recognition services. Therefore, the user "
            +" needs a very good internet connection for optimized performance";
    public static final String HELP = "This app is easy to use. The user however needs to turn on the GPS and the" +
            " internet of the phone this app will run on.\n\n"+
            "To start with, the delay should be set from the Settings menu. " +
            "Tracking information will not be saved until the delay time elapses. "+
            "Also, a notification will be displayed on the phone app bar after the delay time elapses. \n\n"+
            "Click the Start Tracking button to see the current track trail of the user. When the user activity "
            +"changes, the previous track trail is saved to the database."+"\n\nTo view the summary of all track trails\n"+
            "Click the Navigation side bar and select Track by Location. "+"\nThe current track trail is automatically "
            +"displayed if there is an existing track trail, " +
            "Otherwise, the user should select a date on the calendar icon of the toolbar to see the "+
            "track history of the selected date.";


}
