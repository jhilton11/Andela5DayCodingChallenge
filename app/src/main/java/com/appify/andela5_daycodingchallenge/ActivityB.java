package com.appify.andela5_daycodingchallenge;

import android.net.http.SslError;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ActivityB extends AppCompatActivity {
    private WebView mWebview;
    private ActionBar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        mWebview = findViewById(R.id.webview);

        String url = "https://andela.com/alc/";
        mWebview.setWebViewClient(new WebViewController());
        mWebview.getSettings().setJavaScriptEnabled(true);
        mWebview.getSettings().setDisplayZoomControls(true);
        mWebview.getSettings().setLoadsImagesAutomatically(true);
        mWebview.loadUrl("https://andela.com/alc/");

        toolbar = getSupportActionBar();
        toolbar.setTitle("About ALC");

        toolbar.setHomeButtonEnabled(true);
        toolbar.setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    class WebViewController extends WebViewClient {

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }

        @Override
        public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
            handler.proceed(); // Ignore SSL certificate errors
        }
    }
}
