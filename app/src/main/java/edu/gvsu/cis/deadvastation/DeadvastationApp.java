package edu.gvsu.cis.deadvastation;

import android.app.Application;
import net.danlew.android.joda.JodaTimeAndroid;
import android.app.Application;
import net.danlew.android.joda.ResourceZoneInfoProvider;

public class DeadvastationApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        JodaTimeAndroid.init(this);
    }
}