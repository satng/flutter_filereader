package com.webview.filereader;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

import com.tencent.smtt.export.external.TbsCoreSettings;
import com.tencent.smtt.sdk.QbSdk;
import com.tencent.smtt.sdk.TbsListener;
import com.tencent.smtt.sdk.ValueCallback;

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
public class FlutterFileReaderPlugin implements MethodChannel.MethodCallHandler, FlutterPlugin, ActivityAware {

    public static final String channelName = "wv.io/FileReader";
    private Context ctx;
    private MethodChannel methodChannel;
    private FlutterPluginBinding pluginBinding;


    private void init(Context context, BinaryMessenger messenger) {
        ctx = context;
        methodChannel = new MethodChannel(messenger, channelName);
        methodChannel.setMethodCallHandler(this);
    }

    public FlutterFileReaderPlugin() {

    }

    private void onDestory() {

        ctx = null;
        methodChannel = null;
        pluginBinding = null;
    }


    /**
     * Plugin registration.
     */
    public static void registerWith(Registrar registrar) {
        FlutterFileReaderPlugin plugin = new FlutterFileReaderPlugin();
        plugin.init(registrar.context(), registrar.messenger());
    }


    public void netBroadcastRegister(final Context context) {
        //实例化IntentFilter对象
        IntentFilter filter = new IntentFilter();
        filter.addAction("android.net.conn.CONNECTIVITY_CHANGE");

    }

}

