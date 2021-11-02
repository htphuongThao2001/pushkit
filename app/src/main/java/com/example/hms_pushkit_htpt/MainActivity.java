package com.example.hms_pushkit_htpt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;

import com.huawei.agconnect.config.AGConnectServicesConfig;
import com.huawei.hms.aaid.HmsInstanceId;
import com.huawei.hms.common.ApiException;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "PushKitActivity";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getPushToken();

    }


    private void sendRedTokenToServer(String token) {
        Log.i(TAG, "sending token to server. token:" + token);
    }


    private void getPushToken() {

        showLog("getToken:begin");

        new Thread() {
            @Override
            public void run() {
                try {
                    // read from agconnect-services.json
                    String appId = "Please enter your App_Id from agconnect-services.json ";
                    String token = HmsInstanceId.getInstance(MainActivity.this).getToken(appId, "HCM");
                    Log.i(TAG, "get token:" + token);
                    if(!TextUtils.isEmpty(token)) {
                        sendRedTokenToServer(token);
                    }

                    showLog("get token:" + token);
                } catch (ApiException e) {
                    Log.e(TAG, "get token failed, " + e);
                    showLog("get token failed, " + e);
                }
            }
        }.start();
    }

    private void showLog(String s) {
    }
}