package com.bb.bahaudin.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;
import android.hardware.Camera;


import static android.provider.MediaStore.INTENT_ACTION_VIDEO_CAMERA;


public class MainActivity extends AppCompatActivity implements OnClickListener {
Button videoFeed;
    private WebView wv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        videoFeed = (Button)findViewById(R.id.videoFeed);
        videoFeed.setOnClickListener(this);
    }

    public void openView(){
          // Camera.open();
       //Intent openWebpage= new Intent(Intent.ACTION_VIEW, Uri.parse("http://76.120.126.209:8080/stream.html"));
        Intent openWebpage= new Intent(Intent.ACTION_VIEW, Uri.parse("http://10.0.0.138:8080/stream.html"));
          startActivity(openWebpage);
        //startActivity(new Intent("android.intent.action.cameraView"));
        //Intent intent = new Intent(this, cameraView.class);
        //startActivity(intent);

    }

    public void pageHis(View view){

        Intent intent = new Intent(this, Notifications.class);
        startActivity(intent);
    }

    public void FaceRec(View view){
        Intent intent = new Intent(this, FacialRecognition.class);
        startActivity(intent);
    }


    public void onClick (View v){
              switch(v.getId()){

                  case R.id.videoFeed:
                      openView();
                  case R.id.notification:
                     // Intent openWebpage= new Intent(Intent.ACTION_VIEW, Uri.parse("http://google.com"));

                      break;

              }
    }
}
