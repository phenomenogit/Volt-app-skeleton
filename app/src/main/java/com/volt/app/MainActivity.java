package com.volt.app;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {

    private WebView face;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        face = new WebView(this);
        WebSettings settings = face.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        face.setWebViewClient(new WebViewClient());
        setContentView(face);

        // Skeleton face: a bundled page, so the APK opens with zero engine.
        // Session 2 wires this to the living gateway at 127.0.0.1:18789.
        face.loadUrl("file:///android_asset/face/index.html");
    }

    @Override
    public void onBackPressed() {
        if (face != null && face.canGoBack()) {
            face.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
