package com.pinkhippo.cloistersapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Window6 extends AppCompatActivity {

    ImageView Podcast;
    TextView GalleryName;
    Boolean Selected = false;
    Button ChangeMedia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_window6);

        Podcast = findViewById(R.id.Podcast);
        GalleryName = findViewById(R.id.GalleryName);
        ChangeMedia = findViewById(R.id.ChangeMedia);

        Button SaintChristopherBtn = (Button) findViewById(R.id.Christopher);
        Button SaintMichealBtn = (Button) findViewById(R.id.Micheal);
        Button SaintAndrew = (Button) findViewById(R.id.Andrew);

        TextView tv=(TextView)findViewById(R.id.GalleryName);
        tv.setSelected(true);
    }

    public void Sorgheloos (View v){
        Podcast.setImageResource(R.drawable.podcastactive);
        GalleryName.setText(R.string.Glass_Sorgheloos);
        Selected = !Selected;
    }

    // Zoom out function, going back to main floor [main activity]
    public void Escape (View v) {
        Intent i = new Intent(this,TheGlassGallery.class );
        startActivity(i);
    }

    // Zoom out function, going back to main floor [main activity]
    public void launchFirstFloor (View v) {
        Intent i = new Intent(this,MainActivity.class );
        startActivity(i);
    }
}