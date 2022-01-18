package com.webview.filereader;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;


import java.lang.reflect.Field;
import java.util.HashMap;

import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry.Registrar;

/**
 * FlutterX5Plugin
 */
public class FlutterFileReaderPlugin implements FlutterPlugin {

    public static final String channelName = "wv.io/FileReader";
    private Context ctx;


    private void init(Context context, BinaryMessenger messenger) {
        ctx = context;
    }


}

