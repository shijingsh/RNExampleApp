package com.rnexampleapp;

import android.app.Application;

import com.facebook.react.ReactApplication;
import com.swmansion.gesturehandler.react.RNGestureHandlerPackage;
import com.swmansion.reanimated.ReanimatedPackage;
import com.rt2zz.reactnativecontacts.ReactNativeContacts;
import com.dooboolab.RNIap.RNIapPackage;
import com.reactnativecommunity.asyncstorage.AsyncStoragePackage;
import com.RNFetchBlob.RNFetchBlobPackage;
import com.oblador.vectoricons.VectorIconsPackage;
import com.react.rnspinkit.RNSpinkitPackage;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.soloader.SoLoader;

import cn.jiguang.plugins.push.JPushPackage;

import java.util.Arrays;
import java.util.List;

public class MainApplication extends Application implements ReactApplication {

    // 设置为 true 将不会弹出 toast
    private boolean SHUTDOWN_TOAST = false;
    // 设置为 true 将不会打印 log
    private boolean SHUTDOWN_LOG = false;

    private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {
        @Override
        public boolean getUseDeveloperSupport() {
            return BuildConfig.DEBUG;
        }

        @Override
        protected List<ReactPackage> getPackages() {
            return Arrays.<ReactPackage>asList(
                    new MainReactPackage(),
                    new RNGestureHandlerPackage(),
                    new ReanimatedPackage(),
                    new ReactNativeContacts(),
                    new RNIapPackage(),
                    new AsyncStoragePackage(),
                    new RNFetchBlobPackage(),
                    new VectorIconsPackage(),
                    new JPushPackage(),
                    new RNSpinkitPackage()
            );
        }

        @Override
        protected String getJSMainModuleName() {
            return "index";
        }
    };

    @Override
    public ReactNativeHost getReactNativeHost() {
        return mReactNativeHost;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        SoLoader.init(this, /* native exopackage */ false);
    }
}
