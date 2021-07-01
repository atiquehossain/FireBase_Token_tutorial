package com.example.firebase_tutorial;

import android.util.Log;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class MyFireBaseTokenID extends FirebaseMessagingService {

    @Override
    public void onNewToken(String s) {
        super.onNewToken(s);

/*  FirebaseInstallations aultanative
        Task<String> tok;
        tok= FirebaseMessaging.getInstance().getToken();
        Log.d("onNewToken", "onNewToken: "+tok);

*/
        Log.d("onNewToken", "Token: " + s);
    }

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        Log.d("onNewToken", "Message: " + remoteMessage.getData().toString());

    }
}

