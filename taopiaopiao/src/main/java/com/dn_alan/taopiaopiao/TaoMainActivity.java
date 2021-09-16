package com.dn_alan.taopiaopiao;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.dn_alan.pluginstand.PayInterfaceActivity;

public class TaoMainActivity extends BaseActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.img).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(that,"插件",Toast.LENGTH_SHORT).show();
//                startActivity(new Intent(that, SceondActivity.class));
//                startService(new Intent(that, OneService.class));

                //d动态注册广播
                IntentFilter intentFilter  = new IntentFilter();
                intentFilter.addAction("com.dn_alan.taopiaopiao.TaoMainActivity");
                registerReceiver(new MyReceiver(), intentFilter);
            }
        });

        findViewById(R.id.sendBroad).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction("com.dn_alan.taopiaopiao.TaoMainActivity");
                sendBroadcast(intent);
            }
        });
    }
}
