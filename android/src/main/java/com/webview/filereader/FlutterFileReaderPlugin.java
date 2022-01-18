package com.webview.filereader;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Build;
import android.content.Context;


import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;


/**
 * FlutterX5Plugin
 */
public class FlutterFileReaderPlugin implements FlutterPlugin, ActivityAware, MethodCallHandler {

    public static final String channelName = "wv.io/FileReader";
    Activity activity;
    private Context applicationContext;
    private MethodChannel methodChannel;

    @Override
    public void onAttachedToEngine(FlutterPluginBinding binding) {
        onAttachedToEngine(binding.getApplicationContext(), binding.getBinaryMessenger());
    }
    private void onAttachedToEngine(Context applicationContext, BinaryMessenger messenger) {
        this.applicationContext = applicationContext;
        methodChannel = new MethodChannel(messenger, channelName);
        methodChannel.setMethodCallHandler(this);
    }
    @Override
    public void onAttachedToActivity(ActivityPluginBinding binding) {
        this.activity = binding.getActivity();
    }
    @Override
    public void onDetachedFromActivityForConfigChanges() {

    }

    @Override
    public void onReattachedToActivityForConfigChanges( ActivityPluginBinding binding) {

    }
    @Override
    public void onDetachedFromActivity() {
        this.activity = null;
    }
    @Override
    public void onMethodCall(MethodCall call, Result result) {
        result.success(null);
    }

    @Override
    public void onDetachedFromEngine(FlutterPluginBinding binding) {
        applicationContext = null;
        methodChannel.setMethodCallHandler(null);
    }
}

