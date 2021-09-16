package com.dn_alan.taopiaopiao;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import com.dn_alan.pluginstand.PayInterfaceService;

public class BaseService extends Service implements PayInterfaceService {
    private Service that;
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void attach(Service proxyService) {
        this.that = proxyService;
    }

    @Override
    public void onCreate() {

    }
}
