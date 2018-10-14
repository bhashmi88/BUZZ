package com.bb.bahaudin.myapplication;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.net.Uri;
import android.widget.MediaController;
import android.widget.VideoView;
import static android.provider.MediaStore.INTENT_ACTION_VIDEO_CAMERA;

public class cameraView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera_view);
        VideoView vidView = (VideoView)findViewById(R.id.myVideo);
        String vidAddress="https://www.youtube.com/watch?v=EIYtubRrMc4";
        Uri vidUri = Uri.parse(vidAddress);
        vidView.setVideoURI(vidUri);
        vidView.start();
    }


}
