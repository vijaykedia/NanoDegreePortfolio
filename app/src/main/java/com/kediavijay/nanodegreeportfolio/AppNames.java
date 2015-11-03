package com.kediavijay.nanodegreeportfolio;

import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vijaykedia on 03/11/15.
 */
public enum AppNames {

    SPOTIFY_STREAMER("Spotify Streamer"),
    SUPER_DUO("Super Duo"),
    BUILD_IT_BIGGER("Build It Bigger"),
    XYZ_READER("XYZ Reader"),
    CAPSTONE_PROJECT("Capstone Project");

    @NonNull private final String value;

    AppNames(@NonNull final String value) {
        this.value = value;
    }

    @NonNull
    public String getValue() {
        return value;
    }

    @NonNull
    public static List<String> getAppNames() {
        final List<String> appNamesList = new ArrayList<>();
        for (final AppNames appNames : AppNames.values()) {
            appNamesList.add(appNames.getValue());
        }
        return appNamesList;
    }
}
