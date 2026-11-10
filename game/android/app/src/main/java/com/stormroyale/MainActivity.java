package com.stormroyale;
import android.app.Activity;import android.os.Bundle;import android.view.View;import android.view.Window;import android.view.WindowManager;import android.webkit.WebView;import android.webkit.WebSettings;
public class MainActivity extends Activity{WebView w;
 @Override protected void onCreate(Bundle b){super.onCreate(b);requestWindowFeature(Window.FEATURE_NO_TITLE);getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
  w=new WebView(this);WebSettings s=w.getSettings();s.setJavaScriptEnabled(true);s.setDomStorageEnabled(true);s.setUseWideViewPort(true);s.setLoadWithOverviewMode(true);s.setMediaPlaybackRequiresUserGesture(false);
  w.setSystemUiVisibility(View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY|View.SYSTEM_UI_FLAG_HIDE_NAVIGATION|View.SYSTEM_UI_FLAG_FULLSCREEN);w.loadUrl("file:///android_asset/index.html");setContentView(w);}
 @Override public void onBackPressed(){}}
