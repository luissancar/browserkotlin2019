package com.example.web

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.Toast
import android.content.ActivityNotFoundException
import android.content.Intent
import android.webkit.URLUtil.isNetworkUrl
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.net.Uri
import android.os.PersistableBundle
import android.util.Log
import android.view.KeyEvent
import android.webkit.URLUtil
import android.webkit.WebViewClient


class MainActivity : AppCompatActivity() {
   var a=0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        webView.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                view?.loadUrl(url)
                return true
            }

        }
        editTextUrl.setOnKeyListener(View.OnKeyListener { v, keyCode, event ->
            if (keyCode == KeyEvent.KEYCODE_ENTER && event.action == KeyEvent.ACTION_UP) {
                //Perform Code
                leerUrl()
                return@OnKeyListener true
            }
            false
        })


        webView.loadUrl("https://www.google.co.in/")

    }

    fun go(v: View){
        leerUrl()

    }
    fun leerUrl(){
        webView.loadUrl(editTextUrl.text.toString())
        Log.d("url",editTextUrl.text.toString())

    }
    fun boton2(v: View){
        tv2.text="eeee"
    }


    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
    }

}
