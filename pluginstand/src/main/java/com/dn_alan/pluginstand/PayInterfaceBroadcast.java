package com.dn_alan.pluginstand;

import android.content.Context;
import android.content.Intent;

public interface PayInterfaceBroadcast {
    public void attach(Context context);

    public void onReceive(Context context, Intent intent);

}
