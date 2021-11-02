package com.example.hms_pushkit_htpt;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;

import androidx.annotation.Nullable;

import com.huawei.agconnect.config.AGConnectServicesConfig;
import com.huawei.hms.aaid.HmsInstanceId;
import com.huawei.hms.common.ApiException;

public  class DemoHmsMessageService extends com.huawei.hms.push.HmsMessageService {
    @Override
    public void onMessageSent(String s) {
        super.onMessageSent(s);
    }
    //private static final String TAG = "PushDemoLog";




    }

