package com.awwhome.xiezaianzhuangapp.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by Administrator on 2017/3/3 0003.
 */
public class AppStateReceiver extends BroadcastReceiver {

    private static final String TAG = "AppStateReceiver";

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(TAG, "onReceive: onReceive方法被执行了");

        String action = intent.getAction();

        if ("android.intent.action.PACKAGE_ADDED".equals(action)){
            Log.d(TAG, "onReceive: 应用被安装了 -----ADDED");
        }else if ("android.intent.action.PACKAGE_INSTALL".equals(action)){// 预留的，不起作用
            Log.d(TAG, "onReceive: 应用被安装了 -----INSTALL");
        }else if ("android.intent.action.PACKAGE_REMOVED".equals(action)){
            Log.d(TAG, "onReceive: 应用被卸载了 ");
        }

    }
}
