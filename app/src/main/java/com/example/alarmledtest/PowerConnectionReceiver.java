package com.example.alarmledtest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class PowerConnectionReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (intent.getAction().equals(Intent.ACTION_POWER_CONNECTED)){
            Intent i = new Intent(context, MainActivity.class);
            intent.putExtra("myBroadcast", "myBroadcast");

            i.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(i);
        }

    }
}
