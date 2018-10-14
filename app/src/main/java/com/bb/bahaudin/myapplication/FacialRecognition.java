package com.bb.bahaudin.myapplication;

import android.content.Intent;
import android.graphics.Camera;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View.OnClickListener;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.hardware.camera2.CameraDevice;
import android.widget.Button;
import android.widget.ImageView;

import java.io.File;

public class FacialRecognition extends AppCompatActivity {
ImageView CamView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facial_recognition);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        CamView=(ImageView)findViewById(R.id.CamView);



    }

    public void CamCap(View view){

     Intent camera_intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        File file=getFile();
        camera_intent.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(file));
        startActivityForResult(camera_intent,1);


    }

    private File getFile(){

     File folder = new File("sdcard/Buzz");
        if (!folder.exists()){
            folder.mkdir();
        }
      File image_file= new File(folder,"Buzz_im.jpg");
        return image_file;

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        String path= "sdcard/Buzz/Buzz_im.jpg";
        CamView.setImageDrawable(Drawable.createFromPath(path));
    }
}
