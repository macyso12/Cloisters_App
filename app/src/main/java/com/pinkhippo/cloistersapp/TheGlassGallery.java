package com.pinkhippo.cloistersapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TheGlassGallery extends AppCompatActivity {

    ImageView Podcast;
    TextView GalleryName;
    Boolean Selected = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_glass_gallery);

        Podcast = findViewById(R.id.Podcast);
        GalleryName = findViewById(R.id.GalleryName);

        TextView tv=(TextView)findViewById(R.id.GalleryName);
        tv.setSelected(true);
    }

    public void Carousell (View v){
        /*Podcast.setImageResource(R.drawable.podcastactive);
        GalleryName.setText(R.string.Rround_Node_Devotional);
        Selected = !Selected;*/
        Intent i = new Intent(this,Carousell.class );
        startActivity(i);
    }

    // Zoom out function, going back to main floor [main activity]
    public void launchFirstFloor (View v) {
        Intent i = new Intent(this,GroundFloorActivity.class );
        startActivity(i);
    }
}