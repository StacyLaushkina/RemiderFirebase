package com.laushkina.anastasia.reminderFirebase

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.firebase.messaging.FirebaseMessaging

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onSubscribeRequested(v: View) {
        FirebaseMessaging.getInstance().subscribeToTopic("news")
    }

    fun onUnSubscribeRequested(v: View) {
        FirebaseMessaging.getInstance().unsubscribeFromTopic("news")
    }
}
