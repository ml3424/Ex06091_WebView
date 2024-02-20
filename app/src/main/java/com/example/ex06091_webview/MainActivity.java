package com.example.ex06091_webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText eT1;
    WebView wV;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eT1 = findViewById(R.id.eT1);
        wV = findViewById(R.id.wV);
        wV.getSettings().setJavaScriptEnabled(true);
        wV.setWebViewClient(new MyWebViewClient());

    }

    private class MyWebViewClient extends WebViewClient {
        public boolean shouldOverideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }

    public void click(View view) {
        String url = eT1.getText().toString();
        wV.loadUrl(url);
    }


}