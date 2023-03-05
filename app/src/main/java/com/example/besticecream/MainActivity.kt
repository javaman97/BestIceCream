package com.example.besticecream

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webViewVariable=findViewById<WebView>(R.id.webview)
        webviewSetup(webViewVariable)
    }
    @RequiresApi(Build.VERSION_CODES.O)
    private fun webviewSetup(webView: WebView) {
        webView.webViewClient= WebViewClient()

        webView.apply {
            settings.javaScriptEnabled=true
            settings.safeBrowsingEnabled=true
            loadUrl("https://besticecreamnear.com/")
        }
    }
}