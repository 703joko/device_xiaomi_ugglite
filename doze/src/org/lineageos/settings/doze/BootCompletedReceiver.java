/*
 * Copyright (C) 2015 The CyanogenMod Project
 *               2017 The LineageOS Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.lineageos.settings.doze;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

<<<<<<< HEAD:doze/src/org/lineageos/settings/doze/BootCompletedReceiver.java
=======
import org.lineageos.settings.dirac.DiracUtils;
import org.lineageos.settings.doze.DozeUtils;

>>>>>>> a0d2387... ugglite: parts: Add DiracSound backend:parts/src/org/lineageos/settings/BootCompletedReceiver.java
public class BootCompletedReceiver extends BroadcastReceiver {

    private static final boolean DEBUG = false;
    private static final String TAG = "XiaomiDoze";

    @Override
    public void onReceive(final Context context, Intent intent) {
<<<<<<< HEAD:doze/src/org/lineageos/settings/doze/BootCompletedReceiver.java
        if (Utils.isDozeEnabled(context) && Utils.sensorsEnabled(context)) {
            if (DEBUG) Log.d(TAG, "Starting service");
            Utils.startService(context);
        }
<<<<<<< HEAD:doze/src/org/lineageos/settings/doze/BootCompletedReceiver.java
<<<<<<< HEAD:doze/src/org/lineageos/settings/doze/BootCompletedReceiver.java
=======
        new DiracUtils(context).onBootCompleted();
>>>>>>> b5eb671... ugglite: dirac: Only call setEnabled on boot completed:parts/src/org/lineageos/settings/BootCompletedReceiver.java
=======
        new DiracUtils(context);
>>>>>>> 845e444... ugglite: parts: Refactor Dirac setup:parts/src/org/lineageos/settings/BootCompletedReceiver.java
=======
        if (DozeUtils.isDozeEnabled(context) && DozeUtils.sensorsEnabled(context)) {
            if (DEBUG) Log.d(TAG, "Starting Doze service");
	    DiracUtils.initialize();
            DozeUtils.startService(context);
        }
        DiracUtils.initialize(context);
>>>>>>> 57e7749... ugglite: Dirac fixes:parts/src/org/lineageos/settings/BootCompletedReceiver.java
    }
}
